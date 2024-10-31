package Principal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import Funcionariostipo.Funcionarioassalariado;
import Funcionariostipo.Funcionariohorista;

public class MainInterface {
    public static void main(String[] args) {

        // Criação do frame principal
        JFrame frame = new JFrame("Sistema de Gestão de Funcionários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300); // Aumentado o tamanho do frame
        frame.setLayout(new BorderLayout());

        //entrada horista
        JLabel labelSalarioHorista = new JLabel("Salário Anual do Funcionário Horista:");
        JTextField campoSalarioHorista = new JTextField(30); // Aumentado para 30 colunas

        //campos de entrada
        JPanel painelEntrada = new JPanel();
        painelEntrada.setLayout(new FlowLayout());
        painelEntrada.add(labelSalarioHorista);
        painelEntrada.add(campoSalarioHorista);

        //calculo de bonus (BOTOES)
        JButton botaoCalcularAssalariado = new JButton("Calcular Bônus Assalariado");
        JButton botaoCalcularHorista = new JButton("Calcular Bônus Horista");

        //painel dos botoes
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());
        painelBotoes.add(botaoCalcularAssalariado);
        painelBotoes.add(botaoCalcularHorista);

        //resultado dos calculos
        JLabel labelResultado = new JLabel("Resultado: ");
        JTextField campoResultado = new JTextField(30); // Aumentado para 30 colunas
        campoResultado.setEditable(false); // Campo apenas para exibição

        //painel dos resultados
        JPanel painelResultado = new JPanel();
        painelResultado.setLayout(new FlowLayout());
        painelResultado.add(labelResultado);
        painelResultado.add(campoResultado);

        //Posição dos resultados
        frame.add(painelEntrada, BorderLayout.WEST);
        frame.add(painelBotoes, BorderLayout.NORTH);
        frame.add(painelResultado, BorderLayout.SOUTH);

        //ação do botão assalariado
        botaoCalcularAssalariado.addActionListener(e -> {
            Funcionarioassalariado funcionarioAssalariado = new Funcionarioassalariado();
            campoResultado.setText("R$ " + funcionarioAssalariado.calcularBonus());
        });

        //Ação do botão horista
        botaoCalcularHorista.addActionListener(e -> {
            try {
                double salarioAnual = Double.parseDouble(campoSalarioHorista.getText());
                Funcionariohorista funcionarioHorista = new Funcionariohorista(salarioAnual);
                campoResultado.setText("R$ " + funcionarioHorista.calcularBonus());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Insira um valor numérico válido para o salário anual.");
            }
        });

        //interface visivel
        frame.setVisible(true);
    }
}
