package rmi;

import java.io.File;
import java.rmi.Remote;

public interface Matrice extends Remote {

	public int[][] ProdMatrice(int mat1[][], int mat2[][]) throws Exception;

	public void afficher(int[][] mat) throws Exception;

}
