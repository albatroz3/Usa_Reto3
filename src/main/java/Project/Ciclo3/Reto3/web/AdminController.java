package Project.Ciclo3.Reto3.web;

import Project.Ciclo3.Reto3.model.Admin;
import Project.Ciclo3.Reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    public List<Admin> getAdmin() {
        return adminService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Admin> getAdmin(@PathVariable("id") int id){
        return adminService.getAdmin(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin save(@RequestBody Admin admin){
        return adminService.save(admin);
    }
    @PutMapping("/update")
    public Admin update(@RequestBody Admin admin){
        return adminService.update(admin);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id){
        return adminService.delete(id);
    }
}
