#include "Endereco.h"
#include <iostream>

Endereco::Endereco(std::string umaRua, int umNumero, int umCEP){
    rua = umaRua;
    numero = umNumero;
    CEP = umCEP;
}
Endereco::~Endereco(){

}

std::string Endereco::getRua(){
    return rua;
}
int Endereco::getNumero(){
    return numero;
}
int Endereco::getCEP(){
    return CEP;
}