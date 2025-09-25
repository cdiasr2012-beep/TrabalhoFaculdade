import java.time.LocalDateTime;
import java.util.Scanner;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;



public class CadastroEvento {
     public static void main(String[] args) {    

        System.out.println("Nome : ");
        String nome = in.nextLine();
    
         System.out.println("Endereço: ");
         String endereco = in.nextLine();
         
         System.out.println("Categoria: ");
         String categoria = in.nextLine();
         
         System.out.println("Horário: ");
         String horário = in.nextLine();
         
         System.out.println("Descrição: ");
         String descrição = in.nextLine();

         public Evento(String nome, String endereco, String categoria, LocalDateTime horario, String
 descricao) {
             this.id = counter++;
             this.nome = nome;
             this.endereco = endereco;
             this.categoria = categoria;
             this.horario = horario;
             this.descricao = descricao;
         }
   
    }
}