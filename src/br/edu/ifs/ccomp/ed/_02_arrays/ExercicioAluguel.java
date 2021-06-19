package br.edu.ifs.ccomp.ed._02_arrays;

import java.util.Scanner;

public class ExercicioAluguel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluguel[] vect = new Aluguel[10];
        System.out.print("Quantos quartos você vai alugar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            vect[room] = new Aluguel(name, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
