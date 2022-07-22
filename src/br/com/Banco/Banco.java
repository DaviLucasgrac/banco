package br.com.Banco;
import java.util.Scanner;
import java.util.Random;
public class Banco {

	public static void main(String[] args) {
		
		

		
				try (Scanner leia = new Scanner(System.in)) {
					Cliente cliente=new Cliente();
					Conta   conta=new Conta();
					Random random = new Random();
					
					conta.agencia=1414;
					conta.conta=random.nextInt(9000);
					conta.operacao=13;
					conta.saldoAnterior=100;
					
					System.out.println("Informe o nome:");
					cliente.usuario=leia.nextLine();
					
					
					
					System.out.println("Informe o CPF:");
					cliente.cpf=leia.nextInt();
					
					leia.nextLine();
					
					System.out.println("informe a data de nascimento:");
					cliente.nascimento=leia.nextLine();
					
					System.out.println("Crie uma senha:");
					conta.senha=leia.nextInt();
					
					System.out.println("Parabéns! você agora é nosso cliente. sua conta é: ");
					System.out.println("conta: "+conta.conta);
					System.out.println("Agencia: "+conta.agencia);
					System.out.println("operação: "+conta.operacao);
					System.out.println("Para acessar sua conte tecle '3' ou '0' para sair ");
					cliente.atalho=leia.nextInt();
					while((cliente.atalho!=3) && (cliente.atalho!=0)) {
						 System.out.println("entrada incorreta, tente novamente");
							System.out.println("Para acessar sua conte tecle '3' ou '0' para sair");
							cliente.atalho=leia.nextInt();
						}
					
					if (cliente.atalho==3) {
						System.out.println("Seja bem vindo ao Banco!");
						System.out.println("digite sua senha para ter acesso a conta, ou digite '0' para sair");
						
						conta.acessosenha=leia.nextInt();
						leia.nextLine(); }
					
					else {
						System.out.println("obrigado por usar o nosso banco!");
					
						return;
				}
					
					while((conta.acessosenha!=conta.senha) &&(conta.acessosenha!=0)) {
						System.out.println("senha incorreta,  tente novamente ou digite '0' para sair");
						conta.acessosenha=leia.nextInt();
						leia.nextLine();
					}
					
						if (conta.acessosenha==conta.senha)
							{
							
						
						System.out.println("Para ver seu saldo tecle 1:");
						System.out.println("Para sacar tecle 2:");
						System.out.println("Para depositar tecle 3");
						cliente.atalho=leia.nextInt();
						conta.saldo=conta.saldoAnterior+conta.saldo;
						conta.saldoAnterior=0;
							}else {
								
								return;
							}
						switch (cliente.atalho) {
						case 1:
							System.out.println("Saldo : R$" +conta.saldo);
							System.out.println("digite 2 pra sacar, ou 0 para sair");
							cliente.atalho=leia.nextInt();
							
							case 2:
								System.out.println("Digite o valor");
								conta.valorSaque=leia.nextDouble();
								
								
								if (conta.saldo-conta.valorSaque<0) {
									System.out.println("Você não tem saldo suficiente!");
									
								}
								else
									conta.saldo=conta.saldo-conta.valorSaque;
									System.out.println("Você sacou: R$" +conta.valorSaque+", e ficou com: R$" +conta.saldo+" de saldo");
								System.out.println(" retire seu dinheiro");
								System.out.println("obrigado por usar o nosso banco!");
								;
							
								conta.valorSaque=0;
								

								conta.saldoAnterior=conta.saldo;
								break;
							case 0:
								System.out.println("obrigado por usar o nosso banco!");
								break;
								
						
							
						
						case 3:
							conta.saldoAnterior=conta.saldo;
							System.out.println("digite o valor do deposito:");
							conta.saldo=leia.nextDouble();
							conta.saldo=conta.saldo+conta.saldoAnterior;
							
							
							System.out.println("Seu saldo agora é R$ "+conta.saldo);
							
							System.out.println("Para sacar tecle 2:");
							System.out.println("Para depositar tecle 3");
							cliente.atalho=leia.nextInt();
							switch (cliente.atalho) {
						case 1:
							System.out.println("Saldo: R$" +conta.saldo);
							System.out.println("digite 2 pra sacar, ou 0 para sair");
							cliente.atalho=leia.nextInt();
							break;
							case 2:
								System.out.println("Digite o valor");
								conta.valorSaque=leia.nextDouble();
								
								
								if (conta.saldo-conta.valorSaque<0) {
									System.out.println("Você não tem saldo suficiente!");
								}
								else
									conta.saldo=conta.saldo-conta.valorSaque;
									System.out.println("Você sacou: R$" +conta.valorSaque+", e ficou com: R$" +conta.saldo+" de saldo");
								
								conta.valorSaque=0;
								
								conta.saldoAnterior=conta.saldo;
							case 0:
								System.out.println("obrigado por usar o nosso banco!");
								
							break;
							
						
						case 3:
							System.out.println("digite o valor do deposito:");
							conta.saldo=leia.nextDouble();
							conta.saldo=conta.saldo+conta.saldoAnterior;
							
							System.out.println("Seu saldo agora é R$ "+conta.saldo);
							System.out.println("obrigado por usar o nosso banco!");
}     

						}
				}}}
					
				
			


