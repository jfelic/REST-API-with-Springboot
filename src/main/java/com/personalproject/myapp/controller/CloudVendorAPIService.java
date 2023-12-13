package com.personalproject.myapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalproject.myapp.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;
    
    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendorDetails(String vendorID){
        return cloudVendor;
        
        /* 
        new CloudVendor("C1", "Vendor 1", 
        "Address One", "xxxxx");
        */
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully.";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully.";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(String vendorID) {
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully.";
    }
}
