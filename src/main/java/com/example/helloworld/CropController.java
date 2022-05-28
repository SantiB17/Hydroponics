package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CropController {

    public CropController(List<Crop> cropList) {
        this._cropList = cropList;
    }

    @RequestMapping(method= RequestMethod.POST, value = "/crops")
    public String addCrop(@RequestBody Crop crop) {
        _cropList.add(crop);
        return crop.getName() + " added";
    }

    @Override
    public String toString() {
        return _cropList.stream()
                .map(Crop::getName)
                .collect(Collectors.joining(", "));
    }

    private List<Crop> _cropList;
}
