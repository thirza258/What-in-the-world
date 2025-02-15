package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;

public class Eng {
    private String f;
    private String m;

    @JsonProperty("f")
    public String getF() { return f; }
    @JsonProperty("f")
    public void setF(String value) { this.f = value; }

    @JsonProperty("m")
    public String getM() { return m; }
    @JsonProperty("m")
    public void setM(String value) { this.m = value; }
}
