package models.enfermidades;

import models.EstadoFisico;

public class Covid implements IEnfermidades{
    private boolean isCovid;
    private static final double temp = 38.5;

    public Covid(boolean isCovid) {
        this.isCovid = isCovid;
    }

    @Override
    public EstadoFisico getEnfermidade() {
        if(isCovid) return EstadoFisico.DOENTE;
        return EstadoFisico.NORMAL;
    }

    public boolean isCovid() {
        return isCovid;
    }

    public void setCovid(boolean covid) {
        isCovid = covid;
    }

    public static double getTemp() {
        return temp;
    }
}
