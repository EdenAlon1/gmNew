package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnr extends ffkk implements ffix {
    final /* synthetic */ gdu a;
    final /* synthetic */ goa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnr(goa goaVar, gdu gduVar) {
        super(0);
        this.b = goaVar;
        this.a = gduVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (!ffkj.e(this.b, this.a.a)) {
            ffdx.v(this.a.b, new gnq(this.b));
            hio hioVar = this.a.c;
            if (hioVar != null) {
                hioVar.a();
            }
        }
        return ffcu.a;
    }
}
