package com.example.restcountries.parse;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Side {
    LEFT, RIGHT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LEFT: return "left";
            case RIGHT: return "right";
        }
        return null;
    }

    @JsonCreator
    public static Side forValue(String value) throws IOException {
        if (value.equals("left")) return LEFT;
        if (value.equals("right")) return RIGHT;
        throw new IOException("Cannot deserialize Side");
    }
}
