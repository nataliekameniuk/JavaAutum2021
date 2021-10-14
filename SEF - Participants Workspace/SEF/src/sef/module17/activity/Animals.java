package sef.module17.activity;
import java.util.ArrayList;
import java.util.List;

public class Animals {

        private ArrayList<String> species = new ArrayList<>();
        private String color;
        public Animals();{

        species.add("Dog");
        species.add("Cat");
        species.add("Mouse");
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}

