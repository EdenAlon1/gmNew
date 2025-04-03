package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbw {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/sms/config/MmsSmsPreferenceUtils");
    public static final emyl b = cfvl.x(211796674, "dont_allow_too_many_sms_parts_to_mms_upgrade");
    public final Context c;
    public final cpbs d;
    public final ctwb e;
    public final ctyw f;
    private final cxao g;
    private final Object h = new Object();
    private final HashMap i = new HashMap();

    public cpbw(Context context, cpbs cpbsVar, ctyw ctywVar, ctwb ctwbVar, cxao cxaoVar) {
        this.c = context;
        this.d = cpbsVar;
        this.f = ctywVar;
        this.e = ctwbVar;
        this.g = cxaoVar;
    }

    public final int a(int i) {
        cpbn a2 = this.d.a(i);
        if (((Boolean) ((cfup) b.get()).e()).booleanValue() && !a2.r()) {
            return -1;
        }
        if (a2.b.getBoolean("enableMultipartSMS", true) || a2.t()) {
            return a2.b.getInt("smsToMmsTextThreshold", -1);
        }
        return 1;
    }

    public final cxan b(int i) {
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
        return cxanVar;
    }

    public final boolean c(int i) {
        cpbn a2 = this.d.a(i);
        cxan b2 = b(i);
        if (((Boolean) b2.c().orElse(Boolean.valueOf(a2.p()))).booleanValue()) {
            return !this.e.h(i).C() || ((Boolean) b2.d().orElse(Boolean.valueOf(a2.q()))).booleanValue();
        }
        return false;
    }

    public final boolean d(int i) {
        cpbn a2 = this.d.a(i);
        if (a2.o()) {
            return ((Boolean) b(i).e().orElse(Boolean.valueOf(a2.n()))).booleanValue();
        }
        return false;
    }

    public final boolean e(int i) {
        return ((Boolean) b(i).i().orElse(Boolean.valueOf(this.d.a(i).w()))).booleanValue();
    }
}
