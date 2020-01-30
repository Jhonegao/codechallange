package com.br.zen.codechallange.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.zen.codechallange.domain.Peca;

@Repository
public interface PecaRepository extends JpaRepository<Peca, Integer> {

}
