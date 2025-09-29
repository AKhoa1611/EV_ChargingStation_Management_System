package swp391.code.swp391;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
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



    }
}