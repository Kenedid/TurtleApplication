package com.company;

/**
 * Created by Kenedid on 15-05-2017.
 */
public class Bruger {

    private String name;
    private int age;
    private String addrese;
    private String email;

    public Bruger(String name,int age,String addrese,String email){

        this.name = name;
        this.addrese = addrese;
        this.age = age;
        this.email = email;
    }

    public int getAge() {return age;
    }

    public String getAddrese(){return addrese;
    }

    public String getEmail(){return email;
    }

    public String getName(){return name;
    }


    public void setAddrese(String addrese) {
        this.addrese = addrese;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
