pacote  um.digitalinnovation.basecamp ;

 classe  pública Principal {

    public  static  void  main ( String [] args ) {

        // Quadrilátero
        Sistema . fora . println( " Exercício quadrilátero " );
        Quadrilátero . área( 3 );
        Quadrilátero . área( 5d , 5d );
        Quadrilátero . área( 7 , 8 , 9 );
        Quadrilátero . área( 5f , 5f );

    }
}

-------------------------------------------------


pacote  um.digitalinnovation.basecamp ;

/**
* Classe de exemplo para o exercício da Aula 2 de Métodos.
 */
 classe  pública Quadrilátero {

    public  static  void  area ( double  side ) {

        Sistema . fora . println( " Área do quadrado: "  + lado * lado);
    }

    public  static  void  area ( double  lado1 , double  lado2 ) {

        Sistema . fora . println( " Área do que pode ser: "  + lado1 * lado2);
    }

     área de vazio estático  público ( double baseMaior , double baseMenor , double altura ) {    

        Sistema . fora . println( " Área do trapézio: "  + ((baseMaior + baseMenor) * altura) /  2 );
    }

    public  static  void  area ( float  diagonal1 , float  diagonal2 ) {

        Sistema . fora . println( " Área do losango: "  + (diagonal1 * diagonal2) / 2 );
    }

}