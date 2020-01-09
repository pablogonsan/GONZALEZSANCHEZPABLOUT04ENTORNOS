//Tarea 04 Entornos
package cuentas;
/**
 * 
 * @author Pablo Gonzalez Sanchez 
 * @version 2019-09 R (4.13.0)
 * 
 */
public class CCuenta {


    /** Estas son las propiedades de la clase CCuenta
     * 
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Comienza el programa
     */
    public CCuenta()
    {
    }

    /**
     * @param nom Nombre del dueño de la cuenta bancaria
     * @param cue Numero de la cuenta bancaria
     * @param sal Saldo actual en la cuenta bancaria
     * @param tipo Tipos de intereses que se aplican en la cuenta bancaria
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /** Muestra el estado del saldo actual de la cuenta bancaria
     * @return <code>saldo</code> Saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /** Metodo para ingresar dinero de la cuenta bancaria, el saldo resultara modificado
     * @param cantidad Cuantia a ingresar en la cuenta bancaria
     * @throws Exception No se podran introducir cantidades de dinero negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /** Metodo para retirar dinero de la cuenta bancaria, el saldo resultara modificado
     * @param cantidad Cuantia a retirar de la cuenta bancaria
     * @throws Exception No se podran sacar cantidades de dinero negativas
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/** Metodo para indicar el nombre del titular de la cuenta
	 * @return <code>nombre</code> Nombre del titular
	 */
	private String getNombre() {
		return nombre;
	}

	/** Metodo para mostrar el nombre del titular de la cuenta
	 * @param nombre Nombre del titular
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** Devuelve el numero de la cuenta bancaria
	 * @return <code>cuenta</code> Numero de la cuenta bancaria
	 */
	private String getCuenta() {
		return cuenta;
	}

	/** Indica el numero de la cuenta bancaria
	 * @param cuenta Numero de Cuenta Bancaria
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**Devuelve el saldo actual de la cuenta bancaria
	 * @return <code>saldo</code> Saldo Actual de la Cuenta Bancaria
	 */
	private double getSaldo() {
		return saldo;
	}

	/**Valor del saldo de la cuenta bancaria
	 * @param saldo Muestra el saldo actual
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/** Indica el tipo de interes que se cargara a la cuenta
	 * @return <code>tipoInterés</code>
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/** Asignacion del valor del tipo de interes
	 * @param tipoInteres Se establecera el porcentaje 
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
