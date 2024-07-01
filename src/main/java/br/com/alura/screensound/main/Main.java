package br.com.alura.screensound.main;

import br.com.alura.screensound.model.Artist;
import br.com.alura.screensound.model.ArtistType;
import br.com.alura.screensound.model.Song;
import br.com.alura.screensound.repository.ArtistRepository;
import br.com.alura.screensound.service.ChatGPTQuery;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);
    private final ArtistRepository repository;

    public Main(ArtistRepository repository) {
        this.repository = repository;
    }

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

    public void addArtists(){
        var addNewArtist = "S";

        while(addNewArtist.equalsIgnoreCase("s")) {
            System.out.println("*** CADASTRO DE ARTISTA ***");
            System.out.println("Informe o nome do artista: ");
            var name = scanner.nextLine();
            System.out.println("Informe o tipo desse artista: (solo, dupla ou banda)");
            var type = scanner.nextLine();

            ArtistType artistType = ArtistType.valueOf(type.toUpperCase());
            Artist artist = new Artist(name, artistType);
            repository.save(artist);

            do {
                System.out.println("Cadastrar novo artista? [S/N]");
                addNewArtist = scanner.nextLine();

                if (!addNewArtist.equalsIgnoreCase("S") && !addNewArtist.equalsIgnoreCase("N")){
                    System.out.println("Resposta inválida. Responda 'S' para sim e 'N' para não.");
                }
            }while(!(addNewArtist.equalsIgnoreCase("S")) && !(addNewArtist.equalsIgnoreCase("N")));
        }
    }

    public void addSongs(){
        var addNewSong = "S";

        while(addNewSong.equalsIgnoreCase("s")){
            System.out.println("*** CADASTRO DE MÚSICA ***");
            System.out.println("Cadastrar música de qual artista?");
            var artistName = scanner.nextLine();

            Optional<Artist> artist = repository.findByNameContainingIgnoreCase(artistName);

            if (artist.isPresent()){
                System.out.println("Informe o título da música: ");
                var songTitle = scanner.nextLine();
                Song song = new Song(songTitle, artist.get());
                artist.get().getSongs().add(song);
                repository.save(artist.get());
            }else{
                System.out.println("Artista não encontrado.");
            }

            do{
                System.out.println("Deseja cadastrar outra música? [S/N]");
                addNewSong = scanner.nextLine();

                if(!addNewSong.equalsIgnoreCase("s") && !addNewSong.equalsIgnoreCase("n")){
                    System.out.println("Resposta inválida. Responda 'S' para sim e 'N' para não.");
                }
            }while(!addNewSong.equalsIgnoreCase("s") && !addNewSong.equalsIgnoreCase("n"));
        }
    }

    public void listSongs(){
        List<Artist> artists = repository.findAll();
        artists.forEach(a -> a.getSongs().forEach(System.out::println));
    }

    public void getSongsByArtist(){
        System.out.println("*** LISTAR MÚSICAS DE UM ARTISTA ***");
        System.out.println("Listar músicas de qual artista?");
        var artistName = scanner.nextLine();

        List<Song> songsFromArtist = repository.getSongsByArtist(artistName);

        if (songsFromArtist.isEmpty()){
            System.out.println("Não foram encontradas músicas do artista informado.");
        }else{
            songsFromArtist.forEach(System.out::println);
        }
    }

    public void getDataFromAnArtist(){
        System.out.println("*** COLETAR DADOS SOBRE UM ARTISTA ***");
        System.out.println("Pesquisar dados sobre qual artista?");
        var artistName = scanner.nextLine();
        var data = ChatGPTQuery.getInfo(artistName);
        System.out.println(data.trim());

    }
}
