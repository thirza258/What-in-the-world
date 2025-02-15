package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Idd {
    private String root;
    private List<String> suffixes;

    @JsonProperty("root")
    public String getRoot() { return root; }
    @JsonProperty("root")
    public void setRoot(String value) { this.root = value; }

    @JsonProperty("suffixes")
    public List<String> getSuffixes() { return suffixes; }
    @JsonProperty("suffixes")
    public void setSuffixes(List<String> value) { this.suffixes = value; }
}
