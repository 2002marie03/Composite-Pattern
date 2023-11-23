package org.example.composant;

public class File extends Composant{
    private String name;

    public File(String name) {
        super(name);
    }

    @Override
    public void view() {
        System.out.println(tab()+"File name: "+name);

    }
}
