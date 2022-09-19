
import javax.swing.JOptionPane;

public class Salario {
	
	public void ReajustarSalario() {
		double [] salarios = new double [200];
		Double reajuste;
		int i = 0;
		double cont = 0;
		
		while(cont != -1) {
			salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
			cont = salarios[i];
			i++;
		}
		
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do reajuste em Reais: "));
		
		for(i=0;i<salarios.length;i++) {
			if (salarios[i] > 0)
			System.out.println("O Salario com reajuste de R$"+reajuste+" é R$"+(salarios[i] + reajuste));
		}
		
	}

}
