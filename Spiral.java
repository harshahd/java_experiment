import java.util.Scanner;

class Spiral
{
public static void main(String arg[])
{
int row,column;
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number of rows");
row=s1.nextInt();
System.out.println("Enter the number of column");
column=s1.nextInt();
if(row!=column)
{
System.out.println("Row and column should be equal because of fetching in a square.");
return;
}
int top=0,bottom=row-1,left=0,right=column-1;
int[][] table=new int[row][column];
for(int i=0;i<row;i++)
{
System.out.println("Row "+i+":");
for(int j=0;j<column;j++)
{
System.out.println("Enter the column "+j+" value");
table[i][j]=s1.nextInt();
}
}
int countTop=0,countRight=0,countBottom=0,countLeft=0;
int loop=0;
while(loop<=(row/2))
{
for(int i=countTop;i<=right;i++)
{
System.out.println(table[countTop][countRight]);
countRight++;
}
countTop++;
top++;
countBottom=countTop;
for(int i=countTop;i<=bottom;i++)
{
System.out.println(table[countBottom][countRight-1]);
countBottom++;
}
countRight--;
countLeft=countRight-1;
for(int i=countRight-1;i>=left;i--)
{
System.out.println(table[countBottom-1][countLeft]);
countLeft--;
}
countBottom--;
countTop=countBottom-1;
for(int i=countBottom-1;i>=top;i--)
{
System.out.println(table[countTop][countLeft+1]);
countTop--;
}
countTop++;
countBottom--;
countLeft++;
countRight=countLeft+1;
loop++;
right--;
left++;
bottom--;
}
}
}