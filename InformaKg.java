import javax.swing.JOptionPane;
public class InformaKg
{
  public static void main(String[] args)
  { //Variaveis
   int i;
    char vetor[] = new char [10]; 
   
   for(i=0;i<10;i=i+1)
   {
   
     //entrada
     // Observe que ao colocar.charAt(0); Apenas a primeira letra digitada ser� adicionada a mem�ria.    
     vetor[i] = JOptionPane.showInputDialog("Digite um caracter").charAt(0);
    }
    
    
      //Sa�da
      JOptionPane.showMessageDialog(null, ""+vetor[0]+"" +vetor[1]+"" +vetor[2]+""+vetor[3]+"" +vetor[4]+""+vetor[5]+"" +vetor[6]+""+vetor[7]+""+vetor[8]+""+vetor[9]);

    
   
  }
}