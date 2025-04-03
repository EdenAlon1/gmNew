package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdl {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/sms/wappushsi/WapPushSiUtils");
    public final ffbr a;
    public final ffbr b;
    public final Context c;
    private final ffbr e;
    private final Executor f;
    private final cxao g;
    private final Object h = new Object();
    private final HashMap i = new HashMap();

    public cpdl(Context context, Executor executor, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cxao cxaoVar) {
        this.c = context;
        this.f = executor;
        this.a = ffbrVar;
        this.e = ffbrVar2;
        this.b = ffbrVar3;
        this.g = cxaoVar;
    }

    public static int a() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        int i = gregorianCalendar.get(15) + gregorianCalendar.get(16);
        enru enruVar = d;
        ensk e = enruVar.e();
        e.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/sms/wappushsi/WapPushSiUtils", "getTimeOffset", 44, "WapPushSiUtils.java")).r("Timezone Offset: %d", i);
        ensk e2 = enruVar.e();
        e2.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/sms/wappushsi/WapPushSiUtils", "getTimeOffset", 45, "WapPushSiUtils.java")).r("DST Timezone Offset: %d", gregorianCalendar.get(16));
        return i;
    }

    public final void b() {
        axos.a(new Runnable() { // from class: cpdk
            @Override // java.lang.Runnable
            public final void run() {
                final cpdl cpdlVar = cpdl.this;
                ((ctwb) cpdlVar.b.b()).o(new ctwa() { // from class: cpdj
                    @Override // defpackage.ctwa
                    public final boolean a(int i) {
                        cpdl cpdlVar2 = cpdl.this;
                        ((ctyw) cpdlVar2.a.b()).a(i).h(cpdlVar2.c.getResources().getString(R.string.wap_push_si_pref_key), false);
                        return true;
                    }
                });
            }
        }, this.f);
    }

    public final boolean c(int i) {
        cxan cxanVar;
        synchronized (this.h) {
            HashMap hashMap = this.i;
            Integer valueOf = Integer.valueOf(i);
            cxanVar = (cxan) hashMap.get(valueOf);
            if (cxanVar == null) {
                cxanVar = this.g.a(i);
                this.i.put(valueOf, cxanVar);
            }
        }
        return ((Boolean) cxanVar.g().orElse(Boolean.valueOf(((cpbs) this.e.b()).a(i).m()))).booleanValue();
    }
}
