package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;

public class Maps {
    private String googleMaps;
    private String openStreetMaps;

    @JsonProperty("googleMaps")
    public String getGoogleMaps() { return googleMaps; }
    @JsonProperty("googleMaps")
    public void setGoogleMaps(String value) { this.googleMaps = value; }

    @JsonProperty("openStreetMaps")
    public String getOpenStreetMaps() { return openStreetMaps; }
    @JsonProperty("openStreetMaps")
    public void setOpenStreetMaps(String value) { this.openStreetMaps = value; }
}
