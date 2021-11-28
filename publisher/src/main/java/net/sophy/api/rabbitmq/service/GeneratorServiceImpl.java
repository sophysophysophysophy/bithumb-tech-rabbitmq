package net.sophy.api.rabbitmq.service;

import net.sophy.api.rabbitmq.domain.Factor;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.function.Function;

@Service
public class GeneratorServiceImpl implements GeneratorService {
    @Override
    public int randomFactor() {
        Function<String, Integer> function = Integer::parseInt;
        int a = function.apply(Factor.MAX.toString());
        int b = function.apply(Factor.MIN.toString() + 1);
        int c = function.apply(Factor.MIN.toString());
        return new Random().nextInt(a - b + 1) + c;
    }
}
