package com.api.fasecolda.mappers;

import com.api.fasecolda.dto.PolizaDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PolizaMapper implements RowMapper<PolizaDto> {
    @Override
    public PolizaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        PolizaDto polizaDto = new PolizaDto();
        polizaDto.setNombre(rs.getString("nombre"));
        polizaDto.setDocumento(rs.getInt("documento"));
        polizaDto.setDireccion(rs.getString("direccion"));
        polizaDto.setFe_nacimiento(rs.getDate("fe_nacimiento"));
        polizaDto.setFe_registro(rs.getDate("fe_registro"));
        polizaDto.setFe_vencimiento(rs.getDate("fe_vencemiento"));
        polizaDto.setCompany(rs.getString("company"));
        polizaDto.setNum_poliza(rs.getInt("num_poliza"));
        polizaDto.setNit_company(rs.getString("nit_company"));
        polizaDto.setPago_mensual(rs.getDouble("pago_mensual"));
        polizaDto.setPago_anula(rs.getDouble("pago_anual"));
        polizaDto.setValor_asegurado(rs.getDouble("valor_asegurado"));
        return polizaDto;
    }
}
