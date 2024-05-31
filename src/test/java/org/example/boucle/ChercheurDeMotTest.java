package org.example.boucle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ChercheurDeMotTest {

    private ChercheurDeMot chercheurDeMot;
    private BenchmarkState state;

    @BeforeEach
    void setUp() {
        chercheurDeMot = new ChercheurDeMot();
        state = new BenchmarkState();
        state.mots = Arrays.asList("bonjour", "au", "revoir", "monde");
    }

    @Test
    void trouverMotPrecis_motPresent() {
        state.motCible = "revoir";
        assertThat(chercheurDeMot.trouverMotPrecis(state)).isTrue();
    }

    @Test
    void trouverMotPrecis_motAbsent() {
        state.motCible = "absent";
        assertThat(chercheurDeMot.trouverMotPrecis(state)).isFalse();
    }

    @Test
    void trouverMotPrecisV2_motPresent() {
        state.motCible = "revoir";
        assertThat(chercheurDeMot.trouverMotPrecisV2(state)).isTrue();
    }

    @Test
    void trouverMotPrecisV2_motAbsent() {
        state.motCible = "absent";
        assertThat(chercheurDeMot.trouverMotPrecisV2(state)).isFalse();
    }
}
