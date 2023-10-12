package com.sistemaalunonline.API.service;

import com.sistemaalunonline.API.model.Nota;
import com.sistemaalunonline.API.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NotaService {

    @Autowired
    private NotaRepository notaRepository;

    public List<Nota> findAll() {
        return notaRepository.findAll();
    }

    public Nota findById(Long id) {
        Optional<Nota> obj = notaRepository.findById(id);
        return obj.orElse(null);
    }

    public Nota save(Nota nota) {
        return notaRepository.save(nota);
    }

    public void delete(Long id) {
        notaRepository.deleteById(id);
    }
}