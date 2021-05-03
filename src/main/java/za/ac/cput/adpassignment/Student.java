package za.ac.cput.adpassignment;
/**
  * Ratidzai Makondo 218187289
**/


public class Student {
    private int stud1;
    private int stud2;
    private String name;
    private String surname;
    public Student() {
    }

    public long getStud1(){
        return stud1;
    }

    public long getStud2(){
        return stud2;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setStud1(int stud1){
        this.stud1 = stud1;
    }

    public void setStud2(int stud2){
        this.stud2 = stud2;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String Surname){
        this.surname = surname;
    }

    public void show(){
        System.out.println("Student1" + " " + stud1);
        System.out.println("Student2" + " " + stud2);
        System.out.println("Name" + " " + name);
        System.out.println("Surname" + " " + surname);

    }
}


