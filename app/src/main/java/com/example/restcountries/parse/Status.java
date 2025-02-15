package com.example.restcountries.parse;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Status {
    OFFICIALLY_ASSIGNED, USER_ASSIGNED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OFFICIALLY_ASSIGNED: return "officially-assigned";
            case USER_ASSIGNED: return "user-assigned";
        }
        return null;
    }

    @JsonCreator
    public static Status forValue(String value) throws IOException {
        if (value.equals("officially-assigned")) return OFFICIALLY_ASSIGNED;
        if (value.equals("user-assigned")) return USER_ASSIGNED;
        throw new IOException("Cannot deserialize Status");
    }
}
