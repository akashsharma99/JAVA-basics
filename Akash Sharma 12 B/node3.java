import java.util.*;
class node3
{
    String x;node3 nxt,prev;
    node3()//default constructor
    {
        x="empty";nxt=null;prev=null;
    }
    void input()//to input a string
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string = ");
        x=sc.nextLine();
    }
    void display()//to display the string
    {
        System.out.println(x);
    }
}//end of node