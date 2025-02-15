package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;

public class BAM {
    private String name;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
}
