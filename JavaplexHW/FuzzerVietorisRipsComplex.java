package com.company;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import edu.stanford.math.plex4.api.Plex4;
import edu.stanford.math.plex4.metric.impl.EuclideanMetricSpace;

public class FuzzerVietorisRipsComplex {
    public static void fuzzerTestOneInput(FuzzedDataProvider data){
        //генерация пространства
        double[][] points = new double[50][2];
        for(int i = 0; i < 50; i++){
            points[i][0] = data.consumeDouble();
            points[i][1] = data.consumeDouble();
        }
        EuclideanMetricSpace space = Plex4.createEuclideanMetricSpace(points);
        Plex4.createVietorisRipsStream(space, data.consumeInt(), data.consumeDouble(), data.consumeInt());
    }
}
