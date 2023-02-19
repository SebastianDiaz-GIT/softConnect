package com.api.fasecolda.dao;

import com.api.fasecolda.dto.PolizaDto;
import com.api.fasecolda.exceptions.DaoExceptions;

import java.util.List;

public interface PolizaDaoInt {

    void insert(PolizaDto polizaDto) throws DaoExceptions;
    void delete(PolizaDto polizaDto)  throws DaoExceptions;
    void update(PolizaDto polizaDto) throws DaoExceptions;
    List getAll() throws DaoExceptions;
    PolizaDto getbyid(PolizaDto polizaDto) throws DaoExceptions;
}
