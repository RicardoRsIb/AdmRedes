package PDFPreve;



public class PdfObtenerSQLPreve {
    int Numero;
    String Nombre;
    byte[] Archivo;

    public PdfObtenerSQLPreve() {
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
    public void setNumeropdf(int id) {
        this.Numero = id;
    }

    public void setNombrepdf(String nombre) {
        this.Nombre = nombre;
    }

    public void setArchivopdf(byte[] archivo) {
        this.Archivo = archivo;
    }

}
