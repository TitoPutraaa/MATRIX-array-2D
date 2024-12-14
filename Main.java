// MATRIX PENGURANGAN DAN 
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("masukan jumlah baris : ");
        int baris = scan.nextInt();
        System.out.print("masukan jumlah column : ");
        int column = scan.nextInt();
        int[][] matrixA = new int[baris][column];
        int[][] matrixB = new int[baris][column];
        
        
        // MEMEANGGIL METHOD 
        System.out.println("\ninput data MATRIX PERTAMA");
        inputMatrix(matrixA, scan);
        System.out.println("\ninput data MATRIX KE-DUA");
        inputMatrix(matrixB, scan);
        System.out.println("\nhasil MATRIX PERTAMA");
        printMatrix(matrixA);
        System.out.println("\nhasil MATRIX KE-DUA");
        printMatrix(matrixB);
        
        // case loop 
        while (true) {
            // pemilihan 
            System.out.println("\npilih penghitungan penjumlahan atau pengurangan!");
            System.out.println("PENJUMLAHAN : +");
            System.out.println("PENGURANGAN : -"); 
            System.out.print("PILIHAN : ");
            String pick = scan.next();
                  
            switch (pick) {
                case "+":
                System.out.println("\nHASIL PENJU MLAHAN MATRIX");
                for (int b = 0; b < matrixA.length; b++) { 
                    for (int c = 0; c < matrixA[b].length; c++) {
                        System.out.print(matrixA[b][c] + matrixB[b][c] + " ");
                    }
                    System.out.println();
                }              
                break;
                case "-":
                System.out.println("\nHASIL PENGURANGAN MATRIX");
                for (int b = 0; b < matrixA.length; b++) {
                    for (int c = 0; c < matrixA[b].length; c++) {
                        System.out.print(matrixA[b][c] - matrixB[b][c] + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("INPUT SALAH!!! / MASUKAN + ATAU - pada menu pilihan");
                break;
            }
                    System.out.println("\napakah anda ingin melanjutkan penghitungan?");
                    System.out.println("ingin melanjutkan : y ");
                    System.out.println("tidak ingin melanjutkan : n ");
                    System.out.print("PILIH : ");
                    String lop = scan.next();
                    if (lop.equalsIgnoreCase("n")) {
                        break;
                    } else if (lop.equalsIgnoreCase("y")) {
                        System.out.println();
                    } else {
                        System.out.println("hanya dapat menginput y atau n ");
                    }
                }
            }

        // method menginput data matrix 
    public static void inputMatrix (int[][] matrixA, Scanner scan) {
        for (int b = 0; b < matrixA.length; b++) {
            System.out.println("      baris ke " + (b+1));
            for (int c = 0; c < matrixA[b].length; c++) {
                System.out.print("nilai baris " + (b+1) + " column " + (c+1) + " : ");
                matrixA[b][c] = scan.nextInt();
            }
        }
    }

    // method menampilkan data matrix 
    public static void printMatrix(int[][] matrixA) {
        for (int b = 0; b < matrixA.length;b++) {
            for (int c = 0; c < matrixA[b].length; c++) {
                System.out.print(matrixA[b][c] + " "); 
            }
            System.out.println();
        }
    }
} 