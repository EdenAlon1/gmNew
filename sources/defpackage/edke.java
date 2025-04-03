package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edke {
    private static final enhk a;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(edpz.ADDRESS, "formatted_address");
        enhdVar.k(edpz.ADDRESS_COMPONENTS, "address_components");
        enhdVar.k(edpz.BUSINESS_STATUS, "business_status");
        enhdVar.k(edpz.CURBSIDE_PICKUP, "curbside_pickup");
        enhdVar.k(edpz.CURRENT_OPENING_HOURS, "current_opening_hours");
        enhdVar.k(edpz.DELIVERY, "delivery");
        enhdVar.k(edpz.DINE_IN, "dine_in");
        enhdVar.k(edpz.DISPLAY_NAME, "name");
        enhdVar.k(edpz.EDITORIAL_SUMMARY, "editorial_summary");
        enhdVar.k(edpz.FORMATTED_ADDRESS, "formatted_address");
        enhdVar.k(edpz.ICON_BACKGROUND_COLOR, "icon_background_color");
        enhdVar.k(edpz.ICON_MASK_URL, "icon_mask_base_uri");
        enhdVar.k(edpz.ICON_URL, "icon_mask_base_uri");
        enhdVar.k(edpz.ID, "place_id");
        enhdVar.k(edpz.INTERNATIONAL_PHONE_NUMBER, "international_phone_number");
        enhdVar.k(edpz.LAT_LNG, "geometry/location");
        enhdVar.k(edpz.LOCATION, "geometry/location");
        enhdVar.k(edpz.NAME, "name");
        enhdVar.k(edpz.OPENING_HOURS, "opening_hours");
        enhdVar.k(edpz.PHONE_NUMBER, "international_phone_number");
        enhdVar.k(edpz.PHOTO_METADATAS, "photos");
        enhdVar.k(edpz.PLUS_CODE, "plus_code");
        enhdVar.k(edpz.PRICE_LEVEL, "price_level");
        enhdVar.k(edpz.RATING, "rating");
        enhdVar.k(edpz.RESERVABLE, "reservable");
        enhdVar.k(edpz.SECONDARY_OPENING_HOURS, "secondary_opening_hours");
        enhdVar.k(edpz.SERVES_BEER, "serves_beer");
        enhdVar.k(edpz.SERVES_BREAKFAST, "serves_breakfast");
        enhdVar.k(edpz.SERVES_BRUNCH, "serves_brunch");
        enhdVar.k(edpz.SERVES_DINNER, "serves_dinner");
        enhdVar.k(edpz.SERVES_LUNCH, "serves_lunch");
        enhdVar.k(edpz.SERVES_VEGETARIAN_FOOD, "serves_vegetarian_food");
        enhdVar.k(edpz.SERVES_WINE, "serves_wine");
        enhdVar.k(edpz.TAKEOUT, "takeout");
        enhdVar.k(edpz.TYPES, "types");
        enhdVar.k(edpz.USER_RATINGS_TOTAL, "user_ratings_total");
        enhdVar.k(edpz.USER_RATING_COUNT, "user_ratings_total");
        enhdVar.k(edpz.UTC_OFFSET, "utc_offset");
        enhdVar.k(edpz.VIEWPORT, "geometry/viewport");
        enhdVar.k(edpz.WEBSITE_URI, "website");
        enhdVar.k(edpz.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "wheelchair_accessible_entrance");
        a = enhdVar.c();
    }

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) a.get((edpz) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) a.get((edpz) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
