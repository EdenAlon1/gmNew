package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csr extends ffkk implements ffjm {
    final /* synthetic */ dbe a;
    final /* synthetic */ hvi b;
    final /* synthetic */ cyq c;
    final /* synthetic */ ffji d;
    final /* synthetic */ ffjn e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csr(dbe dbeVar, hvi hviVar, cyq cyqVar, ffji ffjiVar, ffjn ffjnVar, int i) {
        super(2);
        this.a = dbeVar;
        this.b = hviVar;
        this.c = cyqVar;
        this.d = ffjiVar;
        this.e = ffjnVar;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        css.b(this.a, this.b, this.c, this.d, this.e, (hfd) obj, hip.a(this.f | 1));
        return ffcu.a;
    }
}
