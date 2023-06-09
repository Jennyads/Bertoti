
public class Controller implements controllerInterface{

	View view;
	Subject model;
	
	public Controller(Subject mo){
		this.model = mo;
		view = new View(model, this);
		view.createView();
		view.desabilitarBotaoCancelar();
		
	}
	
	public void assinar(){
		
		model.registerObserver(view);
		System.out.println("Consulta agendada no setor de agendamento");
		view.desabilitarBotaoAssinar();
		view.habilitarBotaoCancelar();
		
	}
	
	public void cancelar(){
		
		model.removeObserver(view);
		System.out.println("Agendamento cancelado");
		view.desabilitarBotaoCancelar();
		view.habilitarBotaoAssinar();
		
	}
	
}
