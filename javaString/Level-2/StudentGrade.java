import java.util.*;

class StudentGrade {
    
    // method to generate random marks
    static int[][] getMarks(int n){
        int[][] m = new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                m[i][j] = 40 + (int)(Math.random()*61); // 40–100
        return m;
    }

    // method to find grade
    static String getGrade(double p){
        if(p>=80) return "A";
        else if(p>=70) return "B";
        else if(p>=60) return "C";
        else if(p>=50) return "D";
        else if(p>=40) return "E";
        else return "R";
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        int[][] marks=getMarks(n);

        System.out.println("Phy  Chem  Math  Total  %  Grade");

        for(int i=0;i<n;i++){
            int total = marks[i][0]+marks[i][1]+marks[i][2];
            double per = Math.round((total/3.0)*100.0)/100.0;

            System.out.println(
                marks[i][0]+"    "+
                marks[i][1]+"    "+
                marks[i][2]+"    "+
                total+"    "+
                per+"    "+
                getGrade(per)
            );
        }
    }
}
