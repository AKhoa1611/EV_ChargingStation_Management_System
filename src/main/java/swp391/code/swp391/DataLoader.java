package swp391.code.swp391;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import swp391.code.swp391.Entity.ChargingStation;
import swp391.code.swp391.Repository.ChargingStationRepository;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final ChargingStationRepository chargingStationRepository;

    @Override
    public void run(String... args) throws Exception {

        if (chargingStationRepository.count() == 0) {
            loadSampleData();
        }
    }

    private void loadSampleData() {
        System.out.println("Loading sample charging stations...");

        ChargingStation station1 = new ChargingStation();
        station1.setStationName("Central Mall Charging Hub");
        station1.setAddress("123 Central Mall, District 1, HCM City");
        station1.setStatus(ChargingStation.ChargingStationStatus.ACTIVE);

        ChargingStation station2 = new ChargingStation();
        station2.setStationName("Tech Park Station");
        station2.setAddress("456 High Tech Park, District 9, HCM City");
        station2.setStatus(ChargingStation.ChargingStationStatus.ACTIVE);

        ChargingStation station3 = new ChargingStation();
        station3.setStationName("Airport Express Charging");
        station3.setAddress("789 Tan Son Nhat Airport, Tan Binh, HCM City");
        station3.setStatus(ChargingStation.ChargingStationStatus.MAINTENANCE);

        ChargingStation station4 = new ChargingStation();
        station4.setStationName("University Campus Station");
        station4.setAddress("147 University Village, Thu Duc City");
        station4.setStatus(ChargingStation.ChargingStationStatus.ACTIVE);

        ChargingStation station5 = new ChargingStation();
        station5.setStationName("Business District Hub");
        station5.setAddress("258 Nguyen Hue Boulevard, District 1, HCM City");
        station5.setStatus(ChargingStation.ChargingStationStatus.INACTIVE);

        ChargingStation station6 = new ChargingStation();
        station6.setStationName("Shopping Center Charging");
        station6.setAddress("741 Crescent Mall, District 7, HCM City");
        station6.setStatus(ChargingStation.ChargingStationStatus.ACTIVE);

        ChargingStation station7 = new ChargingStation();
        station7.setStationName("Residential Area Station");
        station7.setAddress("369 Pham Van Dong Street, Thu Duc City");
        station7.setStatus(ChargingStation.ChargingStationStatus.ACTIVE);

        ChargingStation station8 = new ChargingStation();
        station8.setStationName("Industrial Zone Station");
        station8.setAddress("852 SHTP Industrial Zone, District 9, HCM City");
        station8.setStatus(ChargingStation.ChargingStationStatus.MAINTENANCE);

        ChargingStation station9 = new ChargingStation();
        station9.setStationName("Landmark Tower Station");
        station9.setAddress("963 Landmark 81, Binh Thanh District, HCM City");
        station9.setStatus(ChargingStation.ChargingStationStatus.ACTIVE);

        ChargingStation station10 = new ChargingStation();
        station10.setStationName("Riverside Park Charging");
        station10.setAddress("159 Riverside Park, District 2, HCM City");
        station10.setStatus(ChargingStation.ChargingStationStatus.ACTIVE);

        // Save tất cả vào database
        chargingStationRepository.save(station1);
        chargingStationRepository.save(station2);
        chargingStationRepository.save(station3);
        chargingStationRepository.save(station4);
        chargingStationRepository.save(station5);
        chargingStationRepository.save(station6);
        chargingStationRepository.save(station7);
        chargingStationRepository.save(station8);
        chargingStationRepository.save(station9);
        chargingStationRepository.save(station10);

        System.out.println("Sample data loaded successfully! Total stations: 10");
    }
}