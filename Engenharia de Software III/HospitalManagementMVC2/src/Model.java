

import java.util.*;

public class Model implements Subject {
	private ArrayList observers;
	private String nome;
	private String especialidade;
	private String horario;
	
	public Model() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(nome, especialidade, horario);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(String nome, String especialidade, String horario) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.horario = horario;
		measurementsChanged();
	}
	
	public String getTemperature() {
		return nome;
	}
	
	public String getHumidity() {
		return especialidade;
	}
	
	public String getPressure() {
		return horario;
	}
}
