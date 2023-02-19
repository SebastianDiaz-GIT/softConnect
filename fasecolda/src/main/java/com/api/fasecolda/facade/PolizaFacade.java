package com.api.fasecolda.facade;

import com.api.fasecolda.dto.PolizaDto;
import com.api.fasecolda.exceptions.FacadeException;
import com.api.fasecolda.exceptions.ManagerException;
import com.api.fasecolda.manager.PolizaManagerInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ThemeResolver;

import java.util.List;

@Component
@Transactional
public class PolizaFacade implements PolizaFacadeInt{

    @Autowired
    private PolizaManagerInt polizaManagerInt;

    @Override
    public void insert(PolizaDto polizaDto) throws FacadeException {
        try {
            polizaManagerInt.insert(polizaDto);
        }catch (Exception e){
            throw new FacadeException(e);
        }
    }

    @Override
    public void delete(PolizaDto polizaDto) throws FacadeException {

    }

    @Override
    @Transactional(readOnly = true)
    public List getAll() throws FacadeException {
        return null;
    }
}
