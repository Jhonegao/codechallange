package com.br.zen.codechallange;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.zen.codechallange.domain.Carro;
import com.br.zen.codechallange.domain.Peca;
import com.br.zen.codechallange.repositories.CarroRepository;
import com.br.zen.codechallange.repositories.PecaRepository;

@SpringBootApplication
public class CodechallangeApplication implements CommandLineRunner {

	@Autowired
	private CarroRepository carroRepo;
	@Autowired
	private PecaRepository pecaRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CodechallangeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Carro c1 = new Carro(null, "Palio");
//		Carro c2 = new Carro(null,"Uno");
//		Carro c3 = new Carro(null,"Saveiro");
//		
//		Peca p1 = new Peca(null, "Polia", 2.0, 1.2, c1);
//		Peca p2 = new Peca(null, "Polia", 3.0, 5.8,c1);
//		Peca p3 = new Peca(null, "Impulsor", 50.0, 41.8,c3);
//		Peca p4 = new Peca(null, "Impulsor", 40.0, 30.2,c2);
//		Peca p5 = new Peca(null, "Propulsor", 11.0, 10.0,c2);
//		
//		c1.getPecas().addAll(Arrays.asList(p1,p2));
//		c2.getPecas().addAll(Arrays.asList(p4,p5));
//		c3.getPecas().addAll(Arrays.asList(p3));
//		
//		
//		carroRepo.saveAll(Arrays.asList(c1,c2,c3));
//		pecaRepo.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		
	}

}
