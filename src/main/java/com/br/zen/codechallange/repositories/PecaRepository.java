package com.br.zen.codechallange.repositories;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.br.zen.codechallange.domain.Peca;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Integer> {
	
	@Transactional(readOnly = true)
	@Query("SELECT obj FROM Peca obj WHERE obj.carro.id =:carroId ORDER BY obj.nome")
	public List<Peca> findPecas(@Param ("carroId")Integer carro_id);

}
