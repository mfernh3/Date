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
			case 4:
			case 6:
			case 9:
			case 11:
				if((day>=1) && (day<=31)) {
					this.day = day;
				} else {
					throw new DateException("Dia "+ day +"no valido para el mes " + month + ", valores posibles entre 1y 3");
				}
				break;
			}
		}
		public Date(Date fecha){
			this.day = fecha.getDay();
			this.month = fecha.getMonth();
			this.year = fecha.getYear();
		}
		
		public String toString() {
			return this.day + "/" + this.month + "/" + this.year;
		}
		
		public int getDay{
			return this.day;
		}
		
		public int getMonth{
			return this.month;
		}

		public int getYear{
			return this.year;
		}
		
		void setDay(int nuevoDay){
			this.day = nuevoDay;	
		}

		void setMonth(int nuevoMonth){
			this.month = nuevoMonth;
		}
		
		void setYear(int nuevoYear){
			this.year = nuevoYear;
		}
		
		public boolean isSameYearIf(date another){
			if ( this.year == another.getYear() ){
				return true;
			}
			return false;
		}
		
		public boolean isSameMonthIf(date another){
			if ( this.month == another.getMonth() ){
				return true;
			}
			return false;
		}
		
		public boolean isSameDayIf(date another){
			if ( this.day == another.getDay() ){
				return true;
			}
			return false;
		}
		public boolean isSame(date another){
			if (isSameDayIf(another) && isSameMonthIf(another)  && isSameYearIf(another)){
				return true;
			}
			return false;
		}
		
		public boolean isSameDay(Date another){
			return another.day == this.day;
		}
		
		public boolean isSameMonth(Date another){
			return another.month == this.month;
		}

		public boolean isSameYear(Date another){
			return another.year == this.year;
		}

		public boolean isSame(Date another){
			return isSameDay(another) && isSameMonth(another)  && isSameYear(another);
		}
		
		public String getMonthName(){
			String name = " ";
			switch(this.month){
				case 1:
					name = "Enero";
					break;
				case 2:
					name = "Febrero";
					break;
				case 3:
					name = "Marzo";
					break;
				case 4:
					name = "Abril";
					break;
				case 5:
					name = "Mayo";
					break;
				case 6:
					name = "Junio";
					break;
				case 7:
					name = "Julio";
					break;
				case 8:
					name = "Agosto";
					break;
				case 9:
					name = "Septiembre";
					break;
				case 10:
					name = "Octubre";
					break;
				case 11:
					name = "Noviembre";
					break;
				case 12:
					name = "Diciembre";
					break;
			}
			return name;
		}
		
		boolean isDayRight(int day){
			boolean iDR = false;
			switch(this.month){
				case 1: //next
				case 3: //next
				case 5: //next
				case 7: //next
				case 8: //next
				case 10: //next
				case 12:
					iDR = ((day>=1) && (day<=31));
					break;
				case 4: //next
				case 6: //next
				case 9: //next
				case 11:
					iDR = ((day>=1) && (day<=30));
					break;
				case 2:
					iDR = ((day>=1) && (day<=28));
					break;
			}
			return iDR;
		}
		
		public String getSeasonName(){
			String n = " ";
			switch(this.month){
				case 1: //next
				case 2:
					n="Invierno";
					break;
				case 3:
					if(this.day<21){
						n="Invierno";
					} else {
						n="Primavera";
					}
					break;
				case 4: //next
				case 5: 
					n="Primavera";
					break;
				case 6:
					if(this.day<21){
						n="Primavera";
					} else {
						n="Verano";
					}
					break;
				case 7: //next
				case 8: 
					n="Verano";
					break;
				case 9:
					if(this.day<23){
						n="Verano";
					} else {
						n="Otoño";
					}
					break;
				case 10: //next
				case 11:				
					n="Otoño";
					break;
				case 12:
					if(this.day<21){
						n="Otoño";
					} else {
						n="Invierno";
					}
					break;
			}
			return n;
		}
		
		
		
		
	}
}
