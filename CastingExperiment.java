class CastingExperiment
{
public static void main(String arg[])
{
int[][] box={{4,7,8,1},{2,6,9,5},{7,2,-1,3},{4,5,70,2}};
int total1=box.length-1;
int total2=box[0].length-1;
int traverse=3;
for(int i=0;i<=total1;i++)
{
for(int j=0;j<4;j++)
{
if((i==0) && (j==0))
{
System.out.println(box[i][j]);
}
if((i==0) && (j>=total1))
{
for(int k=0;k<total1;k++)
{
i++;
System.out.println(box[k][j]);
}
}
}
}
}
}
/*
4, 7, 8, 1
2, 6, 9, 5
7, 2, -1, 3
4, 5, 70, 2
*/


