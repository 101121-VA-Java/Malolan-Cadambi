package Scope_Basics;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;

        plusTwo(i);

        System.out.println("i = " + i);

        User u = new User();

        u.name = "Malolan";

       System.out.println(u.sayMyName());

        System.out.println(User.numberOfUser);

        User b = new User("Cadambi");

        System.out.println(b.sayMyName());

        Driver.sayStatic();

        System.out.println(u.numberOfUser);

        System.out.println(User.numberOfUser);

        User.printNumOfUser();
    }

    public static void saySomething(){
        String s = "Hello";

        System.out.println(s);
    }

    public static void plusTwo(int i){
        i = i + 2; // i += 2;
        System.out.println(i);
    }

    public static void setNameToKevin(User u){
        u.name = "Kevin";
        System.out.println(u.name);
    }

    public static void sayStatic(){
        System.out.println("I'm a static method");
    }
	}


