import java.util.Timer;
import java.util.TimerTask;

public class schedulingCenter {
	public static void main(String[] args) {
		final Model model = Model.getInstance();
		ControllerTrial controller = new ControllerTrial(model);

		// Agendar as medições usando o método scheduleMeasurements da classe Model
		Model.scheduleMeasurements("Ana Caroline", "Cardiologista", "10:10", 5000);
		Model.scheduleMeasurements("Jeniffer Cristina", "Psiquiatra", "07:50", 15000);
	}
}
