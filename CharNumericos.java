import javax.swing.JOptionPane;
public class CharNumericos
{
  public static void main(String[] args)
  { //Variveis, onde n signif�ca "n�mero"
    char n1,n2,n3,n4;
    String unidos;
    //Guardando os valores
    n1=JOptionPane.showInputDialog("Digite um n�mero de milhar:").charAt(0);
    n2=JOptionPane.showInputDialog("Digite um n�mero de centena de milhar:").charAt(0);
    n3=JOptionPane.showInputDialog("Digite um n�mero de dezena de milhar:").charAt(0);
    n4=JOptionPane.showInputDialog("Digite um n�mero de unidade de milhar:").charAt(0);
    
    unidos = n1+""+n2+""+n3+""+n4;
    
    JOptionPane.showMessageDialog(null,"A uni�o fica assim:"+unidos);
    
    
    
    
  }
}