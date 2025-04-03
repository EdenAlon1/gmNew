package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcc extends ffkk implements ffjm {
    final /* synthetic */ fcu a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jyi c;
    final /* synthetic */ boolean d;
    final /* synthetic */ long e;
    final /* synthetic */ float f;
    final /* synthetic */ hvi g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcc(fcu fcuVar, boolean z, jyi jyiVar, boolean z2, long j, float f, hvi hviVar, int i) {
        super(2);
        this.a = fcuVar;
        this.b = z;
        this.c = jyiVar;
        this.d = z2;
        this.e = j;
        this.f = f;
        this.g = hviVar;
        this.h = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fci.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hfd) obj, hip.a(this.h | 1));
        return ffcu.a;
    }
}
