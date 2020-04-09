package com.company;

public class Plant {

    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws TypeException,ColorException {
        Color c = colorEnum(color);
        Type t = typeEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
    }

    private Color colorEnum(String color) throws ColorException{
        if(color.equals("green")){
            return Color.Green;
        }else if(color.equals("yellow")){
            return Color.Yellow;
        }else if(color.equals("red")){
            return Color.Red;
        }else throw new ColorException("Please enter only green,yellow,red");
    }
    private Type typeEnum(String type) throws TypeException{
        if(type.equals("rose")){
            return Type.Rose;
        }else if(type.equals("narcissus")){
            return Type.Narcissus;
        }else throw new TypeException("Please enter only narcissus,rose");
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
enum Color{Green,Yellow,Red}
enum Type{Rose,Narcissus}