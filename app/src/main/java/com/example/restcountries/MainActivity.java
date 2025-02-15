package com.example.restcountries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.example.restcountries.parse.Converter;
import com.example.restcountries.parse.Country;
import com.squareup.moshi.Moshi;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Comparator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static Retrofit retrofit;
    private EditText searchText;
    private RecyclerView recyclerView;
    private TextView noData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        recyclerView = findViewById(R.id.recyclerView);
        noData = findViewById(R.id.noData);
        searchText = findViewById(R.id.search_page);

        try {
            String fileName = "countries.json";
            File jsonFile = new File(getFilesDir(), fileName);

            List<Country> countries = null;

            if (jsonFile.exists()) {
                // Read data from the existing JSON file
                String jsonString = readFromFile(jsonFile);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    countries = Converter.fromJsonString(jsonString);
                }
            } else {
                // Fetch data from the URL
                String jsonObject = getJSONObjectFromURL("https://restcountries.com/v3.1/all/");
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    countries = Converter.fromJsonString(jsonObject);
                }

                // Write data to the JSON file
                writeToFile(jsonFile, jsonObject);
            }

            if (countries == null) {
                recyclerView.setVisibility(RecyclerView.GONE);
                noData.setVisibility(TextView.VISIBLE);
                Log.d("TAG", "onCreate: countries is null");
            } else {
                noData.setVisibility(TextView.GONE);
                recyclerView.setVisibility(RecyclerView.VISIBLE);

                countries.sort(new Comparator<Country>() {
                    @Override
                    public int compare(Country o1, Country o2) {
                        return o1.getName().getOfficial().compareTo(o2.getName().getOfficial());
                    }
                });

                CountryAdapter adapter = new CountryAdapter(countries);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                recyclerView.setAdapter(adapter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public static String getJSONObjectFromURL(String urlString) throws IOException, JSONException {
        HttpURLConnection urlConnection = null;
        URL url = new URL(urlString);
        urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.setReadTimeout(10000 /* milliseconds */ );
        urlConnection.setConnectTimeout(15000 /* milliseconds */ );
        urlConnection.setDoOutput(true);
        urlConnection.connect();

        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }
        br.close();

        String jsonString = sb.toString();
        System.out.println("JSON: " + jsonString);

        return jsonString;
    }

    // Helper method to read data from a file
    private String readFromFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufferedReader = new BufferedReader(isr);
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line).append('\n');
        }
        fis.close();
        return stringBuilder.toString();
    }

    // Helper method to write data to a file
    private void writeToFile(File file, String data) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bufferedWriter = new BufferedWriter(osw);
        bufferedWriter.write(data);
        bufferedWriter.close();
        fos.close();
    }
}