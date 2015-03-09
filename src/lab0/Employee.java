package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid.
 * <p>
 * For example, String arguments may be null or empty; other objects may be
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all arguments
 * are valid. The only exception is when any argument is acceptable based on
 * requirements. Fix the code below using if logic to validate method arguments
 * and throw IllegalArgumentException or a custom exception if the validation
 * fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
//    public static final int MAX_VACATION_DAYS = 28;//rigid--should make this a variable
//    //instead, do...

    private int maxVacationDays = 28; //then create setters and getters
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        if (daysVacation > maxVacationDays || daysVacation < 0) {
            throw new IllegalArgumentException();
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {

        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    /*write comment with rule given by customer:
     ssn must be either 9 digits in length 
     or 11 characters where first 3 are digists, followed by hiphen, followed by 2 digits, followed by hyphen, 
     followed by 4 digists.
     cannot be null
     */
    public void setSsn(String ssn) {
//        if (ssn == null || ssn.length() < 9)
//        {throw new  IllegalArgumentException();
//        }else{
//           int index = ssn.indexOf("-"); //use indexOf or split
//           if(index > -1)
//           {
//            String[] parts = ssn.split("-");//if size of 3, it has 2 hyphens
//            if (parts.length != 3)
//           }
        }

//        this.ssn = ssn;
    }

