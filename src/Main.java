import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Basico");
        curso1.setDescricao("Introducao ao Java Basico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Script");
        curso2.setDescricao("Introducao ao Java Script");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Apresentacao da Linguagem");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda tudo sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Contudos Inscritos: \n " + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println(" ");
        System.out.println("Contudos Concluidos: \n " + devFelipe.getConteudosConcluidos());
        System.out.println("XP Total: " + devFelipe.calcularTotalXp());

        System.out.println("----------------------");

        Dev devMonica = new Dev();
        devMonica.setNome("Monica");
        devMonica.inscreverBootcamp(bootcamp);
        System.out.println("Contudos Inscritos: \n" + devFelipe.getConteudosInscritos());
        System.out.println(" ");
        devMonica.progredir();
        devMonica.progredir();
        System.out.println("Contudos Concluidos: \n" + devFelipe.getConteudosConcluidos());
        System.out.println("XP: " + devMonica.calcularTotalXp());

    }
}
