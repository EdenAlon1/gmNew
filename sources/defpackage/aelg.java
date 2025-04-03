package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelg implements aqge {
    public final aqvh a;
    public final emyl b;
    private final ffsk c;

    public aelg(ffsk ffskVar, aqvh aqvhVar) {
        ffskVar.getClass();
        aqvhVar.getClass();
        this.c = ffskVar;
        this.a = aqvhVar;
        this.b = emys.a(new emyl() { // from class: aele
            @Override // defpackage.emyl
            public final Object get() {
                return aelg.this.a.c();
            }
        });
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        ctbx a = ((aqge) this.b.get()).a(aqgdVar);
        a.getClass();
        return a;
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new aelf(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
