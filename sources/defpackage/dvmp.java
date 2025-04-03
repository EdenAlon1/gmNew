package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvmp implements dvft {
    public static final boolean a;
    private static final entd b = entd.c("GnpSdk");
    private static final Map c;
    private final dvbu d;
    private final dvcp e;
    private final Context f;
    private final eagn g;

    static {
        boolean z = false;
        Map g = ffew.g(new ffcf(33, ffdx.b(evsn.ANDROID_POST_NOTIFICATIONS)), new ffcf(23, ffdx.g(evsn.ANDROID_CAMERA, evsn.ANDROID_ACCESS_FINE_LOCATION)));
        c = g;
        Set keySet = g.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (easb.b(((Number) it.next()).intValue())) {
                    z = true;
                    break;
                }
            }
        }
        a = z;
    }

    public dvmp(dvbu dvbuVar, dvcp dvcpVar, Context context, eagn eagnVar) {
        dvcpVar.getClass();
        context.getClass();
        this.d = dvbuVar;
        this.e = dvcpVar;
        this.f = context;
        this.g = eagnVar;
    }

    @Override // defpackage.dvft
    public final long a() {
        return TimeUnit.HOURS.toMillis(1L);
    }

    @Override // defpackage.dvft
    public final long b() {
        return TimeUnit.DAYS.toMillis(1L);
    }

    @Override // defpackage.dvft
    public final ListenableFuture c() {
        b.o().q("Executing PermissionsStateLoggingJob");
        Map map = c;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            ffdx.w(arrayList, !easb.b(((Number) entry.getKey()).intValue()) ? ffel.a : (List) entry.getValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            linkedHashMap.put(obj, easb.a(this.f, dvdm.a((evsn) obj)) ? evsl.ANDROID_PERMISSION_STATE_AUTHORIZED : evsl.ANDROID_PERMISSION_STATE_DENIED);
        }
        enhk e = engq.e(linkedHashMap);
        if (!e.isEmpty()) {
            dvcp dvcpVar = this.e;
            List a2 = this.d.a();
            a2.getClass();
            dvcpVar.b(e, engq.a(a2), ((eagl) this.g).a);
        }
        return erre.a;
    }

    @Override // defpackage.dvft
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dvft
    public final boolean e() {
        return false;
    }

    @Override // defpackage.dvft
    public final int f() {
        return 1;
    }

    @Override // defpackage.dvft
    public final int g() {
        return 1;
    }
}
