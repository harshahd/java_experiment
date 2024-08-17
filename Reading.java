import java.io.*;

class Reading
{
public static void main(String arg[]) throws IOException
{
String s="";
FileReader fr=new FileReader("e:/original.txt");
while(fr.ready())
{
s=s+fr.read();
}
System.out.println(s);
}
}
