package matrices;


import java.util.Scanner;
public class Nomor02_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		// ukuran matriksnya
		System.out.println("Masukkan ukuran matriks : ");
		int i = scan.nextInt(); // baris
		int j = scan.nextInt(); // kolom
		int k = scan.nextInt(); // ?

		int[][] matriksA = new int[i][j];
		// matriks A i j berarti baris a kolom j
		int[][] matriksB = new int[j][k];
		int[][] matriksC = new int[i][k];

		// input matriks A
		System.out.println("Input Matriks A");
		for (int m = 0; m < i; m++){
			for (int n = 0; n < j; n++){
				matriksA[m][n] = scan.nextInt();
				// buat input matriksnya pakai scan ini
			}
		}

		// input matriks B
		System.out.println("Input Matriks B");
		for (int m = 0; m < j; m++){
			for (int n = 0; n < k; n++){
				matriksB[m][n] = scan.nextInt();
			}
		}

		// program perkalian matriks A dan matriks B
		for (int m = 0; m < i; m++){
			for (int n = 0; n < k; n++){
				for (int o = 0; o < j; o++){
					matriksC[m][n] = matriksC[m][n] + matriksA[m][o] * matriksB[o][n];
					// matriksC[m][n] = matriksC[m][n] + berarti baris tambah kolom dari matriks A dan matriks B 
					// baru dikalikan indeks didalamnya matriks A dan matriks B
				}

			}
		}

		// buat ngeprint
		System.out.println("== Hasil Matriks ==");
		for (int m = 0; m < i; m++){
			for (int n = 0; n < k; n++){
				System.out.print(matriksC[m][n] + " ");
			}
			System.out.println("\n");
		}
    }
}
