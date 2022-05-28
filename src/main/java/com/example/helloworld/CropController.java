package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CropController {

    public CropController(List<Crop> cropList) {
        this._cropList = cropList;
    }

    @RequestMapping(method= RequestMethod.POST, value = "/crops")
    public List<Crop> addCrop(@RequestBody Crop crop) {
        _cropList.add(crop);
        return _cropList;
    }

    private List<Crop> _cropList;
}
