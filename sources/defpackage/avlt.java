package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avlt implements avlp {
    private final avlp a;
    private final akzt b;
    private final entd c;

    public avlt(avlp avlpVar, akzt akztVar) {
        akztVar.getClass();
        this.a = avlpVar;
        this.b = akztVar;
        this.c = entd.c("BugleRcsCapabilities");
    }

    @Override // defpackage.avlp
    public final ephj a(aoku aokuVar) {
        this.b.e("Bugle.Rcs.Capability.RcsContacts.Counts", 3);
        ((ensz) this.c.j()).q("RcsContacts should not be called.");
        ephj a = this.a.a(aokuVar);
        a.getClass();
        return a;
    }

    @Override // defpackage.avlp
    public final Optional c(aoku aokuVar) {
        this.b.e("Bugle.Rcs.Capability.RcsContacts.Counts", 0);
        ((ensz) this.c.j()).q("RcsContacts should not be called.");
        Optional c = this.a.c(aokuVar);
        c.getClass();
        return c;
    }
}
