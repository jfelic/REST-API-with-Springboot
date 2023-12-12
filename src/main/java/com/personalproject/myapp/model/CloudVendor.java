package com.personalproject.myapp.model;

public class CloudVendor {
    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    /* Blank constructor */
    public CloudVendor(){}

    /* Constructor with parameters */
    public CloudVendor (String vendorID, String vendorName, String vendorAddress,
    String vendorPhoneNumber) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    /* Getters */
    public String getVendorID() {
        return this.vendorID;
    }
    public String getVendorName() {
        return this.vendorName;
    }
    public String getVendorAddress(){
        return this.vendorAddress;
    }
    public String getVendorPhoneNumber() {
        return this.vendorPhoneNumber;
    }
    /* Getters End */

    /* Setters */
    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
     public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
    /* Setters End */

}
