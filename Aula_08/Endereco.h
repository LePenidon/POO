#ifndef ENDERECO_H
#define ENDERECO_H
#include <iostream>
#include <string>

class Endereco{
    public:
     Endereco();
     Endereco(std::string umaRua, int umNumero, int umCEP);
     ~Endereco();
     std::string getRua();
     int getNumero(  );
     int getCEP();
     

    protected:
     std::string rua;
     int numero;
     int CEP;
};

#endif