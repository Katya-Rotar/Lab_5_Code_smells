package CodeSmells_Part_2.Task_2.newVersion;

import java.util.List;

public interface ListManager {
    void addItem(String item);
    void removeItem(String item);
    List<String> getItems();
}
