<template>
  <div id="forms">

    <div class="container">
          <h2>Cadastro</h2>
      <form @submit.prevent="salvar">
          <label>Nome</label>
          <input type="text" placeholder="Nome" v-model="cliente.nome">
          <button class="waves-effect waves-light btn-small">Salvar<i class="material-icons left">save</i></button>
      </form>

      <table>

        <thead>
          <tr>
            <th>ID</th>
            <th>NOME</th>
          </tr>
        </thead>

        <tbody>
          <tr v-for="cliente of clientes" :key="cliente.id">
            <td>{{cliente.id}}</td>
            <td>{{cliente.nome}}</td>
            <td>
              <button @click="editar(cliente)" class="waves-effect btn-small blue darken-1"><i class="material-icons">create</i></button>
              <button  @click="remover(cliente.id)" class="waves-effect btn-small red darken-1"><i class="material-icons">delete_sweep</i></button>
            </td>
          </tr>
        </tbody>
      
      </table>

    </div>

  </div>
</template>

<script>
import{http} from '../../services/config';
import Cliente from '../../services/clientes'
export default{
  data(){
    return{
      cliente:{
        id:'',
        nome:''
      },
      clientes:[]
    }
  },
  mounted(){
    this.listar()
  },
  methods:{
    listar(){
      Cliente.listar().then(resposta => {
      this.clientes = resposta.data
      })
    },
    salvar(){
          Cliente.salvar(this.cliente).then(resposta =>{
           if(!this.cliente.id){
             this.cliente = {}
              alert('Salvo com sucesso!', resposta.data)
              this.listar()
            }else{
              this.cliente = {}
              alert('Atualizado com sucesso!', resposta.data)
              this.listar()
               }
            })
    }, 
    editar(cliente){
      this.cliente = cliente
    },

    remover(id) {  
       if(confirm('Deseja excluir o produto?')){  
      http.delete('http://localhost:8080/clientes/' + id)
      .then(response => {
        this.http.splice(id,1)
        console.log(this.id);
        console.log(response.data);
        
        
      });
     
    }
     this.listar()}
    
  }
}
</script>

<style>
.container{
  width: 500px;
  margin-top: 100px;
  font-size: 20px;
}
label,input{
  font-size: 20px;
}
</style>
