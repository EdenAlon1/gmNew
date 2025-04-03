package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqe extends hvh implements its {
    public ffji a;
    public long b = -9223372034707292160L;

    public iqe(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return true;
    }

    @Override // defpackage.its
    public final void i(long j) {
        if (kaf.e(this.b, j)) {
            return;
        }
        this.a.invoke(new kaf(j));
        this.b = j;
    }

    @Override // defpackage.its
    public final /* synthetic */ void dY(ioc iocVar) {
    }
}
