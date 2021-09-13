package HomeWork6;

public class Animal {


    private String type;
    private String name;  //параметры животного
    private int StaminaToRun;  //параметры животного
    private int StaminaToSwim;  //параметры животного



    public Animal(String type, String name, int staminaToRun, int staminaToSwim) {
        this.type = type;
        this.name = name;
        StaminaToRun = staminaToRun;
        StaminaToSwim = staminaToSwim;
    }

    public boolean run(int distance){
        if(distance <= StaminaToRun){
            System.out.printf("%s %s can run %d meters!\n", type, name, StaminaToRun);
            return true;
        } else
            System.out.printf("%s %s can't run %d meters!\n", type, name, StaminaToRun);
        return false;
    }

    public boolean swimm(int distance){
        if(distance <= StaminaToSwim){
            System.out.printf("%s %s can swimming %d meters!\n", type, name, StaminaToSwim);
            return true;
        } else
            System.out.printf("%s %s can't swimming %d meters!\n", type, name, StaminaToSwim);
        return false;

    }


    public String getName() {
        return name;
    }








}
