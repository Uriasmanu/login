import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       String login, senha;

    login = JOptionPane.showInputDialog("Digite o seu login");
    senha = JOptionPane.showInputDialog("Digite a sua senha");

    if (login.equals("aluno") && senha.equals("aluno")) {
        JOptionPane.showMessageDialog(null,"Acesso Liberado");

        }else{
            JOptionPane.showMessageDialog(null,"Login ou senha incorretos");
        }
    }
}


