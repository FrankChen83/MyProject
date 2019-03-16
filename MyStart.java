public class MyStart {
  public MyStart(String name,String address){
    this.name=name;
    this.address=address;
  }
  
  private String name;
  private String address;
  
  public String makeOne() {
    return name+address;
  }
  
  public static void main(String[] str) {
    MyStart ms=new MyStart("王兰花","万花苑23号304号");
    System.out.println("MyStart..................");
    System.out.println(ms.makeOne());
  }
  
  public static String theDeveloper() {
    return "I am Develper";
  }

}
