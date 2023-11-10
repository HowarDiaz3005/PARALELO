public class Casa 
{
    private String color;

    public Casa()
    {
        this("Desconocido");
    }

    public Casa(String color)
    {
        this.color = color;
    }

    public String mostrarColor()
    {
        return this.color;
    }

    public void cambiarColor(String color)
    {
        this.color = color;
    }
}
