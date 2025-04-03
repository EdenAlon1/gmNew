package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdx extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ fcy b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdx(hvi hviVar, fcy fcyVar, ffji ffjiVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = fcyVar;
        this.c = ffjiVar;
        this.d = ffjmVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fea.a(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
