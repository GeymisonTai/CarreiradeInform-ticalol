N1=int(input("Digite sue número bb: "))
N2=int(input("Digite sue número bb: "))
N3=int(input("Digite sue número bb: "))

if N1 >= N2 and N1 >= N3:
    maior = N1
elif N2 >= N1 and N2 >= N3:
    maior = N2
else:
    maior = N3
if N1 <= N2 and N1 <= N3:
    menor = N1
elif N2 <= N1 and N2 <= N3:
    menor = N2
else:
    menor = N3
print(f"Maior: {maior}")
print(f"Menor: {menor}")
