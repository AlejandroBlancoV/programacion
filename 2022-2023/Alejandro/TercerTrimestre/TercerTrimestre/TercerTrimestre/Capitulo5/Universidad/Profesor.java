package Capitulo5.Universidad;

public class Profesor extends Persona{
    protected String departamento;
    protected String categoría;

    
    public Profesor(String nombre, String direccion, String departamento, String categoría) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoría = categoría;
    }


    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public String getCategoría() {
        return categoría;
    }


    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }


    @Override
    public String toString() {
        return super.toString()+"Profesor [departamento=" + departamento + ", categoría=" + categoría + "]";
    }


   




    
}
