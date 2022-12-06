package edu.desafiodecodigo;

public class Painel {
    public static Integer calculaTotalLeds(Integer altura,Integer largura) {
        int ledsDosQuadrados = altura*largura*4;
        if(altura==0||largura==0) return 0;
        if(largura==1&&altura>1) return ledsDosQuadrados-(2*(altura-1));
        if(altura==1&&largura>1) return ledsDosQuadrados-(2*(largura-1));
        int ledRepetidos = 2*(altura-1)+2*(largura-1)+(altura-1)*(3*(largura-1));
        return ledsDosQuadrados-ledRepetidos;
    }
}
