package com.gapstars.dumiduh.models;

public class TestData {
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    private String Id;
    private String stringValue;
    private int intValue;
}
