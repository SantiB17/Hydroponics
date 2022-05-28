package com.example.helloworld;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Crop {
   @JsonCreator
    public Crop(@JsonProperty("_name") String name) {
        this._name = name;
        this.dateHarvested =
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    private String _name;
    private String dateHarvested;
}
