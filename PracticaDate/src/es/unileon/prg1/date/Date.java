package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(){
		this.year = 
		this.month =
		this.day = 
		public Date(int day, int month, int year) throws DateException{
			this.year = year;
			if (month < 1 || month > 12) {
				throw new DateException("Mes " + month + " no valido" +
						" Valores posibles entre 1 y 12.");
			} else {
				this.month = month;
			}
	}
}
