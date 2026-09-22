package com.ejemplo;

import com.ejemplo.dao.NumeroDAO;
import com.ejemplo.model.Numero;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumeroDAO numeroDAO = new NumeroDAO();

        System.out.println("==============================");
        System.out.println("  CLASIFICADOR DE NUMEROS");
        System.out.println("  JAVA + ORACLE 19C  ");
        System.out.println("==============================");

        System.out.print("INGRESE UN NUMERO: ");
        int numero = scanner.nextInt();

        String clasificacion = "";

        // condicional 1
        if (numero > 0) {
            clasificacion = "POSITIVO";
        }

        // condicional 2
        if (numero < 0) {
            clasificacion = "NEGATIVO";
        }

        // condicional 3
        if (numero == 0) {
            clasificacion = "CERO";
        }

        System.out.println();
        System.out.println("NUMERO: " + numero);
        System.out.println("CLASIFICACION: " + clasificacion);

        numeroDAO.guardar(numero, clasificacion);

        scanner.close();
    }
}