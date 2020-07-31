/*
Program to accept 5 Command Line Arguments and print them on console.If there's no argument print No
Arguments,if there is 1 or 2 or 3 or 4 arguments then print the respective number of arguments.
 */
public class NoOfCommandLineArguments {
    public static void main(String args[]){
        int m=args.length;
        if(m<5)
        {
            System.out.println(m+" ARGUMENTS");
        }
        else if(m==5)
        {
            for(int i=0;i<args.length;i++)
                System.out.print("ARGUMENT "+(i+1)+"-->"+args[i]+" ");
        }

    }
}

