package CodeSmells_Part_2.Task_2.newVersion;

import CodeSmells_Part_2.Task_2.Person;

public class LargeClass2 {
    private final Person person;
    private final ListManager friendList;
    private final ListManager enemyList;
    private final ListManager taskList;

    public LargeClass2(String name, int age, String gender) {
        this.person = new Person(name, age, gender);
        this.friendList = new ListHandler();
        this.enemyList = new ListHandler();
        this.taskList = new ListHandler();
    }

    public void displayInfo() {
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Gender: " + person.gender());
        System.out.println("Friends: " + friendList.getItems());
        System.out.println("Enemies: " + enemyList.getItems());
        System.out.println("Tasks: " + taskList.getItems());
    }
}
