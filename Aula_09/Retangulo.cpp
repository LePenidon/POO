#include "Retangulo.h"
#include <string>

Retangulo::Retangulo(float fUmaMedida1, float fUmaMedida2, std::string sUmIdentificador): Poligono(fUmaMedida1, fUmaMedida2, sUmIdentificador){
    this->fPerimetro = (fUmaMedida1 + fUmaMedida2)/2;

}

float Retangulo::calculaArea(){
    return fMedida1 * fMedida2;
}

// float Retangulo::getMedida1(){
//     return this->fMedida1;
// }
