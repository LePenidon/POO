#include "Poligono.h"
#include <string>

Poligono::Poligono(float fUmaMedida1, float fUmaMedida2, std::string sUmIdentificador){
    fMedida1 = fUmaMedida1;
    fMedida2 = fUmaMedida2;
    sIdentificador = sUmIdentificador;
}

float Poligono::operator+(Poligono & const) const{
    return this->calculaArea() + poligono.calculaArea();
}