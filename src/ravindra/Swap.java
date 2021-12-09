package ravindra;

public class Swap {
public static void main(String...args)
{
int a=55;
int b=90;

a=a^b;
b=a^b;
a=a^b;
System.out.print("a="+a);
System.out.print("b="+b);

}
}
