interface Mark {


    double getPercentage();

}

public class Task2 {
    /*
     We have to calculate the average of marks obtained in three subjects by student A and by student B.
     Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average
      percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'.
      The constructor of student A takes the marks in three subjects as its parameters and the marks
      in four subjects as its parameters for student B. Test your code
    */
    public static void main(String[] args) {


        StudentA studentA = new StudentA(76, 78, 86);
        StudentB studentB = new StudentB(89, 90, 90, 86);


        System.out.println("the average of marks obtained in  subjects by studentA  is " + studentA.getPercentage() + ";");
        System.out.println("the average of marks obtained in  subjects by studentB  is " + studentB.getPercentage() + ";");
    }
}

class StudentA implements Mark {
    double sub1;
    double sub2;
    double sub3;

    StudentA(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public double getPercentage() {
        double average = (sub1 + sub2 + sub3) / 3;


        return average;
    }
}

class StudentB implements Mark {
    double sub1;
    double sub2;
    double sub3;
    double sub4;

    public StudentB(double sub1, double sub2, double sub3, double sub4) {

        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;

    }

    public double getPercentage() {
        double avarage = (sub1 + sub2 + sub3 + sub4) / 4;
        return avarage;

    }

}







