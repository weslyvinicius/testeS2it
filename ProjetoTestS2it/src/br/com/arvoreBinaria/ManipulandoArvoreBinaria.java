package br.com.arvoreBinaria;

public class ManipulandoArvoreBinaria {
	
	public static void main(String[] args) {
		
		BinaryTree no1 = new BinaryTree(10);
		BinaryTree no2 = new BinaryTree(5);
		BinaryTree no3 = new BinaryTree(1);
		BinaryTree no4 = new BinaryTree(8);
		BinaryTree no5 = new BinaryTree(15);
		BinaryTree no6 = new BinaryTree(12);
		BinaryTree no7 = new BinaryTree(18);
		
		
		BinaryTree arvore = new BinaryTree();
		arvore.inserindoNoNaArvore(no1);		
		arvore.inserindoNoNaArvore(no2);
		arvore.inserindoNoNaArvore(no3);
		arvore.inserindoNoNaArvore(no4);
		arvore.inserindoNoNaArvore(no5);
		arvore.inserindoNoNaArvore(no6);
		arvore.inserindoNoNaArvore(no7);
		
		System.out.println("Soma do No 5: " + arvore.somaNosSubsequentes(no5) );
		
		
	}

}
