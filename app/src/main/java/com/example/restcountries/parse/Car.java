package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Car {
    private List<String> signs;
    private Side side;

    @JsonProperty("signs")
    public List<String> getSigns() { return signs; }
    @JsonProperty("signs")
    public void setSigns(List<String> value) { this.signs = value; }

    @JsonProperty("side")
    public Side getSide() { return side; }
    @JsonProperty("side")
    public void setSide(Side value) { this.side = value; }
}
