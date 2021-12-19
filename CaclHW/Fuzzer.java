package com.company;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class Fuzzer {
    public static void fuzzerTestOneInput(FuzzedDataProvider data){
        //JSONObject jo = new JSONObject(data.consumeRemainingAsString() );
        try{
            Calc.calculate(data.consumeRemainingAsString());
        }
        catch(CalcException e){}
    }
}
