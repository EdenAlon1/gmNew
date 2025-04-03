package defpackage;

import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtz {
    private final dgym a;
    private final LocationManager b;
    private final ctud c;
    private final errl d;

    public adtz(LocationManager locationManager, ctud ctudVar, errl errlVar, dgym dgymVar) {
        this.b = locationManager;
        this.c = ctudVar;
        this.d = errlVar;
        this.a = dgymVar;
    }

    public final elfl a() {
        final ArrayList arrayList = new ArrayList();
        if (!this.c.j()) {
            cfzc cfzcVar = new cfzc();
            cfzcVar.b("currentLocation");
            cfzcVar.c("App does not have location permission");
            arrayList.add(cfzcVar.a());
            return elfo.e(arrayList);
        }
        if (this.b.isProviderEnabled("gps") || this.b.isProviderEnabled("network")) {
            return elfl.g(duin.a(this.a.c(102))).h(new emwl() { // from class: adty
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Location location = (Location) obj;
                    String format = String.format(Locale.US, "(%.4f, %.4f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    cfzc cfzcVar2 = new cfzc();
                    cfzcVar2.b("currentLocation");
                    cfzcVar2.c(format);
                    cfzl a = cfzcVar2.a();
                    List list = arrayList;
                    list.add(a);
                    return list;
                }
            }, this.d);
        }
        cfzc cfzcVar2 = new cfzc();
        cfzcVar2.b("currentLocation");
        cfzcVar2.c("System location is disabled");
        arrayList.add(cfzcVar2.a());
        return elfo.e(arrayList);
    }
}
