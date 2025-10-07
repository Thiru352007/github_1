import java.util.Scanner;
 class student{
    public static void main(String[]arge)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        System.out.println("Enter you Tamil mark:");
        int mark1= sc.nextInt();
        System.out.println("Enter your English mark:");
        int mark2= sc.nextInt();
        System.out.println("Enter your maths mark:");
        int mark3 = sc.nextInt();
        System.out.println("Enter your science mark:");
        int mark4 = sc.nextInt();
        System.out.println("Enter your social science mark:");
        int mark5 = sc.nextInt();
        int total = mark1+mark2+mark3+mark4+mark5;
        System.out.println("Your Name is: "+name+"\nAnd your Age is:"+age+"\nYour tmail mark is: "+mark1+"\nYour English mark is: "+mark2+"\nYour maths mark is: "+mark3+"\nYour science mark is: "+mark4+"\nyour social science mark is: "+mark5+"\n and the total mark is: "+total);
        sc.close();
    }
}   


