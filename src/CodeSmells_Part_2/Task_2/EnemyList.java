package CodeSmells_Part_2.Task_2;

import java.util.List;
import java.util.ArrayList;

public class EnemyList {
    private final List<String> enemies;

    public EnemyList() {
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(String enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(String enemy) {
        enemies.remove(enemy);
    }

    public List<String> getEnemies() {
        return enemies;
    }
}
