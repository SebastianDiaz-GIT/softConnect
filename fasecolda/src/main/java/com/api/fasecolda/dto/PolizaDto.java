package com.api.fasecolda.dto;

import java.sql.Date;

public class PolizaDto {
    private String nombre, direccion, company, nit_company;
    private int documento, num_poliza;
    private double pago_mensual, pago_anula, valor_asegurado;
    private Date fe_nacimiento, fe_registro, fe_vencimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNit_company() {
        return nit_company;
    }

    public void setNit_company(String nit_company) {
        this.nit_company = nit_company;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getNum_poliza() {
        return num_poliza;
    }

    public void setNum_poliza(int num_poliza) {
        this.num_poliza = num_poliza;
    }

    public double getPago_mensual() {
        return pago_mensual;
    }

    public void setPago_mensual(double pago_mensual) {
        this.pago_mensual = pago_mensual;
    }

    public double getPago_anula() {
        return pago_anula;
    }

    public void setPago_anula(double pago_anula) {
        this.pago_anula = pago_anula;
    }

    public double getValor_asegurado() {
        return valor_asegurado;
    }

    public void setValor_asegurado(double valor_asegurado) {
        this.valor_asegurado = valor_asegurado;
    }

    public Date getFe_nacimiento() {
        return fe_nacimiento;
    }

    public void setFe_nacimiento(Date fe_nacimiento) {
        this.fe_nacimiento = fe_nacimiento;
    }

    public Date getFe_registro() {
        return fe_registro;
    }

    public void setFe_registro(Date fe_registro) {
        this.fe_registro = fe_registro;
    }

    public Date getFe_vencimiento() {
        return fe_vencimiento;
    }

    public void setFe_vencimiento(Date fe_vencimiento) {
        this.fe_vencimiento = fe_vencimiento;
    }
}
