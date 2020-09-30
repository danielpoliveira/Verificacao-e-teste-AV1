package funcionario;

public class Funcionario {
    private String nome;
    private String funcao;
    private String setor;
    
    //Código corrigido
    public Funcionario() {
    	this.nome 	= "";
    	this.funcao = "";
    	this.setor 	= "";
    }
  	
    public String exibir(){
        return "Nome: "+nome+ 
        		"\nFuncao: "+funcao+
        		"\nSetor: "+setor;        
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
  
	public void setFuncao(String funcao){
        this.funcao = funcao;
    }
	
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public String getNome(){
        return nome;
    }
  
    public String getFuncao(){
        return funcao;
    }
    
    public String getSetor(){
        return setor;
    }


}

