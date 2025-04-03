package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class geo extends ffkk implements ffjm {
    final /* synthetic */ igq a;
    final /* synthetic */ String b;
    final /* synthetic */ hvi c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geo(igq igqVar, String str, hvi hviVar, long j, int i, int i2) {
        super(2);
        this.a = igqVar;
        this.b = str;
        this.c = hviVar;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        geq.a(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1), this.f);
        return ffcu.a;
    }
}
