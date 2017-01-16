package creational.builder;

import creational.builder.builder.Builder;

/**
 * Created by jason-geng on 1/16/17.
 */
public class Director {

    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        this.builder.productA();
        this.builder.productB();
        this.builder.productC();
    }
}
