package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;

public class PostalCode {
    private String format;
    private String regex;

    @JsonProperty("format")
    public String getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(String value) { this.format = value; }

    @JsonProperty("regex")
    public String getRegex() { return regex; }
    @JsonProperty("regex")
    public void setRegex(String value) { this.regex = value; }
}
