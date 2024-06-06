package Homework3;

public class Homework3 {

    public static void main(String[] args) {

        // 1. массив из 5 строк
        String[] todoList = new String[5];

        todoList[0] = "Сходить в магазин";
        todoList[1] = "Убраться дома";
        todoList[2] = "Дочитать книгу";
        todoList[3] = "Сделать зарядку";
        todoList[4] = "Приготовить ужин";

        for (String todo : todoList) {
            System.out.println(todo);
        }

        // 2. массив с дробными числами с 5-ю знаками после запятой
        double[] numbers = {3.14159, 2.71828, 1.00000};

        for (double number : numbers) {
            System.out.printf("%.5f%n", number);
        }

        //3. массив с 3-мя фильмами
        Movie[] films = new Movie[3];
        films[0] = new Movie("Я шагаю по Москве", 8.8, "Комедия", false);
        films[1] = new Movie("Ирония судьбы, или С лёгким паром!", 8.3, "Комедия", false);
        films[2] = new Movie("Москва слезам не верит", 8.2, "Мелодрама", false);

        films[0].printInfo();
        films[1].printInfo();
        films[2].printInfo();

        //4. напечатать на экран числа от 1 до 1 000 000 000
        for (int i = 1; i <= 1_000_000_000; i++) {
            //     System.out.print(i + "; ");
        }

        //5. перебор массива из задачи 4 в цикле
        for (int i = 0; i <= 2; i++) {
            films[i].printInfo();
        }

        //6. Массив строк
        String[] names = new String[10];

        // Заполнение массива именами
        names[0] = "Алексей";
        names[1] = "Мария";
        names[2] = "Дмитрий";
        names[3] = "Екатерина";
        names[4] = "Сергей";
        names[5] = "Наталья";
        names[6] = "Владимир";
        names[7] = "Анна";
        names[8] = "Михаил";
        names[9] = "Ольга";

        // Вывод на экран только первых трех игроков
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }

    }

}
