package com.api.fasecolda.controller;

import com.api.fasecolda.dto.PolizaDto;
import com.api.fasecolda.exceptions.ControllerException;
import com.api.fasecolda.exceptions.FacadeException;
import com.api.fasecolda.facade.PolizaFacadeInt;
import com.api.fasecolda.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api_poliza")
public class PolizaController {
    @Autowired
    private PolizaFacadeInt polizaFacadeInt;

    @PostMapping("/insertarPoliza")
    public ResponseEntity<Message> insertarPoliza(@RequestBody PolizaDto polizaDto) throws ControllerException{
        Message message = new Message("0", "Creacion Exitosa", null);
        try{
            polizaFacadeInt.insert(polizaDto);
        }catch (FacadeException e){
            message.setCodigo("1");
            message.setMessage("Error en crear un producto"+e.getMessage());
            throw new ControllerException(e);
        } catch (Exception e)
        {
            throw new ControllerException(e);
        }
        return ResponseEntity.ok(message);
    }
}
