package com.example.marcio.mrcobranch;

/**
 * Created by Marcio on 10/15/2017.
 */

public class Clothes {

    String name;
    String colour;
    String type;
    String material;
    String photoId;
    String wheather;

    public Clothes(String n,String c,String t, String m, String pId){

        name=n;
        colour =c;
        type = t;
        material=m;
        photoId=pId;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
}