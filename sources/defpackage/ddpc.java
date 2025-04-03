package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpc implements ddow {
    public final aqvh a;
    public int b;
    public int c;
    public cbsy d;
    public final bgmm e;
    public final bfkp f;
    public int g;
    private final ffsk h;

    public ddpc(ffsk ffskVar, aqvh aqvhVar) {
        ffskVar.getClass();
        aqvhVar.getClass();
        this.h = ffskVar;
        this.a = aqvhVar;
        this.b = -1;
        this.c = -1;
        this.g = 1;
        this.d = cbsy.a;
        String[] strArr = bgmn.a;
        this.e = new bgmm();
        String[] strArr2 = bfkq.a;
        this.f = new bfkp();
    }

    @Override // defpackage.ddow
    public final elfl a() {
        elfl c;
        int i = this.c;
        if (i == -1) {
            throw new IllegalStateException("iconResId must be provided");
        }
        if (this.b == -1) {
            throw new IllegalStateException("simSlot must be provided");
        }
        if (this.g == 1) {
            throw new IllegalStateException("logType must be provided");
        }
        if (this.d == cbsy.a) {
            throw new IllegalStateException("position must be provided");
        }
        c = axol.c(this.h, ffhe.a, ffsm.a, new ddpb(this, i, null));
        return c;
    }

    public final void b(cbsy cbsyVar) {
        cbsyVar.getClass();
        this.d = cbsyVar;
    }
}
