package application;

public class multiDimesionArray {

    public static void main(String[] args){
    var groups = new String[][]{
            {"Luffy","Zoro","Sanji"},
            {"BigMom","Katakuri","Daifuku"},
            {"Kaido", "King", "Queen"},
            {"Roger","Rayleigh","Oden"}
    };

    for(int i = 0; i< groups.length; i++){
//        String[] names = groups[i];
            for(int j=0; j<groups[i].length;j++){
//                System.out.println("Group" + j);
                System.out.printf("%s\t",groups[i][j]);
            }
            System.out.println();
    }
}
}
