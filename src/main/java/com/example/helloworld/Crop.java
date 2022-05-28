package com.example.helloworld;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Crop {

    public Crop() {
    }
   @JsonCreator
    public Crop(@JsonProperty("name") String name, @JsonProperty("dateHarvested") String dateHarvested) {
        this._name = name;
        this._datePlanted = dateHarvested;
    }

    public String get_datePlanted() {
        return _datePlanted;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return _name;
    }

    public void set_datePlanted(String _datePlanted) {
        this._datePlanted = _datePlanted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "id=" + id +
                ", _name='" + _name + '\'' +
                ", _datePlanted='" + _datePlanted + '\'' +
                '}';
    }

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String _name;
    private String _datePlanted;

}
