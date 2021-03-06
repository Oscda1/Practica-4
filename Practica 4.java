import java.util.Random;
class mexicano{
    String nombre="";
    String CURP="";
    String RFC="";
    mexicano(String nombre, String CURP, String RFC){
        this.nombre=nombre;
        this.CURP=CURP;
        this.RFC=RFC;
    }
    /**
     * Genera un RFC (Número de Identificación Fiscal Mexicano) aleatorio basado en el nombre y fecha de nacimiento de la persona
     * 
     * @param Papellido Primer apellido
     * @param Sapellido Segundo apellido
     * @param Nombree Nombres
     * @param Fecha Fecha de nacimiento en formato ddmmaa
     */
    public void SetRFC(String Papellido, String Sapellido, String Nombree, String Fecha){
        this.nombre=Nombree+" "+Papellido+" "+Sapellido;
        char[] Vocales = {'a','e','i','o','u'};
        char vApellido=' ';
        char iNombre=' ';
        int y=0;
        char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',};
        String ClaveLetras="";
        String[] ban = {"BACA","BAKA","BUEI","BUEY","CACA","CACO","CAGA","CAGO","CAKA","CAKO","COGE","COGI","COJA","COJE","COJI","COJO","COLA","CULO","FALO","FETO","GETA","GUEI","GUEY","JETA","JOTO","KACA","KACO","KAGA","KAGO","KAKA","KAKO","KOGE","KOGI","KOJA","KOJE","KOJI","KOJO","KOLA","KULO","LILO","LOCA","LOCO","LOKA","LOKO","MAME","MAMO","MEAR","MEAS","MEON","MIAR","MION","MOCO","MOKO","MULA","MULO","NACA","NACO","PEDA","PEDO","PENE","PIPI","PITO","POPO","PUTA","PUTO","QULO","RATA","ROBA","ROBE","ROBO","RUIN","SENO","TETA","VACA","VAGA","VAGO","VAKA","VUEI","VUEY","WUEI","WUEY"};
        Random HomoClave = new Random();
        boolean salida = false;
        String Bloque="";
        ClaveLetras=(""+letras[HomoClave.nextInt(25)]+letras[HomoClave.nextInt(25)]+letras[HomoClave.nextInt(25)]);
        for(int x=0;x<=Papellido.length();x++){
            for(y=0;y<=4;y++){
                if(Vocales[y]==Papellido.charAt(x)){
                    vApellido=Vocales[y];
                    x=Papellido.length()+1;
                    break;
                }
            }
        }
        for(y=0;y<=Papellido.length()-1;y++){
            for(int x=0;x<=Nombree.length();x++){
                if((Nombree.charAt(x)==' ')&&(Nombree.charAt(x+1)!=' ')){
                    String[] dosNombres = Nombree.split(" ");
                    if((dosNombres[0].compareToIgnoreCase("Maria")==0)||(dosNombres[0].compareToIgnoreCase("Jose"))==0){
                        iNombre=dosNombres[1].charAt(0);
                        salida=true;
                    }else{
                        iNombre=dosNombres[0].charAt(0);
                        salida=true;
                    }
                    break;
                }
            }
            if(salida==true){
                break;
            }
        }
        if(y==(Nombree.length()-1)){
            iNombre=Nombree.charAt(0);
        }
        Bloque=(""+Papellido.charAt(0)+vApellido+Sapellido.charAt(0)+iNombre);
        Bloque=Bloque.toUpperCase();
        for(int x=0;x<=ban.length-1;x++){
            if(Bloque==ban[x]){
                vApellido='x';
            }
        }

        this.RFC=(""+Papellido.charAt(0)+vApellido+Sapellido.charAt(0)+iNombre+Fecha+ClaveLetras);
        this.RFC=this.RFC.toUpperCase();
    }
    // Genera el CURP
    public void SetCURP(String Papellido, String Sapellido, String Nombree, String Fecha, char Genero, String Iniciales){
        char[] Vocales = {'a','e','i','o','u'};
        char vApellido=' ';
        char iNombre=' ';
        int y=0;
        String[] ban = {"BACA","BAKA","BUEI","BUEY","CACA","CACO","CAGA","CAGO","CAKA","CAKO","COGE","COGI","COJA","COJE","COJI","COJO","COLA","CULO","FALO","FETO","GETA","GUEI","GUEY","JETA","JOTO","KACA","KACO","KAGA","KAGO","KAKA","KAKO","KOGE","KOGI","KOJA","KOJE","KOJI","KOJO","KOLA","KULO","LILO","LOCA","LOCO","LOKA","LOKO","MAME","MAMO","MEAR","MEAS","MEON","MIAR","MION","MOCO","MOKO","MULA","MULO","NACA","NACO","PEDA","PEDO","PENE","PIPI","PITO","POPO","PUTA","PUTO","QULO","RATA","ROBA","ROBE","ROBO","RUIN","SENO","TETA","VACA","VAGA","VAGO","VAKA","VUEI","VUEY","WUEI","WUEY"};
        Random HomoClave = new Random();
        boolean salida = false;
        String Bloque="";
        char scpApellido=' ';
        char scsApellido=' ';
        char scNombre=' ';
        int loops=0;
        for(int x=0;x<=Papellido.length();x++){
            for(y=0;y<=4;y++){
                if(Vocales[y]==Papellido.charAt(x)){
                    vApellido=Vocales[y];
                    x=Papellido.length()+1;
                    break;
                }
            }
        }
        for(y=0;y<=Papellido.length()-1;y++){
            for(int x=0;x<=Nombree.length()-1;x++){
                if((Nombree.charAt(x)==' ')&&(Nombree.charAt(x+1)!=' ')){
                    String[] dosNombres = Nombree.split(" ");
                    if((dosNombres[0].compareToIgnoreCase("Maria")==0)||(dosNombres[0].compareToIgnoreCase("Jose"))==0){
                        iNombre=dosNombres[1].charAt(0);
                        salida=true;
                    }else{
                        iNombre=dosNombres[0].charAt(0);
                        salida=true;
                    }
                    break;
                }
            }
            if(salida==true){
                break;
            }
        }
        if(y==(Nombree.length()-1)){
            iNombre=Nombree.charAt(0);
        }
        Bloque=(""+Papellido.charAt(0)+vApellido+Sapellido.charAt(0)+iNombre);
        for(int x=0;x<=ban.length-1;x++){
            if(Bloque==ban[x]){
                vApellido='x';
            }
        }
        for(int x=1;x<=Papellido.length()-1;x++){
            for(y=0;y<=4;y++){
                if(Vocales[y]!=Papellido.charAt(x)){
                    if(loops==4){
                        scpApellido=Papellido.charAt(x);
                        x=Papellido.length()+1;
                        break;
                    }else
                    loops+=1;
                    
                }
            }
        }
        loops=0;
        for(int x=1;x<=Sapellido.length()-1;x++){
            for(y=0;y<=4;y++){
                if(Vocales[y]!=Sapellido.charAt(x)){
                    if(loops==4){scsApellido=Sapellido.charAt(x);
                        x=Sapellido.length()+1;
                        break;
                    }else
                    loops+=1;
                }
            }
        }
        loops=0;
        for(int x=1;x<=Nombree.length()-1;x++){
            for(y=0;y<=4;y++){
                if(Vocales[y]!=Nombree.charAt(x)){
                    if(loops==4){
                        scNombre=Nombree.charAt(x);
                        x=Nombree.length()+1;
                        break;
                    }else
                    loops+=1;
                }
            }
        }
        this.CURP=(""+Papellido.charAt(0)+vApellido+Sapellido.charAt(0)+iNombre+Fecha+Genero+Iniciales+scpApellido+scsApellido+scNombre+HomoClave.nextInt(9)+HomoClave.nextInt(9));
        this.CURP=this.CURP.toUpperCase();
    }
    public void Imprimir(int indice){
        indice+=1;
        System.out.println(indice+")Nombre: "+this.nombre+"\nCURP: "+this.CURP+"\nRFC: "+this.RFC+"\n\n");
    }
}

class Practica4{
    public static void main(String[] args){
        mexicano[] Usuario = new mexicano[100];
        int Opcion=0;
        boolean salir=false;
        boolean esmexicano=false;
        boolean correct=false;
        String Nombre = "";
        String pApellido="";
        String sApellido="";
        String dia="";
        String mes="";
        String año="";
        String genero="";
        String[] Iniciales = {"AS","BC","BS","CC","CL","CM","CS","CH","DF","DG","GT","GR","HG","JC","MC","MN","MS","NT","NL","OC","PL","QT","QR","SP","SL","SR","TC","TS","TL","VZ","YN","ZS"};
        String Entidad="";
        String iEntidades="";
        int posicion=0;
        String FFecha="";
        int NC=-1;
        boolean fin=false;
        for(int x=0;x<100;x++){
            Usuario[x] = new mexicano("","","");
        }
        do{
            System.out.println("Que desea hacer?\n1)Capturar nuevo usuario\n2)Imprimir datos de un usuario\n3)Salir");
            switch(Integer.parseInt(System.console().readLine())){
                case 1:
                    do{
                    System.out.println("Usted es mexicano?\n1)Si\n2)No");
                    Opcion = Integer.parseInt(System.console().readLine());
                    switch(Opcion){
                        case 1:
                            esmexicano=true;
                            salir=true;
                            break;
                        case 2:
                            do{
                                System.out.println("Cuenta con residencia mexicana?\n1)Si\n2)No");
                                Opcion = Integer.parseInt(System.console().readLine());
                                switch(Opcion){
                                    case 1:
                                        salir=true;
                                        break;
                                    case 2:
                                        salir=false;
                                        System.out.println("ERROR");
                                    default:
                                        System.out.print("Ingrese una opcion valida\n");
                                        break;
                                }
                            }while(!((Opcion==1)||(Opcion==2)));
                            break;
                        default:
                            System.out.print("Ingrese una opcion valida");
                            break;
                    }
                }while(salir==false);
                NC+=1;
                salir=false;
                System.out.println("Ingrese su primer apellido:");
                pApellido=System.console().readLine();
                System.out.println("Ingrese su segundo apellido");
                sApellido=System.console().readLine();
                System.out.println("Ingrese su nombre(s)");
                Nombre=System.console().readLine();
                Nombre.concat(" ");
                System.out.println("Ingrese su dia de nacimiento");
                dia=System.console().readLine();
                System.out.println("Ingrese su mes de nacimiento");
                mes=System.console().readLine();
                System.out.println("Ingrese su año de nacimiento");
                año=System.console().readLine();
                FFecha=año.substring(1,3)+mes+dia;
                if(esmexicano==true){
                    System.out.println("Ingrese su entidad de nacimiento");
                    iEntidades=Iniciales[indice()];
                }
                else{
                    iEntidades="NE";
                }
                do{
                    System.out.println("Ingrese su genero (hombre o mujer)");
                    genero=System.console().readLine();
                    genero.toLowerCase();
                    System.out.println((genero!="hombre")||(genero!="mujer"));
                }while(!((genero!="hombre")||(genero!="mujer")));
                Usuario[NC].SetRFC(pApellido, sApellido, Nombre, FFecha);
                Usuario[NC].SetCURP(pApellido, sApellido, Nombre, FFecha, genero.charAt(0), iEntidades);
                break;
                case 2:
                    for (int x=0;x<=NC;x++){
                        Usuario[x].Imprimir(x);
                    }
                    break;
                case 3:
                    fin=true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!");
                    break;
            }
        }while(fin==false);
    }
    /**
     * Imprime una lista de estados mexicanos, luego le pide al usuario que elija uno y devuelve el índice de
     * el estado escogido.
     * 
     * @return el indice del arreglo.
     */
    public static int indice(){
        String Estados[] = {"AGUASCALIENTES","BAJA CALIFORNIA","BAJA CALIFORNIA SUR","CAMPECHE","COAHUILA","COLIMA","CHIAPAS","CHIHUAHUA","DISTRITO FEDERAL","DURANGO","GUANAJUATO","GUERRERO","HIDALGO","JALISCO","MEXICO","MICHOACAN","MORELOS","NAYARIT","NUEVO LEON","OAXACA","PUEBLA","QUERETARO","QUINTANA ROO","SAN LUIS POTOSI","SINALOA","SONORA","TABASCO","TAMAULIPAS","TLAXCALA","VERACRUZ","YUCATAN","ZACATECAS"};
        int x=0;
        int numero=0;
        boolean salir=false;
        for(x=0;x<=31;x+=1){
            System.out.println((x+1)+") "+Estados[x]);
        }
        do{
            numero=Integer.parseInt(System.console().readLine())-1;
            if((numero<0)||(numero>31)){
                System.out.println("Ingrese una opcion valida!");
            }else
                salir=true;
        }while(salir==false);
        return (numero);
    }
}