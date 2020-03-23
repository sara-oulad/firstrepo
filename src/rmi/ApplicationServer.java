package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ApplicationServer extends UnicastRemoteObject implements Matrice {

	protected ApplicationServer() throws RemoteException {

	}

	public int[][] ProdMatrice(int mat1[][], int mat2[][]) {
		int[][] prod = new int[mat1.length][mat2[0].length];
		for (int i = 0; i < mat1.length; ++i) {
			for (int j = 0; j < mat2[0].length; ++j) {
				for (int k = 0; k < mat2.length; ++k) {
					prod[i][j] = prod[i][j] + mat1[i][k] * mat2[k][j];
				}
			}
		}
		return prod;
	}

	public void afficher(int[][] mat) {
		System.out.println();
		for (int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[0].length; ++j) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
