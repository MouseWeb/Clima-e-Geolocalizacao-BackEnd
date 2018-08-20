package br.com.mouseweb.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mouseweb.domain.LocalizacaoIpv4;

@Repository
public interface LocalizacaoRepository extends JpaRepository<LocalizacaoIpv4, Integer>{

}
