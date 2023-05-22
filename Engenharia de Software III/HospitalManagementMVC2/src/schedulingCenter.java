

import java.util.*;

public class schedulingCenter {

	public static void main(String[] args) {
		final Model model = new Model();
		ControllerTrial controller = new ControllerTrial(model);
		
		
		final Timer timer = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMeasurements("Ana Caroline", "Cardiologista", "10:10");
	        }
	      }, 5000);
	      
	      final Timer timer2 = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMeasurements("Jeniffer Cristina", "Psiquiatra", "07:50");
	        }
	      }, 30000);
		
	}
	  
}
