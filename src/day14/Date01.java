package day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜 시간 클래스
		 * Date 클래스      => Deprecated (비권장)
		 * Calendar 클래스  => 추상클래스라 new 생성 못함. Calendar (객명) = Calendar.getInstance();
		 * LocalDate 클래스 => 추상클래스라 new 생성 못함. LocalDate (객명) = LocalDate.getInstance();
		 */
		Date date = new Date();                    //오늘날짜 리턴
		System.out.println(date);                  //date.toString으로 바꾸면 원하는 값을 잘라 쓸수 있음.
		date.getDate();                            //Calender 로 업글해서 나왔기 때문에 비권장
		System.out.println(date.getDate());
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH);
		System.out.println(month);                  //월이 1~12dnjf 0번지부터 시작 0~11 리턴
		month = c.get(Calendar.MONTH)+1;            //그래서 +1해줘야 쓸수 있음
		System.out.println(month);        
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println(year+"-"+month+"."+day);
		
		LocalDate localdate = LocalDate.now();      //오늘날짜 리턴
		System.out.println(localdate);
		
		LocalDateTime local = LocalDateTime.now();  //지금시간 리턴
		System.out.println(local);
		System.out.println(local.getYear());
		System.out.println(local.getMonth());
		System.out.println(local.getMonthValue());
		System.out.println(local.getDayOfMonth());
		
		LocalDateTime birth = LocalDateTime.of(1998, 12, 24, 9, 00);
		System.out.println(birth);
		
		//yyyy MM dd hh:mm:ss  원하는 모양으로 만드는 법
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy / MM / dd hh:mm:ss");
		System.out.println(df.format(birth));
		
		
	}

}
