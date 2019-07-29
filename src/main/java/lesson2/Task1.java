package lesson2;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 * - не должно быть возможности напрямую устанваливать или читать значение age/name
 * - нельзя установить значение age меньше нуля
 * - максимальныое значение для возраста - 100
 * - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 * - name не может состоять из одних только пробелов
 * - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 * оно должно быть записано в переменную name с большой буквы
 * - ageGroup должен устанавливаться автоматически при установке возраста
 * - child если age до 15 лет
 * - student  - если age от 15 до 25 лет
 * - worker - если age от 26 до 65 лет
 * - pensioner - если age старше 66 лет
 * - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

class Task1 {

    private int age = 0;
    private String name = "unknown name";
    private String ageGroup = "unknown ageGroup";

    void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
            if (age < 15) {
                ageGroup = "child";
            } else if (age >= 15 && age <= 25) {
                ageGroup = "student";
            } else if (age > 25 && age <= 65) {
                ageGroup = "worker";
            } else {
                ageGroup = "pensioner";
            }
        }
    }

    int getAge() {
        return age;
    }

    void setName(String name) {
        if (name.length() >= 3 && name.length() <= 50) {
            if (name.trim().length() >= 3 && name.trim().length() <= 50)
                this.name = name.trim().substring(0, 1).toUpperCase() + name.trim().substring(1).toLowerCase();
        }
    }

    String getName() {
        return name;
    }

    private void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;

    }

    String getAgeGroup() {
        return ageGroup;
    }

}
