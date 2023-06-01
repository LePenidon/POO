#include <iostream>
#include "Retangulo.h"
#include "Poligono.h"
#include "TrianguloRetangulo.h"

int main() {
    Poligono** pols = new Poligono*[4];

    pols[0] = new Retangulo(2, 3, "Retangulo 1");
    pols[1] = new Retangulo(4, 5, "Retangulo 2");
    pols[2] = new TrianguloRetangulo(6, 7, "Triangulo Retangulo 3");
    pols[3] = new TrianguloRetangulo(8, 9, "Triangulo Retangulo 4");

    std::cout << "Poligonos: " << std::endl;

    for(int i = 0; i < 4; i++){
        std::cout << pols[i]->getIdentificador() << ": " << std::endl;
    }

    float soma = *polis[0] + *polis[1];
    std::cout << "Soma: " << soma << std::endl;

    return 0;
}