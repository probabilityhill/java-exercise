public class Main {
	public static void main(String[] args) { 
        System.out.println(getPath("c:\\javadev", "readme.txt"));  // 確認用
	}
    public static String getPath(String folder, String file) {
        // 「\」が末尾にない場合は追加する
        if (!folder.endsWith("\\")) {
             folder += "\\";
        }
        return folder + file;
    }
}
