package leap;

class LeapYearExperiment
{
public static void main(String ar[])
{
boolean leapYear=false;
int year=2016;
leapYear=(year%4==0)?true:false;
System.out.println(leapYear);
}
}
