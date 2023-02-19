package com.api.fasecolda.dao;

import com.api.fasecolda.dto.PolizaDto;
import com.api.fasecolda.exceptions.DaoExceptions;
import com.api.fasecolda.mappers.PolizaMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolizaDao implements PolizaDaoInt{
    private final JdbcTemplate jdbcTemplate;

    public PolizaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    private static final String INSERT_POLIZA = "INSERT INTO fasecolda_data.polizas\n" +
            "(nombre, documento, direccion, fe_nacimiento, fe_registro, fe_vencemiento, company, " +
            "num_poliza, nit_company, pago_mensual, pago_anual, valor_asegurado)\n" +
            "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)\n";

    private static final String GETBYID = "SELECT nombre, documento, direccion, fe_nacimiento, fe_registro, fe_vencemiento, company, num_poliza, nit_company, pago_mensual, pago_anual, valor_asegurado\n" +
            "FROM fasecolda_data.polizas where documento = ?;";

    private static final String UPDATE = "UPDATE fasecolda_data.polizas\n" +
            "SET nombre=?, documento=?, direccion=?, fe_nacimiento=?, fe_registro=?, fe_vencemiento=?, company=?," +
            " num_poliza=?, nit_company=?, pago_mensual=?, pago_anual=?, valor_asegurado=?;\n";
    @Override
    public void insert(PolizaDto polizaDto) throws DaoExceptions {
        try {
            jdbcTemplate.update(INSERT_POLIZA, polizaDto.getNombre(), polizaDto.getDocumento(), polizaDto.getDireccion(),
                    polizaDto.getFe_nacimiento(), polizaDto.getFe_registro(), polizaDto.getFe_vencimiento(), polizaDto.getCompany(), polizaDto.getNum_poliza(),
                    polizaDto.getNit_company(), polizaDto.getPago_mensual(), polizaDto.getPago_anula(), polizaDto.getValor_asegurado());
        }catch (Exception e){
            throw new DaoExceptions(e);
        }
    }

    @Override
    public void delete(PolizaDto polizaDto) throws DaoExceptions {

    }

    @Override
    public void update(PolizaDto polizaDto) throws DaoExceptions {
        try{
            jdbcTemplate.update(UPDATE,  polizaDto.getNombre(), polizaDto.getDocumento(), polizaDto.getDireccion(),
                    polizaDto.getFe_nacimiento(), polizaDto.getFe_registro(), polizaDto.getFe_vencimiento(), polizaDto.getCompany(), polizaDto.getNum_poliza(),
                    polizaDto.getNit_company(), polizaDto.getPago_mensual(), polizaDto.getPago_anula(), polizaDto.getValor_asegurado());
        }catch (Exception e){
            throw new DaoExceptions(e);
        }

    }

    @Override
    public List getAll() throws DaoExceptions {
        return null;
    }

    @Override
    public PolizaDto getbyid(PolizaDto polizaDto) throws DaoExceptions {
        try{
            return jdbcTemplate.queryForObject(GETBYID, new PolizaMapper(), polizaDto.getDocumento());
        }catch (EmptyResultDataAccessException e)
        {
            return null;
        }
    }
}
