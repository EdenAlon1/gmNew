package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvjk implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ dvjl b;
    final /* synthetic */ int c;

    public dvjk(dvjl dvjlVar, String str, int i) {
        this.a = str;
        this.c = i;
        this.b = dvjlVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ears) this.b.l.b()).i(this.b.k, "OK", easp.a(this.a), exxi.a(this.c));
        this.b.m.p(this.a, dvdh.a(this.c), true);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ears) this.b.l.b()).i(this.b.k, "ERROR", easp.a(this.a), exxi.a(this.c));
        ((ensz) ((ensz) ((ensz) dvjl.a.j()).g(th)).h("com/google/android/libraries/internal/growth/growthkit/internal/rpc/impl/GrowthKitGnpApiWrapper$1", "onFailure", (char) 172, "GrowthKitGnpApiWrapper.java")).q("getPromos failed in the GrowthKitGnpApiWrapper");
        this.b.m.p(this.a, dvdh.a(this.c), false);
    }
}
