listaA=[]
listaB=[]
listaC=[]
for i in range(1,10+1):
    a=int(input(f"Digite na listaA {i}: "))
    listaA.append(a)
    listaC.append(a)
for i in range(1,20+1):
    b=int(input(f"Digite na listaB {i}: "))
    listaC.append(b)
print("Vetores de C(implementados de A e B:)")
print(sorted(listaC))
