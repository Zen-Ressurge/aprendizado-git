package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-13");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2046-07-12T01:30:32Z");
		//Instant d07 = Instant.parse("2046-06-12T01:30:32-03:00");
		//Instant d07 = Instant.parse("2046-06-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2020",fmt1);
		LocalDate d09 = LocalDate.parse("20/07/2020 01:30", fmt2);
		//LocalDate d010 = LocalDate.of(2022, 12, 13);
		LocalDate d011 = LocalDate.of(2046, 12, 13);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
       // System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = "+ d08);
        System.out.println("d09 = " + d09.toString());
     //   System.out.println("d010 = " + d010);
        System.out.println("d011 = " + d011.toString());

        
        
	}

}
