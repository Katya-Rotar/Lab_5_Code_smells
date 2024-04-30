package CodeSmells_Part_2.Task_2;

public class LargeClass {
    private final Person person;
    public final FriendList friendList;
    public final EnemyList enemyList;
    public final TaskList taskList;

    public LargeClass(String name, int age, String gender) {
        this.person = new Person(name, age, gender);
        this.friendList = new FriendList();
        this.enemyList = new EnemyList();
        this.taskList = new TaskList();
    }

    public void displayInfo() {
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Gender: " + person.gender());
        System.out.println("Friends: " + friendList.getFriends());
        System.out.println("Enemies: " + enemyList.getEnemies());
        System.out.println("Tasks: " + taskList.getTasks());
    }
}
