const input = document.getElementById("inputdeTarefa");
const lista = document.getElementById("listadeTarefas");
const contador = document.getElementById("contador");

function realizarTarefa() {
    
    if (input.value.trim() === "") return;
    const li = document.createElement("li");
    li.innerHTML = `
        ${input.value}
        <button onclick="editarTarefa(this)">Editar</button>
        <button onclick="deletarTarefa(this)">Deletar</button>
    `;
    
    lista.appendChild(li);
    input.value = "";
    atualizarContador();
}

function editarTarefa(botao) {
    const li = botao.parentElement;
    const textoAtual = li.childNodes[0].textContent.trim();
    const novoTexto = prompt("Editar tarefa:", textoAtual);
    
    if (novoTexto !== null && novoTexto.trim() !== "") {
        li.childNodes[0].textContent = novoTexto;
    }
}

function deletarTarefa(botao) {
    botao.parentElement.remove();
    atualizarContador();
}

function limparTodas() {
    if (confirm("Tem certeza?")) {
        lista.innerHTML = "";
        atualizarContador();
    }
}

function atualizarContador() {
    const total = lista.children.length;
    contador.textContent = `Total: ${total} tarefa(s)`;
}
 Enter
input.addEventListener("keypress", function(event) {
    if (event.key === "Enter") {
        realizarTarefa();
    }
});