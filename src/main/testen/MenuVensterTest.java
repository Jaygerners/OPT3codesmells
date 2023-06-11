import com.example.opt3codesmells.MenuVenster;
import com.example.opt3codesmells.VensterObserver;
import org.junit.jupiter.api.Test;

public class MenuVensterTest {
    @Test
    public void MenuTellerTest(){
        MenuVenster menuVenster = new MenuVenster();
        VensterObserver vensterObserver = new VensterObserver();
        menuVenster.addObserver(vensterObserver);
    }
}
