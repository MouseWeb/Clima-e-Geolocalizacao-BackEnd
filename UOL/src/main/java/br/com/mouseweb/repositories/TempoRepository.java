package br.com.mouseweb.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mouseweb.domain.Tempo;

@Repository
public interface TempoRepository extends JpaRepository<Tempo, Integer>{

}
