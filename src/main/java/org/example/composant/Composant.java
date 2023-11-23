package org.example.composant;

public abstract class Composant {
    protected String name;
    protected int level;

    public Composant(String name) {
        this.name = name;
    }

    public abstract void view();
    public String tab(){
        String tab="";
        for (int i=0;i<level;i++){
            tab+="\t";
        }
        return tab;
    }


}
