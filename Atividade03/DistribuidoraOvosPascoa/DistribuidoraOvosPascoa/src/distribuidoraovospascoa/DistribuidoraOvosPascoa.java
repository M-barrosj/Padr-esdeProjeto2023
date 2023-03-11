/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distribuidoraovospascoa;

import javax.swing.*;

/**
 *
 * @author Aluno
 */
public class DistribuidoraOvosPascoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char Codigo_ovo;
        char Codigo_Fabrica;


        Codigo_Fabrica =  JOptionPane.showInputDialog("Entre com o codigo da Fabrica").charAt(0);
        Codigo_ovo = JOptionPane.showInputDialog("Entre com o codigo do ovo").charAt(0);



        if((Codigo_Fabrica == '1')&&(Codigo_ovo == '1')){
            OvoDePascoaFactory pascoa = new Nestle();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('1');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '1')&&(Codigo_ovo == '2')){
        	 OvoDePascoaFactory pascoa = new Nestle();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('2');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '1')&&(Codigo_ovo == '3')){
        	 OvoDePascoaFactory pascoa = new Nestle();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('3');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '2')&&(Codigo_ovo == '1')){
        	 OvoDePascoaFactory pascoa = new Garoto();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('1');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '2')&&(Codigo_ovo == '2')){
        	 OvoDePascoaFactory pascoa = new Garoto();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('2');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '2')&&(Codigo_ovo == '3')){
        	 OvoDePascoaFactory pascoa = new Garoto();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('3');
            ovo.exibirOvoDePascoa();
        }


          if((Codigo_Fabrica == '3')&&(Codigo_ovo == '1')){
        	  OvoDePascoaFactory pascoa = new Lacta();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('1');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '3')&&(Codigo_ovo == '2')){
        	 OvoDePascoaFactory pascoa = new Lacta();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('2');
            ovo.exibirOvoDePascoa();
        }

         if((Codigo_Fabrica == '3')&&(Codigo_ovo == '3')){
        	 OvoDePascoaFactory pascoa = new Lacta();

            OvoDePascoa ovo = pascoa.CriarOvoDePascoa('3');
            ovo.exibirOvoDePascoa();
        }



    }
}