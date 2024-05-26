package iterator;

import java.util.List;

class UserList {
  private final List<User> users;

  public UserList(List<User> users){
    this.users = users;
  }

  public int getLength(){
    return users.size();
  }

  public User getUserList(int index){
    return users.get(index);
  }

  /**
   * ポイント
   *  iteratorメソッドをオーバーライドしている
   *　引数にUserを指定しているのもポイント
   */
  public Iterator<User> iterator() {
    return new UserListIterator(this);
  }
}