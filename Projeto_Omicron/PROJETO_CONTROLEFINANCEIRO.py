registro = []
##### loop principal ####################################################################################################
while True:   
#### descrição #########################################################################################################
    while True:
        descricao = input("Digite a descrição da transação: \n")
        if all(c.isalpha() or c.isspace() for c in descricao) and descricao.strip() != "":
            break
        print("Descrição inválida. Use apenas letras.")

#### valor ###############################################################################################################
    valor = float(input("Digite o valor da transação: "))
#### categoria #########################################################################################################
    tiposcategoria = (
        "despesa fixa",
        "despesa variável",
        "receita operacional",
        "receita extra",
        "investimento",
        "custo de produção"
    )

    while True:
        categoria = input("Digite a categoria:\n").lower()
        if categoria in tiposcategoria:
            break
        print("Categoria inválida.")

#### tipo ###############################################################################################################
    while True:
        tipo = input("Digite o tipo (receita/despesa): ").lower()
        if tipo in ("receita", "despesa"):
            break
        print("Tipo inválido.")

########################################################################################################################
    registro.append([descricao, valor , categoria, tipo])
########################################################################################################################
    repetir = input("Deseja fazer outra transação? (s/n): ").lower()
    if repetir != "s":
        break   
#########################################################################################################################
saldo=0




