#ifndef POLIGONO_H
#define POLIGONO_H
#include <string>

class Poligono{
    public:
        Poligono(float fUmaMedida1, float fUmaMedida2, std::string sUmIdentificador);
        virtual float calculaArea() = 0;
        float getMedida();
        float getMedida2();
        std::string getIdentificador();
    protected:
        float fMedida1;
        float fMedida2;
        std::string sIdentificador;

};

#endif