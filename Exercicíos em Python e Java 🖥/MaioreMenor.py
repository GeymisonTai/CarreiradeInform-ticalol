n1=int(input("Digite seu número bb: "))
n2=int(input("Digite seu número bb: "))
n3=int(input("Digite seu número bb: "))
if n1 >= n2 and n1 >= n3:
    maior = n1
elif n2 >= n1 and n2 >= n3:
    maior = n2
else:
    maior = n3
if n1 <= n2 and n1 <= n3:
    menor = n1
elif n2 <= n1 and n2 <= n3:
    menor = n2
else:
    menor = n3
print(f"Maior: {maior}, Menor: {menor}")

