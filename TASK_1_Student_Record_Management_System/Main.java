package TASK_1_Student_Record_Management_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends FileHandling {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       FileHandling f=new FileHandling();

        System.out.println("\n\n\n\nPlease Select According to the below Menu:");
        System.out.println("1:-> To View Total No. Of Stidents\n2:-> To View List Of Students\n3:-> To Insert a new Student\n4:-> To update a Student Details\n5:-> To delete a Student");
        int choice=Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                    System.out.println("Total Students are:--"+f.count());
                break;
            case 2:
                    f.show();
                    break;
            case 3: 
                    f.insert();
                    break;
            case 4:
                    f.update();
                    break;
            case 5:
                    f.deletion();
                    break;
            default: System.out.println("Invalid Input!....");

        }
    }
    
}
