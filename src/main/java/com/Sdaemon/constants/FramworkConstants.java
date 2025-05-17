package com.Sdaemon.constants;

import com.Sdaemon.Enums.ConfigProperies;
import com.Sdaemon.Utils.PropertyUtil;

public class FramworkConstants {

    private FramworkConstants(){}
    //

    private static  final String RESOURCEPATH = System.getProperty("user.dir")+"/src/main/resources";
    private static final String CONFIGPATH = RESOURCEPATH+"/config.prop";
    private static String extentreportFilePath = "";
    private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+"/extent-test-output/ExtentReport.html";


    public static final String getConfigFilepath()
    {
        return  CONFIGPATH;
    }

    public static String getExtentreportFilePath() throws Exception
    {
        if (extentreportFilePath.isEmpty()){

            extentreportFilePath = createReportPath();
    }
        return extentreportFilePath;
    }

    private static String createReportPath() throws Exception
    {
        if (PropertyUtil.get(ConfigProperies.OVERRIDEREPORTS).equalsIgnoreCase("no")){
           return  EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
        }
        else {

            return EXTENTREPORTFOLDERPATH+"/index.html";
    }
    }

    private static final int EXPLICITWAIT = 20;

    public static int getExplicitwait() {
        return EXPLICITWAIT;
    }
}






