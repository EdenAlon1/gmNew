package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghd extends ffkk implements ffix {
    final /* synthetic */ gmk a;
    final /* synthetic */ ffsk b;
    final /* synthetic */ cxj c;
    final /* synthetic */ ffix d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghd(gmk gmkVar, ffsk ffskVar, cxj cxjVar, ffix ffixVar) {
        super(0);
        this.a = gmkVar;
        this.b = ffskVar;
        this.c = cxjVar;
        this.d = ffixVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.a.c() == gml.b && this.a.j()) {
            ffqy.d(this.b, null, null, new ggz(this.c, null), 3);
            ffqy.d(this.b, null, null, new gha(this.a, null), 3);
        } else {
            ffqy.d(this.b, null, null, new ghb(this.a, null), 3).hZ(new ghc(this.d));
        }
        return ffcu.a;
    }
}
