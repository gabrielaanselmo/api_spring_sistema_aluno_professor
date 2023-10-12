package com.sistemaalunonline.API.controller;

import com.sistemaalunonline.API.model.Professor;
import com.sistemaalunonline.API.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public ResponseEntity<List<Professor>> findAll() {
        List<Professor> professores = professorService.findAll();
        return ResponseEntity.ok().body(professores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> findById(@PathVariable Long id) {
        Professor professor = professorService.findById(id);
        return ResponseEntity.ok().body(professor);
    }

    @PostMapping
    public ResponseEntity<Professor> save(@RequestBody Professor professor) {
        Professor obj = professorService.save(professor);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        professorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

