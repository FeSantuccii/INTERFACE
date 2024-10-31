package Principal;

import Funcionarios.Funcionario;
import Funcionariostipo.Funcionarioassalariado;
import Funcionariostipo.Funcionariohorista;

public class Main {
    public static void main(String[] args) {
        //Funcionario assalariado, bonus já definido
        Funcionario funcionarioassalariado = new Funcionarioassalariado();
        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioassalariado.calcularBonus());

        //Funcionario horista com salario de 30000
        Funcionario Funcionariohorista = new Funcionariohorista(30000.0);
        System.out.println("Bônus do Funcionário Horista: R$ " + Funcionariohorista.calcularBonus()); //calculo dos 10%
    }
}
