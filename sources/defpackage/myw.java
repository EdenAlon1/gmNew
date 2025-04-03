package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myw implements nar {
    final /* synthetic */ mrc a;
    final /* synthetic */ int b;
    final /* synthetic */ mza c;

    public myw(mza mzaVar, mrc mrcVar, int i) {
        this.a = mrcVar;
        this.b = i;
        this.c = mzaVar;
    }

    @Override // defpackage.nar
    public final void a(long j) {
        this.c.aJ(this.a, this.b, j);
    }

    @Override // defpackage.nar
    public final void b() {
        this.c.aL(this.a, this.b);
    }
}
