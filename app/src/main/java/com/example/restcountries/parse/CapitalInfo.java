package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CapitalInfo {
    private List<Double> latlng;

    @JsonProperty("latlng")
    public List<Double> getLatlng() { return latlng; }
    @JsonProperty("latlng")
    public void setLatlng(List<Double> value) { this.latlng = value; }
}
