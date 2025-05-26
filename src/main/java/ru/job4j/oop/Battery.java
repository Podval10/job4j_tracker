package ru.job4j.oop;

// Создаем класс с именем Battery
public class Battery {
//    Создаем поле класса с именем load
    private int load;
//    Создаем конструктор класса Battery в скобках задаем тип (int) входного параметра (load).
    public Battery(int load) {
//        Задаем значение для поля класса(this.load), которая равняется входному параметру(load).
        this.load = load;
    }
// Создаем метод типа String под названием about.
    public String about() {
// Ссылаясь на этот метод вернуть(вывести) строку "My charge: " + load + "%";
        return "My charge: " + load + "%";
    }

// Создаем метод(exchange),который будет принимать объект типа Battery.
    public void exchange(Battery another) {
// В теле метода exchange пишем,что входной параметр(объекту another класса Battery) его поля load
// приравниваем сумму поля load объекта от которого вызываем текущий метод
// и поля load объекта another(входного параметра)
        another.load=this.load+another.load;
        // В теле метода exchange пишем,объект от которого вызываем метод приравниваем поле объекта load к нулю.
        this.load=0;

    }

// Создаем метод(маин) для демонстрации работы.
    public static void main(String[] args) {
//        Создаем объект класса с названием first и в него передаем данные(70)
        Battery first = new Battery(70);
//        Создаем объект класса с названием second и в него передаем данные(30)
        Battery second = new Battery(30);
//        Команда вывода в консоль( "First." + у объекта first вызываем метод about.)
        System.out.println("First." + first.about());
        //  Команда вывода в консоль( "Second." + у объекта second вызываем метод about.)
        System.out.println("Second." + second.about());
//        У объекта first вызываем метод pour. В нем есть поле this.value - this - указывает на то
//        что нужно взять значение этой переменной у объекта для которого мы вызываем метод:
        first.exchange(second);
        //        Команда вывода в консоль( "First." + у объекта first вызываем метод about.)
        System.out.println("First." + first.about());
        //  Команда вывода в консоль( "Second." + у объекта second вызываем метод about.)
        System.out.println("Second." + second.about());
    }
}
