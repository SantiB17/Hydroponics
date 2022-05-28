package com.example.helloworld;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Crop {
   @JsonCreator
    public Crop(@JsonProperty("name") String name, @JsonProperty("dateHarvested") String dateHarvested) {
        this._name = name;
        this._datePlanted = dateHarvested;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    private String _name;
    private String _datePlanted;
}
