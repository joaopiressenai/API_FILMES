package com.filmes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmesApplication.class, args);
	}
	@Bean
	CommandLineRunner criarFilmes(FilmeRepository rp){
		return args -> {rp.deleteAll();
			Filme patrulhaCanina = new Filme("Patrulha canina","Filme da patrulha canina é muito legal",100);
			Filme barbie= new Filme("Barbie","Filme da barbie para assitir com amigos",120);
			Filme velozesFuriosos = new Filme("Velozes Furiosos","Filme em alta velocidade",300);
			Filme pequenosEspioes = new Filme("Pequenos espiões","Filme de espiões com crianças",150);
			Filme kungFuPanda = new Filme("KungFu Panda","Filme de kung fu com panda",180);
			Filme carrosselDois = new Filme("Carrossel 2","Filme do carroseel",80);
			Filme shrek = new Filme("Shrek","Filme do shrek",100);

			rp.save(patrulhaCanina);
			rp.save(barbie);
			rp.save(velozesFuriosos);
			rp.save(pequenosEspioes);
			rp.save(kungFuPanda);
			rp.save(carrosselDois);
			rp.save(shrek);



		};

	}
}
