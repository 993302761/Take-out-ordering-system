package com.example.demo.entiry;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class Operator implements Serializable {

    private String o_id;
    private String o_passwd;
    private String name;
    private String describe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getO_id() {
        return o_id;
    }

    public void setO_id(String o_id) {
        this.o_id = o_id;
    }

    public String getO_passwd() {
        return o_passwd;
    }

    public void setO_passwd(String o_passwd) {
        this.o_passwd = o_passwd;
    }
}
