N1 = int(input("Digite o 1 número bb: "))
N2 = int(input("Digite o 2 número bb: "))
N3 = int(input("Digite o 3 número bb: "))

if N1 > N2:
    N1, N2 = N2, N1
if N1 > N3:
    N1, N3 = N3, N1
if N2 > N3:
    N2, N3 = N3, N2

print("Ordem crescente:", N1, N2, N3)
