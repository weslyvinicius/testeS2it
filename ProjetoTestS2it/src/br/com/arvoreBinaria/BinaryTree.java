package br.com.arvoreBinaria;

public class BinaryTree {
	
	private Integer valor;
	
	private BinaryTree esquerda;
	
	private BinaryTree direita;
	
	public BinaryTree(){
		
	}
	
	public BinaryTree(int valor){
		this.valor    = valor;
		this.esquerda = null;
		this.direita  = null;		
	}
	
	public boolean arvoreEstaVazia(){
		return this.valor == null ;
	}
	
	public void inserindoNoNaArvore(BinaryTree novoNo){
		
		if (arvoreEstaVazia()){
			this.valor = novoNo.getValor();
		}else{
			
			if(novoNo.getValor() < this.valor){ // inserir na esquerda
				
				if(this.esquerda == null){ // e nó folha
				   this.esquerda = novoNo;
				}else
					this.esquerda.inserindoNoNaArvore(novoNo);
				
			}else if (novoNo.getValor() > this.valor){ // inserir na direta
				
				if( this.direita == null){ // e nó folha
					this.direita = novoNo;
				}else
					this.direita.inserindoNoNaArvore(novoNo);
				
			}
		}
		
	}

	public int somaNosSubsequentes(BinaryTree pontoInicial){		
		if(pontoInicial == null)
			return 0;
		
		final int valueEsquerda = somaNosSubsequentes(pontoInicial.getEsquerda());
		final int valueDireita = somaNosSubsequentes(pontoInicial.getDireita());
		
		return pontoInicial.getValor() + valueEsquerda + valueDireita;
	}
	
	
	
	/*** Get e Set ***/
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public BinaryTree getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(BinaryTree esquerda) {
		this.esquerda = esquerda;
	}

	public BinaryTree getDireita() {
		return direita;
	}

	public void setDireita(BinaryTree direita) {
		this.direita = direita;
	}

	
	

}
