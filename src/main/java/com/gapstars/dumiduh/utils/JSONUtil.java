package com.gapstars.dumiduh.utils;

;
import com.gapstars.dumiduh.models.TestData;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONUtil {

    /***
     *
     * @param id The id of the test data object that needs to be returned.
     * @return The test data object that matches the search criteria.
     */
    public static TestData readTestData(String id) {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("src\\main\\java\\com\\gapstars\\dumiduh\\resources\\test_data.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray testDataList = (JSONArray) obj;
            return parseTheTestDataObject(testDataList, id);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static TestData parseTheTestDataObject(JSONArray jsonArray, String id) {
        TestData testData = new TestData();
        for (int x = 0; x < jsonArray.size(); x++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(x);
            String idValue = (String) jsonObject.get("Id");
            if (idValue.equals(id)) {
                if (jsonObject.get("intValue") != null) {
                    testData.setIntValue(Math.toIntExact((Long) jsonObject.get("intValue")));
                }
                if (jsonObject.get("stringValue") != null) {
                    testData.setStringValue((String) jsonObject.get("stringValue"));
                }
            }
        }
        return testData;
    }
}

