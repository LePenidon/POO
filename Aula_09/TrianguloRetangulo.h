#ifndef TRIANGULORETANGULO_H
#define TRIANGULORETANGULO_H

#include <string>
#include "TrianguloRetangulo.h"

class TrianguloRetangulo: public Poligono{
    public:
        TrianguloRetangulo(float fUmaMedida1, float fUmaMedida2, std::string sUmIdentificador);
        float calculaArea();
    private:
        float fTangente;
};

#endif