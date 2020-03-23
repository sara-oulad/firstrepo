package rmi;

import java.rmi.Naming;

public class Client {

	public Client() {
	}

	public static void main(String[] args) {
		try {
			int[][] mat1 = { { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 } };
			int[][] mat2 = { { 3, 0, 0 }, { 0, 3, 0 }, { 0, 0, 3 } };
			int[][] prod = new int[3][3];
			Matrice stub = (Matrice) Naming.lookup("rmi://localhost:5090/occurence");//occurence faut etre ecrit dans server.
			prod = stub.ProdMatrice(mat1, mat2);
			stub.afficher(prod);
		} catch (Exception e) {
			System.out.println(" client error" + e);
		}
	}
}
