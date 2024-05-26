package iterator;

import iterator.User;
import java.util.NoSuchElementException;

class UserListIterator implements Iterator<User> {

  private final UserList userList;

  private int index;

  public  UserListIterator(UserList userList){
    this.userList = userList;
    this.index = 0;
  }

  @Override
  public boolean hasNext(){
    if (index < userList.getLength()) {
      return true;
    } else {
      return false;
    }
  }

  // 特定の要素のみ返却する処理に返ることもできそう。
  @Override
  public User next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    User user = userList.getUserList(index);
    index++;
    return user;
  }
}