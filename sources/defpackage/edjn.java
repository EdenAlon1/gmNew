package defpackage;

import android.location.Location;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edjn extends edjq {
    private final Location b;
    private final engw c;

    public edjn(edsb edsbVar, Location location, engw engwVar, Locale locale, String str, edto edtoVar) {
        super(edsbVar, locale, str, edtoVar);
        this.b = location;
        this.c = engwVar;
    }

    @Override // defpackage.edjq
    protected final String d() {
        return "findplacefromuserlocation/json";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.edjq
    public final Map e() {
        edsb edsbVar = (edsb) this.a;
        HashMap hashMap = new HashMap();
        enhk enhkVar = edkd.a;
        Location location = this.b;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        Double valueOf = Double.valueOf(latitude);
        Double valueOf2 = Double.valueOf(longitude);
        f(hashMap, "location", String.format(Locale.US, "%.15f,%.15f", valueOf, valueOf2));
        emxf.b(true, "maxLength must not be negative");
        StringBuilder sb = new StringBuilder();
        engw engwVar = this.c;
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            edfx edfxVar = (edfx) engwVar.get(i);
            int length = sb.length();
            enhd enhdVar = new enhd();
            enhdVar.k("mac", edfxVar.a);
            enhdVar.k("strength_dbm", Integer.valueOf(edfxVar.b));
            enhdVar.k("wifi_auth_type", edkd.a.get(edfxVar.c));
            enhdVar.k("is_connected", Boolean.valueOf(edfxVar.d));
            enhdVar.k("frequency_mhz", Integer.valueOf(edfxVar.e));
            enhk c = enhdVar.c();
            emwv emwvVar = new emwv(new emww(","), "=");
            Iterator it = c.entrySet().iterator();
            StringBuilder sb2 = new StringBuilder();
            emwvVar.a(sb2, it);
            String sb3 = sb2.toString();
            int length2 = sb.length();
            String concat = (length > 0 ? "|" : "").concat(sb3);
            if (length2 + concat.length() > 4000) {
                break;
            }
            sb.append(concat);
        }
        f(hashMap, "wifiaccesspoints", sb.toString());
        Location location2 = this.b;
        float accuracy = location2.getAccuracy();
        Integer num = null;
        if (location2.hasAccuracy() && accuracy > 0.0f) {
            num = Integer.valueOf(Math.round(accuracy * 100.0f));
        }
        f(hashMap, "precision", num);
        f(hashMap, "timestamp", Long.valueOf(this.b.getTime()));
        f(hashMap, "fields", edke.a(edsbVar.b()));
        return hashMap;
    }
}
