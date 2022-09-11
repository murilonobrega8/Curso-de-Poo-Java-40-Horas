/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05contabanco;

/**
 *
 * @author murilonobrega8
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void EstadoAtual() {
        System.out.println("------------------------------------");
        System.out.println("Olá, " + this.getDono() + "!");
        System.out.println("O número de sua conta tipo " + this.getTipo() + " é: " + this.getNumConta() + ".");
        System.out.println("O seu saldo é de: " + this.getSaldo() + ".");
        System.out.println("A sua conta está ativa?: " + this.getStatus() + ".");
    }
    
    public void abrirConta(String tipo) {
        this.setStatus(true);
        this.setTipo(tipo);
        if (tipo == "CP") {
            this.setSaldo(150);
        } else if ("CC".equals(tipo)) {
            this.setSaldo(50);
        }
        System.out.println("Bem Vindo ao Banco 131! Você acaba de abrir "
                + "sua conta tipo " + this.getTipo() + " e já recebeu seu bônus de "
                + this.getSaldo() + "!");
    }
    
    public void fecharConta() {
        if (this.getSaldo() < 0) {
            System.out.println("Sua conta tem débito, e por isso não poderá ser encerrada! "
                    + "Solicitamos que faça um depósito no valor de " + Math.abs(this.getSaldo()) + 
                    " para podermos atender a sua solicitação de encerramento.");
        } else if (this.getSaldo() > 0) {
            System.out.println("Sua conta ainda possui saldo de " + this.getSaldo() + "! Por favor,"
            + " realize um saque de " + this.getSaldo() + " para podermos atender a solicitação.");
        } else {
            this.setStatus(false);
            System.out.println("Solicitação atendida com sucesso! Sua conta " + this.getTipo() + 
                    " de número " + this.getNumConta() + " está encerrada!");
        }
    }
    
    public void depositar(float valor) {
        if (this.getStatus() == true) {
        this.setSaldo(this.getSaldo() + valor); 
        System.out.println("Depósito realizado na conta de " + this.getDono() + "! Seu saldo atual é de " + 
                this.getSaldo() + "!");
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
        
    }
    
    public void sacar(float valor) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono() + "!");
            } else {
                System.out.println("Saldo insuficiente para este saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal() {
        int valor = 0;
            if (this.getTipo() == "CC") {
                valor = 12;
            } else if (this.getTipo() == "CP") {
                valor = 20;
            }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono() + "!");
        } else {
            System.out.println("Impossível pagar Mensalidade de uma conta fechada!");
        }
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
