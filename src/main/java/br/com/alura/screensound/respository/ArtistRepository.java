package br.com.alura.screensound.respository;

import br.com.alura.screensound.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
