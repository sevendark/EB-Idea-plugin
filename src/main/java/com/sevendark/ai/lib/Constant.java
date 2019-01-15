package com.sevendark.ai.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public interface Constant {
   String GROUP_NAME = "com.sevendark.ai.plugin.GroupedActions";
   String VAR = "(\\w*[a-z]+\\w*\\.?)+";
   String METHOD = "(([a-zA-Z0-9_]+\\.[a-zA-Z0-9_]+)\\.)?[a-zA-Z_]+\\(?";
   List<String> supportLanuage = new ArrayList<String>(){{
      add("JAVA");
      add("Scala");
   }};

   static void test(){
     Pattern.compile(METHOD + VAR + VAR);
   }
}