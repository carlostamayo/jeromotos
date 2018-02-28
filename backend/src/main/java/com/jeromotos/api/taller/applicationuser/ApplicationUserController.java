/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeromotos.api.taller.applicationuser;

/**
 *
 * @author jose
 */

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ApplicationUserController {
    
    private ApplicationUserRepository applicationUserRepository;    
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public ApplicationUserController(ApplicationUserRepository applicationUserRepository,
                                     BCryptPasswordEncoder bCryptPasswordEncoder) {
        
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    
    @PostMapping("/sign-up")
    public void signUp (@RequestBody ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        applicationUserRepository.save(user);
    }
    
    @GetMapping("/{username}")
    public ApplicationUser getApplicationUser (@PathVariable String username) {
        return applicationUserRepository.findByUsername(username);
    }
}
