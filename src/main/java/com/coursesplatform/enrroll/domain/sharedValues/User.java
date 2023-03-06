package com.coursesplatform.enrroll.domain.sharedValues;

import com.coursesplatform.enrroll.generic.ValueObject;

import java.util.Objects;

public class User implements ValueObject<String> {

    private String value;

    public User(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
