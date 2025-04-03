package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsug extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ kgc b;
    final /* synthetic */ dspe c;
    final /* synthetic */ dsum d;
    final /* synthetic */ ffji e;
    final /* synthetic */ ffjo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsug(hho hhoVar, kgc kgcVar, dspe dspeVar, dsum dsumVar, ffji ffjiVar, ffjo ffjoVar) {
        super(2);
        this.a = hhoVar;
        this.b = kgcVar;
        this.c = dspeVar;
        this.d = dsumVar;
        this.e = ffjiVar;
        this.f = ffjoVar;
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
            hfdVar.v(-1406759257);
            dspe dspeVar = this.c;
            kfr a = kgcVar.a();
            dsuh.b(dspeVar, dstd.a(hvi.e, kgcVar, a), this.d, this.e, hfdVar, 0);
            hfdVar.v(-1153754454);
            ffjo ffjoVar = this.f;
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
