class Armstrong
{
public static void main(String args[])
{
int a=371,b=0,c,d=0;
c=a;
while(c>0)
{
b=c%10;
d=d+b*b*b;
c=c/10;
}
if(a==d)
{
System.out.print("This Armstrong No."+a);
}
else
{
System.out.print("This is not Armstrong No.");
}
}
}

