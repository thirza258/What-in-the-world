package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;

public class Translation {
    private String official;
    private String common;

    @JsonProperty("official")
    public String getOfficial() { return official; }
    @JsonProperty("official")
    public void setOfficial(String value) { this.official = value; }

    @JsonProperty("common")
    public String getCommon() { return common; }
    @JsonProperty("common")
    public void setCommon(String value) { this.common = value; }
}
