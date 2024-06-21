/*
* Packages in java
*   A java package is a group of similar types of classes, interfaces and sub-packages.
*   Package in java can be categorized in two form, built-in package and user-defined package.
*   There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
* */
import myPack.*;

public class PackageDemo {
	public static void main(String[] args ){
		ImportPackage p = new ImportPackage();
		p.show();
		ImportPackage p1 = new ImportPackage("Packagee", 20);
		p1.show();

	}
}