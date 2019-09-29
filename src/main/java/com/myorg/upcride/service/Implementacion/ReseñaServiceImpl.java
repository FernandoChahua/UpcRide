package com.myorg.upcride.service.Implementacion;

import com.myorg.upcride.model.Rese�a;
import com.myorg.upcride.model.Viaje;
import com.myorg.upcride.repository.Rese�aRepository;
import com.myorg.upcride.repository.ViajeRepository;
import com.myorg.upcride.service.Rese�aService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Rese�aServiceImpl implements Rese�aService {

    Rese�aRepository rese�aRepository;
    ViajeRepository viajeRepository;
    @Autowired
    public Rese�aServiceImpl(Rese�aRepository rese�aRepository, ViajeRepository viajeRepository){
        this.rese�aRepository = rese�aRepository;
        this.viajeRepository = viajeRepository;
    }

    @Override
    public Rese�a publicarRese�a(Rese�a r) throws Exception{
        return rese�aRepository.save(r);
    }


    @Override
    public List<Rese�a> listarRese�asPorConductor (Integer conductorId){
        return rese�aRepository.listarRese�asPorConductor(conductorId);
    }

    @Override
    public Rese�a publicarRese�aPorViaje(Rese�a r, Integer viajeId ) throws Exception{
        Viaje v = viajeRepository.findById(viajeId).get();
        r.setViaje(v);
        return rese�aRepository.save(r);

    }
}
