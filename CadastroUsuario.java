import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Private string Name;
        Private int idade;
        Private string cidade;
        Private int Cpf; 
        private List<Integer> eventosConfirmados; // guarda IDs dos eventos
                
        System.out.println("Nome: ");
        String nome = in.nextLine();
        System.out.println("Idade: ");
        String idade = in.nextLine();
        System.out.println("Cidade: ");
        String cidade = in.nextLine();
        System.out.println("CPF: ");
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("CPF: " + CPF);
      
    }
    private Object eventosConfirmados;{
    
    
 public List<Integer> getEventosConfirmados() { return eventosConfirmados; }
 public void confirmarPresenca(String eventoId) {
 if (!eventosConfirmados.contains(eventoId)) eventosConfirmados.add(eventoId);
 }

    /**
     *
     * @param eventoId
     */
    public void cancelarPresenca(String eventoId) {
 eventosConfirmados.remove(Integer.valueOf(eventoId));
    }
}



