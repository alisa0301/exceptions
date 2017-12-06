package stream.supplies;

import lombok.Data;

@Data
public class Supply {

    private int id;
    private String debtorName;
    private String supplyNumber;
    private String supplyReceiptDate;
    private double supplyAmount;
    private Status status;
}
