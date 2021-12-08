package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeCalculate {
    public static void main(String[] args) throws Exception {
//        UTCToCST("2021-12-07T11:59:15", "yyyy-MM-dd'T'HH:mm:ss");

        System.out.println(calculateMinuteTimeParam(Calendar.DATE, "yyyy-MM-dd'T'HH:mm:ss", "2021-12-07T11:59:15", 30));
    }

    /**
     * 时间格式加减
     *
     * @param calendarType
     * @param dateFormat
     * @param dataTime
     * @param gap
     * @return
     */
    public static String calculateMinuteTimeParam(int calendarType, String dateFormat, String dataTime, int gap) {
        DateFormat df = new SimpleDateFormat(dateFormat);
        Date date = new Date();
        try {
            date = df.parse(dataTime);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            //Calendar.MINUTE
            cal.add(calendarType, gap);
            date = cal.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return df.format(date);
    }


    public static void UTCToCST(String UTCStr, String format) throws ParseException, ParseException {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        date = sdf.parse(UTCStr);
        System.out.println("UTC时间: " + date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 30);
        //calendar.getTime() 返回的是Date类型，也可以使用calendar.getTimeInMillis()获取时间戳
        System.out.println("UTC时间+30day: " + calendar.getTime());
    }
}
