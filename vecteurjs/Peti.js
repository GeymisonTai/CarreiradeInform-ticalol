//exercio🤓 1:
const alunos=["Afonso","Bianca","Cezar","Daniela","Erick"];
const listabanana=document.getElementById('ListaAlunesca');
listabanana.innerHTML=`
<ul>
${alunos.map( aluno => `<li>${aluno}</li>`).join(' ')}
</ul> `;
//criar um uma váriavel para pegar a id"Lista Alunesca"  e outra váriavel para 
const lista=document.getElementById('ListaAlunesca');
//querySelectorAll serve retornar a lista os elementos no Dom ou li
const itens = lista.querySelectorAll("li");

const quantidade = itens.length;//length para fazer o tamanho da lista sendo tipop uma lista 

console.log("Existe " + quantidade +"matriculados no Colégio São Lucas");
document.getElementById("Totaldealunos").textContent=quantidade;

//exercio🤓 2:
const notas = [7.5, 8, 6.5, 9, 10];
const listadenotas = document.getElementById('Notinhas');
//content manipula os contéudo a partir do DOM,ignora as tag com <p>
listadenotas.textContent = notas.join(' / ');
//cria uma variavel que soma 
//o reduce usado para arrays e reduzir para um único valor
const soma=notas.reduce((a,b)=> a + b ,0);//como se fosse váriaves:a=notas e b=reduce
const div=soma / notas.length;
document.getElementById('Media').textContent=div;

//exercio🤓 3:
const prd=["arroz","feijão","macarrão","leite","café"];//vetor de comida yey
const dg=document.getElementById('digitos');//pega elementos do que vai ser digitado
//fazer a função do botão
function Checagem() {
    //value pega do dado
    const produto = dg.value.toLowerCase();//tranforma maiúsculas da string para letras minúsculas

    if (prd.includes(produto)) {
        console.log("Esse produto existe na loja.");
        //para aparecer no código html
        document.getElementById("verificagem").textContent =
            "Esse produto existe na loja.";
    } else {
        console.log("Esse produto não existe na loja.");
                //para aparecer no código html
        document.getElementById("verificagem").textContent =
            "Esse produto não existe na loja.";
    }
}

//exercio🤓 4:
// Recebe o vetor inicial, cria um vetor sem valores repetidos e mostra quantos foram removidos
const vetorInicial = [10, 5, 8, 3, 5, 7, 8];
const vetorSemDuplicados = [...new Set(vetorInicial)];
const quantidadeRemovida = vetorInicial.length - vetorSemDuplicados.length;

console.log('Vetor original:', vetorInicial);
console.log('Vetor sem duplicados:', vetorSemDuplicados);
console.log('Quantidade de elementos removidos:', quantidadeRemovida);

// Exibir dinamicamente na página (não precisa alterar o HTML):
const secEx4 = document.createElement('section');
secEx4.id = 'exercicio4';
const tituloEx4 = document.createElement('h2');
tituloEx4.textContent = '4. Vetor sem duplicados e quantidade removida:';
const pVetor = document.createElement('p');
pVetor.textContent = 'Vetor sem duplicados: ' + vetorSemDuplicados.join(', ');
const pRemovidos = document.createElement('p');
pRemovidos.textContent = 'Quantidade de elementos removidos: ' + quantidadeRemovida;
secEx4.appendChild(tituloEx4);
secEx4.appendChild(pVetor);
secEx4.appendChild(pRemovidos);

// Insere antes do script atual (se possível) ou no final do body
const scriptTag = document.currentScript;
if (scriptTag && scriptTag.parentNode) {
  scriptTag.parentNode.insertBefore(secEx4, scriptTag);
} else {
  document.body.appendChild(secEx4);
}
