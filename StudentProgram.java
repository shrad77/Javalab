import java.util.*;
public class student {
    Scanner Sc = new Scanner(System.in);
    double sgpa,soc,tot;
    String name,usn;
    int credits[] = {5,7,10,7,6};
    int marks[] = new int[5];
    int grade[] = new int[5];
    void accept()
    {
        System.out.println("Enter USN");
        usn = Sc.next();
        System.out.println("Enter Name");
        name =Sc.next();
        System.out.println("Enter Marks");
        for(int i=0;i<5;i++)
        {
            marks[i]=Sc.nextInt();
        }
    }
    double cal()
    {
        for(int i=0;i<5;i++)
        {
            if (marks[i] >= 80)
                grade[i]=10;
            if (marks[i] > 70 && marks[i] < 79)
                grade[i]=9;
            if (marks[i] > 60 && marks[i] < 69)
                grade[i]=8;
            if (marks[i] > 55 && marks[i] < 59)
                grade[i]=7;
            if (marks[i] > 50 && marks[i] < 54)
                grade[i]=6;
            if (marks[i] > 45 && marks[i] < 49)
                grade[i]=5;
            if (marks[i] > 40 && marks[i] < 44)
               grade[i]=4;
            if (marks[i] <= 39)
                grade[i]=0;
        }
        for(int i=0;i<5;i++) {
            soc = soc + credits[i];
            tot = tot +(credits[i] * grade[i]);
        }
        sgpa = tot/soc;
        return sgpa;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("USN: "+usn);
        System.out.println("SGPA: "+cal());
    }

    public static void main(String[] args) {

        student s1 = new student();
        s1.accept();
        s1.display();
    }
}
