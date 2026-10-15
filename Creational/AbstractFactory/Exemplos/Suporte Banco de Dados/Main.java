public class Main {
    public static void main(String[] args) {

        String bancoConfigurado = "POSTGREESQL";
        DBFFactory fabrica = null;

        if(bancoConfigurado.equalsIgnoreCase("MYSQL")){
            fabrica = new MySQLFactory();
        }else if(bancoConfigurado.equalsIgnoreCase("POSTGREESQL")){
            fabrica = new MyPostgreeFactory();
        }else{
            System.out.println("Banco não suportado");
        }
        
        Application application = new Application(fabrica);
        application.executar("SELECT * FROM usuarios");

    }

}
