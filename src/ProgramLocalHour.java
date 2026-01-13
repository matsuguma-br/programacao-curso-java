import java.time.*;
import java.time.temporal.ChronoUnit;

public class ProgramLocalHour
{
	public static void main(String[] args)
	{
		// Aula 01
		//		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//
		//		LocalDate d01 = LocalDate.now();
		//		LocalDateTime d02 = LocalDateTime.now();
		//		Instant d03 = Instant.now();
		//
		//		LocalDate d04 = LocalDate.parse("2022-07-20");
		//		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		//		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		//		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		//
		//		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		//		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		//
		//		LocalDate d10 = LocalDate.of(2022, 7, 20);
		//		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 01, 30);
		//
		//		System.out.println(d01);
		//		System.out.println(d02);
		//		System.out.println(d03);
		//		System.out.println(d04);
		//		System.out.println(d05);
		//		System.out.println(d06);
		//		System.out.println(d07);
		//		System.out.println(d08);
		//		System.out.println(d09);
		//		System.out.println(d10);
		//		System.out.println(d11);
		
		// Aula 02
		//		LocalDate d04 = LocalDate.parse("2022-07-20");
		//		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		//		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		//		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		//
		//		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		//		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		//
		//		System.out.println("d04 = " + d04.format(fmt1));
		//		System.out.println("d04 = " + fmt1.format(d04));
		//		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		//
		//		System.out.println("d05 = " + d05.format(fmt1));
		//		System.out.println("d05 = " + d05.format(fmt2));
		//		System.out.println("d05 = " + d05.format(fmt4));
		//
		//		System.out.println("d06 = " + fmt3.format(d06));
		//		System.out.println("d06 = " + fmt5.format(d06));
		
		// Aula 03
		//		LocalDate d04 = LocalDate.parse("2022-07-20");
		//		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		//		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		//
		//		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		//		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		//		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		//		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		//
		//		System.out.println(r1);
		//		System.out.println(r2);
		//		System.out.println(r3);
		//		System.out.println(r4);
		//
		//		System.out.println("d04 dia = " + d04.getDayOfMonth());
		//		System.out.println("d04 mês = " + d04.getMonthValue());
		//		System.out.println("d04 ano = " + d04.getYear());
		//		System.out.println("d05 hora = " + d05.getHour());
		//		System.out.println("d05 minuto = " + d05.getMinute());
		
		// Aula 04
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}