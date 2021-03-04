package com.luv2code.com.swagger.models;

//1.add swagger
//2.Enable swagger

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the Contact")
public class Contact {

    @ApiModelProperty(notes = "the unique id of the contact")
    private String id;
    @ApiModelProperty(notes = "the person's name")
    private String name;
    @ApiModelProperty(notes = "the person phone number")
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
