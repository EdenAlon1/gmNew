package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkj extends ffkk implements ffjm {
    final /* synthetic */ float a;
    final /* synthetic */ hvi b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ long e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkj(float f, hvi hviVar, long j, float f2, long j2, int i, int i2) {
        super(2);
        this.a = f;
        this.b = hviVar;
        this.c = j;
        this.d = f2;
        this.e = j2;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gkn.d(this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
