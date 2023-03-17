package com.pe.jaaldos.Repository;

import com.pe.jaaldos.Entity.RolCargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RolCargoRepository extends JpaRepository<RolCargo,Long> {

    @Query("select rc from RolCargo rc where rc.estado=1")
    List<RolCargo> findAllCustom();
}
