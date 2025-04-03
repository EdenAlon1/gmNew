package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edir {
    private static final enhk a;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(edpz.ACCESSIBILITY_OPTIONS, "accessibilityOptions");
        enhdVar.k(edpz.ADDRESS, "formattedAddress");
        enhdVar.k(edpz.ADDRESS_COMPONENTS, "addressComponents");
        enhdVar.k(edpz.ADR_FORMAT_ADDRESS, "adrFormatAddress");
        enhdVar.k(edpz.ALLOWS_DOGS, "allowsDogs");
        enhdVar.k(edpz.BUSINESS_STATUS, "businessStatus");
        enhdVar.k(edpz.CURBSIDE_PICKUP, "curbsidePickup");
        enhdVar.k(edpz.CURRENT_OPENING_HOURS, "currentOpeningHours");
        enhdVar.k(edpz.CURRENT_SECONDARY_OPENING_HOURS, "currentSecondaryOpeningHours");
        enhdVar.k(edpz.DELIVERY, "delivery");
        enhdVar.k(edpz.DINE_IN, "dineIn");
        enhdVar.k(edpz.DISPLAY_NAME, "displayName");
        enhdVar.k(edpz.EDITORIAL_SUMMARY, "editorialSummary");
        enhdVar.k(edpz.EV_CHARGE_OPTIONS, "evChargeOptions");
        enhdVar.k(edpz.FORMATTED_ADDRESS, "formattedAddress");
        enhdVar.k(edpz.FUEL_OPTIONS, "fuelOptions");
        enhdVar.k(edpz.GOOD_FOR_CHILDREN, "goodForChildren");
        enhdVar.k(edpz.GOOD_FOR_GROUPS, "goodForGroups");
        enhdVar.k(edpz.GOOD_FOR_WATCHING_SPORTS, "goodForWatchingSports");
        enhdVar.k(edpz.GOOGLE_MAPS_URI, "googleMapsUri");
        enhdVar.k(edpz.ICON_BACKGROUND_COLOR, "iconBackgroundColor");
        enhdVar.k(edpz.ICON_MASK_URL, "iconMaskBaseUri");
        enhdVar.k(edpz.ICON_URL, "iconMaskBaseUri");
        enhdVar.k(edpz.ID, "id");
        enhdVar.k(edpz.INTERNATIONAL_PHONE_NUMBER, "internationalPhoneNumber");
        enhdVar.k(edpz.LAT_LNG, "location");
        enhdVar.k(edpz.LIVE_MUSIC, "liveMusic");
        enhdVar.k(edpz.LOCATION, "location");
        enhdVar.k(edpz.MENU_FOR_CHILDREN, "menuForChildren");
        enhdVar.k(edpz.NAME, "displayName");
        enhdVar.k(edpz.NATIONAL_PHONE_NUMBER, "nationalPhoneNumber");
        enhdVar.k(edpz.OPENING_HOURS, "regularOpeningHours");
        enhdVar.k(edpz.OUTDOOR_SEATING, "outdoorSeating");
        enhdVar.k(edpz.PARKING_OPTIONS, "parkingOptions");
        enhdVar.k(edpz.PAYMENT_OPTIONS, "paymentOptions");
        enhdVar.k(edpz.PHONE_NUMBER, "internationalPhoneNumber");
        enhdVar.k(edpz.PHOTO_METADATAS, "photos");
        enhdVar.k(edpz.PLUS_CODE, "plusCode");
        enhdVar.k(edpz.PRICE_LEVEL, "priceLevel");
        enhdVar.k(edpz.PRIMARY_TYPE, "primaryType");
        enhdVar.k(edpz.PRIMARY_TYPE_DISPLAY_NAME, "primaryTypeDisplayName");
        enhdVar.k(edpz.RATING, "rating");
        enhdVar.k(edpz.RESERVABLE, "reservable");
        enhdVar.k(edpz.RESOURCE_NAME, "name");
        enhdVar.k(edpz.RESTROOM, "restroom");
        enhdVar.k(edpz.REVIEWS, "reviews");
        enhdVar.k(edpz.SECONDARY_OPENING_HOURS, "regularSecondaryOpeningHours");
        enhdVar.k(edpz.SERVES_BEER, "servesBeer");
        enhdVar.k(edpz.SERVES_BREAKFAST, "servesBreakfast");
        enhdVar.k(edpz.SERVES_BRUNCH, "servesBrunch");
        enhdVar.k(edpz.SERVES_COCKTAILS, "servesCocktails");
        enhdVar.k(edpz.SERVES_COFFEE, "servesCoffee");
        enhdVar.k(edpz.SERVES_DESSERT, "servesDessert");
        enhdVar.k(edpz.SERVES_DINNER, "servesDinner");
        enhdVar.k(edpz.SERVES_LUNCH, "servesLunch");
        enhdVar.k(edpz.SERVES_VEGETARIAN_FOOD, "servesVegetarianFood");
        enhdVar.k(edpz.SERVES_WINE, "servesWine");
        enhdVar.k(edpz.SHORT_FORMATTED_ADDRESS, "shortFormattedAddress");
        enhdVar.k(edpz.SUB_DESTINATIONS, "subDestinations");
        enhdVar.k(edpz.TAKEOUT, "takeout");
        enhdVar.k(edpz.TYPES, "types");
        enhdVar.k(edpz.USER_RATINGS_TOTAL, "userRatingCount");
        enhdVar.k(edpz.USER_RATING_COUNT, "userRatingCount");
        enhdVar.k(edpz.UTC_OFFSET, "utcOffsetMinutes");
        enhdVar.k(edpz.VIEWPORT, "viewport");
        enhdVar.k(edpz.WEBSITE_URI, "websiteUri");
        enhdVar.k(edpz.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "accessibilityOptions");
        a = enhdVar.c();
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
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
