import javax.swing.JOptionPane;
public class Data
{
  public static void main(String[] args)
  {  //Variaveis: As palavras 1,2 e 3; resultado
     String dia,mes,ano;
     
     dia = JOptionPane.showInputDialog ("Digite o dia:");
     mes = JOptionPane.showInputDialog ("Digite o m�s:");
     ano = JOptionPane.showInputDialog ("Digite o ano:");
     
     
     // Sa�da
     JOptionPane.showMessageDialog (null, dia+"/"+mes+"/"+ano);
       
     
  } 
}