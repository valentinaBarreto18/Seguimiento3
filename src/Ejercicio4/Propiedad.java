package Ejercicio4;

public class Propiedad {
    private int idPropiedad;
    private String direccion;
    private double area;
    private double precio;
    private int habitaciones;
    private int baños;
    private boolean garaje;
    private String estado;


    public Propiedad(int idPropiedad, String direccion, double area, double precio, int habitaciones, int baños, boolean garaje, String estado) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.area = area;
        this.precio = precio;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.garaje = garaje;
        this.estado = estado;
    }


    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanos() {
        return baños;
    }

    public void setBanos(int banos) {
        this.baños = banos;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void mostrarDatos() {
        System.out.println("ID Propiedad: " + idPropiedad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Área: " + area + " m2");
        System.out.println("Precio: $" + precio);
        System.out.println("Habitaciones: " + habitaciones);
        System.out.println("Baños: " + baños);
        System.out.println("Garaje: " + (garaje ? "Sí" : "No"));
        System.out.println("Estado: " + estado);
        System.out.println();
    }
}



