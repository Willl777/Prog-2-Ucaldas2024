package com.darkcode.app;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

import com.darkcode.app.domain.Vehiculo;
import com.darkcode.app.Services.VehiculoServices;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/Vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoServices VehiculoServices;

    @PostMapping ("/create")
    public String addVehiculo(@RequestBody Vehiculo Vehiculo) {
        VehiculoServices.create(Vehiculo);
        return "Creacion-Vehiculo";
    }
    @PutMapping("/{id}")
    public void updateVehiculo(@PathVariable Long id, @RequestBody Vehiculo Vehiculo) {
        Vehiculo.setId(id);
        VehiculoServices.update(Vehiculo);

    }
    @DeleteMapping("/{id}")
	public void deleteVehiculo(@PathVariable Long id){
		VehiculoServices.delete(id);
	}
	
	@GetMapping
	public String listVehiculo(Model model) {
		List<Vehiculo> VeHiculoList = VehiculoServices.read();
		model.addAttribute("carsAttribute", VeHiculoList);
		return "cars-list";
	}
	
}

