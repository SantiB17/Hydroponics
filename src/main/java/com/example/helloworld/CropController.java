package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CropController {

    @RequestMapping(method=RequestMethod.POST, value = "/crops")
    public void addCrop() {
        
    }

}
