package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dklr implements dkhk {
    final /* synthetic */ dkls a;
    private int b = 1;

    public dklr(dkls dklsVar) {
        this.a = dklsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        r3 = ((defpackage.dkyn) r5).b;
        r5 = r9.a.g.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r5.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        ((defpackage.dklu) r5.next()).f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        defpackage.dkty.i(r6, "Error while invoking listener: %s", r6.getMessage());
     */
    @Override // defpackage.dkhk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.dkhi r10, java.lang.String r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dklr.d(dkhi, java.lang.String, byte[]):void");
    }

    @Override // defpackage.dkhk
    public final void q(int i, String str) {
        this.a.i = null;
    }

    @Override // defpackage.dkhk
    public final void r(dkqr dkqrVar) {
        this.a.i = null;
    }

    @Override // defpackage.dkhk
    public final void u() {
        this.a.i = null;
    }

    @Override // defpackage.dkhk
    public final void v(dkqr dkqrVar) {
        dkty.g("Subscription terminated because of exception: %s", dkqrVar.getMessage());
        this.a.i = null;
    }

    @Override // defpackage.dkhk
    public final void t() {
    }
}
