package PDF;

public class PdfObtenerSQL {
    int Numero;
    String Nombre;
    byte[] Archivo;

    public PdfObtenerSQL() {
    }
    
    public int getNumeropdf() {
        return Numero;
    }

    public String getNombrepdf() {
        return Nombre;
    }

    public byte[] getArchivopdf() {
        return Archivo;
    }


    /*Todo los codigos set*/
    public void setNumeropdf(int codigo) {
        this.Numero = codigo;
    }

    public void setNombrepdf(String nombre) {
        this.Nombre = nombre;
    }

    public void setArchivopdf(byte[] archivo) {
        this.Archivo = archivo;
    }

}