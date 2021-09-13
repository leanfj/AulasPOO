package com.mycompany.aulaspoo;

public class ContaBanco {
    
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    
    //Metodo contrutor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Metodos personalizados
    public void statusConta() {
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status conta: " + this.isStatus());
        
    }
    
    
    public void abrirConta(String tipoConta) {
        this.setTipo(tipoConta);
        this.setStatus(true);
        
        if (tipoConta.equals("CC")) {
            this.setSaldo(50);
        } else if (tipoConta.equals("CP")){
            this.setSaldo(150);
        }
        
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com saldo positivo");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta com saldo negativo");
        } else {
            this.setStatus(false);
            System.out.println("Conta finalizada");
        }
        
    }
    
    public void depositar(float valor) {
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito de " + valor + " realizado com sucesso na conta de " + this.getDono());
            System.out.println("Saldo disponivel de " + this.getSaldo());
        } else {
            System.out.println("Impossivel realizar deposito em uma conta fechada");
        }
        
    }
    
    public void sacar(float valor) {
        if(this.isStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado de " + valor + " da conta de " + this.getDono());
                if (this.getSaldo() > 0) {
                    System.out.println("Saldo disponivel de " + this.getSaldo());
                } else if (this.getSaldo() == 0){
                    System.out.println("Conta com saldo ZERADO");
                }
            } else {
                System.out.println("Conta com saldo negativo");
            }
        } else {
            System.out.println("Não é possivel sacar de uma conta desativiada");
        }
    }
    
    public void pagarMensa() {
        float valorMensalidade = 0;
        if (this.getTipo().equals("CC")) {
            valorMensalidade = 12;
        } else if (this.getTipo().equals("CP")) {
            valorMensalidade = 20;
        }
        
        if (this.isStatus()) {
            if(this.getSaldo() >= valorMensalidade) {
                this.setSaldo(this.getSaldo() - valorMensalidade);
                System.out.println("Mensalidade paga com sucesso");
                System.out.println("Saldo disponivel de " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade");
            }
        } else {
            System.out.println("Impossível pagar a mensalidade, conta desativada");
        }
    }

           
    //Metodos acessores
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
