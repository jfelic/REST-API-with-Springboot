package com.personalproject.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalproject.myapp.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(String vendorID){
        return new CloudVendor("C1", "Vendor 1", 
        "Address One", "xxxxx");
    }
}
