package com.myorg.upcride.repository;

import com.myorg.upcride.model.Rese�a;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Rese�aRepository extends JpaRepository<Rese�a, Integer> {
    @Query("SELECT r FROM Rese�a r JOIN Viaje v ON r.viaje.id = v.id JOIN Usuario u ON v.conductor.id = u.id WHERE u.id = ?1")
    List<Rese�a> listarRese�asPorConductor (Integer conductorId);

}
