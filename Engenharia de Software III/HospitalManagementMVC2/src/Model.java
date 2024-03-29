import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Model implements Subject {
	private static Model instance;
	private ArrayList<Observer> observers;
	private String nome;
	private String especialidade;
	private String horario;

	private Model() {
		observers = new ArrayList<>();
	}

	public static synchronized Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
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

	public String getNome() {
		return nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public String getHorario() {
		return horario;
	}

	// Método de fachada para simplificar a interação com a classe Model
	public static void scheduleMeasurements(final String nome, final String especialidade, final String horario, long delay) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				Model model = Model.getInstance();
				model.setMeasurements(nome, especialidade, horario);
			}
		}, delay);
	}

}
