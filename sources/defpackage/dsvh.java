package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvh extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ kgc b;
    final /* synthetic */ dspe c;
    final /* synthetic */ dsvy d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ffji f;
    final /* synthetic */ ffjo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsvh(hho hhoVar, kgc kgcVar, dspe dspeVar, dsvy dsvyVar, boolean z, ffji ffjiVar, ffjo ffjoVar) {
        super(2);
        this.a = hhoVar;
        this.b = kgcVar;
        this.c = dspeVar;
        this.d = dsvyVar;
        this.e = z;
        this.f = ffjiVar;
        this.g = ffjoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.b(ffcu.a);
            this.b.c();
            kgc kgcVar = this.b;
            hfdVar.v(-578028003);
            dspe dspeVar = this.c;
            kfr a = kgcVar.a();
            dsvs.k(dspeVar, dstd.a(hvi.e, kgcVar, a), this.d, this.e, this.f, hfdVar, 0);
            hfdVar.v(-1404115542);
            ffjo ffjoVar = this.g;
            if (ffjoVar != null) {
                ffjoVar.a(kgcVar, a, hfdVar, 8);
            }
            hfdVar.o();
            hfdVar.o();
            hfdVar.v(-2087871650);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
