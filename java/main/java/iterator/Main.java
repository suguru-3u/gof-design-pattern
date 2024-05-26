package iterator;

import iterator.Aggregate;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    User user1 = new User("test01",false);
    User user2 = new User("test02",false);
    User user3 = new User("test03",true);
    User user4 = new User("test04",false);
    User user5 = new User("test05",false);
    List<User> users = new ArrayList<>();
    users.add(user1);
    users.add(user2);
    users.add(user3);
    users.add(user4);
    users.add(user5);

    UserList userLists = new UserList(users);

    // 利用側はuserListsでの実装を意識することなく実装することができる。
    Iterator<User> it = userLists.iterator();
    while (it.hasNext()) {
      User user = it.next();
      user.getUsers();
    }


    System.out.println();
  }
}
