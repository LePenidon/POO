// hello.cpp file
#include <iostream>
#include "Endereco.h"
#include "Pessoa.h"


int main(){
    Endereco* end = new Endereco("Av Sao Carlos", 1000, 13500);
    std::cout << end->getCEP() << std::endl;

    Pessoa* p = new Pessoa("Joao", 12312);
    std::cout << p->getNome() << std::endl;
    p->printEnderecos();

    return 0;
}