package com.example.exampleinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.Serializable;

public class result extends AppCompatActivity implements Serializable {

    String name="";
    private String number="";
    private String address="";
    private static final long serialVersionUID = 46543445;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }

    public String getAddress()
    {
        return address;
    }




    }

