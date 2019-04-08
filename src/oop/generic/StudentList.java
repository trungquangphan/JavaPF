package oop.generic;

public class StudentList {
    static int n;
    int number;
    int lenght=0;
    Studen[] studens;

    public StudentList(int number) {
        this.number = number;
        studens = new Studen[this.number];

    }

    public void add(Studen student) {

        if(lenght >= studens.length){
            Studen[] studens1 = new Studen[studens.length + 10];
            for(int i = studens.length - 1; i >= 0; i--){
                studens1[i] = studens[i];
            }
            studens1[lenght++] = student;
            studens = studens1;
        }else{
            studens[lenght++]=student;

        }

    }
}
