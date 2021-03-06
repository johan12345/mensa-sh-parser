package de.mensa.sh.core;

/**
 * Class with settings
 * @author hannes
 *
 */
public class Settings {

	public static String sh_mensa_url = "http://studentenwerk-s-h.de";
	public static String sh_mensa_overview = "http://studentenwerk-s-h.de/seiten_essen/essen_plaene.html";	
	public static String sh_mensa_css = "http://studentenwerk-s-h.de/css_stile/";
	public static String sh_mensa_meal_db_api_url = "http://192.168.0.106/mensash/api.php";
	
	public static String sh_mensa_meal_img_url = "http://studentenwerk-s-h.de/bilder/bilder_essen/";
	public static String sh_mensa_meal_img_pig = "logo_schwein.png";
	public static String sh_mensa_meal_img_cow = "logo_rind.png";
	public static String sh_mensa_meal_img_vegetarian = "logo_vegetarisch.png";
	public static String sh_mensa_meal_img_vegan = "logo_vegan.png";
	public static String sh_mensa_meal_img_alc = "logo_alkohol.png";
	
	/**
	 * @param cssFile
	 * @param baseURL
	 * @return html link of css file with a specific base url
	 */
	public static String getCssLink(String baseURL, String cssFile){
		return "<link href=\"" + sh_mensa_css + cssFile
				+ "\" rel=\"stylesheet\" type=\"text/css\" />\n";
	}
	
	/**
	 * @param cssFile
	 * @return html link of css file with basic base url
	 */
	public static String getCssLink(String cssFile){
		return getCssLink(sh_mensa_css, cssFile);
	}
	
	/**
	 * @return inline css for replacing content of css files
	 */
	public static String getInlineCss(){
		return "<style type=\"text/css\">body{"
				+ "background-image: none;"
				+ "background-color: #eeeeee;"
				+ "}"
				+ "</style>";
	}
	
}
