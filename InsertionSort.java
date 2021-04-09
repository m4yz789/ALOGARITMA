/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author asus
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
       System.out.print("Masukan Jumlah Data : "); int jumlah_data = Integer.parseInt(dataIn.readLine());
       
       int[] data = new int[jumlah_data];
       
       System.out.println("\nMenu Pengisian Data");
       System.out.println("1. Di Input Oleh User");
       System.out.println("2. Di Input Oleh Program");
       System.out.print("Pilihan : "); int isi_data = Integer.parseInt(dataIn.readLine());
       switch(isi_data)
       {
           case 1 : System.out.println();
                    for(int a = 0; a<jumlah_data; a++)
                            {
                                System.out.print("Data ke-" + (a+1)+":"); data[a] = Integer.parseInt(dataIn.readLine());  
                            }
                            break;
           case 2 : System.out.println();
                    for(int a = 0; a < jumlah_data; a++)
                        data[a] = new Random().nextInt(201);
                    
                    System.out.print("Data : ");
                    for(int a = 0; a<jumlah_data; a++)
                        System.out.print(data[a] + " ");
                    
                    break;
           default : System.out.println("==Pilihan Tidak Tersedia==");
       }
       System.out.println("Proses Insertion Sort");
       for(int a = 0; a<jumlah_data-1; a++) {
           
           System.out.println("Iterasi " + (a+1));
            for(int b = 0; b< jumlah_data; b++)
                System.out.print(data[b] + "\t");
            
            System.out.print("----> Bandingkan " + data[a+1] + "Dengan" + data[a]);
            for(int b = a+1; b>0; b--)
            {
                String pesan = " ----> Tidak Ada Data Pertukaran ";
                if(data[b] < data[b-1])
                {
                    pesan = " --> "+data[b]+"Tukar Posisi Dengan "+data[b-1];
                    
                    int temp= data[b];
                    data[b] = data [b-1];
                    data[b-1] = temp;
                    
                    System.out.println();
                    for(int c=0; c<jumlah_data;c++)
                        System.out.print(data[c]+"\t");
                    
                    System.out.print(pesan);                    
                }
                else
                {
                    System.out.println();
                    for(int c=0; c<jumlah_data;c++)
                        System.out.print(data[c]+"\t");
                    
                    System.out.print(pesan); 
                    break;
                }
            }
            System.out.println("\n");
       }
            System.out.println("\n Data Setelah Di Sorting : ");
            for(int a = 0; a < jumlah_data; a++)
                System.out.print(data[a]+" ");
       }
    }
