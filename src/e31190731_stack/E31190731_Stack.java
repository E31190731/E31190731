/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190731_stack; //class berada pada package ini
import static e31190731_stack.E31190731_Stack.in; //sintax untuk mengimport kelas E31190731_Stack
import java.util.ArrayList; //sintax untuk mengimport arraylist
import java.util.List; //sintax untuk mengimport list
import java.util.Scanner; //sintax untuk mengimport Scanner

/**
 *
 * @author ridho riyadi hartomo
 */
public class E31190731_Stack {

    /**
     * @param args the command line arguments
     */
        public static Scanner in=new Scanner(System.in); //inisialisasi scanner
        private List<Object> list=new ArrayList<Object>(); //inisialisasi list
        private int Index=-1; //inisialisasi Index sebagai integer
    
    public void push(Object object){ //void untuk menambahkan object stack
        list.add(object); //list merupakan tambahkan object
        Index++; //Index +1
    }
    
    public Object pop(){ //void untuk menghapus object stack
        Object object=list.remove(Index); //object merupakan hapus list dari Index
        Index--; //Index -1
        return object; //sintax untuk kembali ke object yang ada
    }
    
    public int count(){ //void untuk menampilkan banyak array pada stack
        return list.size(); //sintax untuk kembali pada panjang list
    }
    
    public Object peek(){ //void untuk menampilkan array terakhir pada stack
        return list.get(Index); //sintax untuk kembali pada list yang didapatkan dari Index
    }
}

class run
{
    public static void main( String[] args ){ //sintax main method
        E31190731_Stack stack=new E31190731_Stack(); //memanggil class E31190731_Stack
        String anime; //object anime sebagai String
        System.out.print("Masukan Nama Anime : ");
        anime = in.nextLine(); //object anime di input menggunakan keyboard
        stack.push(anime);  //object anime di tambahkan kedalam stack
        System.out.print("Masukan Nama Anime : ");
        anime = in.nextLine(); //object anime di input menggunakan keyboard
        stack.push(anime);  //object anime di tambahkan kedalam stack
        System.out.print("Masukan Nama Anime : ");
        anime = in.nextLine(); //object anime di input menggunakan keyboard
        stack.push(anime);  //object anime di tambahkan kedalam stack
        
        System.out.println("===========================================");
        
        int count=stack.count(); //memanggil void count pada class E31190731_Stack
        Object object=stack.peek(); //object memanggil void peek
        System.out.println("Jumlah Data Pada Stack : "+count);
        System.out.println("Data Anime Teratas Pada Stack : "+object);
        
        System.out.println("###########################################");
        
        object=stack.pop(); //object memanggil void pop
        System.out.println("Objek anime yang dikeluarkan (Pop) : "+object);
        count=stack.count(); //object memanggil void count
        System.out.println("Jumlah Data Pada Stack setelah Pop: "+count);
        
        System.out.println("###########################################");
        
        object=stack.pop(); //object memanggil void pop
        System.out.println("Objek anime yang dikeluarkan (Pop) : "+object);
        count=stack.count(); //object memanggil void count
        System.out.println("Jumlah Data Pada Stack setelah Pop: "+count);
        
        System.out.println("###########################################");
        
        object=stack.peek(); //object memanggil void peek
        System.out.println("Data Teratas anime Pada Stack setelah Pop: "+object);
    }
}   