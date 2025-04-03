package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import defpackage.edkb;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edjz {
    public static final /* synthetic */ int a = 0;
    private static final enhk b;
    private static final enhk c;
    private static final enhk d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("OPERATIONAL", edpx.OPERATIONAL);
        enhdVar.k("CLOSED_TEMPORARILY", edpx.CLOSED_TEMPORARILY);
        enhdVar.k("CLOSED_PERMANENTLY", edpx.CLOSED_PERMANENTLY);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("accounting", edqb.ACCOUNTING);
        enhdVar2.k("administrative_area_level_1", edqb.ADMINISTRATIVE_AREA_LEVEL_1);
        enhdVar2.k("administrative_area_level_2", edqb.ADMINISTRATIVE_AREA_LEVEL_2);
        enhdVar2.k("administrative_area_level_3", edqb.ADMINISTRATIVE_AREA_LEVEL_3);
        enhdVar2.k("administrative_area_level_4", edqb.ADMINISTRATIVE_AREA_LEVEL_4);
        enhdVar2.k("administrative_area_level_5", edqb.ADMINISTRATIVE_AREA_LEVEL_5);
        enhdVar2.k("airport", edqb.AIRPORT);
        enhdVar2.k("amusement_park", edqb.AMUSEMENT_PARK);
        enhdVar2.k("aquarium", edqb.AQUARIUM);
        enhdVar2.k("archipelago", edqb.ARCHIPELAGO);
        enhdVar2.k("art_gallery", edqb.ART_GALLERY);
        enhdVar2.k("atm", edqb.ATM);
        enhdVar2.k("bakery", edqb.BAKERY);
        enhdVar2.k("bank", edqb.BANK);
        enhdVar2.k("bar", edqb.BAR);
        enhdVar2.k("beauty_salon", edqb.BEAUTY_SALON);
        enhdVar2.k("bicycle_store", edqb.BICYCLE_STORE);
        enhdVar2.k("book_store", edqb.BOOK_STORE);
        enhdVar2.k("bowling_alley", edqb.BOWLING_ALLEY);
        enhdVar2.k("bus_station", edqb.BUS_STATION);
        enhdVar2.k("cafe", edqb.CAFE);
        enhdVar2.k("campground", edqb.CAMPGROUND);
        enhdVar2.k("car_dealer", edqb.CAR_DEALER);
        enhdVar2.k("car_rental", edqb.CAR_RENTAL);
        enhdVar2.k("car_repair", edqb.CAR_REPAIR);
        enhdVar2.k("car_wash", edqb.CAR_WASH);
        enhdVar2.k("casino", edqb.CASINO);
        enhdVar2.k("cemetery", edqb.CEMETERY);
        enhdVar2.k("church", edqb.CHURCH);
        enhdVar2.k("city_hall", edqb.CITY_HALL);
        enhdVar2.k("clothing_store", edqb.CLOTHING_STORE);
        enhdVar2.k("colloquial_area", edqb.COLLOQUIAL_AREA);
        enhdVar2.k("continent", edqb.CONTINENT);
        enhdVar2.k("convenience_store", edqb.CONVENIENCE_STORE);
        enhdVar2.k("country", edqb.COUNTRY);
        enhdVar2.k("courthouse", edqb.COURTHOUSE);
        enhdVar2.k("dentist", edqb.DENTIST);
        enhdVar2.k("department_store", edqb.DEPARTMENT_STORE);
        enhdVar2.k("doctor", edqb.DOCTOR);
        enhdVar2.k("drugstore", edqb.DRUGSTORE);
        enhdVar2.k("electrician", edqb.ELECTRICIAN);
        enhdVar2.k("electronics_store", edqb.ELECTRONICS_STORE);
        enhdVar2.k("embassy", edqb.EMBASSY);
        enhdVar2.k("establishment", edqb.ESTABLISHMENT);
        enhdVar2.k("finance", edqb.FINANCE);
        enhdVar2.k("fire_station", edqb.FIRE_STATION);
        enhdVar2.k("floor", edqb.FLOOR);
        enhdVar2.k("florist", edqb.FLORIST);
        enhdVar2.k("food", edqb.FOOD);
        enhdVar2.k("funeral_home", edqb.FUNERAL_HOME);
        enhdVar2.k("furniture_store", edqb.FURNITURE_STORE);
        enhdVar2.k("gas_station", edqb.GAS_STATION);
        enhdVar2.k("general_contractor", edqb.GENERAL_CONTRACTOR);
        enhdVar2.k("geocode", edqb.GEOCODE);
        enhdVar2.k("grocery_or_supermarket", edqb.GROCERY_OR_SUPERMARKET);
        enhdVar2.k("gym", edqb.GYM);
        enhdVar2.k("hair_care", edqb.HAIR_CARE);
        enhdVar2.k("hardware_store", edqb.HARDWARE_STORE);
        enhdVar2.k("health", edqb.HEALTH);
        enhdVar2.k("hindu_temple", edqb.HINDU_TEMPLE);
        enhdVar2.k("home_goods_store", edqb.HOME_GOODS_STORE);
        enhdVar2.k("hospital", edqb.HOSPITAL);
        enhdVar2.k("insurance_agency", edqb.INSURANCE_AGENCY);
        enhdVar2.k("intersection", edqb.INTERSECTION);
        enhdVar2.k("jewelry_store", edqb.JEWELRY_STORE);
        enhdVar2.k("laundry", edqb.LAUNDRY);
        enhdVar2.k("lawyer", edqb.LAWYER);
        enhdVar2.k("library", edqb.LIBRARY);
        enhdVar2.k("light_rail_station", edqb.LIGHT_RAIL_STATION);
        enhdVar2.k("liquor_store", edqb.LIQUOR_STORE);
        enhdVar2.k("local_government_office", edqb.LOCAL_GOVERNMENT_OFFICE);
        enhdVar2.k("locality", edqb.LOCALITY);
        enhdVar2.k("locksmith", edqb.LOCKSMITH);
        enhdVar2.k("lodging", edqb.LODGING);
        enhdVar2.k("meal_delivery", edqb.MEAL_DELIVERY);
        enhdVar2.k("meal_takeaway", edqb.MEAL_TAKEAWAY);
        enhdVar2.k("mosque", edqb.MOSQUE);
        enhdVar2.k("movie_rental", edqb.MOVIE_RENTAL);
        enhdVar2.k("movie_theater", edqb.MOVIE_THEATER);
        enhdVar2.k("moving_company", edqb.MOVING_COMPANY);
        enhdVar2.k("museum", edqb.MUSEUM);
        enhdVar2.k("natural_feature", edqb.NATURAL_FEATURE);
        enhdVar2.k("neighborhood", edqb.NEIGHBORHOOD);
        enhdVar2.k("night_club", edqb.NIGHT_CLUB);
        enhdVar2.k("painter", edqb.PAINTER);
        enhdVar2.k("park", edqb.PARK);
        enhdVar2.k("parking", edqb.PARKING);
        enhdVar2.k("pet_store", edqb.PET_STORE);
        enhdVar2.k("pharmacy", edqb.PHARMACY);
        enhdVar2.k("physiotherapist", edqb.PHYSIOTHERAPIST);
        enhdVar2.k("place_of_worship", edqb.PLACE_OF_WORSHIP);
        enhdVar2.k("plumber", edqb.PLUMBER);
        enhdVar2.k("plus_code", edqb.PLUS_CODE);
        enhdVar2.k("point_of_interest", edqb.POINT_OF_INTEREST);
        enhdVar2.k("police", edqb.POLICE);
        enhdVar2.k("political", edqb.POLITICAL);
        enhdVar2.k("post_box", edqb.POST_BOX);
        enhdVar2.k("post_office", edqb.POST_OFFICE);
        enhdVar2.k("postal_code_prefix", edqb.POSTAL_CODE_PREFIX);
        enhdVar2.k("postal_code_suffix", edqb.POSTAL_CODE_SUFFIX);
        enhdVar2.k("postal_code", edqb.POSTAL_CODE);
        enhdVar2.k("postal_town", edqb.POSTAL_TOWN);
        enhdVar2.k("premise", edqb.PREMISE);
        enhdVar2.k("primary_school", edqb.PRIMARY_SCHOOL);
        enhdVar2.k("real_estate_agency", edqb.REAL_ESTATE_AGENCY);
        enhdVar2.k("restaurant", edqb.RESTAURANT);
        enhdVar2.k("roofing_contractor", edqb.ROOFING_CONTRACTOR);
        enhdVar2.k("room", edqb.ROOM);
        enhdVar2.k("route", edqb.ROUTE);
        enhdVar2.k("rv_park", edqb.RV_PARK);
        enhdVar2.k("school", edqb.SCHOOL);
        enhdVar2.k("secondary_school", edqb.SECONDARY_SCHOOL);
        enhdVar2.k("shoe_store", edqb.SHOE_STORE);
        enhdVar2.k("shopping_mall", edqb.SHOPPING_MALL);
        enhdVar2.k("spa", edqb.SPA);
        enhdVar2.k("stadium", edqb.STADIUM);
        enhdVar2.k("storage", edqb.STORAGE);
        enhdVar2.k("store", edqb.STORE);
        enhdVar2.k("street_address", edqb.STREET_ADDRESS);
        enhdVar2.k("street_number", edqb.STREET_NUMBER);
        enhdVar2.k("sublocality_level_1", edqb.SUBLOCALITY_LEVEL_1);
        enhdVar2.k("sublocality_level_2", edqb.SUBLOCALITY_LEVEL_2);
        enhdVar2.k("sublocality_level_3", edqb.SUBLOCALITY_LEVEL_3);
        enhdVar2.k("sublocality_level_4", edqb.SUBLOCALITY_LEVEL_4);
        enhdVar2.k("sublocality_level_5", edqb.SUBLOCALITY_LEVEL_5);
        enhdVar2.k("sublocality", edqb.SUBLOCALITY);
        enhdVar2.k("subpremise", edqb.SUBPREMISE);
        enhdVar2.k("subway_station", edqb.SUBWAY_STATION);
        enhdVar2.k("supermarket", edqb.SUPERMARKET);
        enhdVar2.k("synagogue", edqb.SYNAGOGUE);
        enhdVar2.k("taxi_stand", edqb.TAXI_STAND);
        enhdVar2.k("tourist_attraction", edqb.TOURIST_ATTRACTION);
        enhdVar2.k("town_square", edqb.TOWN_SQUARE);
        enhdVar2.k("train_station", edqb.TRAIN_STATION);
        enhdVar2.k("transit_station", edqb.TRANSIT_STATION);
        enhdVar2.k("travel_agency", edqb.TRAVEL_AGENCY);
        enhdVar2.k("university", edqb.UNIVERSITY);
        enhdVar2.k("veterinary_care", edqb.VETERINARY_CARE);
        enhdVar2.k("zoo", edqb.ZOO);
        c = enhdVar2.c();
        enhd enhdVar3 = new enhd();
        enhdVar3.k("ACCESS", edph.ACCESS);
        enhdVar3.k("BREAKFAST", edph.BREAKFAST);
        enhdVar3.k("BRUNCH", edph.BRUNCH);
        enhdVar3.k("DELIVERY", edph.DELIVERY);
        enhdVar3.k("DINNER", edph.DINNER);
        enhdVar3.k("DRIVE_THROUGH", edph.DRIVE_THROUGH);
        enhdVar3.k("HAPPY_HOUR", edph.HAPPY_HOUR);
        enhdVar3.k("KITCHEN", edph.KITCHEN);
        enhdVar3.k("LUNCH", edph.LUNCH);
        enhdVar3.k("ONLINE_SERVICE_HOURS", edph.ONLINE_SERVICE_HOURS);
        enhdVar3.k("PICKUP", edph.PICKUP);
        enhdVar3.k("SENIOR_HOURS", edph.SENIOR_HOURS);
        enhdVar3.k("TAKEOUT", edph.TAKEOUT);
        d = enhdVar3.c();
    }

    static edpb a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return edpb.e(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format("Unable to convert %s to LocalDate; date should be in format YYYY-MM-DD.", str), e);
        }
    }

    static edpu b(Boolean bool) {
        return bool == null ? edpu.UNKNOWN : bool.booleanValue() ? edpu.TRUE : edpu.FALSE;
    }

    static edqn c(edkb.d.c cVar) {
        edor edorVar;
        edpb edpbVar = null;
        if (cVar == null) {
            return null;
        }
        try {
            Integer num = cVar.day;
            num.getClass();
            String str = cVar.time;
            str.getClass();
            boolean z = true;
            String format = String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", str);
            if (str.length() != 4) {
                z = false;
            }
            emxf.b(z, format);
            try {
                edpc c2 = edpc.c(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)));
                try {
                    edpbVar = a(cVar.date);
                } catch (IllegalArgumentException unused) {
                }
                switch (num.intValue()) {
                    case 0:
                        edorVar = edor.SUNDAY;
                        break;
                    case 1:
                        edorVar = edor.MONDAY;
                        break;
                    case 2:
                        edorVar = edor.TUESDAY;
                        break;
                    case 3:
                        edorVar = edor.WEDNESDAY;
                        break;
                    case 4:
                        edorVar = edor.THURSDAY;
                        break;
                    case 5:
                        edorVar = edor.FRIDAY;
                        break;
                    case 6:
                        edorVar = edor.SATURDAY;
                        break;
                    default:
                        throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
                }
                edqm e = edqn.e(edorVar, c2);
                ((edme) e).a = edpbVar;
                e.b(Boolean.TRUE.equals(cVar.truncated));
                return e.a();
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(format, e2);
            }
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException(e3.getMessage(), e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0228, code lost:
    
        if (r6.isEmpty() != false) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final defpackage.edqc d(defpackage.edkb r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edjz.d(edkb, java.util.List):edqc");
    }

    private static dfqu e(String str) {
        return new dfqu(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static LatLng f(edkb.c.a aVar) {
        if (aVar == null) {
            return null;
        }
        Double d2 = aVar.lat;
        Double d3 = aVar.lng;
        if (d2 == null || d3 == null) {
            return null;
        }
        return new LatLng(d2.doubleValue(), d3.doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static edpi g(edkb.d dVar) {
        engw engwVar;
        ArrayList arrayList;
        edqk a2;
        edpq edpqVar;
        if (dVar == null) {
            return null;
        }
        edpf e = edpi.e();
        edkb.d.a[] aVarArr = dVar.periods;
        if (aVarArr != null) {
            engwVar = engw.p(aVarArr);
        } else {
            int i = engw.d;
            engwVar = enou.a;
        }
        if (engwVar.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            enqv it = engwVar.iterator();
            while (it.hasNext()) {
                edkb.d.a aVar = (edkb.d.a) it.next();
                if (aVar != null) {
                    edlp edlpVar = new edlp();
                    edlpVar.a = c(aVar.open);
                    edlpVar.b = c(aVar.close);
                    edpqVar = edlpVar.a();
                } else {
                    edpqVar = null;
                }
                h(arrayList, edpqVar);
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        e.b(arrayList);
        String[] strArr = dVar.weekdayText;
        e.d(strArr != null ? engw.p(strArr) : enou.a);
        ((edlj) e).a = (edph) d.getOrDefault(dVar.type, null);
        edkb.d.b[] bVarArr = dVar.specialDays;
        engw p = bVarArr != null ? engw.p(bVarArr) : enou.a;
        ArrayList arrayList2 = new ArrayList();
        if (!p.isEmpty()) {
            enqv it2 = p.iterator();
            while (it2.hasNext()) {
                edkb.d.b bVar = (edkb.d.b) it2.next();
                if (bVar != null) {
                    try {
                        edpb a3 = a(bVar.date);
                        a3.getClass();
                        edqj c2 = edqk.c(a3);
                        c2.b(Boolean.TRUE.equals(bVar.exceptionalHours));
                        a2 = c2.a();
                    } catch (IllegalArgumentException | NullPointerException unused) {
                    }
                    h(arrayList2, a2);
                }
                a2 = null;
                h(arrayList2, a2);
            }
        }
        e.c(arrayList2);
        return e.e();
    }

    private static void h(Collection collection, Object obj) {
        if (obj != null) {
            collection.add(obj);
        }
    }
}
