import java.io.*;
class primess                                    // for calculating prime triplet
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int count;                                   // initialising variables
  int i,j,s,l;                                // initialising variables
   int c,p,u;                                // initialising variables
  void abc()throws IOException
  {
    System.out.println("Enter the value");  //entering the limits
    s=Integer.parseInt(br.readLine());
    l=Integer.parseInt(br.readLine());
    if(s<=l)
    {
      call(s,l);                            // calling function to check prime
    }
    else
    {
       abc();
    }

  }
  void call(int s,int l)throws IOException
  {
    for(i=s;i<=l;i++)                       //for loop to check the prime number
    {
      count =1;
      for(j=2;j<i;j++)
      {
        if(i%j==0)
        count=0;
      }
      if(count==1)
      {
        if(i<l)
        pass(i);                              // calling triplet function
      }
      else
      continue;
    }
  }

    void pass(int prime)throws IOException     //function for prime triplet
    {
      int c,p,u;
      c=(prime+2);
      u=fun(c);
      if(u==0)
      {
        u=fun(prime+6);
      }
      else
      c=prime+4;
      u=fun(c);
      if(u==0)
      {
        u=fun(prime+6);
      }
      if(u==0)
       System.out.println(c +"  is a triplet");
    }
    int fun(int no)throws IOException
    {
      count=1;
      for(j=2;j<no;j++)
      {
        if(no%j==0)
        count=0;
      }
      if(count==1)
      return 0;                                 // return statement
      else
      return 1;                                // return statement
    }
  }
  class primes
  {
   public static void main(String args[])throws IOException
   {
     primess obj=new primess();              //object created
     obj.abc();                             //funtion called
   }
  }
/* output
2
12
7  is a triplet
11  is a triplet
13  is a triplet
*/

