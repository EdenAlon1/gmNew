package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nsu {
    public static final long a;
    public final long b;
    public final lug c;
    public final nrs d;
    public final nss e;
    public final nre f;
    public ntf g;
    public npq h;
    public String i;
    public int j;
    public ntv k;
    private final Context l;
    private final nsl m;
    private final lsg n;
    private final npn o;
    private final Looper p;
    private final lpr q;
    private final ltn r;
    private final lua s;
    private final nps t;

    static {
        lqx.b("media3.transformer");
        a = true != lvf.aa() ? 10000L : 25000L;
    }

    public nsu(Context context, nsl nslVar, long j, lug lugVar, nps npsVar, lsg lsgVar, npn npnVar, nrs nrsVar, Looper looper, lpr lprVar, ltn ltnVar) {
        lti.d(true, "Audio and video cannot both be removed.");
        this.l = context;
        this.m = nslVar;
        this.b = j;
        this.c = lugVar;
        this.t = npsVar;
        this.n = lsgVar;
        this.o = npnVar;
        this.d = nrsVar;
        this.p = looper;
        this.q = lprVar;
        this.r = ltnVar;
        this.j = 0;
        this.s = ltnVar.b(looper, null);
        this.e = new nss(this);
        this.f = new nre();
    }

    public final void a() {
        ntv ntvVar = this.k;
        if (ntvVar != null) {
            ntvVar.a();
            ntvVar.a.shutdownNow();
            this.k = null;
        }
    }

    public final void b() {
        a();
        final nrg a2 = this.f.a();
        this.c.d(-1, new lud() { // from class: nso
            @Override // defpackage.lud
            public final void a(Object obj) {
                npq npqVar = nsu.this.h;
                lti.f(npqVar);
                ((nst) obj).a(npqVar, a2);
            }
        });
        this.c.c();
        int i = lvf.a;
        this.j = 0;
    }

    public final void c() {
        if (Looper.myLooper() != this.p) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    public final boolean d() {
        int i = this.j;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean e() {
        int i = this.j;
        return i == 5 || i == 6;
    }

    public final void g(nrz nrzVar) {
        ntf ntfVar;
        c();
        if (d() || e() || (ntfVar = this.g) == null) {
            return;
        }
        synchronized (ntfVar.n) {
            if (ntfVar.t == 2) {
                nrzVar.a = ntfVar.u;
            }
        }
    }

    public final void h(npq npqVar, nrx nrxVar, nss nssVar) {
        lti.d(this.g == null, "There is already an export in progress.");
        int i = npqVar.d;
        nsl nslVar = this.m;
        if (i != 0) {
            nsk nskVar = new nsk(nslVar);
            nskVar.b = i;
            nslVar = nskVar.a();
        }
        nsl nslVar2 = nslVar;
        nrj nrjVar = new nrj(this.c, this.s, nslVar2);
        Context context = this.l;
        npr nprVar = new npr(context, new npy(new npx(context)), this.r);
        lyt.b();
        int i2 = lvf.a;
        ntf ntfVar = new ntf(this.l, npqVar, nslVar2, nprVar, this.t, this.n, this.o, nrxVar, nssVar, nrjVar, this.s, this.q, this.r);
        this.g = ntfVar;
        ntfVar.c();
        ntfVar.f.i(1);
        synchronized (ntfVar.n) {
            ntfVar.t = 1;
            ntfVar.u = 0;
        }
    }
}
