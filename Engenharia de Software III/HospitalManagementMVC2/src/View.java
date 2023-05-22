

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class View implements ActionListener, Observer {
	private Subject model;
	private controllerInterface controller;
	private String nome = "0";
	private String especialidade = "0";
	private String horario = "0";
	
	JFrame frame;
	JPanel panelBotoes;
	JPanel panelDados;
	JPanel panelTemp;
	JPanel panelPres;
	JPanel panelHumi;
	JLabel labelTemp;
	JLabel labelPres;
	JLabel labelHumi;
	JLabel tempText;
	JLabel presText;
	JLabel humiText;
	JButton assinar;
	JButton cancelar;
	
	public View(Subject mo, controllerInterface co) {
		this.model = mo;
		this.controller = co;
	}
	
	
	public void createView(){
		
		frame = new JFrame("Esta��o de agendamento");
		panelBotoes = new JPanel();
		panelDados = new JPanel();
		panelTemp = new JPanel();
		panelPres = new JPanel();
		panelHumi = new JPanel();
		assinar = new JButton("Agendar Consulta");
		cancelar = new JButton("Cancelar Agendamento");
		labelTemp = new JLabel();
		labelPres = new JLabel();
		labelHumi = new JLabel();
		tempText = new JLabel("Nome:");
		presText = new JLabel("Especialidade:");
		humiText = new JLabel("Horário:");
		
		
		assinar.addActionListener(this);
		cancelar.addActionListener(this);
		
		panelBotoes.add(assinar);
		panelBotoes.add(cancelar);
		panelTemp.add(tempText);
		panelTemp.add(labelTemp);
		panelPres.add(presText);
		panelPres.add(labelPres);
		panelHumi.add(humiText);
		panelHumi.add(labelHumi);
		panelDados.add(panelTemp);
		panelDados.add(panelPres);
		panelDados.add(panelHumi);
		frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
		frame.getContentPane().add(BorderLayout.CENTER, panelDados);
		
		labelTemp.setText(nome);
		labelHumi.setText(especialidade);
		labelPres.setText(horario);
		
		
		frame.setSize(800, 300);
		frame.setVisible(true);
		
	}

	public void update(String name, String espe, String hor) {
        nome = name;
        especialidade = espe;
		horario = hor;
        
		display();
	}

	public void display() {
		
		labelTemp.setText(nome);
		labelPres.setText(especialidade);
		labelHumi.setText(horario);
		
	}
	
	public void habilitarBotaoAssinar(){
		
		assinar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoAssinar(){
		
		assinar.setEnabled(false);
		
	}
	
	
	public void habilitarBotaoCancelar(){
		
		cancelar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoCancelar(){
		
		cancelar.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent event){
		if (event.getSource() == assinar){
				controller.assinar();
		}
		if (event.getSource() == cancelar){
				controller.cancelar();
		}
	}
}
