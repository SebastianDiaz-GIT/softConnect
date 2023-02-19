package com.api.fasecolda.manager;

import com.api.fasecolda.dto.PolizaDto;
import com.api.fasecolda.exceptions.ManagerException;

import java.util.List;

public interface PolizaManagerInt {

    void insert(PolizaDto polizaDto) throws ManagerException;
    void delete(PolizaDto polizaDto)  throws ManagerException;
    List getAll() throws ManagerException;
}
