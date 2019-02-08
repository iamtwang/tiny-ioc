package io.github.iamtw.tinyioc;

public class Dummy {

    private String name;

    public String hello(){
        return "Hello " + name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
