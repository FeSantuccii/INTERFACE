package Funcionariostipo;

import Funcionarios.Funcionario;

public class Funcionariohorista implements Funcionario { //herança do Funcionario
    private double totalAnualRecebido;

    public Funcionariohorista(double totalAnualRecebido) {
        this.totalAnualRecebido = totalAnualRecebido;
    }

    @Override
    public double calcularBonus() {
        return totalAnualRecebido * 0.10; //bonus de 10%
    }
}