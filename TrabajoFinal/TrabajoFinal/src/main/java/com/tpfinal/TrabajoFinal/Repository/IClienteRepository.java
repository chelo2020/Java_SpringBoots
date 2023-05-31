package com.tpfinal.TrabajoFinal.Repository;

import com.tpfinal.TrabajoFinal.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente,Long> {

}
