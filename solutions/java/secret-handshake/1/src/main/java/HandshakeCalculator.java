import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> result = new ArrayList<>();

        if ((number & 1)  != 0) result.add(Signal.WINK);
        if ((number & 2)  != 0) result.add(Signal.DOUBLE_BLINK);
        if ((number & 4)  != 0) result.add(Signal.CLOSE_YOUR_EYES);
        if ((number & 8)  != 0) result.add(Signal.JUMP);
        if ((number & 16) != 0) Collections.reverse(result);

        return result;
    }

}