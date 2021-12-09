package ravindra;

public class Pali {
public static void main (String...args)
{
	int num=111,k,s=0;
	int t=num;
	while(num>0)
	{
	k=num%10;
	num=num/10;
	s=s*10+k;
	}
	if(t==s)
		System.out.println("num is pali");
	else
		System.out.println("not pali");
}
}
