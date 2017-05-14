import java.util.*;
class Insert_a_node
{
    node6 p,s;
    Insert_a_node()//default constructor
    {
        p=null;s=null;
    }
    void push()//add node
    {
        p=new node6();p.input();
        if(s==null)
        {
            s=p;
            p.nxt=null;
        }
        else
        {
            p.nxt=s;
            s=p;
        }
    }
    void print()//print list
    {
        for(p=s;p!=null;p=p.nxt)
        {
            p.display();
        }
    }
    void main()//menu driven function
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Create list, enter number of elements");
        int n=sc.nextInt();
        System.out.println("Enter words");
        for(int i=1;i<=n;i++)
            push();
        System.out.println("Enter position for new list,0 being last input");
        int k=sc.nextInt();
        node6 temp=new node6();
        temp.input();
        int c=1;p=s;
        while(c<k)          //to insert at position k
        {   p=p.nxt;    c++;    }
        temp.nxt=p.nxt;
        p.nxt=temp;
        System.out.println("New list is...");
        print();
    }//end of main
}//end of class
/*
OUTPUT:-
Create list, enter number of elements
5
Enter words
Enter string = ram
Enter string = is
Enter string = a
Enter string = good
Enter string = boy
Enter position for new list,0 being last input
3
Enter string = not
New list is...
boy
good
a
not
is
ram

VARIABLE LIST:-
    Variable    Type        Description
      p         class       point current node
      s         class       point last node
      x         String      element of list
      nxt       class       point next node
      h         int         store user choice
      k         int         store position to insert
      c         int         counter variable
*/