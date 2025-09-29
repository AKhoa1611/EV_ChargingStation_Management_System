package swp391.code.swp391.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StationAddingDTO {
    private String stationName;
    private String address;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private int numberOfPort;
    private String status;
}
