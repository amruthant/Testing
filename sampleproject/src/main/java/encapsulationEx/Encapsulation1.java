package encapsulationEx;

public class Encapsulation1 {
private int age;
private String name;

public void setter(String name , int age) {
	this.age = age;
	this.name =name;
}

public void getter(){
	System.out.println("age =" +age + " name ="+name);
}
}
