package com.darkcode.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.darkcode.app.domain.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long>{}