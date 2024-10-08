package Ecommerce;

import java.time.LocalDate;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIscrizione;

    public Cliente (String codiceCliente, String nome, String cognome, String email, LocalDate dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome () {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }

    public String toString() {
        return "Cliente: " + nome + " " + cognome + " (Codice: " + codiceCliente + "), Email: " + email + ", Iscritto dal: " + dataIscrizione;
    }
}
