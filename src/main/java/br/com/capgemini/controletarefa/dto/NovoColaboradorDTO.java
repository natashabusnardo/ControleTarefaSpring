package br.com.capgemini.controletarefa.dto;

import br.com.capgemini.controletarefa.model.Colaborador;

import java.time.LocalDate;

public class NovoColaboradorDTO {

    //@NotBlank //(message = "O campo nome do produto é obrigatório.")
    private String nomeColaborador;
    //@NotBlank
    private String emailColaborador;
    //@NotBlank
    private String senha;
    private LocalDate dataNascimento;

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public String getEmailColaborador() {
        return emailColaborador;
    }

    public void setEmailColaborador(String emailColaborador) {
        this.emailColaborador = emailColaborador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Colaborador toColaborador() {

        Colaborador colaborador = new Colaborador();
        colaborador.setNome(nomeColaborador);
        colaborador.setEmail(emailColaborador);
        colaborador.setSenha(senha);
        colaborador.setDataNascimento(dataNascimento);

        //pedido.setStatus(StatusPedido.AGUARDANDO);

        return colaborador;
    }
}
