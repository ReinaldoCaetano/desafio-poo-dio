import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer ");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev reinaldo = new Dev();
        reinaldo.setNome("Reinaldo");
        reinaldo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Reinaldo" + reinaldo.getConteudoInscritos());
        System.out.println("XP_ " + reinaldo.calcularTotalXp());
        System.out.println("--");
        reinaldo.progredir();
        System.out.println("Conteúdos Inscritos Reinaldo" + reinaldo.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Reinaldo" + reinaldo.getConteudosConcluidos());
        System.out.println("XP_ " + reinaldo.calcularTotalXp());

        System.out.println("--------------------------");

        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + camila.getConteudoInscritos());
        System.out.println("XP_ " + camila.calcularTotalXp());
        camila.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Camila" + camila.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos     Camila" + camila.getConteudosConcluidos());
        System.out.println("XP_ " + camila.calcularTotalXp());





    }
}