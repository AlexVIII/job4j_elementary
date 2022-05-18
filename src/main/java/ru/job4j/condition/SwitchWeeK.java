package ru.job4j.condition;

public class SwitchWeeK {
    public static String nameDay(int day) {
        String name;
        if (day >= 1 && day <= 7) {
            switch (day) {
                case 1:
                    name = "Понедельник";
                    break;
                case 2:
                    name = "Вторник";
                    break;
                case 3:
                    name = "Среда";
                    break;
                case 4:
                    name = "Четверг";
                    break;
                case 5:
                    name = "Пятница";
                    break;
                case 6:
                    name = "Суббота";
                    break;
                case 7:
                    name = "Воскресенье";
                    break;
                default:
                    name = "NotDAY";
            }
            return name;
        }
    }
}

