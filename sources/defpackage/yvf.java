package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yvf implements dtft {
    public static final cfup a = cfvl.k(cfvl.b, "vm_satellite_max_file_size_override", 307200);
    public final drjx b;
    public final int c;
    public final int d;
    public final fgdj e;
    public final fgdj f;
    private final fgdj g;

    public yvf(ffsk ffskVar, fgcq fgcqVar, fgcq fgcqVar2, ausa ausaVar) {
        int i;
        int i2;
        fgdj b;
        ffskVar.getClass();
        fgcqVar.getClass();
        ausaVar.getClass();
        this.b = ((Boolean) ardj.a.e()).booleanValue() ? drjk.a : drji.a;
        if (((Boolean) ardj.a.e()).booleanValue()) {
            Object e = ardj.e.e();
            e.getClass();
            i = ((Number) e).intValue();
        } else {
            i = 12200;
        }
        this.c = i;
        if (((Boolean) ardj.a.e()).booleanValue()) {
            Object e2 = ardj.d.e();
            e2.getClass();
            i2 = ((Number) e2).intValue();
        } else {
            i2 = 8000;
        }
        this.d = i2;
        if (ausaVar.a()) {
            ffxx a2 = ffyy.a(new fgch(new yus(new yup(fgcqVar)), fgcqVar2, new yum(null)));
            int i3 = fgcz.a;
            b = fgbn.b(a2, ffskVar, fgcy.a, null);
        } else {
            ffxx a3 = ffyy.a(new yuy(new yuv(fgcqVar)));
            int i4 = fgcz.a;
            b = fgbn.b(a3, ffskVar, fgcy.a, null);
        }
        this.e = b;
        fgdj b2 = fgbn.b(ffyy.a(new yve(new yvb(fgcqVar))), ffskVar, fgcy.a, false);
        this.g = b2;
        this.f = fgbn.b(ffyy.a(new fgch(b2, b, new yul(this, null))), ffskVar, fgcy.a, null);
    }

    public static final Duration a(Duration duration, Duration duration2) {
        return duration2.multipliedBy(duration.dividedBy(duration2));
    }
}
