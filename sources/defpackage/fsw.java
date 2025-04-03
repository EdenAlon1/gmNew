package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsw extends ffkk implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ hvi b;
    final /* synthetic */ keh c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsw(ffix ffixVar, hvi hviVar, keh kehVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = ffixVar;
        this.b = hviVar;
        this.c = kehVar;
        this.d = ffjmVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fsx.d(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
