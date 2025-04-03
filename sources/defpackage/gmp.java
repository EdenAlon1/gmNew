package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmp extends ffkk implements ffjm {
    final /* synthetic */ gmv a;
    final /* synthetic */ gnn b;
    final /* synthetic */ float c = 8.0f;
    final /* synthetic */ hvi d;
    final /* synthetic */ boolean e;
    final /* synthetic */ gmm f;
    final /* synthetic */ ffjm g;
    final /* synthetic */ ffjn h;
    final /* synthetic */ float i;
    final /* synthetic */ float j;
    final /* synthetic */ int k;
    final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmp(gmv gmvVar, gnn gnnVar, float f, hvi hviVar, boolean z, gmm gmmVar, ffjm ffjmVar, ffjn ffjnVar, float f2, float f3, int i, int i2) {
        super(2);
        this.a = gmvVar;
        this.b = gnnVar;
        this.d = hviVar;
        this.e = z;
        this.f = gmmVar;
        this.g = ffjmVar;
        this.h = ffjnVar;
        this.i = f2;
        this.j = f3;
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        ((Number) obj2).intValue();
        int i = this.k;
        int i2 = this.l;
        int a = hip.a(i | 1);
        int a2 = hip.a(i2);
        this.a.a(this.b, 8.0f, this.d, this.e, this.f, this.g, this.h, this.i, this.j, hfdVar, a, a2);
        return ffcu.a;
    }
}
