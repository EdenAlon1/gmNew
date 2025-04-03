package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebyv extends ebym {
    static final emwl a = new ebyv();

    @Override // defpackage.ebym
    public final void a(dhis dhisVar, ebwl ebwlVar) {
        if (!dhisVar.k() || "null".equals(dhisVar.i())) {
            return;
        }
        ((ebwd) ebwlVar).c = dhisVar.i();
    }

    @Override // defpackage.ebym
    public final void b(dhis dhisVar, ebwl ebwlVar) {
        if (!dhisVar.l() || "null".equals(dhisVar.j())) {
            return;
        }
        ((ebwd) ebwlVar).b = dhisVar.j();
    }

    @Override // defpackage.ebym
    public final void c(dhis dhisVar, ebwl ebwlVar) {
        int gM = dhisVar.gM("is_dasher");
        int i = 1;
        if (gM == 1) {
            i = 3;
        } else if (gM == 2) {
            i = 2;
        }
        ((ebwd) ebwlVar).g = i;
    }
}
