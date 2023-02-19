package com.api.fasecolda.facade;

import com.api.fasecolda.dto.PolizaDto;
import com.api.fasecolda.exceptions.FacadeException;
import com.api.fasecolda.exceptions.ManagerException;

import java.util.List;

public interface PolizaFacadeInt {

    void insert(PolizaDto polizaDto) throws FacadeException;
    void delete(PolizaDto polizaDto)  throws FacadeException;
    List getAll() throws FacadeException;
}
