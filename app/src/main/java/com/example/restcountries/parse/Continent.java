package com.example.restcountries.parse;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Continent {
    AFRICA, ANTARCTICA, ASIA, EUROPE, NORTH_AMERICA, OCEANIA, SOUTH_AMERICA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AFRICA: return "Africa";
            case ANTARCTICA: return "Antarctica";
            case ASIA: return "Asia";
            case EUROPE: return "Europe";
            case NORTH_AMERICA: return "North America";
            case OCEANIA: return "Oceania";
            case SOUTH_AMERICA: return "South America";
        }
        return null;
    }

    @JsonCreator
    public static Continent forValue(String value) throws IOException {
        if (value.equals("Africa")) return AFRICA;
        if (value.equals("Antarctica")) return ANTARCTICA;
        if (value.equals("Asia")) return ASIA;
        if (value.equals("Europe")) return EUROPE;
        if (value.equals("North America")) return NORTH_AMERICA;
        if (value.equals("Oceania")) return OCEANIA;
        if (value.equals("South America")) return SOUTH_AMERICA;
        throw new IOException("Cannot deserialize Continent");
    }
}
