package com.example.helloworld;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CropController {

    public CropController(List<Crop> cropList) {
        this._cropList = cropList;
    }
    @PostMapping("/crops")
    public String addCrop(@RequestBody Crop crop) {
        _cropList.add(crop);
        return crop.getName() + " added";
    }
    @GetMapping("/crops")
    public String all() {
        return toString();
    }
    @Override
    public String toString() {
        return _cropList.stream()
                .map(Crop::getName)
                .collect(Collectors.joining(", "));
    }

    private List<Crop> _cropList;
}
