package com.example.choirproject2.controller;

import com.example.choirproject2.model.Chorister;
import com.example.choirproject2.service.ChoirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChoirAPIService {

    @Autowired
    private ChoirService choirService;

    @GetMapping("/chorister")
    public Chorister getChoristerDetails(){
        return choirService.getChoristerDetails();
    }

    @GetMapping("/AllChoristers")
    public List<Chorister> getAllChoristers(){
        return choirService.getALlChoristers();
    }

    @GetMapping("/chorister/{choristerId}")
    public Chorister getChoristerById(@PathVariable("choristerId") int choristerId){
        return choirService.getChoristerById(choristerId);
    }

    @PutMapping("/chorister/{choristerId}")
    public Chorister updateChorister(@PathVariable("choristerId") int choristerId,@RequestBody Chorister chorister){
        return choirService.updateChorister(choristerId,chorister);
    }

    @PostMapping("/chorister")
    public Chorister SaveChorister(@RequestBody Chorister chorister){

        return choirService.saveChorister(chorister);

    }

    @DeleteMapping("/chorister")
    public Chorister deleteChorister(@RequestParam(name = "choristerId") int choristerId){
        return choirService.deleteChorister(choristerId);
    }

}
