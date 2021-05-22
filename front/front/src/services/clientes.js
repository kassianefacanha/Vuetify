import{http} from './config';
export default{
    listar:()=>{
        return http.get('clientes')
    },
    salvar:(cliente) =>{
        return http.post('clientes', cliente)
    },
    atualizar:(cliente) =>{
        return http.put('clientes', cliente)
    }
    /**apagar:(cliente) =>{
        return http.delete('clientes', {data:cliente})
    }
    **/
}