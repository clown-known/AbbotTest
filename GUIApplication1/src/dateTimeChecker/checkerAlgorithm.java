/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dateTimeChecker;
import java.util.InputMismatchException;
/**
 *
 * @author LapTop
 */
public class checkerAlgorithm {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public int DayInMonth(int month,int year){
        switch(month){
            case 1: case 3:case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6:case 9: case 11: return 30;
            case 2:
                if(year % 400 == 0) return 29;
                else if(year % 100 == 0) return 28;
                else if(year % 4 == 0) return 29;
                else return 28;
            default: return 0;
        }
    }
    public String checkDate(String year,String month,String day){
        int monthValid = 0;
        try{
            month = Integer.parseInt(month)<10?"0"+Integer.parseInt(month):""+Integer.parseInt(month);
            monthValid = Integer.parseInt(month);
            if(monthValid>12||monthValid<1) throw new InputMismatchException("Month is out of range");
        }catch(InputMismatchException ex){
            return ex.getMessage();
        }catch(Exception e){
            return "Input data for month is incorrect format";
        }
        int dayValid = 0;
        try{
            day = Integer.parseInt(day)<10?"0"+Integer.parseInt(day):""+Integer.parseInt(day);
            dayValid = Integer.parseInt(day);
            if(dayValid<1||dayValid>31) throw new InputMismatchException("Day is out of range");
        }catch(InputMismatchException ex){
            return ex.getMessage();
        }catch(Exception e){
            return "Input data for day is incorrect format";
        }
        int yearValid = 0;
        try{
            year = ""+Integer.parseInt(year);
            yearValid = Integer.parseInt(year);
            if(yearValid<1000||yearValid>5000) throw new InputMismatchException("Year is out of range");
        }catch(InputMismatchException ex){
            return ex.getMessage();
        }catch(Exception e){
            return "Input data for year is incorrect format";
        }
        if(isValidDate(yearValid, monthValid, dayValid)) return ""+day+"/"+month+"/"+year+" is correct date time!";
        else return ""+day+"/"+month+"/"+year+" is NOT correct date time!";
    }
    public boolean isValidDate(int year,int month,int day){
        if(month>12||month<1) return false;
        if(day<1) return false;
        if(day<=DayInMonth(month, year)) return true;
        return false;
    }
}
