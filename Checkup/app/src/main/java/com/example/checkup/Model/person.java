package com.example.checkup.Model;

import java.util.Date;

public class person {
    private String MSSV;
    private String Name;
    private String birthdate;
    private String face;
    private Date marked;

    public person(String MSSV, String name, String birthdate, String face) {
        this.MSSV = MSSV;
        Name = name;
        this.face = face;
        this.birthdate = birthdate;
    }

    public person(String MSSV, String name, String birthdate) {
        this.MSSV = MSSV;
        Name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "person{" +
                "MSSV=" + MSSV +
                ", Name='" + Name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    public Date getMarked() {
        return marked;
    }

    public void setMarked(Date marked) {
        this.marked = marked;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
