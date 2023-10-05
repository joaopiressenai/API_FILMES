package com.filmes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {
    private final FilmeRepository rp;

    public FilmeController(FilmeRepository filmeRp){
        this.rp = filmeRp;
    }
    @GetMapping
    public List<Filme> getAll(){
        return this.rp.findAll();
    }

    @GetMapping("/{filmeId}")
    public ResponseEntity<Filme> getById(@PathVariable Integer filmeId){
        Optional<Filme> filme = this.rp.findById(filmeId);
        if(filme.isPresent()){
            return ResponseEntity.ok(filme.get());

        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("{filmeId}")
    public ResponseEntity<Void> remove(@PathVariable Integer filmeId){
        Optional<Filme> filme = this.rp.findById(filmeId);
        if (filme.isPresent()){
            this.rp.deleteById(filmeId);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
