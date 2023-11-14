package BigDecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Operation opSum = new Operation(BigDecimal.valueOf(8.8),BigDecimal.valueOf(7.1), Operation.operation.ADDICTION);
        Operation opSub = new Operation(BigDecimal.valueOf(8.8),BigDecimal.valueOf(7.1), Operation.operation.SUBTRACTION);
        Operation opMultiply = new Operation(BigDecimal.valueOf(8.8),BigDecimal.valueOf(7.1), Operation.operation.MULTIPLICATION);
        Operation opDiv = new Operation(BigDecimal.valueOf(8.8),BigDecimal.valueOf(7.1), Operation.operation.DIVISION);
        Operation opMax = new Operation(BigDecimal.valueOf(8.8),BigDecimal.valueOf(7.1), Operation.operation.MAX);
        Operation opMin = new Operation(BigDecimal.valueOf(8.8),BigDecimal.valueOf(7.1), Operation.operation.MIN);

        System.out.println(opSum.executeOp());
        System.out.println(opSub.executeOp());
        System.out.println(opMultiply.executeOp());
        System.out.println(opDiv.executeOp());
        System.out.println(opMax.executeOp());
        System.out.println(opMin.executeOp());
    }
}
//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
// (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
// crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo