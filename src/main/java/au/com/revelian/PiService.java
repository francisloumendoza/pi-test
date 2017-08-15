package au.com.revelian;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class PiService {

    @Value("${term.limit}")
    private long termLimit;

    public double calculatePi() {

        int operandIdentifier = 1;
        double pi = 1.0;
        for (double number = 3; number <= termLimit; number=number + 2) {

            if (useSubtract(operandIdentifier)) {
                pi = pi - 1/number;
            } else {
                pi = pi + 1/number;
            }

            operandIdentifier++;
        }

        return (4 * pi);
    }

    private boolean useSubtract(int operandIdentifier) {
        return (operandIdentifier % 2) == 1;
    }
}
