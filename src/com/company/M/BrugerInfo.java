package com.company.M;

/**
 * Created by Kenedid on 15-05-2017.
 */
public class BrugerInfo {

    private String navn;
    private String age;
    private String addrese;
    private String email;
    private String cpr;

    public BrugerInfo(String cpr, String navn, String addrese, String email, String age){

        this.navn = navn;
        this.addrese = addrese;
        this.age = age;
        this.email = email;
        this.cpr = cpr;
    }

    public String getAge() {return age;
    }

    public String getAddrese(){return addrese;
    }

    public String getCpr(){return cpr;
    }

    public String getEmail(){return email;
    }

    public String getName(){return navn;
    }


    public void setAddrese(String addrese) {
        this.addrese = addrese;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.navn = navn;
    }

    public void setCpr(String cpr) {this.cpr= cpr;
    }
}
