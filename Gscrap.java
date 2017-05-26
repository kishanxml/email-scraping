package gscrap;

import com.jaunt.Elements;
import com.jaunt.UserAgent;
import com.jaunt.Element;

public class Gscrap {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UserAgent userAgent = new UserAgent();         //create new userAgent (headless browser)
            userAgent.visit("https://clutch.co/web-developers?sort_bef_combine=field_pp_total_reviews_value+DESC&field_pp_min_project_size_value=All&field_pp_hrly_rate_range_value=All&field_pp_size_people_value=All&field_pp_cs_small_biz_value=&field_pp_cs_midmarket_value=&field_pp_cs_enterprise_value=&client_focus=&field_pp_if_advertising_value=&field_pp_if_automotive_value=&field_pp_if_arts_value=&field_pp_if_bizservices_value=&field_pp_if_conproducts_value=&field_pp_if_education_value=&field_pp_if_natural_resources_value=&field_pp_if_finservices_value=&field_pp_if_gambling_value=&field_pp_if_gaming_value=&field_pp_if_government_value=&field_pp_if_healthcare_value=&field_pp_if_hospitality_value=&field_pp_if_it_value=&field_pp_if_legal_value=&field_pp_if_manufacturing_value=&field_pp_if_media_value=&field_pp_if_nonprofit_value=&field_pp_if_realestate_value=&field_pp_if_retail_value=&field_pp_if_telecom_value=&field_pp_if_transportation_value=&field_pp_if_utilities_value=&field_pp_if_other_value=&industry_focus=&country=All&state=&distance%5Bpostal_code%5D=&distance%5Bcountry%5D=us&distance%5Bsearch_distance%5D=100&distance%5Bsearch_units%5D=mile");          //visit google
            Elements elist = userAgent.doc.findEvery("<div class=\"provider-row\">");//findEvery("<li class=\"website-link website-link-a\"");

//            System.out.println(userAgent.doc.innerHTML());^
            for (Element e : elist) {

                System.out.print(e.findFirst("<li class=\"website-link website-link-a\"").findFirst("<a").getAt("href"));
                System.out.println(" |>>| "+e.findFirst("<script>").innerHTML());

//                System.out.println(elist.("href"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
