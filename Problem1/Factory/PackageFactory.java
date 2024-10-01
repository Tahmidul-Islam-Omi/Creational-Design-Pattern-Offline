class PackageFactory {
    public static Package createPackage(String packageType, InternetConnection internetConnection,
            WebServer webServer) {
        switch (packageType) {
            case "Basic":
                return new BasicPackage(internetConnection, webServer);
            case "Standard":
                return new StandardPackage(internetConnection, webServer);
            case "Advanced":
                return new AdvancedPackage(internetConnection, webServer);
            case "Premium":
                return new PremiumPackage(internetConnection, webServer);
            default:
                return null;
        }
    }
}