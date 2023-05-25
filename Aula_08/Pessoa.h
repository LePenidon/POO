#ifndef PESSOA_H
#define PESSOA_H
#include <string>
#include <iostream>
#include "Endereco.h"

class Pessoa{
    public:
     Pessoa();
     Pessoa(std::string umNome, int umCPF);
     ~Pessoa();
     std::string getNome();
     int getCPF();
     void printEnderecos();

    protected:
     std::string nome;
     int CPF;
     Endereco* ends;
};

#endif