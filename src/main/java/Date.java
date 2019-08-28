public class Date {
    protected int day;
    protected String mon;
    protected int yr;
    protected double time;
    protected String meridian;
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public Date(String str) {
        try {
            String[] strs = str.split(" ");
            String[] dates = strs[0].split("/");
            day = Integer.parseInt(dates[0]);
            mon = months[Integer.parseInt(dates[1]) - 1];
            yr = Integer.parseInt(dates[2]);
            int time = Integer.parseInt(strs[1]);
            if (time > 1200) {
                this.time = (time - 1200) / 100.0;
                this.meridian = "pm";
            } else {
                this.time = time / 100.0;
                this.meridian = "am";
            }
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Invalid month!");
        }
    }

    public static boolean isDate(String str) {
        String[] strs = str.split(" ");
        if (strs.length != 2) {
            return false;
        }
        String[] dates = strs[0].split("/");
        if (dates.length != 3) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        if (day == 1) {
            return "1st of " + mon + " " + yr + ", " + time + meridian;
        } else if (day == 2) {
            return "2nd of " + mon + " " + yr + ", " + time + meridian;
        } else if (day == 3){
            return "3rd of " + mon + " " + yr + ", " + time + meridian;
        } else {
            return day + "th of " + mon + " " + yr + ", " + time + meridian;
        }
    }
}
