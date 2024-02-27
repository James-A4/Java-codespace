public class LeapYear {
    public static void main(String[] args) {
        int year = Comp122.getInt("Please enter a year");
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear;

        if (year % 4 == 0) 
            if((year % 100 == 0) && (year % 400 != 0)) {
                leapYear = false;  // Your code here
            }
            else {
                leapYear = true;
            }
        
        else {
            leapYear = false;
        }
        
        return leapYear;
    }
    public static boolean isLeapYearCondensed(int year) {
        return (year % 4 == 0) && (year % 100 != 0);
    }

}
