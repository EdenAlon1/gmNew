package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Calendar;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwt implements alwu {
    public static final cskc a = cskc.g("BugleUsageStatistics", "UptimeTracker");
    public final csjk b;
    private final Context e;
    private final ffbr f;
    private final dkpp g;
    private Integer j;
    private eysq k;
    private long l;
    private long m;
    private long n;
    private final csmx o;
    private final String h = UUID.randomUUID().toString();
    private long i = 0;
    public eqwf c = eqwf.INVALID_PRE_KOTO;
    private int p = 1;
    public int d = 1;

    public alwt(Context context, ffbr ffbrVar, dkpp dkppVar, csjk csjkVar, ctud ctudVar) {
        alws alwsVar = new alws(this);
        this.o = alwsVar;
        this.e = context;
        this.f = ffbrVar;
        this.g = dkppVar;
        this.b = csjkVar;
        csmz csmzVar = (csmz) csjkVar.a();
        csms csmsVar = (csms) csmv.a.createBuilder();
        csmu csmuVar = ctudVar.l() ? csmu.ALL_ACTIVE_SUBSCRIPTIONS : csmu.DEFAULT_SYSTEM_SUBSCRIPTION;
        csmsVar.copyOnWrite();
        csmv csmvVar = (csmv) csmsVar.instance;
        csmvVar.c = csmuVar.e;
        csmvVar.b |= 1;
        csmzVar.m(alwsVar, (csmv) csmsVar.build());
        f(2, this.c);
    }

    private final eosx g() {
        int intValue;
        eosu eosuVar = (eosu) eosx.a.createBuilder();
        int i = this.d;
        eosuVar.copyOnWrite();
        eosx eosxVar = (eosx) eosuVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        eosxVar.c = i2;
        eosxVar.b |= 1;
        int i3 = this.p;
        eosuVar.copyOnWrite();
        eosx eosxVar2 = (eosx) eosuVar.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        eosxVar2.d = i4;
        eosxVar2.b |= 2;
        eqwf eqwfVar = this.c;
        eosuVar.copyOnWrite();
        eosx eosxVar3 = (eosx) eosuVar.instance;
        eosxVar3.e = eqwfVar.N;
        eosxVar3.b |= 4;
        long j = this.l;
        eosuVar.copyOnWrite();
        eosx eosxVar4 = (eosx) eosuVar.instance;
        eosxVar4.b |= 8;
        eosxVar4.f = j;
        long j2 = this.m;
        eosuVar.copyOnWrite();
        eosx eosxVar5 = (eosx) eosuVar.instance;
        eosxVar5.b |= 16;
        eosxVar5.g = j2;
        long j3 = this.n;
        eosuVar.copyOnWrite();
        eosx eosxVar6 = (eosx) eosuVar.instance;
        eosxVar6.b |= 32;
        eosxVar6.h = j3;
        String str = this.h;
        eosuVar.copyOnWrite();
        eosx eosxVar7 = (eosx) eosuVar.instance;
        str.getClass();
        eosxVar7.b |= 64;
        eosxVar7.i = str;
        long j4 = this.i;
        this.i = 1 + j4;
        eosuVar.copyOnWrite();
        eosx eosxVar8 = (eosx) eosuVar.instance;
        eosxVar8.b |= 128;
        eosxVar8.j = j4;
        eowr eowrVar = (eowr) eowt.a.createBuilder();
        Integer num = this.j;
        if (num != null) {
            intValue = num.intValue();
        } else {
            try {
                this.j = Integer.valueOf(this.e.getPackageManager().getPackageInfo("com.google.android.ims", 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                this.j = -1;
            }
            a.q("Loaded CS version.");
            intValue = this.j.intValue();
        }
        eowrVar.copyOnWrite();
        eowt eowtVar = (eowt) eowrVar.instance;
        eowtVar.b |= 1;
        eowtVar.c = intValue;
        eosuVar.copyOnWrite();
        eosx eosxVar9 = (eosx) eosuVar.instance;
        eowt eowtVar2 = (eowt) eowrVar.build();
        eowtVar2.getClass();
        eosxVar9.k = eowtVar2;
        eosxVar9.b |= 256;
        eysq eysqVar = this.k;
        if (eysqVar == null) {
            String m = this.g.m();
            if (TextUtils.isEmpty(m)) {
                a.r("Unable to retrieve SIM operator information for metrics!");
                eysqVar = eysq.a;
            } else {
                dkpp dkppVar = this.g;
                String n = dkppVar.n();
                String i5 = dkppVar.i();
                eysp eyspVar = (eysp) eysq.a.createBuilder();
                String substring = m.substring(0, 3);
                eyspVar.copyOnWrite();
                eysq eysqVar2 = (eysq) eyspVar.instance;
                substring.getClass();
                eysqVar2.b |= 1;
                eysqVar2.c = substring;
                String substring2 = m.substring(3);
                eyspVar.copyOnWrite();
                eysq eysqVar3 = (eysq) eyspVar.instance;
                substring2.getClass();
                eysqVar3.b |= 2;
                eysqVar3.d = substring2;
                boolean t = this.g.t();
                eyspVar.copyOnWrite();
                eysq eysqVar4 = (eysq) eyspVar.instance;
                eysqVar4.b |= 16;
                eysqVar4.g = t;
                if (!TextUtils.isEmpty(i5)) {
                    String i6 = this.g.i();
                    eyspVar.copyOnWrite();
                    eysq eysqVar5 = (eysq) eyspVar.instance;
                    i6.getClass();
                    eysqVar5.b |= 8;
                    eysqVar5.f = i6;
                }
                if (!TextUtils.isEmpty(n)) {
                    eyspVar.copyOnWrite();
                    eysq eysqVar6 = (eysq) eyspVar.instance;
                    n.getClass();
                    eysqVar6.b |= 4;
                    eysqVar6.e = n;
                }
                this.k = (eysq) eyspVar.build();
                a.q("Loaded GSMNetworkId.");
                eysqVar = this.k;
            }
        }
        eosuVar.copyOnWrite();
        eosx eosxVar10 = (eosx) eosuVar.instance;
        eysqVar.getClass();
        eosxVar10.l = eysqVar;
        eosxVar10.b |= 1024;
        return (eosx) eosuVar.build();
    }

    public final void a(eosx eosxVar) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eosxVar.getClass();
        eolvVar.K = eosxVar;
        eolvVar.c |= 32;
        ((akxl) this.f.b()).j(eoluVar);
        csjb d = a.d();
        int a2 = eosw.a(eosxVar.c);
        d.A("Sending event to clearcut", (a2 == 0 || a2 == 1) ? "UNKNOWN_RCS_UPTIME_STATE" : a2 != 2 ? a2 != 3 ? "RCS_UPTIME_STATE_REGISTERED" : "RCS_UPTIME_STATE_UNREGISTERED" : "RCS_UPTIME_STATE_IGNORE");
        d.r();
    }

    @Override // defpackage.alwu
    public final void b() {
        eosx g;
        a.q("Logging periodic event.");
        synchronized (this) {
            this.p = this.d;
            g = g();
        }
        a(g);
    }

    @Override // defpackage.alwu
    public final void c(eqwf eqwfVar) {
        eosx f;
        csjb d = a.d();
        d.A("Availability updated", eqwfVar);
        d.r();
        synchronized (this) {
            f = !e(eqwfVar) ? f(2, eqwfVar) : this.d == 4 ? f(4, eqwfVar) : f(3, eqwfVar);
        }
        if (f != null) {
            a(f);
        }
    }

    @Override // defpackage.alwu
    public final void d(boolean z) {
        eosx f;
        csjb d = a.d();
        d.B("Registration updated", z);
        d.r();
        synchronized (this) {
            f = z ? f(4, this.c) : e(this.c) ? f(3, this.c) : f(2, this.c);
        }
        if (f != null) {
            a(f);
        }
    }

    public final boolean e(eqwf eqwfVar) {
        return ((csmz) this.b.a()).r() && eqwfVar == eqwf.AVAILABLE;
    }

    public final eosx f(int i, eqwf eqwfVar) {
        int i2 = this.d;
        if (i2 == i && this.c == eqwfVar) {
            return null;
        }
        this.p = i2;
        this.d = i;
        this.c = eqwfVar;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        int i3 = i - 1;
        if (i3 == 2) {
            this.m = timeInMillis;
        } else if (i3 != 3) {
            this.n = timeInMillis;
        } else {
            this.l = timeInMillis;
        }
        return g();
    }
}
