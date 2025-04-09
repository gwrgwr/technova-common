package com.technova.vendor.dto;

import com.technova.user.Address;
import com.technova.user.PhoneNumber;

public class VendorCreateDTO {
    private String companyName;

    private String companyType;

    private String companyRegistrationNumber;

    private String name;

    private String username;

    private String email;

    private String password;

    private Address address;

    private PhoneNumber phoneNumber;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public VendorCreateDTO(String companyName, String companyType, String companyRegistrationNumber, String name, String username, String email, String password, Address address, PhoneNumber phoneNumber) {
        this.companyName = companyName;
        this.companyType = companyType;
        this.companyRegistrationNumber = companyRegistrationNumber;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public VendorCreateDTO() {}
}
