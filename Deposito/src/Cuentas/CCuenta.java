package Cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria.
 * Permite realizar operaciones como por ejemplo ingresos, retiros y consultar el saldo.
 */

public class CCuenta {
	

		private String nombre; // Nombre del titular de la cuenta
	    private String cuenta;   // Número de la cuenta
	    private double saldo;  // Saldo actual de la cuenta
	    private double tipoInterés;  // Tipo de interés aplicado a la cuenta

	    /**
	     * Constructor por defecto de la clase CCuenta sin parámetros.
	     */
	    
	    public CCuenta()
	    {
	    }
	    
	    /**
	     * Constructor con parámetros de la clase CCuenta.
	     *
	     * @param nom   El nombre del titular de la cuenta.
	     * @param cue   El número de cuenta.
	     * @param sal   El saldo inicial de la cuenta.
	     * @param tipo  El tipo de interés de la cuenta.
	     */

	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        nombre =nom;
	        cuenta=cue;
	        saldo=sal;
	    }

	    /**
	     * Método para obtener el estado actual del saldo.
	     *
	     * @return El saldo actual.
	     */
	    
	    public double estado()
	    {
	        return saldo;
	    }

	 // Getters y setters

	    /**
	     * Método para obtener el nombre del titular.
	     *
	     * @return El nombre del titular.
	     */
	    
	    public String getNombre() {
		return nombre;
	}

	    /**
	     * Método para establecer el nombre del titular.
	     *
	     * @param nombre El nombre del titular.
	     */
	    
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
     * Método para obtener el número de cuenta.
     *
     * @return El número de cuenta.
     */
	
	public String getCuenta() {
		return cuenta;
	}

	/**
     * Método para establecer el número de cuenta.
     *
     * @param cuenta El número de cuenta.
     */
	
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
     * Método para obtener el saldo de la cuenta.
     *
     * @return El saldo de la cuenta.
     */
	
	public double getSaldo() {
		return saldo;
	}

	/**
     * Método para establecer el saldo de la cuenta.
     *
     * @param saldo El saldo de la cuenta.
     */
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
     * Método para obtener el tipo de interés.
     *
     * @return El tipo de interés.
     */
	
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
     * Método para establecer el tipo de interés.
     *
     * @param tipoInterés El tipo de interés.
     */
	
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
     * Método para ingresar una cantidad de dinero.
     *
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
	
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        saldo = saldo + cantidad;
	    }

	    /**
	     * Método para retirar una cantidad de dinero.
	     *
	     * @param cantidad La cantidad a retirar.
	     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
	     */
	    
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        saldo = saldo - cantidad;
	    }
	}


