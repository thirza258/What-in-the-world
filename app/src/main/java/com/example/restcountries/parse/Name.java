package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class Name {
    private String common;
    private String official;
    private Map<String, Translation> nativeName;

    @JsonProperty("common")
    public String getCommon() { return common; }
    @JsonProperty("common")
    public void setCommon(String value) { this.common = value; }

    @JsonProperty("official")
    public String getOfficial() { return official; }
    @JsonProperty("official")
    public void setOfficial(String value) { this.official = value; }

    @JsonProperty("nativeName")
    public Map<String, Translation> getNativeName() { return nativeName; }
    @JsonProperty("nativeName")
    public void setNativeName(Map<String, Translation> value) { this.nativeName = value; }
}
