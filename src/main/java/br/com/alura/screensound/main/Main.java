package br.com.alura.screensound.main;

import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        var option = -1;
        while (option != 0){
            var menu = """
                    **** SCREENSOUND MÚSICAS ****
                    
                    1- Cadastrar artistas                            
                    2- Cadastrar músicas                                       
                    3- Listar músicas                                        
                    4- Buscar músicas por artista                                      
                    5- Pesquisar dados sobre um artista
                    
                    0- Sair
                    """;
            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    addArtists();
                    break;
                case 2:
                    addSongs();
                    break;
                case 3:
                    listSongs();
                    break;
                case 4:
                    getSongsByArtist();
                    break;
                case 5:
                    getDataFromAnArtist();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void addArtists(){}
    public void addSongs(){}
    public void listSongs(){}
    public void getSongsByArtist(){}
    public void getDataFromAnArtist(){}
}
