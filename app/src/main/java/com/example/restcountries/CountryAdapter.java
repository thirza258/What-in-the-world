package com.example.restcountries;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restcountries.parse.Country;
import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> implements Filterable {

    private List<Country> data;

    private List<Country> countryListFull;

    public CountryAdapter(List<Country> data) {
        this.data = data;
        this.countryListFull = new ArrayList<>(data);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country item = data.get(position);
        try {
            Picasso.get().load(item.getFlags().getPNG()).into(holder.flag);
        } catch (Exception e){
            Picasso.get().load("https://www.investopedia.com/boeing-stock-tumble-just-latest-example-of-pressure-from-safety-and-other-issues-8423783").into(holder.flag);
        }

        try {
            holder.countryName.setText(item.getName().getOfficial());
        } catch (Exception e){
            holder.countryName.setText("No Country");
        }

        try {
            holder.capital.setText("Capital: " + item.getCapital().get(0));
        } catch (Exception e) {
            Log.d("TAG", "onBindViewHolder: " + item.getName().getOfficial());
            holder.capital.setText("No Capital");
        }

        try {
            long population = Long.parseLong(String.valueOf(item.getPopulation()));

            // Create a DecimalFormat instance with the desired format
            DecimalFormat decimalFormat = new DecimalFormat("#,###");

            // Format the population and set the text
            holder.population.setText("Population: " + decimalFormat.format(population));
        } catch (Exception e) {
            holder.population.setText("No Population");
        }

        try {
            holder.region.setText("Region: " + item.getRegion().toValue());
        } catch (Exception e){
            holder.region.setText("No Region");
        }

        holder.cardCountry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "onClick: " + item.getName().getOfficial());
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public Filter getFilter() {
        return countryFilter;
    }

    private final Filter countryFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Country> filteredList = new ArrayList<>();
            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(countryListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (Country country : countryListFull) {
                    if (country.getName().getOfficial().toLowerCase().contains(filterPattern)) {
                        filteredList.add(country);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            results.count = filteredList.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            data.clear();
            data.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView flag;
        TextView countryName, capital, population, region;
        CardView cardCountry;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flag);
            countryName = itemView.findViewById(R.id.name);
            capital = itemView.findViewById(R.id.capital);
            population = itemView.findViewById(R.id.population);
            region = itemView.findViewById(R.id.region);
            cardCountry = itemView.findViewById(R.id.card_country);
        }
    }
}
