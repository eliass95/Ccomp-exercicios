public class ProfessorHorista extends Professor
{
    private int horas;
    
    public ProfessorHorista() {
    }

    public ProfessorHorista(int matricula, String nome, double salario, int horas) {
        super(matricula, nome, salario);
        this.horas = horas;
    }
    
    public int getHoras() {
        return this.horas;
    }
    
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public double getSalario() {
        return super.getSalario() * horas;
    }
}
