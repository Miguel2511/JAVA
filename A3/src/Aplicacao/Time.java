package Aplicacao;

public class Time {
	
	private int Hora;
	private int Minuto;
	private int Segundo;
	
	// CONJ 0
	public Time(){
		Hora = 0;
		Minuto = 0;
		Segundo = 0;
	}
	// CONJ HORA
	public Time(int hora){
		Hora = hora;
		Minuto = 0;
		Segundo = 0; 
	}
	// CONJ HORA, MINUTO
	public Time(int hora, int minuto){
		Hora = hora;
		Minuto = minuto;
		Segundo = 0; 
	}
	// CONJ HORA, MINUTO, SEGUNDO
	public Time(int hora, int minuto, int segundo){
		Hora = hora;
		Minuto = minuto;
		Segundo = segundo; 
	}
	
	// GET E SET HORA
	public int getHora() {
		return Hora;
	}
	public void setHora(int hora) {
		if(hora >= 0 && hora <= 23) {
			Hora = hora;	
		}
		else {
			Hora = 0;
		}
	}
	
	
	// GET E SET MINUTOS
	public int getMinuto() {
		return Minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto >= 0 && minuto <= 59) {
			Minuto = minuto;	
		}
		else {
			Minuto = 0;
		}
	}
	
	
	// GET E SET SEGUNDOS
	public int getSegundo() {
		return Segundo;
	}
	public void setSegundo(int segundo) {
		if(segundo >= 0 && segundo <= 59) {
			Segundo = segundo;	
		}
		else {
			Segundo = 0;
		}
	}
	
	// MÉTODO STRING
	public String exibeHora() {
		return Hora + ":" + Minuto + ":" + Segundo;
	}

}
