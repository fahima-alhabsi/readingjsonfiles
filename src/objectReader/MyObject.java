package objectReader;

import java.util.List;

public class MyObject {
	
	  private String name;
	    private String country;
	    private String website;

	    // Getter and setter methods for the variables
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    public String getWebsite() {
	        return website;
	    }

	    public void setWebsite(String website) {
	        this.website = website;
	    }
	
	
	
	    String stateProvince;
	    List<String> domains;
	    List<String> web_pages;
	    String alpha_two_code;
	    /**
	     * @return the stateProvince
	     */
	    public String getStateProvince() {
	    return stateProvince;
	    }
	    /**
	     * @param stateProvince the stateProvince to set
	     */
	    public void setStateProvince(String stateProvince) {
	    this.stateProvince = stateProvince;
	    }
	    /**
	     * @return the domains
	     */
	    public List<String> getDomains() {
	    return domains;
	    }
	    /**
	     * @param domains the domains to set
	     */
	    public void setDomains(List<String> domains) {
	    this.domains = domains;
	    }
	    /**
	     * @return the web_pages
	     */
	    public List<String> getWeb_pages() {
	    return web_pages;
	    }
	    /**
	     * @param web_pages the web_pages to set
	     */
	    public void setWeb_pages(List<String> web_pages) {
	    this.web_pages = web_pages;
	    }
	    /**
	     * @return the alpha_two_code
	     */
	    public String getAlpha_two_code() {
	    return alpha_two_code;
	    }
	    /**
	     * @param alpha_two_code the alpha_two_code to set
	     */
	    public void setAlpha_two_code(String alpha_two_code) {
	    this.alpha_two_code = alpha_two_code;
	    }
}
