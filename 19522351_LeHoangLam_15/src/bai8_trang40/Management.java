package bai8_trang40;

import java.util.ArrayList;
import java.util.Collections;

public class Management {

	private ArrayList<Person> peopleList;
    int numberOfPeople;

    public Management(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.peopleList = new ArrayList<Person>(numberOfPeople);
    }

    public void addPerson(Person Person) {
        peopleList.add(Person);
    }

    public void removePerson(String name) {
        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).getName().equals(name)) {
                peopleList.remove(i);
                return;
            }
        }
    }

    public void sortByName() {
        Collections.sort(peopleList,Collections.reverseOrder());
    }

    public void displayPeople() {
        System.out.printf("%-20s %-20s %-20s\n", "Name", "Address", "Details");
        for (Person Person : peopleList) {
            System.out.println(Person);
        }
    }

}
