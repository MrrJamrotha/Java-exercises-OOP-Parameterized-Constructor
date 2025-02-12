//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog myDog1 = new Dog("Ah kiki","Black");
        Dog myDog2 = new Dog("Ah Ter","Blue");

        System.out.println("My dog 1 name = "+ myDog1.getName()+" Color = " + myDog1.getColor() );
        System.out.println("My dog 2 name = "+ myDog2.getName()+" Color = " + myDog2.getColor() );
    }
}