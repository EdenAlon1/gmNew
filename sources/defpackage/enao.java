package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enao extends enaq {
    volatile long a;
    enbg b;
    enbg c;

    public enao(Object obj, int i, enbg enbgVar) {
        super(obj, i, enbgVar);
        this.a = Long.MAX_VALUE;
        int i2 = enbf.x;
        enak enakVar = enak.a;
        this.b = enakVar;
        this.c = enakVar;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final long b() {
        return this.a;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final enbg f() {
        return this.b;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final enbg h() {
        return this.c;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final void l(enbg enbgVar) {
        this.b = enbgVar;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final void n(enbg enbgVar) {
        this.c = enbgVar;
    }
}
