package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckst extends ceut {
    private final ckss a;

    public ckst(ckss ckssVar) {
        this.a = ckssVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("UpdateRcsGroupNameHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cksv.a.getParserForType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (defpackage.eykm.b(r7) >= 0) goto L16;
     */
    @Override // defpackage.ceut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ defpackage.elfl j(defpackage.ceuw r7, defpackage.eyhs r8) {
        /*
            r6 = this;
            cksv r8 = (defpackage.cksv) r8
            java.lang.String r7 = r8.h
            boolean r7 = r7.isEmpty()
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L17
            java.lang.String r7 = r8.c
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L15
            goto L17
        L15:
            r7 = r0
            goto L18
        L17:
            r7 = r1
        L18:
            java.lang.String r2 = "Conversation ID and RCS group ID are empty"
            defpackage.emxf.b(r7, r2)
            int r7 = r8.b
            r7 = r7 & r1
            if (r7 == 0) goto L32
            eyja r7 = r8.f
            if (r7 != 0) goto L28
            eyja r7 = defpackage.eyja.a
        L28:
            long r2 = defpackage.eykm.b(r7)
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L33
        L32:
            r0 = r1
        L33:
            java.lang.String r7 = "The timestamp provided is negative"
            defpackage.emxf.b(r0, r7)
            ckss r7 = r6.a
            elfl r7 = r7.c(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckst.j(ceuw, eyhs):elfl");
    }
}
