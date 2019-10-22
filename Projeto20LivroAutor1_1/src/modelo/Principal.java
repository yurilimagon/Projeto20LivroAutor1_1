/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Livro livro01 = new Livro("Vinte Mil Léguas Submarinas","ABC",2019,autor01);
        Livro livro01 = new Livro();
        livro01.setTitulo("Vinte Mil Léguas Submarinas");
        livro01.setEditora("ABC");
        livro01.setAno(2019);
        
        Autor autor01 = new Autor("Julio Verne", 1910, "jv@email.com",livro01);
        livro01.setEscritor(autor01);
        
        System.out.println("Livro: " + livro01.getTitulo() + "\n" + livro01.getEditora() + "\n" +
                                        livro01.getAno() + "\n" + livro01.getEscritor().getNome());
        
        System.out.println("\nAutor: " + autor01.getNome() + "\n" + autor01.getAnoNasc() + "\n" +
                                        autor01.getEmail() + "\n" + autor01.getObra().getTitulo());
    }
    
}
