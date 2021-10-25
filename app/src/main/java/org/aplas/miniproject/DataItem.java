package org.aplas.miniproject;

public class DataItem {
    private String name;
    private int image;
    private int detail;

    public DataItem(int image, String name, int detail) {
        this.image = image;
        this.name = name;
        this.detail = detail;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public int getDetail() {
        return detail;
    }

    public void setDetail(int detail) {
        this.detail = detail;
    }

}
