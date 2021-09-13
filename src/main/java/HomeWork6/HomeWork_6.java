package HomeWork6;

public class HomeWork_6 {
    public static void main(String[] args){
    //1. Создать классы Собака и Кот с наследованием от класса Животное.
        //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); ->
        // 'Бобик пробежал 150 м.');
        //3. У каждого животного есть ограничения на действия (например бег: кот 200 м., собака 500 м.;
        // плавание: кот не умеет плавать, собака 10 м.).
        //4. * Добавить подсчет созданных котов, собак и животных.



        Animal[] animals = {
                new Cat("Boris"),
                new Dog("Maks", 550, 20),
                new Cat("Murzik"),
                new Dog("Topik", 190, 9),
        };

        System.out.println("Колличество животных у меня: " + animals.length);

        for(Animal i  : animals) {
            i.run(190);
            i.run(210);
            i.run(510);
            i.run(450);
            i.swimm(12);
            i.swimm(10);
            i.swimm(20);

        }



    }

}