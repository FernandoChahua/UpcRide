
package com.myorg.upcride.controller;
import com.myorg.upcride.model.Rese�a;
import com.myorg.upcride.service.Rese�aService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/rese�as")
public class Rese�aController {

    private Rese�aService rese�aService;

    @Autowired
    public Rese�aController(Rese�aService rese�aService){
        this.rese�aService = rese�aService;
    }


    @RequestMapping
    public Rese�a publicarRese�as(Rese�a r) throws Exception {
        return rese�aService.publicarRese�a(r);
    }
    @RequestMapping(path="/{viajeId}", method = RequestMethod.POST)
    public Rese�a publicarRese�aPorViaje(@RequestBody Rese�a r, @PathVariable Integer viajeId) throws Exception{
        return rese�aService.publicarRese�aPorViaje(r,viajeId);
    }

    @RequestMapping(path="/{conductorId}", method = RequestMethod.GET)
    public List<Rese�a> listarRes�asPorConductor(@PathVariable Integer conductorId) throws Exception{
        return rese�aService.listarRese�asPorConductor(conductorId);
    }

}