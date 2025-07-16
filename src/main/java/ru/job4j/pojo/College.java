package ru.job4j.pojo;
import java.util.Date;
public class College {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setName("Андрей Евгеньевич Михальков");
        student1.setGroup("ННОП-112");
        student1.setCreated(new Date());
        System.out.println(student1.getName() + " был зачислен в группу : " + student1.getGroup()  +  student1.getCreated());

        Student student2=new Student();
        student2.setName("Соколов Виталий александрович");
        student2.setGroup(student1.getGroup());
        student2.setCreated(new Date());
        System.out.println(student2.getName() + " был зачислен в группу : " + student2.getGroup()  +  student2.getCreated());
    }
}
