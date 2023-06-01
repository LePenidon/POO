#ifndef RETANGULO_H
#define RETANGULO_H

#include <string>
#include "Poligono.h"

class Retangulo: public Poligono{
    public:
        Retangulo(float fUmaMedida1, float fUmaMedida2, std::string sUmIdentificador);
        float calculaArea();
    private:
        float fPerimetro;
};

#endif