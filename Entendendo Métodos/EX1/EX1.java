pacote  um.digitalinnovation.basecamp ;

/**
* Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public  class  Calculadora {

    public  static  void  soma ( double  numero1 , double  numero2 ) {

        resultado duplo = numero1 + numero2;

        Sistema . fora . println( " A soma de "  + numero1 +  " mais "  + numero2 +  " é "  + resultado);
    }

    public  static  void  subtracao ( double  numero1 , double  numero2 ) {

        duplo resultado = numero1 - numero2;

        Sistema . fora . println( " A subtracao de "  + numero1 +  " menos "  + numero2 +  " é "  + resultado);
    }

    public  static  void  multiplicacao ( double  numero1 , double  numero2 ) {

        duplo resultado = numero1 * numero2;

        Sistema . fora . println( " A multiplicação de "  + numero1 +  " vezes "  + numero2 +  " é "  + resultado);
    }

    public  static  void   divisao ( double  numero1 , double  numero2 ) {

        duplo resultado = numero1 / numero2;

        Sistema . fora . println( " A divisão de "  + numero1 +  " por "  + numero2 +  " é "  + );
    }

}


-----------------------------------------------------------------------------------------

pacote  um.digitalinnovation.basecamp ;

/**
* Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
 classe  pública Emprestimo {

    public  static  int  getDuasParcelas () {
        retorno  2 ;
    }

    public  static  int  getTresParcelas () {

        retorno  3 ;
    }

    public  static  double  getTaxaDuasParcelas () {

        retorno  0,3 ;
    }

    public  static  double  getTaxaTresParcelas () {

        retorno  0,45 ;
    }

    public  static  void  calcular ( double  valor , int  parcelas ) {

        if (parcelas ==  2 ) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            Sistema . fora . printn( " Valor final do comentário para 2 parcelas: R$ "  + valorFinal);
        } else  if (parcelas ==  3 ) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            Sistema . fora . printn( " Valor final do comentário para 3 parcelas: R$ "  + valorFinal);
        } senão {
            Sistema . fora . println( " Quantidade de parcelas não aceita. " );
        }

    }

}

--------------------------------------------------------------------------------------

pacote  um.digitalinnovation.basecamp ;

/**
* Aula principal dos exercícios da Aula 1 de Métodos.
 */
 classe  pública Principal {

    public  static  void  main ( String [] args ) {

        // Calculadora
        Sistema . fora . println( " Exercício calculadora " );
        Calculadora . soma ( 3,6 ) ;
        Calculadora . subtração( 9 , 1,8 );
        Calculadora . multiplicacao( 7 , 8 );
        Calculadora . divisão( 5 , 2,5 );

        // Mensagem
        Sistema . fora . println( " Exercício mensagem " );
        Mensagem . obterMensagem( 9 );
        Mensagem . obterMensagem( 14 );
        Mensagem . obterMensagem( 1 );

        // Empréstimo
        Sistema . fora . println( " Exercícios de avaliação " );
        Emprestimo . calcular( 1000 , Emprestimo . getDuasParcelas());
        Emprestimo . calcular( 1000 , Emprestimo . getTresParcelas());
        Emprestimo . calcular( 1000 , 5 );

    }
}


------------------------------------------------------------------------------------------

pacote  um.digitalinnovation.basecamp ;

/**
* Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
 classe  pública Mensagem {


    public  static  void  obterMensagem ( int  hora ) {

        mudar (hora) {
            caso  5 :
            caso  6 :
            caso  7 :
            caso  8 :
            caso  9 :
            caso  10 :
            caso  11 :
            caso  12 :
                mensagemBomDia();
                quebrar ;
            caso  13 :
            caso  14 :
            caso  15 :
            caso  16 :
            caso  17 :
                mensagemBoaTarde();
                quebrar ;
            caso  18 :
            caso  19 :
            caso  20 :
            caso  21 :
            caso  22 :
            caso  23 :
            caso  0 :
            caso  1 :
            caso  2 :
            caso  3 :
            caso  4 :
                mensagemBoaNoite();
                quebrar ;
            padrão :
                Sistema . fora . println( " Hora inválida. " );
                quebrar ;
        }
    }

    public  static  void  mensagemBomDia () {
        Sistema . fora . println( " Bom dia! " );
    }

    public  static  void  mensagemBoaTarde () {
        Sistema . fora . println( " Boa tarde! " );
    }

    public  static  void  mensagemBoaNoite () {
        Sistema . fora . println( " Boa noite! " );
    }

}



