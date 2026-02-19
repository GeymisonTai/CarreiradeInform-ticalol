from datetime import datetime
agora = datetime.now()
hora = agora.hour 
print(agora.strftime("%H:%M"))
if 5<= hora <= 11:
    print("Bom dia!!")
elif 12 <= hora <= 17:
    print("Boa tarde!!")
elif 18 <= hora <= 21:
    print("Boa noite!!")
else:
    print("Vai dormir, praga")
