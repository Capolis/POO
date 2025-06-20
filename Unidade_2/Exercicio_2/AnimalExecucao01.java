public class AnimalExecucao01 {

    public static void executar() {

        System.out.println("Qual tipo de animal deseja criar?");
        System.out.println("1 - Mamífero");
        System.out.println("2 - Ave");
        System.out.println("3 - Peixe");
        int tipo = ExerciciosMenu.scanner.nextInt();
        ExerciciosMenu.scanner.nextLine();
        System.out.print("Nome do animal: ");
        String nome = ExerciciosMenu.scanner.nextLine();
        System.out.print("Idade do animal: ");
        int idade = ExerciciosMenu.scanner.nextInt();
        ExerciciosMenu.scanner.nextLine();
        switch (tipo) {
            case 1:
                System.out.print("Tem pelos? (S/N): ");
                boolean pelos;
                if(ExerciciosMenu.scanner.nextLine().equalsIgnoreCase("S")) {
                    pelos = true;
                } else {
                    pelos = false;
                }
                Mamifero mamifero = new Mamifero(nome, idade, pelos);
                mamifero.mostrarInformacoes();
                mamifero.amamentar();
                break;
            case 2:
                System.out.print("Consegue voar? (S/N): ");
                boolean voa;
                if(ExerciciosMenu.scanner.nextLine().equalsIgnoreCase("S")) {
                    voa = true;
                } else {
                    voa = false;
                }
                Ave ave = new Ave(nome, idade, voa);
                ave.mostrarInformacoes();
                ave.botarOvo();
                break;
            case 3:
                System.out.print("É de água doce? (S/N): ");
                boolean aguaDoce;
                if(ExerciciosMenu.scanner.nextLine().equalsIgnoreCase("S")) {
                    aguaDoce = true;
                } else {
                    aguaDoce = false;
                }
                Peixe peixe = new Peixe(nome, idade, aguaDoce);
                peixe.mostrarInformacoes();
                peixe.nadar();
                break;
            default:
                System.out.println("Tipo inválido.");
        }
    }

}