/**
 * 
 */
/**
 * @author Gandreva PC
 *
 */
package qaautomation.tugas2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas2 {
	
   @SuppressWarnings("resource")
public static void main(String[] args) {         
        Kalkulator_fungsi fungsi = new Kalkulator_fungsi();
		Scanner input = new Scanner(System.in);
        boolean daftar = true;
        
        try{
        	while(daftar==true){
           
                System.out.println("");
                System.out.println("=========================");
                System.out.println("   Aplikasi Kalkulator   ");
                System.out.println("=========================");
                System.out.println("1. Sum (Penjumlahan)");
                System.out.println("2. Subtract (Pengurangan)");
                System.out.println("3. Divide (Pembagian)");
                System.out.println("4. Multiplication (Perkalian)");
                System.out.println("=========================");
                                
                System.out.print("Masukkan Operator Pilihan Anda : ");
                int pilihan = input.nextInt();
                System.out.println("");
                
                if(pilihan>=1 && pilihan<=4){
                System.out.print("Input Pertama : ");
                int int1 = input.nextInt();
                fungsi.setInputan1(int1);
                System.out.println("");

                System.out.print("Input Kedua : ");
                int int2 = input.nextInt();
                fungsi.setInputan2(int2);
                System.out.println("");
           
                      
                if (pilihan==1){
                    fungsi.sum();
                    System.out.println("Hasil Penjumlahan = " +fungsi.getHasil());                                   
                }
                else if(pilihan==2){
                    fungsi.subtract();
                    System.out.println("Hasil Pengurangan = " +fungsi.getHasil());
                }
                else if(pilihan==3){
                    fungsi.divide();
                    System.out.println("Hasil Pembagian = " +fungsi.getHasil());
                }  
                else if(pilihan==4){
                    fungsi.multiplication();
                    System.out.println("Hasil Perkalian = " +fungsi.getHasil());  
                }    
                else if(daftar=false);{
                	             	
                }
             }
        	else System.out.println("Inputan Operator Pilihan Anda Salah");
        	
            }
        }
            catch (InputMismatchException exception){
                    System.out.println("Inputan Anda Tidak Integer");
                   
            }
         }
   	}
