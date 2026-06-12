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
//exercio 3:

const prd=["arroz","feijão","macarrão","leite","café"];





if(digitos == prd){console.log("Produto encontrado");}
else {console.log("Produto não encontrado");}
//exercio 4:
