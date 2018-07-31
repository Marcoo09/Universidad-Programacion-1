/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monkeylearn;

import com.monkeylearn.MonkeyLearn;
import com.monkeylearn.MonkeyLearnResponse;
import com.monkeylearn.MonkeyLearnException;
import java.lang.reflect.Array;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Usuario
 */

//Api Key: 7494134e75bce130709ed33b052a464c00d004b1

public class MonkeyLearnPractise {

    /**
     * @param args the command line arguments
     * @throws com.monkeylearn.MonkeyLearnException
     */
            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tweet a clasificar");
        // "El mejor deportista español de la historia. poco mas q decir. enhorabuena @RafaelNadal!!! eres ENORME campeon!! 🏆🎾💪 #VamosRafa"
        String tweet = scanner.nextLine();
        MonkeyLearn ml = new MonkeyLearn("9b5d7d8c191865fc4972195dacd9df6a8c4996f0");
        String moduleId = "cl_u9PRHNzf";
        String[] textList = {tweet};
        try {
            System.out.println("Cargando...");
            MonkeyLearnResponse res = ml.classifiers.classify(moduleId, textList, false);
            
            /*JSONObject result = res.jsonResult;
            String sentiment = (String)result.get("label");
            Float probability = (Float)result.get("probability");*/
         
            System.out.println( res.arrayResult.toJSONString() );
            System.out.println("-----");
            System.out.println((res.arrayResult.get(0)));
            System.out.println("-----");
            JSONArray results = (JSONArray)res.arrayResult.get(0);
            System.out.println("-----");
            JSONObject jsonObject = (JSONObject)results.get(0);
            System.out.println(jsonObject.get("probability"));
            System.out.println("-----");
        } catch (MonkeyLearnException e) {
            System.out.println(String.format("Unexpected error %s", e.getLocalizedMessage()));
        }
    }

      
    
    }
    

