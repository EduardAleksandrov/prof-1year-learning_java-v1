package org.example.book;

public class State {
    String value = "Default";  // значение по умолчанию

    //  инициализатор
    {
        System.out.println("Initializator. Old value: " + value);
        value = "Initializator";
    }

    // конструктор
    State(){
        System.out.println("Constructor. Old value: " + value);
        value = "Constructor";
    }
}
