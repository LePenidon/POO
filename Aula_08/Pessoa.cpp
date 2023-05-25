#include "Pessoa.h"
#include "Endereco.h"
#include <iostream>

Pessoa::Pessoa(){

}
Pessoa::Pessoa(std::string umNome, int umCPF){
    nome = umNome;
    CPF = umCPF;
    ends = new Endereco[10];
    for (int i = 0; i < 10; i++) {
        ends[i] = Endereco("Rua Jose Bonifacio", i*10,i*20);
    }
}
Pessoa::~Pessoa(){
    delete[] ends;
}

std::string Pessoa::getNome(){
    return nome;
}
int Pessoa::getCPF(){
    return CPF;
}

void Pessoa::printEnderecos(){
    for (int i =0; i < 10;i++){
        std::cout << ends[i].getRua() << ", " << ends[i].getNumero() << std::endl;
    }
}