package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpjn extends ffhv implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ cxj b;
    final /* synthetic */ boolean c;
    final /* synthetic */ rva d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpjn(rva rvaVar, long j, cxj cxjVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = rvaVar;
        this.a = j;
        this.b = cxjVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpjn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        long f;
        ffci.b(obj);
        float floatValue = ((Number) this.b.d()).floatValue();
        if (floatValue > 0.96f) {
            floatValue = 0.96f;
        }
        boolean z = this.c;
        long j = this.a;
        rva rvaVar = this.d;
        f = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), floatValue, ibw.f(j));
        rvb.c(rvaVar, f, z);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpjn(this.d, this.a, this.b, this.c, ffguVar);
    }
}
