package TASK_1_Student_Record_Management_System;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.classfile.BufWriter;

public class FileHandling {

    public static void main(String[] args)throws IOException {
        
        FileWriter fw=new FileWriter("D:\\Msahil2412 Workplace\\GITHUB\\Pinnacle-Intern-Tasks\\TASK_1_Student_Record_Management_System\\DemoFile");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println("Hello Java ");
        pw.println("Hello JavaSS ");
        pw.close();
        bw.close();
        fw.close();
    }
    
}
