package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(){
		this.year = 2019;
		this.month = 0;
		this.day = 0;
		public Date(int day, int month, int year) throws DateException{
			this.year = year;
			if (month < 1 || month > 12) {
				throw new DateException("Mes " + month + " no valido" +
						" Valores posibles entre 1 y 12.");
			} else {
				this.month = month;
			}
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if((day>=1) && (day<=31)){
					this.day = day;	
				} else {
					throw new DateException("Dia " + day + " no valido para el mes " + month + ", valores posibles entre 1 y 31.");
				}
				break;
			case 11:
				
			}
		}
	}
}
