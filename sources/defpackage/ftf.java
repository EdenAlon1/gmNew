package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftf extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;
    final /* synthetic */ hvi c;
    final /* synthetic */ long d;
    final /* synthetic */ dji e;
    final /* synthetic */ kex f;
    final /* synthetic */ idh g;
    final /* synthetic */ long h;
    final /* synthetic */ float i;
    final /* synthetic */ ffjn j;
    final /* synthetic */ int k;
    final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftf(boolean z, ffix ffixVar, hvi hviVar, long j, dji djiVar, kex kexVar, idh idhVar, long j2, float f, ffjn ffjnVar, int i, int i2) {
        super(2);
        this.a = z;
        this.b = ffixVar;
        this.c = hviVar;
        this.d = j;
        this.e = djiVar;
        this.f = kexVar;
        this.g = idhVar;
        this.h = j2;
        this.i = f;
        this.j = ffjnVar;
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.k;
        int i2 = this.l;
        int a = hip.a(i | 1);
        int a2 = hip.a(i2);
        fti.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (hfd) obj, a, a2);
        return ffcu.a;
    }
}
