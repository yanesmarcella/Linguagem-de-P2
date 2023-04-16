package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel{

	private int quantidade;
	private Produto produto;
	private double desconto;
	
	public ItemCompra(int quantidade, double desconto) {
		
		if(desconto <= produto.getDescontoMaximo() ) {
			this.quantidade = quantidade;
			this.desconto = desconto;
			
		}else {
			System.out.println("Desconto ultrapassou o limite");
		}
		
	}
	
	public ItemCompra(Produto produto, double desconto) {
	
		if(this.produto.equals(produto)) {
			this.produto = produto;
			this.desconto = desconto;

		}else {
			System.out.println("Este produto já existe");
		}
	}
	
	public double calcularPreco() {
		
		double preco;
		preco = this.produto.getPreco() - this.desconto;
		return preco;
	}
}

