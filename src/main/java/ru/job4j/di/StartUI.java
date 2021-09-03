package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StartUI {

    private Store store;
    private ConsoleInput input;

//    public StartUI(Store store, ConsoleInput input) {
//        this.store = store;
//        this.input = input;
//    }

    @Autowired
    public void setInput(ConsoleInput input) {
        this.input = input;
    }

    @Autowired
    public void setStore(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void askInput(String question) {
        input.askStr(question);
    }

    public void printStore() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}