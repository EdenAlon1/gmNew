package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iqj {
    private boolean a;

    public static /* synthetic */ void m(iqj iqjVar, iqk iqkVar, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        if (iqjVar.c() == kah.a || iqjVar.a() == 0) {
            iqjVar.d(iqkVar);
            iqkVar.ee(kaa.d(j, iqkVar.e), 0.0f, null);
            return;
        }
        int a = iqjVar.a() - iqkVar.a;
        int a2 = kaa.a(j);
        iqjVar.d(iqkVar);
        iqkVar.ee(kaa.d((kaa.b(j) & 4294967295L) | ((a - a2) << 32), iqkVar.e), 0.0f, null);
    }

    public static /* synthetic */ void n(iqj iqjVar, iqk iqkVar, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        ffji ffjiVar = iqm.a;
        if (iqjVar.c() == kah.a || iqjVar.a() == 0) {
            iqjVar.d(iqkVar);
            iqkVar.ee(kaa.d(j, iqkVar.e), 0.0f, ffjiVar);
            return;
        }
        int a = iqjVar.a() - iqkVar.a;
        int a2 = kaa.a(j);
        iqjVar.d(iqkVar);
        iqkVar.ee(kaa.d((kaa.b(j) & 4294967295L) | ((a - a2) << 32), iqkVar.e), 0.0f, ffjiVar);
    }

    public static /* synthetic */ void o(iqj iqjVar, iqk iqkVar, long j) {
        ffji ffjiVar = iqm.a;
        if (iqjVar.c() == kah.a || iqjVar.a() == 0) {
            iqjVar.d(iqkVar);
            iqkVar.ee(kaa.d(j, iqkVar.e), 0.0f, ffjiVar);
            return;
        }
        int a = iqjVar.a() - iqkVar.a;
        int a2 = kaa.a(j);
        int b = kaa.b(j);
        iqjVar.d(iqkVar);
        iqkVar.ee(kaa.d((b & 4294967295L) | ((a - a2) << 32), iqkVar.e), 0.0f, ffjiVar);
    }

    public static /* synthetic */ void p(iqj iqjVar, iqk iqkVar, int i, int i2, ffji ffjiVar, int i3) {
        if ((i3 & 8) != 0) {
            ffjiVar = iqm.a;
        }
        iqjVar.g(iqkVar, i, i2, 0.0f, ffjiVar);
    }

    public static /* synthetic */ void s(iqj iqjVar, iqk iqkVar) {
        if (iqjVar.c() == kah.a || iqjVar.a() == 0) {
            iqjVar.d(iqkVar);
            iqkVar.ee(kaa.d(0L, iqkVar.e), 0.0f, null);
            return;
        }
        int a = iqjVar.a() - iqkVar.a;
        int a2 = kaa.a(0L);
        int b = kaa.b(0L);
        iqjVar.d(iqkVar);
        iqkVar.ee(kaa.d(((a - a2) << 32) | (b & 4294967295L), iqkVar.e), 0.0f, null);
    }

    public abstract int a();

    public ioc b() {
        throw null;
    }

    public abstract kah c();

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(iqk iqkVar) {
        if (iqkVar instanceof ivq) {
            ((ivq) iqkVar).R(this.a);
        }
    }

    public final void e(iqk iqkVar, int i, int i2, float f) {
        d(iqkVar);
        iqkVar.ee(kaa.d((i2 & 4294967295L) | (i << 32), iqkVar.e), f, null);
    }

    public final void f(iqk iqkVar, long j, float f) {
        d(iqkVar);
        iqkVar.ee(kaa.d(j, iqkVar.e), f, null);
    }

    public final void g(iqk iqkVar, int i, int i2, float f, ffji ffjiVar) {
        d(iqkVar);
        iqkVar.ee(kaa.d((i2 & 4294967295L) | (i << 32), iqkVar.e), f, ffjiVar);
    }

    public final void h(iqk iqkVar, long j, float f, ffji ffjiVar) {
        d(iqkVar);
        iqkVar.ee(kaa.d(j, iqkVar.e), f, ffjiVar);
    }

    public final void i(iqk iqkVar, long j, iga igaVar, float f) {
        d(iqkVar);
        iqkVar.x(kaa.d(j, iqkVar.e), f, igaVar);
    }

    public final void j(ffji ffjiVar) {
        this.a = true;
        ffjiVar.invoke(this);
        this.a = false;
    }
}
