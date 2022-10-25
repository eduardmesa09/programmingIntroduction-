import math
import random
lista= []
for i in range (10):
    lista.append(int(random.randint(1, 100)))
lista.sort()

def numeroMayor():
    print("Lista: ")
    print(*lista)  
    print("\nNúmero mayor: ", lista[-1])

def numeroMenor():
    print("Lista: ")
    print(*lista)  
    print("\nNúmero mayor: ", lista[0])

def raizCuadrada():
    print(*lista) 
    n= int(input("¿A qué número de la lista desea hayarle la raiz cuadrada?\n"))
    for i in lista:    
        if i==n:
            print("Resultado: ", math.sqrt(i))

def elevarAPotencia():
    print(*lista)
    n= int(input("¿A qué número de la lista desea elevar a una potencia?\n"))
    p= int(input("Digite la potencia:\n"))
    for i in lista:    
        if i==n:
            print("Resultado: ", math.pow(n, p))

opcion=1
while opcion!=0:
    print("\n=======OPERACIONES=======\n",
        "1. Ver el número mayor. \n",
        "2. Ver el número menor. \n",
        "3. Cálcular la raiz cuadrada. \n",
        "4. Elevar a una potencia. \n",
        "0. SALIR.")
    opcion=int(input("DIGITE LA OPCION QUE DESEA: "))
    print("==============================")
    if 0<=opcion<=4:
        if opcion==1:
            numeroMayor()
        if opcion==2:
            numeroMenor()
        if opcion==3:
            raizCuadrada()
        if opcion==4:
            elevarAPotencia()
        if opcion==0:
            print("El programa ha finalizado.")
    else:
        print("OPCION NO VALIDA\n")

