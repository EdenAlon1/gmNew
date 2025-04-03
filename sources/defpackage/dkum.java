package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkum implements eeht {
    private static final dktn a = new dktn("PAccesNetworkInfoMessageFilter");
    private final djjt b;
    private final int c;

    public dkum(int i, djjt djjtVar) {
        this.c = i;
        this.b = djjtVar;
    }

    private static final void b(eenj eenjVar, String str) {
        try {
            eenjVar.q(eene.g("P-Access-Network-Info", str));
        } catch (Exception e) {
            dkty.j(e, a, "Exception while adding Access Info Header", new Object[0]);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r2.equals("INVITE") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        if (r2.equals("BYE") != false) goto L82;
     */
    @Override // defpackage.eeht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.eenj r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkum.a(eenj):void");
    }
}
