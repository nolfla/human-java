public class Human(){
  public String name;
  
  public Human(String inputName){
    this.name = inputName;
  }
  
  public void sayName(String name){
    System.out.println("My name is " + name);
  }
  
  public static void main(String[] args){
    Human hero = new Human("Clark Kent");
    hero.sayName("Superman");
  }
}
