package org.example.boucle;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.List;

@State(Scope.Benchmark)
public class BenchmarkState {
    List<String> mots;
    String motCible;
}
