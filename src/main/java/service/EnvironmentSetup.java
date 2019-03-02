package service;

public class EnvironmentSetup {

    private static String mavenProperty;

    public static String executeOnEnv;


    public static String environmnetSelector() {
        mavenProperty = System.getProperty("env");
        if (mavenProperty == null)
            executeOnEnv = "dev";
        else if (mavenProperty.equals("qa"))
            executeOnEnv = "qa";
        else if (mavenProperty.equals("stg"))
            executeOnEnv = "stg";
        else if (mavenProperty.equals("prod"))
            executeOnEnv = "prod";
        return executeOnEnv;
    }
}
