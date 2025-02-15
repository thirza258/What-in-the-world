package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;

public class Aed {
    private String name;
    private String symbol;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("symbol")
    public String getSymbol() { return symbol; }
    @JsonProperty("symbol")
    public void setSymbol(String value) { this.symbol = value; }
}
