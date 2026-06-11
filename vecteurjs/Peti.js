//exercio 1:
const alunos=["Afonso","Bianca","Cezar","Daniela","Erick"];
const listabanana=document.getElementById('ListaAlunesca');
listabanana.innerHTML=`
<ul>
${alunos.map( aluno => `<li>${aluno}</li>`).join(' ')}
</ul> `;
//criar um uma váriavel para pegar a id"Lista Alunesca"  e outra váriavel para 
const lista=document.getElementById('ListaAlunesca');
const itens = lista.querySelectorAll("li");//querySelectorAll serve retornar a lista os elementos no Dom ou li

const quantidade = itens.length;//length para fazer o tamanho da lista sendo tipop uma lista 
console.log("Existe " + quantidade +"matriculados no Colégio São Lucas");
document.getElementById("Totaldealunos").textContent=quantidade;

//exercio 2:
const notas=[7.5,8,6.5,9,10];
const listadenotas=document.getElementById('Notinhas');

notas.forEach(nota => {
const linotas=document.createElement('li');
linotas.textContent=notas;
listadenotas.appendChild(linotas);
});





const total=(notas[0]+notas[4])/2;
console.log(total)
//exercio 3:
const prd=["arroz","feijão","macarrão","leite","café"];
if(digitos == prd){console.log("Produto encontrado");}
else {console.log("Produto não encontrado");}
//exercio 4:
