package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CropController {

    public CropController(List<Crop> cropList) {
        this._cropList = cropList;
    }
    @PostMapping("/crops")
    public String addCrop(@RequestBody Crop crop) {
        _cropRepository.save(crop);
        return crop.getName() + " saved";
    }
    @GetMapping("/crops")
    public List<Crop> getAllCrops() {
       _cropRepository.findAll()
               .forEach(_cropList::add);
       return _cropList;
    }
    @Override
    public String toString() {
        return _cropList.stream()
                .map(Crop::getName)
                .collect(Collectors.joining(", "));
    }

    @Autowired
    private CropRepository _cropRepository;
    private List<Crop> _cropList;
}
