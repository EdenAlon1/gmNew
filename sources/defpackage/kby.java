package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kby extends ffkk implements ffjm {
    final /* synthetic */ ffji a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffji d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kby(ffji ffjiVar, hvi hviVar, ffji ffjiVar2, ffji ffjiVar3, int i, int i2) {
        super(2);
        this.a = ffjiVar;
        this.b = hviVar;
        this.c = ffjiVar2;
        this.d = ffjiVar3;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kcg.c(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1), this.f);
        return ffcu.a;
    }
}
