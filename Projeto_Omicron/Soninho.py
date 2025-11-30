ovelhas=0
x=input("Ta com sono? (sim/não): ")
while x == "não":
    ovelhas +=1
    print(f"Contou {ovelhas}...")
    x=input("Ainda ta com sono? (sim/não): ")
else:
    print(f"Boa noite,querido usário,contou {ovelhas} ovelhas.")