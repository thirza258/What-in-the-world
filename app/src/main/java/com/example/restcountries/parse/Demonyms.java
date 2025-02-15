package com.example.restcountries.parse;

import com.fasterxml.jackson.annotation.*;

public class Demonyms {
    private Eng eng;
    private Eng fra;

    @JsonProperty("eng")
    public Eng getEng() { return eng; }
    @JsonProperty("eng")
    public void setEng(Eng value) { this.eng = value; }

    @JsonProperty("fra")
    public Eng getFra() { return fra; }
    @JsonProperty("fra")
    public void setFra(Eng value) { this.fra = value; }
}
