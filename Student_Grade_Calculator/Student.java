package Student_Grade_Calculator;

import java.util.Scanner;

public class Student {
    public static void start(){

        System.out.println("Welcome to student mark calculator.. \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of Subjects:");

        int numberOfSubjects = scanner.nextInt();

        int[] individualMarks= new int[numberOfSubjects];

        for(int i=0;i<numberOfSubjects;i++){

            System.out.print("Enter the " +(i+1)+" Subject mark:");


            individualMarks[i]=scanner.nextInt();

        }

        int totalMArks = Student.totalMArks(individualMarks);

        float percentage = Student.percentage(totalMArks,numberOfSubjects);

        System.out.printf("Total Marks: %d \nPercentage: %.1f%% \n", totalMArks,percentage);

        char[] grades =Student.grade(individualMarks);
        int i=1;
        for(char grade: grades){
            System.out.println("Grade of "+i+"Subject is "+grade);
            i++;
        }

    }


        private static int totalMArks(int[] marksArray){
            int total=0;
            for(int marks:marksArray){
                total+=marks;
            }
            return total;
        }

        private static float percentage(int total,int numberOfSubject){

            return (total/(float)(numberOfSubject*100))*100;

        }

        private static char[] grade(int[]arr ){

            char[] grade = new char[arr.length];

            for(int i=0;i<arr.length;i++){

                if(arr[i]>=95){
                    grade[i]='A';
                }

                else if(arr[i]>=80){
                    grade[i]='B';
                }

                else if(arr[i]>=60){
                    grade[i]='C';
                }

                else if(arr[i]>=40){
                    grade[i]='D';
                }

                else{
                    grade[i]='F';
                }

                

            }
            return grade;

        }




    
}
