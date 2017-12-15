package com.univ.Testing;

public class Compte {
	
	private float solde;
	
	/**
	 * Credite le compte du montant transmis en argument.
	 * @param credit
	 * @throws Exception si credit <= 0
	 */
	public void crediter(float credit) throws Exception{
		if (credit <= 0){
			throw new Exception();
		this.solde = solde + credit;
	}

	public float getSolde() {
		return this.solde;
	}

	/**
	 * Debite le compte de la valeur transmise en argument
	 * @param debit
	 * @return le montant demande si le solde du compte est superieur au montant demande,
	 * retourne la valeur du solde si le solde est inferieur au montant demande. 
	 * @throws Exception si debit < 20 ou si debit > 1000 euros.
	 */
	public float debiter(float debit) throws Exception{
		if(debit <= 0 || debit < 20 || debit > 1000) {
			throw new Exception();
		}
		return this.solde - debit;
	}
	
	/**
	 * Reinitialise
	 * @param solde
	 * @throws Exception si solde <= 0
	 */
	public void setSolde(float solde) throws Exception{
		if (solde <= 0){
			throw new exception();	
		}
		this.solde = solde;
		
	}


}
