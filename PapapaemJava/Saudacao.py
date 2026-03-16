from datetime import datetime
agora=datetime.now()
hora=agora.hour
minuto=agora.minute

if 5<= hora  <=12:
 print("Bom dia :D")
elif 12<= hora <=17:
 print("Boa tarde ;D")
elif 18<= hora <=23:
 print("Boa noite bb")
else:
 print("Vai dormir seu porra!")