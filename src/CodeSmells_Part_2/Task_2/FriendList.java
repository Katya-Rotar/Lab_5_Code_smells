package CodeSmells_Part_2.Task_2;

import java.util.ArrayList;
import java.util.List;

public class FriendList {
    private final List<String> friends;

    public FriendList() {
        this.friends = new ArrayList<>();
    }

    public void addFriend(String friend) {
        friends.add(friend);
    }

    public void removeFriend(String friend) {
        friends.remove(friend);
    }

    public List<String> getFriends() {
        return friends;
    }
}
