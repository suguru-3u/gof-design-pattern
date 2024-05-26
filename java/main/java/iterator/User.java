package iterator;

class User {
  private String name;

  private boolean adminFlg;

  public User(String name, boolean adminFlg){
    this.name = name;
    this.adminFlg = adminFlg;
  }

  public void getUsers(){
     final String authority = this.adminFlg ? "管理者" : "一般ユーザー";
     System.out.println(this.name + " : " + authority);
  }
}