package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjo extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ long b;
    final /* synthetic */ float c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjo(hvi hviVar, long j, float f, int i, int i2) {
        super(2);
        this.a = hviVar;
        this.b = j;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fjp.a(this.a, this.b, this.c, (hfd) obj, hip.a(this.d | 1), this.e);
        return ffcu.a;
    }
}
