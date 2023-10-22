package unlp.info.math;

public class Complex {

	private double re; // parte real
	private double im; // parte imaginaria

	// constructor publico
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public double realPart() {
		return this.re;
	}

	public double imaginaryPart() {
		return this.im;
	}

	public Complex add(Complex c) {
		this.re = this.re + c.re;
		this.im = this.im + c.im;
		return this;
	}

	public Complex subtract(Complex c) {
		this.re = this.re - c.re;
		this.im = this.im - c.im;
		return this;
	}

	public Complex multiply(Complex c) {
		this.re = this.re * c.re;
		this.im = this.im * c.im;
		return this;
	}

	public Complex divide(Complex c) {
		this.re = this.re / c.re;
		this.im = this.im / this.im;
		return this;
	}

	public boolean equals(Complex o) { // puse el parametro como Complex no como object
		return ((o.re == this.re) && (this.im == o.im));

	}

	public int hashCode() { // buscar en intenre
		int num = 1;
		return num;
	}

	public String toString() {
		return ("La parte real del numero complejo es " + realPart() + "y la parte imaginaria es " + imaginaryPart());

	}

	public static Complex valueOf(double re, double im) { // no se bien como se hace
		Complex num = new Complex(re, im);
		return num;
	}

}
