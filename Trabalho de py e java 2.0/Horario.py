from datetime import datetime
agora = datetime.now()
hora = agora.hour
minuto = agora.minute
print(f"Agora são {hora}:{minuto}")
if 5 <= hora < 12:
    print("Bom dia!!")
elif 12 <= hora < 18:
    print("Boa tarde.")
elif 18 <= hora <= 23:
    print("Boa noite...zz")
else:
    print("Vai dormir, praga ❤")