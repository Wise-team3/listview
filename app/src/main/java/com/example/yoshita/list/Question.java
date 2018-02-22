package com.example.yoshita.list;

import java.io.Serializable;

/**
 * Created by yoshita on 22-02-2018.
 */

public class Question implements Serializable {
    String name;

    public Question(String name) {
        this.name = name;
//here we can add more fields like description,answers etc
    }

    public String getName() {
        return name;
    }
}
