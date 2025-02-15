package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;

public class Flags {
    private String png;
    private String svg;
    private String alt;

    @JsonProperty("png")
    public String getPNG() { return png; }
    @JsonProperty("png")
    public void setPNG(String value) { this.png = value; }

    @JsonProperty("svg")
    public String getSVG() { return svg; }
    @JsonProperty("svg")
    public void setSVG(String value) { this.svg = value; }

    @JsonProperty("alt")
    public String getAlt() { return alt; }
    @JsonProperty("alt")
    public void setAlt(String value) { this.alt = value; }
}
