package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbv extends ffkk implements ffjm {
    final /* synthetic */ ffji a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ffji c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbv(ffji ffjiVar, hvi hviVar, ffji ffjiVar2, int i, int i2) {
        super(2);
        this.a = ffjiVar;
        this.b = hviVar;
        this.c = ffjiVar2;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kcg.b(this.a, this.b, this.c, (hfd) obj, hip.a(this.d | 1), this.e);
        return ffcu.a;
    }
}
