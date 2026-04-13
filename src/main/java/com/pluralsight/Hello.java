

public class sayHello {

    public sayHello() {
        System.out.println("Hello");
    }
}

public class sayGoodbye {
   public sayGoodbye(){
       System.out.println("Goodbye");
   }
}

public class sayGoodmorning {
    public sayGoodmorning(){
        System.out.println("Good morning");
    }
}


public  void main(String[] args) {

    sayHello hello = new sayHello();
    sayGoodbye goodbye = new sayGoodbye();
    sayGoodmorning goodmorning = new sayGoodmorning();

}


