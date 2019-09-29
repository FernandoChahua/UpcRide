package com.myorg.upcride.service;

import com.myorg.upcride.model.Rese�a;

import java.util.List;

public interface Rese�aService{
    Rese�a publicarRese�a(Rese�a r) throws Exception;
    List<Rese�a> listarRese�asPorConductor (Integer conductorId);
    Rese�a publicarRese�aPorViaje(Rese�a r, Integer viajeId) throws Exception;
}
