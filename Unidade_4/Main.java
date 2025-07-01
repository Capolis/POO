import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Carro> carros = new ArrayList<>();
    private static List<Moto> motos = new ArrayList<>();
    private static List<Pessoa> clientes = new ArrayList<>();
    private static List<Venda> vendas = new ArrayList<>();
    private static List<Onibus> onibus = new ArrayList<>();
    public static void main(String[] args) {

        //Cadastro de veiculos iniciais
        Carro carro1 = new Carro("Fiat", "Uno", 2020, "Branco", 30000.00, 4, "Flex", 280);
        Carro carro2 = new Carro("Volkswagen", "Gol", 2021, "Preto", 35000.00, 4, "Flex", 300);
        carros.add(carro1);
        carros.add(carro2);
        Moto moto1 = new Moto("Honda", "CB500", 2022, "Vermelha", 25000.00, 500, true, "Esportiva");
        Moto moto2 = new Moto("Yamaha", "MT-03", 2021, "Azul", 22000.00, 300, false, "Naked");
        motos.add(moto1);
        motos.add(moto2);
        Onibus onibus1 = new Onibus("Mercedes-Benz", "O500", 2019, "Amarelo", 500000.00, 50, "Rodoviário");
        Onibus onibus2 = new Onibus("Volvo", "B12R", 2020, "Branco", 550000.00, 60, "Executivo");
        onibus.add(onibus1);
        onibus.add(onibus2);
        Pessoa cliente1 = new Pessoa("João Silva", 30, "Rua A, 123", "11999999999", "", 1.86, 103.0);
        Pessoa cliente2 = new Pessoa("Maria Oliveira", 25, "Rua B, 456", "11988888888", "", 1.50, 58.0);
        clientes.add(cliente1);
        clientes.add(cliente2);
        Venda venda1 = new Venda(carro1, cliente1, 32000.00, LocalDateTime.now());
        Venda venda2 = new Venda(moto1, cliente2, 24000.00, LocalDateTime.now());
        Venda venda3 = new Venda(onibus1, cliente1, 480000.00, LocalDateTime.now());
        vendas.add(venda1);
        carros.remove(carro1);
        vendas.add(venda2);
        motos.remove(moto1);
        vendas.add(venda3);
        onibus.remove(onibus1);

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        do{
            try{
                System.out.println("### Menu Concessionaria ###");
                System.out.println("1 - Mostrar Veiculos");
                System.out.println("2 - Comprar Veiculo");
                System.out.println("3 - Vender Veiculo");
                System.out.println("4 - Cadastrar um cliente");
                System.out.println("5 - Gerar relatorio");
                System.out.println("6 - Mostrar Clientes");
                System.out.println("7 - Sugerir veiculo para cliente");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                escolha = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                switch (escolha) {
                    case 1:
                        mostrarVeiculos(0);
                        break;
                    case 2:
                        comprarVeiculo(scanner);
                        break;
                    case 3:
                        venderVeiculo(scanner);
                        break;
                    case 4:
                        cadastrarCliente(scanner);
                        break;
                    case 5:
                        gerarRelatorio();
                        break;
                    case 6:
                        mostrarClientes();
                        break;
                    case 7:
                        sugerirVeiculoParaCliente(scanner);
                        break;
                    case 0:
                        System.out.println("Fechando o programa...");
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                }
            }catch (InputMismatchException e){
                System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Erro desconhecido: "+e.getMessage());
            }
        } while (escolha != 0);

        scanner.close();
    }

    private static void mostrarVeiculos(int tipoVeiculos) {
        int x;
        if ((!carros.isEmpty() && tipoVeiculos == 1) || tipoVeiculos == 0) {
            System.out.println("### Lista de Carros ###");
            x = 1;
            for (Carro carro : carros) {
                System.out.println(x+" - "+carro.getModelo()+" - "+carro.getAno());
                x++;
            }
            System.out.println("----------------------------------");
        } 
        if(carros.isEmpty() && tipoVeiculos == 0){
            System.out.println("Nenhum carro cadastrado. Cadastre para visualizar-los!"); 
            System.out.println("----------------------------------");
        }
        if ((!motos.isEmpty() && tipoVeiculos == 2) || tipoVeiculos == 0) {
            System.out.println("### Lista de Motos ###");
            x = 1;
            for (Moto moto : motos) {
                System.out.println(x+" - "+moto.getModelo()+" - "+moto.getAno());
                x++;
            }
            System.out.println("----------------------------------");
        }
        if(carros.isEmpty() && tipoVeiculos == 0){
            System.out.println("Nenhuma moto cadastrada. Cadastre para visualizar-las!"); 
            System.out.println("----------------------------------");
        }
        if ((!onibus.isEmpty() && tipoVeiculos == 3) || tipoVeiculos == 0) {
            System.out.println("### Lista de Onibus ###");
            x = 1;
            for (Onibus onibus : onibus) {
                System.out.println(x+" - "+onibus.getModelo()+" - "+onibus.getAno());
                x++;
            }
            System.out.println("----------------------------------");
        }
        if(carros.isEmpty() && tipoVeiculos == 0){
            System.out.println("Nenhum onibus cadastrado. Cadastre para visualizar-los!"); 
            System.out.println("----------------------------------");
        }
    }

    private static void comprarVeiculo(Scanner scanner) {
        try{
            System.out.println("### Compra de Veiculo ###");
            int escolha;

            System.out.println("Qual novo veiculo deseja cadastrar?");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Onibus");
            System.out.println("0 - Voltar ao menu");
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha > 3 || escolha < 0) {
                throw new InputMismatchException();
            }
            while (escolha != 0) {
                System.out.print("Digite a marca do veículo: ");
                String marca = scanner.nextLine();

                System.out.print("Digite o modelo do veículo: ");
                String modelo = scanner.nextLine();

                System.out.print("Digite o ano do veículo: ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite a cor do veículo: ");
                String cor = scanner.nextLine();

                System.out.print("Digite o preço do veículo: ");
                double preco = scanner.nextDouble();
            
                switch (escolha) {
                    case 1:
                        System.out.print("Digite o numero de portas veículo: ");
                        int nPortas = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o tipo de combustivel: ");
                        String tipoCombustivel = scanner.nextLine();

                        System.out.print("Digite a capacidade do porta malas do veículo: ");
                        int capacidadePortaMalas = scanner.nextInt();
                        scanner.nextLine();

                        try{
                            for (Carro c : carros) {
                                if (c.getModelo().equalsIgnoreCase(modelo) && c.getAno() == ano) {
                                    throw new VeiculoJaCadastradoException("Este carro já está cadastrado no sistema!");
                                }
                            }
                            Carro carro = new Carro(marca, modelo, ano, cor, preco, nPortas, tipoCombustivel, capacidadePortaMalas);
                            carros.add(carro);
                            System.out.println("Carro modelo: "+modelo+", cadastrado com sucesso!");                            
                        } catch (VeiculoJaCadastradoException e) {
                            System.out.println("Erro: "+e.getMessage());
                            return;
                        } finally {
                            escolha = 0;
                        }
                        break;
                    
                    case 2:
                        System.out.print("Digite as cilindradas do veiculo: ");
                        int cilindradas = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("O veiculo possui partida eletrica? S - sim, N - não");
                        String partida = scanner.nextLine();
                        boolean partidaEletrica;
                        if(partida == "S" || partida == "s"){
                            partidaEletrica = true;
                        }else{
                            partidaEletrica = false;
                        }

                        System.out.print("Digite a categoria do veiculo: ");
                        String categoria = scanner.nextLine();
                        try{
                            for (Moto m : motos) {
                                if (m.getModelo().equalsIgnoreCase(modelo) && m.getAno() == ano) {
                                    throw new VeiculoJaCadastradoException("Esta moto já está cadastrada no sistema!");
                                }
                            }
                            Moto moto = new Moto(marca, modelo, ano, cor, preco, cilindradas, partidaEletrica, categoria);
                            motos.add(moto);
                            System.out.println("moto modelo: "+ modelo +", cadastrada com sucesso!");
                        } catch (VeiculoJaCadastradoException e) {
                            System.out.println("Erro: "+ e.getMessage());
                            return;
                        } finally {
                            escolha = 0;
                        }
                        escolha = 0;
                        break;
                    case 3:
                        System.out.print("Digite o numero de passageiros do onibus: ");
                        int nPassageiros = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o tipo do onibus: ");
                        String tipoOnibus = scanner.nextLine();

                        try{
                            for (Onibus o : onibus) {
                                if (o.getModelo().equalsIgnoreCase(modelo) && o.getAno() == ano) {
                                    throw new VeiculoJaCadastradoException("Este onibus já está cadastrado no sistema!");
                                }
                            }
                            Onibus novoOnibus = new Onibus(marca, modelo, ano, cor, preco, nPassageiros, tipoOnibus);
                            onibus.add(novoOnibus);
                            System.out.println("Onibus modelo: "+ modelo +", cadastrado com sucesso!");
                        } catch (VeiculoJaCadastradoException e) {
                            System.out.println("Erro: "+e.getMessage());
                            return;
                        } finally {
                            escolha = 0;
                        }
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                        break;
                }
            }
            
        }catch (InputMismatchException e){
            System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
        }catch (Exception e){
            System.out.println("Erro desconhecido: "+e.getMessage());
        }
    }

    private static void venderVeiculo(Scanner scanner) {
        try{
            if (clientes.isEmpty() || (carros.isEmpty() && motos.isEmpty() && onibus.isEmpty())) {
                if (clientes.isEmpty()) {
                    System.out.println("Não há clientes na base de dados!");
                }
                if (carros.isEmpty()) {
                    System.out.println("Não há carros disponiveis para vendas!");
                }
                if (motos.isEmpty()) {
                    System.out.println("Não há motos disponiveis para vendas!");
                }
                if (onibus.isEmpty()) {
                    System.out.println("Não há onibus disponiveis para vendas!");
                }
                System.out.println("Por favor, cadastre um cliente e/ou veiculo antes de realizar uma venda.");
                return;
            } else {
                mostrarClientes();
                Pessoa comprador = clientes.get(scanner.nextInt()-1);
                scanner.nextLine();

                System.out.print("Informe o valor da venda: R$");
                double valor = scanner.nextDouble();
                scanner.nextLine();

                int escolha;

                System.out.println("Qual novo veiculo deseja vender?");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Onibus");
                escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        mostrarVeiculos(1);
                        Carro carroParaVenda = carros.get(scanner.nextInt() -1);
                        scanner.nextLine();

                        Venda novaVendaCarro = new Venda(carroParaVenda, comprador, valor, LocalDateTime.now());
                        vendas.add(novaVendaCarro);
                        carros.remove(carroParaVenda);
                        break;
                
                    case 2:
                        mostrarVeiculos(2);
                        Moto motoParaVenda = motos.get(scanner.nextInt() -1);
                        scanner.nextLine();

                        Venda novaVendaMoto = new Venda(motoParaVenda, comprador, valor, LocalDateTime.now());
                        vendas.add(novaVendaMoto);
                        motos.remove(motoParaVenda);
                        break;

                    case 3:
                        mostrarVeiculos(3);
                        Onibus onibusParaVenda = onibus.get(scanner.nextInt() -1);
                        scanner.nextLine();

                        Venda novaVendaOnibus = new Venda(onibusParaVenda, comprador, valor, LocalDateTime.now());
                        vendas.add(novaVendaOnibus);
                        onibus.remove(onibusParaVenda);
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                        return;
                    
                }

                System.out.println("Venda executada com sucesso!");
            }
        }catch (InputMismatchException e){
            System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Erro: Indice invalido. Certifique-se de escolher uma opção correta!");
        }catch (Exception e){
            System.out.println("Erro desconhecido: "+e.getMessage());
        }
    }
    
    private static void sugerirVeiculoParaCliente(Scanner scanner) {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
            return;
        }
    
        System.out.println("Selecione um cliente para sugerir veículos:");
        mostrarClientes();
        int indiceCliente = scanner.nextInt() - 1;
        scanner.nextLine();
    
        if (indiceCliente < 0 || indiceCliente >= clientes.size()) {
            System.out.println("Índice de cliente inválido.");
            return;
        }
    
        Pessoa cliente = clientes.get(indiceCliente);    
        double altura = cliente.getAltura();
        double peso = cliente.getPeso();
        int idade = cliente.getIdade();
    
        System.out.println("\nAnalisando o biotipo do cliente: " + cliente.getNome());
    
        if (altura > 1.85 || peso > 100) {
            System.out.println("Recomendação: Veículos espaçosos.");
                if (!onibus.isEmpty()) {
                mostrarVeiculos(3);
            } else if (!carros.isEmpty()) {
                mostrarVeiculos(1);
            }    
        } else if (altura < 1.60 && peso < 60) {
            System.out.println("Recomendação: Veículos compactos.");
                if (!motos.isEmpty()) {
                mostrarVeiculos(1);
            } if (!carros.isEmpty()) {
                mostrarVeiculos(2);
            }    
        } else if (idade > 65) {
            System.out.println("Recomendação: Carros para conforto e acessibilidade.");
                if (!carros.isEmpty()) {
                mostrarVeiculos(2);
            }
        } else {
            System.out.println("Recomendação padrão: Carros.");
                if (!carros.isEmpty()) {
                mostrarVeiculos(2);
            }
        }
    }

    private static void mostrarClientes() {
        if (!clientes.isEmpty()) {
            System.out.println("### Lista de Clientes ###");
            int x = 1;
            for (Pessoa cliente : clientes) {
                System.out.println(x+" - "+cliente.getNome()+" - "+cliente.getTelefone());
                x++;
            }
        }else{
            System.out.println("Nenhuma cliente foi encontrado!");
        }
    }

    private static void cadastrarCliente(Scanner scanner) {
        try{
            System.out.println("### Cadastro de Cliente ###");

            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do cliente: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o endereço do cliente: ");
            String endereco = scanner.nextLine();

            System.out.println("Digite um telefone para contato do cliente: ");
            String telefone = scanner.nextLine();

            System.out.println("Digite o email do cliente: ");
            String email = scanner.nextLine();

            System.out.println("Digite a altura do cliente: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite o peso do cliente: ");
            double peso = scanner.nextDouble();
            scanner.nextLine();
            
            if (idade <= 0 || altura <= 0 || peso <= 0)
                throw new ClienteInvalidoException("Dados do cliente inválidos! Verifique idade, altura e peso.");
            else if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty())
                throw new ClienteInvalidoException("Dados do cliente inválidos! Verifique nome, endereço, telefone e email.");
            
            Pessoa novoCliente = new Pessoa(nome, idade, endereco, telefone, email, altura, peso);
            clientes.add(novoCliente);

            System.out.println("O cliente: "+nome+", foi cadastrado com sucesso!");
        } catch (InputMismatchException e){
            System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
        } catch (ClienteInvalidoException e) {
            System.out.println("Erro: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Erro desconhecido: "+e.getMessage());
        }

    }

    private static void gerarRelatorio() {
        if (vendas.isEmpty()) {
            System.out.println("Não existem vendas cadastradas!");
        }else{
            System.out.println("### Relatorio de vendas ###");
            System.out.println();
            for (Venda venda : vendas) {
               System.out.println("Data: "+ venda.getDataVenda());
               System.out.println("Veiculo: "+venda.getVeiculo().getModelo()+" - "+venda.getVeiculo().getAno());
               System.out.println("Comprador: "+venda.getComprador().getNome()+" - "+venda.getComprador().getTelefone());
               System.out.println("Valor da venda: R$"+venda.getValor());
               System.out.println("Valor do veiculo: R$"+venda.getVeiculo().getPreco());
               System.out.print("R$"+(venda.getValor() - venda.getVeiculo().getPreco()));
               System.out.println(venda.getValor() >= venda.getVeiculo().getPreco() ? " Venda lucrativa!" : " Venda com prejuizo!");
               System.out.println("----------------------------------------------------------------"); 
               System.out.println();
            }
        }
    }
    
}