package com.br.zen.codechallange.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.zen.codechallange.domain.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {

}
