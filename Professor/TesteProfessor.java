public class TesteProfessor
{
    public static void main(String args[]) {
        ProfessorHorista ph = new ProfessorHorista();
        ph.setMatricula(1122);
        ph.setNome("João");
        ph.setSalario(30);
        ph.setHoras(12);
        
        System.out.println("\nMatricula: " + ph.getMatricula());
        System.out.println("Nome: " + ph.getNome());
        System.out.println("Horas: " + ph.getHoras());        
        System.out.println("Salario: " + ph.getSalario());
        
        // ---------------------------
        
        ProfessorDE pde = new ProfessorDE();
        pde.setMatricula(9914);
        pde.setNome("Ana");
        pde.setSalario(3000);
        pde.setLicencaPremio(1);
        
        System.out.println("\nMatricula: " + pde.getMatricula());
        System.out.println("Nome: " + pde.getNome());
        System.out.println("Salario: " + pde.getSalario());
        System.out.println("Licença Premio: " + pde.getLicencaPremio());
        
        // ---------------------------
        
        ProfessorHorista phr = new ProfessorHorista(100, "João", 20, 10);
        
        System.out.println("\nMatricula: " + phr.getMatricula());
        System.out.println("Nome: " + phr.getNome());
        System.out.println("Horas: " + phr.getHoras());        
        System.out.println("Salario: " + phr.getSalario());
    }
}
