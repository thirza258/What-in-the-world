package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;

public class CoatOfArms {
    private String png;
    private String svg;

    @JsonProperty("png")
    public String getPNG() { return png; }
    @JsonProperty("png")
    public void setPNG(String value) { this.png = value; }

    @JsonProperty("svg")
    public String getSVG() { return svg; }
    @JsonProperty("svg")
    public void setSVG(String value) { this.svg = value; }
}
