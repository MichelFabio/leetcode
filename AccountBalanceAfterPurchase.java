//Dado un entero de entrada redondear al multiplo de 10 mas cercano, si esta igual de cerca a dos numeros
//elija el mayor (ejm 15, se redondea a 20), y devuleva el balance de la cuenta con un valor inicial de 100
class AccountBalanceAfterPurchase{
	public int accountBalanceAfterPurchase(int purchaseAmount){
		int valor = purchase % 10;
		int res = 0;
		
		if(valor >= 5){
			res = purchaseAmount % 10;
		}else res = purchaseAmount - valor;
		return 100 - res;
	}
}
