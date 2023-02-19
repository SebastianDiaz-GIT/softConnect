package com.api.fasecolda.manager;

import com.api.fasecolda.dao.PolizaDaoInt;
import com.api.fasecolda.dto.PolizaDto;
import com.api.fasecolda.exceptions.DaoExceptions;
import com.api.fasecolda.exceptions.ManagerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PolizaManager implements PolizaManagerInt{

    @Autowired
    private PolizaDaoInt polizaDaoInt;

    @Override
    public void insert(PolizaDto polizaDto) throws ManagerException {
        try{
            PolizaDto polizafound = polizaDaoInt.getbyid(polizaDto);
            if(polizafound != null){
                polizaDaoInt.update(polizaDto);
            }else{
                polizaDaoInt.insert(polizaDto);
            }
        }catch (DaoExceptions e){
            throw new ManagerException(e);
        }
    }

    @Override
    public void delete(PolizaDto polizaDto) throws ManagerException {

    }

    @Override
    public List getAll() throws ManagerException {
        return null;
    }
}
