/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        int index = 0;
        for (String items : list) {
            System.out.println((index + 1) + ": " + this.list.get(index));
            index++;
        }
    }

    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
