package Funcionariostipo;

import Funcionarios.Funcionario;

public class Funcionarioassalariado implements Funcionario { //herança do funcionario
    @Override
    public double calcularBonus() { //bonus valor fixo de 5000
        return 5000.0;
    }
}