package com.pe.jaaldos.Repository;

import com.pe.jaaldos.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query ("select cli from Cliente cli where cli.estado=1")
    List<Cliente> findAllCustom();
}
