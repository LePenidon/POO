#include "TrianguloRetangulo.h"
#include <string>

TrianguloRetangulo::TrianguloRetangulo(float fUmaMedida1, float fUmaMedida2, std::string sUmIdentificador): TrianguloRetangulo(fUmaMedida1, fUmaMedida2, sUmIdentificador){
    if(fUmaMedida1 > fUmaMedida2){
            this->fTangente = fUmaMedida1/fUmaMedida2;
    }else{
        this->fTangente = fUmaMedida2/fUmaMedida1;
    }
}