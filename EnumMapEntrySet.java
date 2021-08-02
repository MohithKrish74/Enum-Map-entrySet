package com.keyword;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

enum Transportation{RAILWAYS,AIRWAYS,WATERWAYS,ROADWAYS,PIPELINES}
public class EnumMapEntrySet
{
    public static void main(String[] args)
    {
        EnumMap<Transportation,String> map = new EnumMap<Transportation, String>(Transportation.class);
        map.put(Transportation.RAILWAYS,"Trains");
        map.put(Transportation.AIRWAYS,"Aeroplanes");
        map.put(Transportation.WATERWAYS,"Ships");
        map.put(Transportation.ROADWAYS,"Buses");
        map.put(Transportation.PIPELINES,"Pipes and Tubes");
        System.out.println("The Map is "+map);
        System.out.println("The Keys and Values are: ");
        for(Map.Entry<Transportation,String> m : map.entrySet())
        {
            System.out.println(m.getKey()+" : "+m.getValue());
        }
    }
}
