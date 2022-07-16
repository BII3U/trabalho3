package apresentacao;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Categorias;
import negocio.Letra;
import negocio.Participante;
import persistencia.CategoriaDAO;
import persistencia.ParticipanteDAO;

public class JanelaPadrao extends JFrame{
	
	private JLabel apresentacao;
	private JPanel painelApresentacao;
	private JLabel labelPessoa;
	private JPanel painelPessoa;
	
	private JTextField campoPessoa;
	private JLabel labelLugar;
	private JTextField campoLugar;
	private JPanel painelLugar;
	private JPanel painelCampos;
	
	private JLabel labelObjeto;
	private JLabel labelCidadeEstadoPais;
	private JLabel labelCarro;
	private JLabel labelFruta;
	private JLabel labelAnimal;
	private JLabel labelParticipante;
	private JLabel labelLetraSorteada;
	
	private JPanel painelObjeto;
	private JPanel painelCidadeEstadoPais;
	private JPanel painelCarro;
	private JPanel painelFruta;
	private JPanel painelAnimal;
	private JPanel painelParticipante;
	private JPanel painelLetraSorteada;
	
	private JTextField campoObjeto;
	private JTextField campoCidadeEstadoPais;
	private JTextField campoCarro;
	private JTextField campoFruta;
	private JTextField campoAnimal;
	private JTextField campoParticipante;
	private JTextField campoLetraSorteada;
	
	private JButton enviar;
	private JPanel painelEnviar;
	
	public JanelaPadrao() {
		super("Aprendendo Interface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(500,300);
		setLayout(new FlowLayout());
		addComponentes();
		addEventos();
		
		setVisible(true);
	}
	
	private void addComponentes() {
		apresentacao = new JLabel("Seja Bien Venido Forasteiro!");
		painelApresentacao = new JPanel();
		
		labelPessoa = new JLabel("Pessoa");
		campoPessoa = new JTextField();
		campoPessoa.setColumns(18); // setar a largura da coluna
		painelPessoa = new JPanel();
		
		labelLugar = new JLabel("Lugar");
		campoLugar = new JTextField();
		campoLugar.setColumns(18);  // setar largura do campo lugar
		painelLugar = new JPanel();
		
		painelCampos = new JPanel();
		
		enviar = new JButton("Enviar");
		painelEnviar = new JPanel();
		
		labelObjeto = new JLabel("Objeto");
		labelCidadeEstadoPais = new JLabel("CidadeEstadoPais");
		labelCarro = new JLabel("Carro");
		labelFruta = new JLabel("Fruta");
		labelAnimal = new JLabel("Animal");
		labelParticipante = new JLabel("Participante");
		labelLetraSorteada = new JLabel("LetraSorteada");
		
		painelObjeto = new JPanel();
		painelCidadeEstadoPais = new JPanel();
		painelCarro = new JPanel();
		painelFruta = new JPanel();
		painelAnimal = new JPanel();
		painelParticipante = new JPanel();
		painelLetraSorteada = new JPanel();
		
		campoObjeto = new JTextField();
		campoObjeto.setColumns(18);
		campoCidadeEstadoPais = new JTextField();
		campoCidadeEstadoPais.setColumns(18);
		campoCarro = new JTextField();
		campoCarro.setColumns(18);
	    campoFruta = new JTextField();
	    campoFruta.setColumns(18);
		campoAnimal = new JTextField();
		campoAnimal.setColumns(18);
		campoParticipante = new JTextField();
		campoParticipante.setColumns(18);
		campoLetraSorteada = new JTextField();
		campoLetraSorteada.setColumns(18);
		
		painelApresentacao.add(apresentacao);
		painelPessoa.add(labelPessoa);
		painelPessoa.add(campoPessoa);
		
		painelLugar.add(labelLugar);
		painelLugar.add(campoLugar);
		
		painelObjeto.add(labelObjeto);
		painelObjeto.add(campoObjeto);
		
		painelCidadeEstadoPais.add(labelCidadeEstadoPais);
		painelCidadeEstadoPais.add(campoCidadeEstadoPais);
		
		painelCarro.add(labelCarro);
		painelCarro.add(campoCarro);
		
		painelFruta.add(labelFruta);
		painelFruta.add(campoFruta);
		
		painelAnimal.add(labelAnimal);
		painelAnimal.add(campoAnimal);
		
		painelParticipante.add(labelParticipante);
		painelParticipante.add(campoParticipante);
		
		painelLetraSorteada.add(labelLetraSorteada);
		painelLetraSorteada.add(campoLetraSorteada);
		
;	//	painelCampos.add(painelPessoa);
	//	painelCampos.add(painelLugar);
		
		painelEnviar.add(enviar);
		
		add(painelApresentacao);
		add(painelPessoa);		//os campos ficam abaixo um do outro ao inves seguidos
		add(painelLugar);		//
		add(painelObjeto);
		add(painelCidadeEstadoPais);
		add(painelCarro);
		add(painelFruta);
		add(painelAnimal);
		add(painelParticipante);
		add(painelLetraSorteada);
		
		//	add(painelCampos);			
		add(painelEnviar);
}
	private void addEventos() {
		enviar.addActionListener(e -> enviar());
	}
	
	private void enviar() {
		
		String pessoa = campoPessoa.getText();
		String carro = campoCarro.getText();
		String CidadeEstadoPais = campoCidadeEstadoPais.getText();
		String fruta = campoFruta.getText();
		String objeto = campoObjeto.getText();
		String animal = campoAnimal.getText();
		int participante = Integer.parseInt(campoParticipante.getText());
		int letra = Integer.parseInt(campoLetraSorteada.getText());
		
		Categorias c = new Categorias();
		
		Participante p = new Participante();
		p.setId(participante);
		
		Letra l = new Letra();
		l.setId(letra);
		
		c.setPessoa(pessoa);
		c.setCarro(carro);
		c.setCidadeEstadoPais(CidadeEstadoPais);
		c.setFruta(fruta);
		c.setObjeto(objeto);
		c.setAnimal(animal);
		c.setParticipante(p);
		c.setLetra(l);
		
		CategoriaDAO.inserir(c);
		
		

		
	}
}