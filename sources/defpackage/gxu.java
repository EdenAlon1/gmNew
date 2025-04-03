package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxu extends ffkk implements ffji {
    final /* synthetic */ lkr a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ffix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxu(lkr lkrVar, ffji ffjiVar, ffix ffixVar) {
        super(1);
        this.a = lkrVar;
        this.b = ffjiVar;
        this.c = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final ffji ffjiVar = this.b;
        lkp lkpVar = new lkp() { // from class: gxs
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar, lki lkiVar) {
                ffji.this.invoke(lkiVar);
            }
        };
        this.a.P().c(lkpVar);
        return new gxt(this.c, this.a, lkpVar);
    }
}
