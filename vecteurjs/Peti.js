//exercio 1:
const alunos=["Afonso","Bianca","Cezar","Daniela","Erick"];
const listabanana=document.getElementById('ListaAlunesca');
listabanana.innerHTML=`
<ul>
${alunos.map( aluno => `<li>${aluno}</li>`).join(' ')}
</ul> `;


const lista=document.getElementById('ListaAlunesca');
const itens = lista.querySelectorAll("li");

const quantidade = itens.length;
console.log("Existe " + quantidade +"matriculados no Colégio São Lucas");
document.getElementById("Totaldealunos").textContent=quantidade;









//exercio 2:
const notas=[7.5,8,6.5,9,10];
const total=(notas[0]+notas[4])/2;
console.log(total)
//exercio 3:
const prd=["arroz","feijão","macarrão","leite","café"];
if(digitos == prd){console.log("Produto encontrado");}
else {console.log("Produto não encontrado");}
//exercio 4:
