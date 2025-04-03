package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lnn extends ffkk implements ffji {
    final /* synthetic */ lkr a;
    final /* synthetic */ lki b;
    final /* synthetic */ hkx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnn(lkr lkrVar, lki lkiVar, hkx hkxVar) {
        super(1);
        this.a = lkrVar;
        this.b = lkiVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final lki lkiVar = this.b;
        final hkx hkxVar = this.c;
        lkp lkpVar = new lkp() { // from class: lnl
            @Override // defpackage.lkp
            public final void hg(lkr lkrVar, lki lkiVar2) {
                if (lkiVar2 == lki.this) {
                    ((ffix) hkxVar.a()).invoke();
                }
            }
        };
        this.a.P().c(lkpVar);
        return new lnm(this.a, lkpVar);
    }
}
