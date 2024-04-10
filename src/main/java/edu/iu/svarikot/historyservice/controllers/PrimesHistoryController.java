package edu.iu.ssadasiv.historyservice.controllers;

import edu.iu.ssadasiv.historyservice.model.PrimesRecord;
import edu.iu.ssadasiv.historyservice.repository.PrimesHistoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistoryController {
    private final PrimesHistoryRepository primesHistoryRepository;

    public PrimesHistoryController(PrimesHistoryRepository primesHistoryRepository) {
        this.primesHistoryRepository = primesHistoryRepository;
    }
    @GetMapping("/{customer}")
    public List<PrimesRecord> findAll(@PathVariable String customer){
        return primesHistoryRepository.findAllByCustomer(customer);
    }
}
