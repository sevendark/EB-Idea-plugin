package com.sevendark.ai.plugin.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public interface Constant {
   String GROUP_NAME = "com.sevendark.ai.plugin.GroupedActions";
   String VAR = ".*[a-z].*";
   String STR = "^\"[^\"]+\"$";
   String NUM = "\\d+";
   String METHOD = "\\.?(([a-zA-Z0-9_]+)\\.)*[a-zA-Z_]+\\(?";
   String JAVA_COMMENT = "//[\\S ]*";
   List<String> supportLanuage = new ArrayList<String>(){{
      add("JAVA");
      add("Scala");
   }};

   @SuppressWarnings("ResultOfMethodCallIgnored")
   static void test(){
     Pattern.compile(METHOD + VAR + STR + JAVA_COMMENT + NUM);
   }

}
