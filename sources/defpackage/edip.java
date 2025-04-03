package defpackage;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edip {
    public final enhk a;
    public final enhk b;
    private final edis c;
    private final enhk d;
    private final enhk e;

    public edip(edis edisVar) {
        enhd enhdVar = new enhd();
        enhdVar.k(exhz.OPERATIONAL, edpx.OPERATIONAL);
        enhdVar.k(exhz.CLOSED_TEMPORARILY, edpx.CLOSED_TEMPORARILY);
        enhdVar.k(exhz.CLOSED_PERMANENTLY, edpx.CLOSED_PERMANENTLY);
        this.d = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k(exif.ACCESS, edph.ACCESS);
        enhdVar2.k(exif.BREAKFAST, edph.BREAKFAST);
        enhdVar2.k(exif.BRUNCH, edph.BRUNCH);
        enhdVar2.k(exif.DELIVERY, edph.DELIVERY);
        enhdVar2.k(exif.DINNER, edph.DINNER);
        enhdVar2.k(exif.DRIVE_THROUGH, edph.DRIVE_THROUGH);
        enhdVar2.k(exif.HAPPY_HOUR, edph.HAPPY_HOUR);
        enhdVar2.k(exif.KITCHEN, edph.KITCHEN);
        enhdVar2.k(exif.LUNCH, edph.LUNCH);
        enhdVar2.k(exif.ONLINE_SERVICE_HOURS, edph.ONLINE_SERVICE_HOURS);
        enhdVar2.k(exif.PICKUP, edph.PICKUP);
        enhdVar2.k(exif.SENIOR_HOURS, edph.SENIOR_HOURS);
        enhdVar2.k(exif.TAKEOUT, edph.TAKEOUT);
        this.e = enhdVar2.c();
        enhd enhdVar3 = new enhd();
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_UNSPECIFIED, edou.EV_CONNECTOR_TYPE_UNSPECIFIED);
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_OTHER, edou.EV_CONNECTOR_TYPE_OTHER);
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_J1772, edou.EV_CONNECTOR_TYPE_J1772);
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_TYPE_2, edou.EV_CONNECTOR_TYPE_TYPE_2);
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_CHADEMO, edou.EV_CONNECTOR_TYPE_CHADEMO);
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_CCS_COMBO_1, edou.EV_CONNECTOR_TYPE_CCS_COMBO_1);
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_CCS_COMBO_2, edou.EV_CONNECTOR_TYPE_CCS_COMBO_2);
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_TESLA, edou.EV_CONNECTOR_TYPE_TESLA);
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T, edou.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T);
        enhdVar3.k(exhc.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET, edou.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET);
        this.a = enhdVar3.c();
        enhd enhdVar4 = new enhd();
        enhdVar4.k(exhf.FUEL_TYPE_UNSPECIFIED, edoy.FUEL_TYPE_UNSPECIFIED);
        enhdVar4.k(exhf.DIESEL, edoy.DIESEL);
        enhdVar4.k(exhf.REGULAR_UNLEADED, edoy.REGULAR_UNLEADED);
        enhdVar4.k(exhf.MIDGRADE, edoy.MIDGRADE);
        enhdVar4.k(exhf.PREMIUM, edoy.PREMIUM);
        enhdVar4.k(exhf.SP91, edoy.SP91);
        enhdVar4.k(exhf.SP91_E10, edoy.SP91_E10);
        enhdVar4.k(exhf.SP92, edoy.SP92);
        enhdVar4.k(exhf.SP95, edoy.SP95);
        enhdVar4.k(exhf.SP95_E10, edoy.SP95_E10);
        enhdVar4.k(exhf.SP98, edoy.SP98);
        enhdVar4.k(exhf.SP99, edoy.SP99);
        enhdVar4.k(exhf.SP100, edoy.SP100);
        enhdVar4.k(exhf.LPG, edoy.LPG);
        enhdVar4.k(exhf.E80, edoy.E80);
        enhdVar4.k(exhf.E85, edoy.E85);
        enhdVar4.k(exhf.METHANE, edoy.METHANE);
        enhdVar4.k(exhf.BIO_DIESEL, edoy.BIO_DIESEL);
        enhdVar4.k(exhf.TRUCK_DIESEL, edoy.TRUCK_DIESEL);
        this.b = enhdVar4.c();
        this.c = edisVar;
    }

    public static final String b(String str) {
        return str.startsWith("//") ? "https:".concat(String.valueOf(str)) : str;
    }

    public static final Instant c(eyja eyjaVar) {
        return Instant.ofEpochSecond(eyjaVar.b, eyjaVar.c);
    }

    public static final String d(String str, String str2) {
        enip enipVar = eodx.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if (!"a".matches("[a-z0-9-]+")) {
            throw new IllegalArgumentException("Invalid element name \"a\". Only lowercase letters, numbers and '-' allowed.");
        }
        if (eodx.a.contains("a")) {
            throw new IllegalArgumentException("Element \"a\" is not supported.");
        }
        eodx.c(eoea.a(str), "a", linkedHashMap);
        eodx.b(str2, "a", arrayList);
        return eodx.a("a", linkedHashMap, arrayList).a;
    }

    private final edpi e(exii exiiVar) {
        exif exifVar;
        edqn edqnVar;
        edpf e = edpi.e();
        eygr eygrVar = exiiVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = eygrVar.iterator();
        while (true) {
            edqn edqnVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            exie exieVar = (exie) it.next();
            edlp edlpVar = new edlp();
            if ((1 & exieVar.b) != 0) {
                exid exidVar = exieVar.c;
                if (exidVar == null) {
                    exidVar = exid.a;
                }
                edqnVar = o(exidVar);
            } else {
                edqnVar = null;
            }
            edlpVar.a = edqnVar;
            if ((exieVar.b & 2) != 0) {
                exid exidVar2 = exieVar.d;
                if (exidVar2 == null) {
                    exidVar2 = exid.a;
                }
                edqnVar2 = o(exidVar2);
            }
            edlpVar.b = edqnVar2;
            arrayList.add(edlpVar.a());
        }
        e.b(arrayList);
        e.d(exiiVar.c);
        switch (exiiVar.d) {
            case 0:
                exifVar = exif.SECONDARY_HOURS_TYPE_UNSPECIFIED;
                break;
            case 1:
                exifVar = exif.DRIVE_THROUGH;
                break;
            case 2:
                exifVar = exif.HAPPY_HOUR;
                break;
            case 3:
                exifVar = exif.DELIVERY;
                break;
            case 4:
                exifVar = exif.TAKEOUT;
                break;
            case 5:
                exifVar = exif.KITCHEN;
                break;
            case 6:
                exifVar = exif.BREAKFAST;
                break;
            case 7:
                exifVar = exif.LUNCH;
                break;
            case 8:
                exifVar = exif.DINNER;
                break;
            case 9:
                exifVar = exif.BRUNCH;
                break;
            case 10:
                exifVar = exif.PICKUP;
                break;
            case 11:
                exifVar = exif.ACCESS;
                break;
            case 12:
                exifVar = exif.SENIOR_HOURS;
                break;
            case 13:
                exifVar = exif.ONLINE_SERVICE_HOURS;
                break;
            default:
                exifVar = null;
                break;
        }
        if (exifVar == null) {
            exifVar = exif.UNRECOGNIZED;
        }
        ((edlj) e).a = (edph) this.e.getOrDefault(exifVar, null);
        eygr eygrVar2 = exiiVar.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it2 = eygrVar2.iterator();
        while (it2.hasNext()) {
            try {
                faun faunVar = ((exih) it2.next()).b;
                if (faunVar == null) {
                    faunVar = faun.a;
                }
                edqj c = edqk.c(l(faunVar));
                c.b(true);
                arrayList2.add(c.a());
            } catch (IllegalArgumentException e2) {
                throw g(String.format("Special day is not properly defined: %s", e2.getMessage()));
            }
        }
        e.c(arrayList2);
        return e.e();
    }

    private final List f(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(e((exii) it.next()));
        }
        return arrayList;
    }

    private static final dfqu g(String str) {
        return new dfqu(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static final String h(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static final edpu i(boolean z, boolean z2) {
        return !z ? edpu.UNKNOWN : z2 ? edpu.TRUE : edpu.FALSE;
    }

    private static final String j(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return String.valueOf(str).concat(".png");
    }

    private static final LatLng k(fauu fauuVar) {
        return new LatLng(fauuVar.b, fauuVar.c);
    }

    private static final edpb l(faun faunVar) {
        return edpb.e(faunVar.b, faunVar.c, faunVar.d);
    }

    private static final Uri m(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return Uri.parse(str);
    }

    private static final edmm n(exgv exgvVar) {
        String str = exgvVar.b;
        if (str.isEmpty()) {
            throw g("Author name not provided for an AuthorAttribution result.");
        }
        edkx edkxVar = new edkx();
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        edkxVar.a = str;
        edkxVar.b = h(exgvVar.c);
        edkxVar.c = h(exgvVar.d);
        emxf.b(!((edky) edkxVar.a()).a.isEmpty(), "Name must not be empty.");
        return edkxVar.a();
    }

    private static final edqn o(exid exidVar) {
        edpb edpbVar;
        edor edorVar;
        int i = exidVar.c;
        edpc c = edpc.c(exidVar.d, exidVar.e);
        if ((exidVar.b & 8) != 0) {
            faun faunVar = exidVar.f;
            if (faunVar == null) {
                faunVar = faun.a;
            }
            edpbVar = l(faunVar);
        } else {
            edpbVar = null;
        }
        switch (i) {
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
                throw g("Day of week must an integer between 0 and 6");
        }
        edqm e = edqn.e(edorVar, c);
        ((edme) e).a = edpbVar;
        e.b(exidVar.g);
        return e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0324  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.edqc a(defpackage.exir r25) {
        /*
            Method dump skipped, instructions count: 2816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edip.a(exir):edqc");
    }
}
