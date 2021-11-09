package Chapter2;

public class Java2_09 {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public void setDay(int Day) {
        this.day = day; /* this.(멤버 변수 day) = (매개변수 day); */
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ( month <  1 || month > 12) {
            isValid = false;
        }
        else
            this.month = month; // this.(멤버 변수 month) = (매개변수 month);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year; // this.(멤버 변수 year) = (매개변수 year);
    }

    public void showDate() {

        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다");
        }
        else {
            System.out.println("유효하지 않은 날짜입니다");
        }
    }
}
