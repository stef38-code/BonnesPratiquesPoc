package org.example.boucle;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
@State(Scope.Benchmark)
public class ChercheurDeMot {
    @Benchmark
    public boolean trouverMotPrecis(BenchmarkState state) {
        for (String mot : state.mots) {
            if (mot.equals(state.motCible)) {
                return true;
            }
        }
        return false;
    }
    @Benchmark
    public boolean trouverMotPrecisV2(BenchmarkState state) {
        return state.mots.stream().anyMatch(mot -> mot.equals(state.motCible));
    }
}
