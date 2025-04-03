package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsz extends ffkk implements ffjm {
    final /* synthetic */ gul a;
    final /* synthetic */ hvi b;
    final /* synthetic */ grs c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsz(gul gulVar, hvi hviVar, grs grsVar, int i) {
        super(2);
        this.a = gulVar;
        this.b = hviVar;
        this.c = grsVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        guj.y(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
