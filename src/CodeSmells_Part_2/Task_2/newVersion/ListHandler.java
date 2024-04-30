package CodeSmells_Part_2.Task_2.newVersion;

import java.util.ArrayList;
import java.util.List;

public class ListHandler implements ListManager {
    private final List<String> items;

    public ListHandler(){
        this.items = new ArrayList<>();
    }
    @Override
    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public void removeItem(String item) {
        items.remove(item);
    }

    @Override
    public List<String> getItems() {
        return items;
    }
}
