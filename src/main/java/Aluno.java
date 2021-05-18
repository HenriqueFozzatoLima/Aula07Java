
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Aluno {

    Scanner ler = new Scanner(System.in);

    public void cadastrarAluno() {
        String a[] = new String[5];
        String m[] = {"Matemática", "Português", "Ciências"};
        double nota[] = new double[5];

        for (int i = 0; i < 5; i++) {
            a[i] = JOptionPane.showInputDialog("Nome do aluno: ");

        }

        for (String aluno : a) {
            System.out.println(aluno);
            //JOptionPane.showMessageDialog(null, aluno);
        }

    }

    public void atividade1() {
        String m[] = {"Matemática", "Português", "Física", "História", "Geografia"};
        double nota[] = new double[5];
        double media[] = new double[5];
        String result = "";
        for (int i = 0; i < m.length; i++) {

            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + m[i]));
            result += m[i] + ": " + nota[i] + "\n";

        }

        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, "Sua média é: " + (nota[0] + nota[1] + nota[2] + nota[3] + nota[4]) / 5);

    }

    public void atividade3() {
        String disc[] = {"Matemática", "Português", "Física", "História", "Geografia"};
        double nota[] = {9, 8, 4.5, 7, 6};
   

        System.out.println("Digite um número de 0 a 4:");
        int num = ler.nextInt();
        if (num == 0) {
            System.out.println("Disciplina: " + disc[0] + "\n" + "Nota: " + nota[0]);

        } else if (num == 1) {
            System.out.println("Disciplina: " + disc[1] + "\n" + "Nota: " + nota[1]);
        } else if (num == 2) {
            System.out.println("Disciplina: " + disc[2] + "\n" + "Nota: " + nota[2]);
        } else if (num == 3) {
            System.out.println("Disciplina: " + disc[3] + "\n" + "Nota: " + nota[3]);
        } else if (num == 4) {
            System.out.println("Disciplina: " + disc[4] + "\n" + "Nota: " + nota[4]);
        } else {
            System.out.println("Número inválido. Por favor, escolha um número de 0 a 4.");
        }

//            
    }

}


