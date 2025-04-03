package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbn extends llf {
    private lld a;

    @Override // defpackage.lld
    public final Object a() {
        lld lldVar = this.a;
        if (lldVar == null) {
            return null;
        }
        return lldVar.a();
    }

    final void b(lld lldVar) {
        lld lldVar2 = this.a;
        if (lldVar2 != null) {
            super.q(lldVar2);
        }
        this.a = lldVar;
        super.p(lldVar, new llh() { // from class: cbm
            @Override // defpackage.llh
            public final void a(Object obj) {
                cbn.this.m(obj);
            }
        });
    }
}
