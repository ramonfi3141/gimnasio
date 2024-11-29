

// Estrategia para pago con tarjeta de crédito
class TarjetaCreditoPago {
    public void procesar(double cantidad) {
        System.out.println("Pago de " + cantidad + " con tarjeta de crédito.");
    }
}

// Estrategia para pago mediante transferencia bancaria
class TransferenciaPago {
    public void procesar(double cantidad) {
        System.out.println("Pago de " + cantidad + " mediante transferencia bancaria.");
    }
}

// Contexto que utiliza diferentes estrategias de pago
class PagoContexto {
    private Object estrategiaPago;

    public PagoContexto(Object estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    public void cambiarEstrategia(Object nuevaEstrategia) {
        this.estrategiaPago = nuevaEstrategia;
    }

    public void procesarPago(double cantidad) {
        if (estrategiaPago instanceof TarjetaCreditoPago) {
            ((TarjetaCreditoPago) estrategiaPago).procesar(cantidad);
        } else if (estrategiaPago instanceof TransferenciaPago) {
            ((TransferenciaPago) estrategiaPago).procesar(cantidad);
        }
    }
}

// Uso del patrón Strategy
public class strategy {
    public static void main(String[] args) {
        PagoContexto pago = new PagoContexto(new TarjetaCreditoPago());
        pago.procesarPago(100.0);  // Salida: Pago de 100.0 con tarjeta de crédito.
       
        pago.cambiarEstrategia(new TransferenciaPago());
        pago.procesarPago(200.0);  // Salida: Pago de 200.0 mediante transferencia bancaria.
    }
}