package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtj extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ grs b;
    final /* synthetic */ gul c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtj(hvi hviVar, grs grsVar, gul gulVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = grsVar;
        this.c = gulVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hvi hviVar = this.a;
        grs grsVar = this.b;
        int i = this.d;
        guj.p(hviVar, grsVar, this.c, (hfd) obj, hip.a(i | 1));
        return ffcu.a;
    }
}
