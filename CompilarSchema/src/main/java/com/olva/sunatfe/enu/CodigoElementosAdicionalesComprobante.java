/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olva.sunatfe.enu;

/**
 *
 * @author CTELLO
 */
public enum CodigoElementosAdicionalesComprobante {

    MONTO_EN_LETRAS("1000"),
    LEYENDA_TRANSFERENCIA_GRATUITA("1002"),
    LEYENDA_COMPROBANTE_DE_PERCEPCION("2000"),
    LEYENDA_BIENES_TRANSFERIDOS_EN_LA_AMAZONIA("2001"),
    LEYENDA_SERVICIOS_PRESTADOS_EN_LA_AMAZONIA("2002"),
    LEYENDA_CONTRATOS_DE_CONSTRUCCION_EJECUTADOS_EN_LA_AMAZONIA("2003"),
    LEYENDA_AGENCIA_DE_VIAJES("2004"),
    DETRACCIONES_CODIGO_DE_BB_SS("3000"),
    DETRACCIONES_NUMERO_CTA_BN("3001"),
    DETRACCIONES_RECURSOS_HIDROBIOLOGICOS_NOMBRE_MATRICULA_EMBARCACION("3002"),
    DETRACCIONES_RECURSOS_HIDROBIOLOGICOS_TIPO_CANTIDAD_ESPECIE_VENDIDA("3003"),
    DETRACCIONES_RECURSOS_HIDROBIOLOGICOS_LUGAR_DESCARGA("3004"),
    DETRACCIONES_RECURSOS_HIDROBIOLOGICOS_FECHA_DESCARGA("3005"),
    DETRACCIONES_TRANSPORTE_VIENES_VIA_TERRESTRE_REGISTRO_MTC("3006"),
    DETRACCIONES_TRANSPORTE_VIENES_VIA_TERRESTRE_CONF_VEHICULAR("3007"),
    DETRACCIONES_TRANSPORTE_VIENES_VIA_TERRESTRE_PUNTO_ORIGEN("3008"),
    DETRACCIONES_TRANSPORTE_VIENES_VIA_TERRESTRE_PUNTO_DESTINO("3009"),
    DETRACCIONES_TRANSPORTE_VIENES_VIA_TERRESTRE_VALOR_REFERENCIA_PRELIMINAR("3010"),
    BENEFICIO_HOSPEDAJE_COD_PAIS_EMISION_PASAPORTE("4000"),
    BENEFICIO_HOSPEDAJE_COD_PAIS_RESIDENCIA_SUJETO_NO_DOMICILIADO("4001"),
    BENEFICIO_HOSPEDAJE_FECHA_INGRESO_PAIS("4002"),
    BENEFICIO_HOSPEDAJE_FECHA_INGRESO_ESTABLECIMIENTO("4003"),
    BENEFICIO_HOSPEDAJE_FECHA_SALIDA_ESTABLECIMIENTO("4004"),
    BENEFICIO_HOSPEDAJE_NUMERO_DIAS_PERMANENCIA("4005"),
    BENEFICIO_HOSPEDAJE_FECHA_CONSUMO("4006"),
    BENEFICIO_HOSPEDAJE_PAQUETE_TURISTICO_NOMBRE_APELLIDO_HUESPED("4007"),
    BENEFICIO_HOSPEDAJE_PAQUETE_TURISTICO_TIPO_DOCUMENTO_IDENTIDAD("4008"),
    BENEFICIO_HOSPEDAJE_PAQUETE_TURISTICO_NUMERO_DOCUMENTO_IDENTIDAD("4009"),
    PROVEEDORES_ESTADO_NUMERO_EXPEDIENTE("5000"),
    PROVEEDORES_ESTADO_COD_UNID_EJECUTORA("5001"),
    PROVEEDORES_ESTADO_NRO_PROCESO_SELECCION("5002"),
    PROVEEDORES_ESTADO_NRO_CONTRATO("5003"),
    COMERCIALIZACION_ORO_COD_UNICO_CONCESION_MINERA("6000"),
    COMERCIALIZACION_ORO_NRO_DEC_COMPROMISO("6001"),
    COMERCIALIZACION_ORO_NRO_REG_ESPECIAL_COMERC_ORO("6002"),
    COMERCIALIZACION_ORO_NRO_RESOLUCION_AUTORIZA_PLANTA_BENEFICIO("6003"),
    COMERCIALIZACION_ORO_LEY_MINERAL("6004");
    private final String codigo;

    public String getCodigo() {
        return codigo;
    }

    private CodigoElementosAdicionalesComprobante(String codigo) {
        this.codigo = codigo;
    }
}
