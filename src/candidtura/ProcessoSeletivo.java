package candidtura;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
	}
   static void analisarCandidato(double salarioPretendido) {
	   double salarioBase = 2000.0;
	   if(salarioBase > salarioPretendido){
		   System.out.print("ligar para candidato");
	   }else if(salarioBase == salarioPretendido)
		   System.out.print("ligar para candidato com contra proposta");
	   else {
		   System.out.print("aguardando o resultado dos demais candidatos");
	   }
   }
   }
   

