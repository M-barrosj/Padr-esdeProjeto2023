/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distribuidoraovospascoa;

/**
 *
 * @author Aluno
 */
public class Lacta extends OvoDePascoaFactory{
    @Override
	OvoDePascoa CriarOvoDePascoa(char ovo) {
		
		if(ovo == '1') {
			return new AoLeite();
		}else if(ovo == '2') {
			return new Oreo();
		}
		return new SonhoDeValsa();
	}
}
