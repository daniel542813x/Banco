
package General;


public class CreditoSolicitud {
    
    int numsolc;
    int diasolicitud;
    int messolicitud;
    int añosolicitud;
    int codigogarantia;
    String nombrec;
    int cedulac;
    int dianacimiento;
    int mesnacimiento;
    int añonacimiento;
    int edadc;
    String sexoc;
    int estratoc;
    String estadocivil;
    int personascargo;
    int ingresos;
    int egresos;
    String ciudadc;
    String direccionc;
    int celularc;
    String emailc;
    String estado;
    
    
     public CreditoSolicitud() {
    }

    public CreditoSolicitud(String nombrec,int cedulac ,String fechanc,int edadc ,String sexoc ,
            int estratoc , String ciudadc, String direccionc, int celularc, String emailc, 
            int numsolc, String fechasc, int diasolicitud, int messolicitud, int añosolicitud, 
            int codigogarantia, int dianacimiento,int mesnacimiento,int añonacimiento, String estadocivil, 
            int personascargo,int ingresos,int egresos,String estado ) {
        
        this.nombrec = nombrec;
        this.cedulac = cedulac;
        this.edadc = edadc;
        this.sexoc = sexoc;
        this.estratoc = estratoc;
        this.ciudadc = ciudadc;
        this.direccionc = direccionc;
        this.celularc = celularc;
        this.emailc = emailc;
        this.numsolc = numsolc;
        this.diasolicitud=diasolicitud;
        this.messolicitud=messolicitud;
        this.añosolicitud=añosolicitud;
        this.codigogarantia=codigogarantia;
        this.dianacimiento=dianacimiento;
        this.mesnacimiento=mesnacimiento;
        this.añonacimiento=añonacimiento;
        this.estadocivil=estadocivil;
        this.personascargo=personascargo;
        this.ingresos=ingresos;
        this.egresos=egresos;
        this.estado=estado;

        
    }
    
    public String getNombrec() {
        return nombrec;
    }
    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }
    
   
    public int getCedulac() {
        return cedulac;
    }
    public void setCedulac(int cedulac) {
        this.cedulac = cedulac;
    }
    
    public int getEdadc() {
        return edadc;
    }
    public void setEdadc(int edadc) {
        this.edadc = edadc;
    }

    public String getSexoc() {
        return sexoc;
    }
    public void setSexoc(String sexoc) {
        this.sexoc = sexoc;
    }

    public int getEstratoc() {
        return estratoc;
    }
    public void setEstratoc(int estratoc) {
        this.estratoc = estratoc;
    } 

    public String getCiudadc() {
        return ciudadc;
    }
    public void setCiudadc(String ciudadc) {
        this.ciudadc = ciudadc;
    }
    
    public String getDireccionc() {
        return direccionc;
    }
    public void setDireccionc(String direccionc) {
        this.direccionc = direccionc;
    }
    
     public int getCelularc() {
        return celularc;
    }
    public void setCelularc(int celularc) {
        this.celularc = celularc;
    }
    
     public String getEmailc() {
        return emailc;
    }
    public void setEmailc(String emailc) {
        this.emailc = emailc;
    }
    
     public int getNumsolc() {
        return numsolc;
    }
    public void setNumsolc(int numsolc) {
        this.numsolc = numsolc;
    }
    
    public int getDiasolicitud() {
        return diasolicitud;
    }
    public void setDiasolicitud(int diasolicitud) {
        this.diasolicitud = diasolicitud;
    }
    
    public int getMessolicitud() {
        return messolicitud;
    }
    public void setMesolicitud(int messolicitud) {
        this.messolicitud = messolicitud;
    }
    
    public int getAñosolicitud() {
        return añosolicitud;
    }
    public void setAñosolicitud(int añosolicitud) {
        this.añosolicitud = añosolicitud;
    }
    
    public int getCodigogarantia() {
        return codigogarantia;
    }
    public void setCodigogarantia(int codigogarantia) {
        this.codigogarantia= codigogarantia;
    }
    
    public int getDianacimieto() {
        return dianacimiento;
    }
    public void setDianacimiento(int dianacimiento) {
        this.dianacimiento = dianacimiento;
    }
    
    public int getMesnacimiento() {
        return mesnacimiento;
    }
    public void setMesnacimiento(int mesnacimiento) {
        this.mesnacimiento = mesnacimiento;
    }
    
    public int getAñonacimiento() {
        return añonacimiento;
    }
    public void setAñonacimiento(int añonacimiento) {
        this.añonacimiento = añonacimiento;
    }
    
    public String getEstadocivil() {
        return estadocivil;
    }
    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }
    
    public int getPersonascargo() {
        return personascargo;
    }
    public void setPersonascargo(int personascargo) {
        this.personascargo = personascargo;
    }
    
    public int getIngresos() {
        return ingresos;
    }
    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }
    
    public int getEgresos() {
        return egresos;
    }
    public void setEgresos(int egresos) {
        this.egresos= egresos;
    }
    public void setEstado(String estado) {
        this.estado= estado;
    }
    
    
    
}
