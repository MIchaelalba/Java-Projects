package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Locale.*;

public class Main {
    public static void main(String[] args) {
        setDefault(US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ":");
            System.out.print("Id:");
            Integer id = sc.nextInt();

            while (hasId(list,id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary:");
            Double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp == null)
            System.out.println("This id does not exist!");
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }


        System.out.println("\nlist of employees: ");
        for (Employee e : list)
            System.out.println(e);

        sc.close();


    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

    public static void Exemplo01() {
        List<String> lista = new ArrayList<>();

        lista.add("Michael");
        lista.add("Lais");
        lista.add("Alice");
        lista.add("Marco");
        lista.add("Denise");
        lista.add("Andre");
        lista.add("Bruno");
        lista.add("Daniel");
        lista.add("Elias");
        lista.add("Elaine");

        //predicado Lambda para remover itens de listas
        lista.removeIf(x -> x.charAt(0) == 'M');
        lista.removeIf(x -> x.contains("Alice"));
        System.out.println(lista);
        System.out.println("--------------------------");

        //Lista de filtro usando predicado Lambda para filtrar itens de listas
        List<String> lista_filtro = lista.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
        System.out.println(lista_filtro);
        System.out.println("--------------------------");

        //Encontrar na lista o primeiro item que comece com uma letra
        String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}