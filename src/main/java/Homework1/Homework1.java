package Homework1;

public class Homework1 {

        public static void main(String[] args) {

            String city = "Khanty-Mansijsk";
            System.out.println("\nСтрока: " + city+"\n");

            //проверяет, является ли строка пустой
            boolean result1 = city.isEmpty();
            System.out.println(".isEmpty:\t\t" + (result1 ? "Строка пустая" : "Строка не пустая"));

            //проверяет, содержит ли строка только пробелы или является пустой
            boolean result2 = city.isBlank();
            System.out.println(".isBlank:\t\t" + (result2 ? "Строка содержит только пробелы или пустая" : "Строка не пустая и не содержит только пробелы"));

            // Получение подстроки с 0-го по 6-й индекс (включительно, но без 6)
            String result3 = city.substring(0, 6);
            System.out.println(".substring:\t\tСтрока с 0-го по 6-ой индекс: " + result3);

            //Получение подстроки начиная с 7 индекса
            String result4 = city.substring(7);
            System.out.println(".substring:\t\tСтрока, начиная с 7 индекса: " + result4);

            // Нахождение  индекса первого вхождения подстроки в строку
            int result5 = city.indexOf("a");
            System.out.println(".indexOf:\t\tИндекс первого вхождения 'a': "+result5);

            //  Нахождение  индекса последнего вхождения подстроки в строку
            //        int result4 = city.indexOf("a");
            int result6 = city.lastIndexOf("a");
            System.out.println(".indexOf:\t\tИндекс первого вхождения 'a': "+result6);

            // Преобразование строки в нижний регистр
            String result7 = city.toLowerCase();
            System.out.println((".toLowerCase:\tСтрока в нижнем регистре: "+result7));

            // Преобразование строки в верхний регистр
            String result8 = city.toUpperCase();
            System.out.println((".toUpperCase:\tСтрока в верхнем регистре: "+result8));

            //Замена вхождения указанного символа или подстроки в исходной строке на другой символ или подстроку
            String result9 = city.replace("a","AA");
            System.out.println((".replace:\t\tИзмененная строка: "+result9));

            //Проверяет, начинается ли строка с указанной подстроки
            boolean result10 = city.startsWith("Khanty");
            System.out.println(".startsWith:\t" + (result10 ? "Строка начинается с Khanty" : "Строка не начинается с Khanty"));

            //Проверяет, заканчивается ли строка с указанной подстроки
            boolean result11 = city.endsWith("Khanty");
            System.out.println(".endsWith:\t\t" + (result11 ? "Строка заканчивается на Khanty" : "Строка не заканчивается на Khanty"));

            //Повторяет строку указанное количество раз и возвращает новую строку, состоящую из повторений исходной строки.
            String result12 = city.repeat(3);
            System.out.println((".repeat:\t\tПолученная строка: "+result12));

            //Проверяет, содержит ли строка указанную последовательность символов или подстроку
            boolean result13 = city.contains("ma");
            System.out.println(".contains:\t\t" + (result13 ? "Строка содержит 'ma'" : "Строка не содержит 'ma'"));

            //Объединяет текущую строку с указанной строкой
            String result14 = city.concat(", ХМАО-Югра");
            System.out.println((".concat:\t\tПолученная строка: "+result14));


            //Удаляет все начальные и конечные пробелы
            String initCity = "   Khanty-Mansijsk    ";
            String result15 = city.trim();
            System.out.println((".trim:\t\t\tИсходная строка: " + initCity + " Очищенная строка: "+result15));

            //Сравнение строк
            String anotherCity="Сургут";
            boolean result16 = city.equals(anotherCity);
            System.out.println(".equals:\t\tПервая строка: " + city + " Вторая строка: "+ anotherCity + " -- " +
                    (result13 ? "Строки равны" : "Строки не равны"));
        }


}
