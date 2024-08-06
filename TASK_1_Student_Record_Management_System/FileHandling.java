package TASK_1_Student_Record_Management_System;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {

    public void insert()throws IOException {
        
        FileWriter fw=new FileWriter("D:\\Msahil2412 Workplace\\GITHUB\\Pinnacle-Intern-Tasks\\TASK_1_Student_Record_Management_System\\DemoFile.txt", true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\n Please Enter STOP to stop the insertion...\n\nEnter  the details in the format of:\nRoll Number\nName\nGrade\n\n");

        String st="";
        int i=0;
        while(!st.equals("STOP"))
        {
            st=br.readLine();
            if(st.equals("STOP"))
                continue;
            if(i==2){
                pw.println(st);
                i=-1;
            }
            else
                pw.print(st+"\t\t  ");
            i++;
        }
        pw.close();
        bw.close();
        fw.close();
        show();
    }

    public void show() throws IOException
    {
        FileReader fr=new FileReader("D:\\Msahil2412 Workplace\\GITHUB\\Pinnacle-Intern-Tasks\\TASK_1_Student_Record_Management_System\\DemoFile.txt");
        BufferedReader br=new BufferedReader(fr);

        String s="";
        while(s!=null)
        {
            s=br.readLine();
            if(s!=null)
                System.out.println(s);
        }
        br.close();
        fr.close();
    }
    public int count()throws IOException
    {
        int l = 0;
        BufferedReader br = new BufferedReader(new FileReader(
                "D:\\Msahil2412 Workplace\\GITHUB\\Pinnacle-Intern-Tasks\\TASK_1_Student_Record_Management_System\\DemoFile.txt"));
        while (br.readLine() != null) {
            l++;
        }
        br.close();
        return l-1;
    }
    public void update()throws IOException
    {
        StringBuilder con = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("D:\\Msahil2412 Workplace\\GITHUB\\Pinnacle-Intern-Tasks\\TASK_1_Student_Record_Management_System\\DemoFile.txt"));
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Roll Number of the Student to update:-->");
        String rn=s.next();
        s.nextLine();
        System.out.println("Enter the Complete Old Data-->");
        String st=s.nextLine();
        System.out.println("Enter the Complete new Data-->");
        String st2= s.nextLine();

        String l="";
        while ((l = br.readLine()) != null) {
            String t=l.substring(0,2);
            // System.out.println(t);
            if(t.equals(rn))
            {
                l=l.replace(st, st2);
                // System.out.println(l);
                // System.out.println(t);
                }
            con.append(l).append(System.lineSeparator());
        }
        String fileCon = con.toString();
        System.out.println(fileCon);
        br.close();
        s.close();
        // fileCon = fileCon.replace(st, st2);
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Msahil2412 Workplace\\GITHUB\\Pinnacle-Intern-Tasks\\TASK_1_Student_Record_Management_System\\DemoFile.txt"));
        writer.write(fileCon);
        writer.close();
    }
}
