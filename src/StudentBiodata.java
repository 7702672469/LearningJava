import java.util.Scanner;

public class StudentBiodata {
    public static void main(String[] args) {
        int stuAge = 23;
        double stuGpa = 8.8;
        char stuInitial = 'p';
        String stuName = "Keerthana";
        System.out.println(stuAge);
        System.out.println(stuGpa);
        System.out.println(stuName);
        System.out.println(stuName + "has a gpa of" + stuGpa + "at the age of:" + stuAge);
        Scanner sc=new Scanner(System.in);
        stuGpa=sc.nextDouble();
        System.out.println(stuName + "has a gpa of" + stuGpa + "at the age of:" + stuAge);

    }
}
