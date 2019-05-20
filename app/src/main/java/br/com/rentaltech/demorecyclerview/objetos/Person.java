package br.com.rentaltech.demorecyclerview.objetos;

import java.util.ArrayList;
import java.util.List;

import br.com.rentaltech.demorecyclerview.R;

//Modelo Pessoa
public class Person {
    private String name;
    private String age;
    private int photoId;

    public Person(String name, String age, int photoId){
        this.setName(name);
        this.setAge(age);
        this.setPhotoId(photoId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

}
