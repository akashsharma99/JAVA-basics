import java.util.*;
class Number_List
{
    node s;
    Number_List()//constructor
    {
        s=null;
    }
    void createList()//to create a list of integers
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("No.of elements = ");
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            node p=new node();
            p.input();       //input number
            if(s==null)          //store pointer
            {
                s=p;p.nxt=null;
            }
            else
            {
                p.nxt=s;
                s=p;
            }
        }
    }
    void displayList()//to display the list
    {
        for(node x=s;x!=null;x=x.nxt)
            x.display();
    }
    void search()//to search a number in a list
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number to search = ");
        int m=sc.nextInt(),fg=0;
        for(node x=s;x!=null;x=x.nxt)//linear search
        {  
            if(x.n==m)
                fg=1; 
        }
        if(fg==0)
            System.out.println("number not found");
        else
            System.out.println("number found");
    }
    void cntPrime()//count number of prime numbers
    {
        int c=0;
        for(node x=s;x!=null;x=x.nxt)
        {   
            int a=0;
            for(int i=1;i<=x.n;i++)
            {
                if(x.n%i==0)
                    a++;
            }
            if(a<=2)
                c++;
        }
        System.out.println("number of prime numbers = "+c);
    }
    void cntPalindrome()//count number of palindrome numbers
    {
        int c=0;
        for(node x=s;x!=null;x=x.nxt)
        {
            int a=x.n,s=0;
            while(a!=0)
            {
                s=s*10+(a%10);
                a=a/10;
            }
            if(s==x.n)
                c++;
        }
        System.out.println("number of palindrome numbers = "+c);
    }
    void cntPerfect()//count number of perfect numbers
    {
        int c=0;
        for(node x=s;x!=null;x=x.nxt)
        {
            int s=0;
            for(int i=1;i<x.n;i++)
            {
                if(x.n%i==0)
                    s=s+i;
            }
            if(s==x.n)
                c++;
        }
        System.out.println("number of perfect numbers = "+c);
    }
    void main()//menu driven main function
    {
        System.out.println("Create a list of integers");
        createList();
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("1.display_2.search number_3.number type_4.exit");
            int ch=sc.nextInt();int f=0;
            switch(ch)      //call various funtions on user's choice
            {
                case 1:displayList();
                break;
                case 2:search();
                break;
                case 3:System.out.println("41.count prime__42.count perfect__43.count palindrome");
                int a=sc.nextInt();
                if(a==41)cntPrime();
                else if(a==42)cntPerfect();
                else cntPalindrome();
                break;
                case 4:f=1;break;
            }
            if(f==1)break;
        }
    }//end of main
}//end of Number_List
/*
OUTPUT:-
Create a list of integers
No.of elements = 10
6
28
666
17
19
25
282
15
16
7
1.display_2.search number_3.number type_4.exit
2
Number to search = 4
number not found
1.display_2.search number_3.number type_4.exit
2
Number to search = 7
number found
1.display_2.search number_3.number type_4.exit
3
41.count prime__42.count perfect__43.count palindrome
41
number of prime numbers = 3
1.display_2.search number_3.number type_4.exit
3
41.count prime__42.count perfect__43.count palindrome
42
number of perfect numbers = 2
1.display_2.search number_3.number type_4.exit
3
41.count prime__42.count perfect__43.count palindrome
43
number of palindrome numbers = 4
1.display_2.search number_3.number type_4.exit
4

VARIABLE LIST:-
Variable    Type        Description
s           class       point the last node
p           class       point the current node
nxt         class       point next node         
x           class       loop variable
n           int         element of list
i           int         loop variable
c           int         store count of numbers
ch          int         store user's choice*/