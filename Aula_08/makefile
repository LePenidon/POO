CPPFLAGS = -pedantic-errors -Wall -lm -I/.

all: endereco.o pessoa.o main.o
	g++ endereco.o pessoa.o main.o -o run $(CPPFLAGS);./run

endereco.o:
	g++ -c Endereco.cpp -o endereco.o $(CPPFLAGS)

pessoa.o:
	g++ -c Pessoa.cpp -o pessoa.o $(CPPFLAGS)
	
main.o:
	g++ -c main.cpp $(CPPFLAGS) -o main.o 

run:
	./run

clean:
	rm *.o *.zip run



# CFLAGS = -std=c99 -pedantic-errors -Wall -lm

# all: functions.o lista_info.o it_info.o lista_mov.o it_mov.o main.o
# 	gcc functions.o lista_info.o it_info.o lista_mov.o it_mov.o main.o -o run $(CFLAGS);./run

# functions.o:
# 	gcc -c ./functions/functions.c $(CFLAGS) -I/functions -o functions.o

# main.o:
# 	gcc -c main.c $(CFLAGS) -o main.o

# run:
# 	./run

# clean:
# 	rm *.o *.zip run