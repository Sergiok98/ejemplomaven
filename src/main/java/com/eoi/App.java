package com.eoi;


public class App {
    public static void main( String[] args ){
        Person p = new Person("Juan", 24);
        p.setNombre("Pepe");
        p.setEdad(23); 
        System.out.println("Nombre: " + p.getNombre()+ "\nEdad: " + p.getEdad()); 
        System.out.println(p);
    }
}
