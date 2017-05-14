import java.util.*;
class Frequency_of_nodes
{
    node12 p,s,j;
    Frequency_of_nodes()//default constructor
    {
        s=null;p=null;j=null;
    }
    void push()//add node
    {
        p=new node12();
        p.getdata();
        if(s==null)
        {
            s=p;
            p.nxt=null;
            j=p;
        }
        else
        {
            j.nxt=p;
            p.nxt=null;
            j=p;
        }
    }
    void sort()//to sort the given list in ascending order
    {
        for(p=s;p.nxt!=null;p=p.nxt)
        {
            for(j=p.nxt;j!=null;j=j.nxt)
            {
                if(p.n>j.n)
                {
                    int temp=p.n;
                    p.n=j.n;
                    j.n=temp;
                }
            }
        }        
    }
    void main()//menu driven function
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Create list, enter number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the numbers");
        for(int i=1;i<=n;i++)//input list
            push();
        sort();         //call sort() to sort the given list
        int c=0;     
        System.out.println("Number"+"\t"+"Frequency");
        for(p=s;p!=null;p=p.nxt)//to display frequency of numbers
        {
            c++;
            if(p.nxt!=null&&p.n!=p.nxt.n)
            {
                System.out.println(p.n+"\t"+c);c=0;
            }
            if(p.nxt==null)
            System.out.println(p.n+"\t"+c);
        }
    }//end of main
}//end of Frequency_of_nodes
/*
OUTPUT:-
Create list, enter number of elements
7
Enter the numbers
2
6
6
5
6
2
4
Number  Frequency
2   2
4   1
5   1
6   3

VARIABLE LIST:-
    Variable    Type        Description
      p         class       point current node
      j         class       point last node
      s         class       point first node
      n         int         element of list
      nxt       class       point next node
      c         int         frequency of each element
*/
   