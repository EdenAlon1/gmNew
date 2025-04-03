package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gub extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ gul b;
    final /* synthetic */ grs c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gub(hvi hviVar, gul gulVar, grs grsVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = gulVar;
        this.c = grsVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hvi hviVar = this.a;
        gul gulVar = this.b;
        int i = this.d;
        guj.t(hviVar, gulVar, this.c, (hfd) obj, hip.a(i | 1));
        return ffcu.a;
    }
}
