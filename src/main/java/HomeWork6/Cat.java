package HomeWork6;

public class Cat extends Animal{
    private static final int StaminaToRun = 200;
    private static final int StaminaToSwim = 0;


     Cat(String name) {  // конструктор
        super( "Cat", name, StaminaToRun, StaminaToSwim);  //ссылка  на объект родительского типа, только в первой строке конструктора

    }


    public boolean swim(int distance){
        System.out.println(getName() + "can't swimming");
        return false;
    }


}
