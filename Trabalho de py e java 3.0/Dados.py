from datetime import date
Nome=input("Digite seu nome: ")
idade=int(input("Digite sua idade:"))
data_nasc_str = input("Digite sua data de nascimento (DD/MM/AAAA): ")
dia, mes, ano = map(int, data_nasc_str.split('/'))
#########################################3
from datetime import datetime
agora = datetime.now()
hora = agora.hour
minuto = agora.minute
if 5 <= hora < 12:
    print("Bom dia!!")
elif 12 <= hora < 18:
    print("Boa tarde.")
else:
 print("Boa noite")

if idade >= 18:
        print(
              
f"!Entrada liberada para o barzinho :D!")
else:
  print(
f"!Pode não,vagabundo >:(!")

