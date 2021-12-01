package com.animals.puppy.bussinesLayer;

import com.animals.puppy.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
