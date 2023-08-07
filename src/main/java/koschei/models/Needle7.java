package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    Deth8 deth8;
    @Autowired
    public Needle7 (Deth8 deth) {
        this.deth8 = deth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth8.toString();
    }
}
