
/**
 * Write a description of class prettydates here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import static java.lang.System.out;
import java.util.Scanner;
public class prettydates
{
    // ---add methods here to make the program work----
    // formatNumberAsTwoDigits
    public static String formatNumberAsTwoDigits (int day)
    {
        if (day < 10)
        {
            return "0" +day;
        }
     
        else if(day>=10)
        {
            return day+"";
        } 
        else
        {
            return "error";
        }
    }    
    //nameFormat
    public static String nameFormat(int month, int day, int year)
    {

        if (month == 1)
        {
            return "Janurary "+day+", " +year;
        }
        else if (month == 10)
        {
            return "October "+day+", " +year;
        }
        else if (month == 12)
        {
            return "December "+day+", " +year;
        }
        else
        {
            return "error";
        }   

    }    
    //slashFormat
    public static String slashFormat(int month, int day, int year)
    {
        if (month == 01)
        {
            return "01/0" +day+ "/" +year ;
        }
        else if (month == 10)
        {
            return "10/0"+day+ "/" +year ;
        }
        else if (month == 12)
        {
            return "12/"+day+ "/" +year ;
        } 
        else 
        {
            return "error";
        }   
    }    
    //dashFormat
    //(this is more efficent just in case the numbers change...but ask the mentors)
    public static String dashFormat(int year,int month, int day)
    {

        if (month<10&day<10)
        {
            return +year+"-0"+month+"-0"+day;
        }
        else if (month>=10&day<10)
        {
            return +year+"-"+month+"-0"+day;
        }
        else
        {
            return +year+"-"+month+"-"+day;
        }   
    }    
    // ---- end of your work area -----
    // don't change this code.
    public static void printDate(int month, int day, int year)
    {
        System.out.println(nameFormat(month, day, year));
        System.out.println(slashFormat(month, day, year));
        System.out.println(dashFormat(year,month, day));
        System.out.println();
    }
    // don't change this code.
    public static void main(String[] args)
    {
        System.out.println(formatNumberAsTwoDigits(3));
        System.out.println(formatNumberAsTwoDigits(9));
        System.out.println(formatNumberAsTwoDigits(10));
        System.out.println(formatNumberAsTwoDigits(12));
        printDate(10, 4, 2014);
        printDate(1, 1, 2015);
        printDate(12, 31, 2013);
    }
}    
