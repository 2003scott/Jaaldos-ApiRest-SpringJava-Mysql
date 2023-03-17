package com.pe.jaaldos.Repository;

import com.pe.jaaldos.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {

    @Query("select e from Empleado e where e.estado=1")
    List<Empleado> findAllCustom();
}
