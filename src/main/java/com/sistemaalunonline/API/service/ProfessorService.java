package com.sistemaalunonline.API.service;

import com.sistemaalunonline.API.model.Professor;
import com.sistemaalunonline.API.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    public Professor findById(Long id) {
        Optional<Professor> obj = professorRepository.findById(id);
        return obj.orElse(null);
    }

    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    public void delete(Long id) {
        professorRepository.deleteById(id);
    }
}