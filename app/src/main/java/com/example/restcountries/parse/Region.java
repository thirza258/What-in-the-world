package com.example.restcountries.parse;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Region {
    AFRICA, AMERICAS, ANTARCTIC, ASIA, EUROPE, OCEANIA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AFRICA: return "Africa";
            case AMERICAS: return "Americas";
            case ANTARCTIC: return "Antarctic";
            case ASIA: return "Asia";
            case EUROPE: return "Europe";
            case OCEANIA: return "Oceania";
        }
        return null;
    }

    @JsonCreator
    public static Region forValue(String value) throws IOException {
        if (value.equals("Africa")) return AFRICA;
        if (value.equals("Americas")) return AMERICAS;
        if (value.equals("Antarctic")) return ANTARCTIC;
        if (value.equals("Asia")) return ASIA;
        if (value.equals("Europe")) return EUROPE;
        if (value.equals("Oceania")) return OCEANIA;
        throw new IOException("Cannot deserialize Region");
    }
}
