package com.example.restcountries.parse;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum StartOfWeek {
    MONDAY, SATURDAY, SUNDAY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case MONDAY: return "monday";
            case SATURDAY: return "saturday";
            case SUNDAY: return "sunday";
        }
        return null;
    }

    @JsonCreator
    public static StartOfWeek forValue(String value) throws IOException {
        if (value.equals("monday")) return MONDAY;
        if (value.equals("saturday")) return SATURDAY;
        if (value.equals("sunday")) return SUNDAY;
        throw new IOException("Cannot deserialize StartOfWeek");
    }
}
