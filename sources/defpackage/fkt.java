package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkt extends ffkk implements ffjm {
    final /* synthetic */ igq a;
    final /* synthetic */ hvi b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkt(igq igqVar, hvi hviVar, long j, int i) {
        super(2);
        this.a = igqVar;
        this.b = hviVar;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fkv.a(this.a, this.b, this.c, (hfd) obj, hip.a(this.d | 1));
        return ffcu.a;
    }
}
