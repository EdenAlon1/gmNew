package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amhr implements aqge {
    public final aqge a;
    public final aqge b;
    private final ffsk c;

    public amhr(ffsk ffskVar, aqge aqgeVar, aqge aqgeVar2) {
        ffskVar.getClass();
        aqgeVar.getClass();
        aqgeVar2.getClass();
        this.c = ffskVar;
        this.a = aqgeVar;
        this.b = aqgeVar2;
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return ctbt.b(this.a.a(aqgdVar), this.b.a(aqgdVar));
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new amhq(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new ffce("An operation is not implemented: Can't be implemented until BugleConversationPropertiesSupplier#getBlocking");
    }
}
