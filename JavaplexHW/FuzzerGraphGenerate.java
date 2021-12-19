package com.company;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import edu.stanford.math.plex.Persistence;
import edu.stanford.math.plex4.graph.random.BinaryHierarchicalGraph;
import edu.stanford.math.plex4.visualization.HomologyVisualizer;

public class FuzzerGraphGenerate {

    public static void fuzzerTestOneInput(FuzzedDataProvider data){
        //генерация графа
        (new BinaryHierarchicalGraph(data.consumeInt(0, 100), data.consumeInt(0,100)*1.0/100)).generate();
    }
}
