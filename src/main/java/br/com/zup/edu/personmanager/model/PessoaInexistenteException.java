package br.com.zup.edu.personmanager.model;

public class PessoaInexistenteException extends RuntimeException{
    public PessoaInexistenteException() {
        super("Não consta um registro de pessoa com esse id.");
    }
}
