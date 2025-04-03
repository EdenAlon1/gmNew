package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdwd implements cdwp {
    private final cdwh a;
    private final azei b;
    private final cdwg c;

    public cdwd(cdwh cdwhVar, azei azeiVar) {
        this.a = cdwhVar;
        this.b = azeiVar;
        this.c = cdwhVar.a();
    }

    @Override // defpackage.cdwp
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, ceuw ceuwVar, cdws cdwsVar, Exception exc, ffgu ffguVar) {
        return b((cdvy) obj, obj2, ceuwVar, exc, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cdvy r8, java.lang.Object r9, defpackage.ceuw r10, java.lang.Exception r11, defpackage.ffgu r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.cdwc
            if (r0 == 0) goto L13
            r0 = r12
            cdwc r0 = (defpackage.cdwc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdwc r0 = new cdwc
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            cdwd r8 = r6.d
            defpackage.ffci.b(r12)
            goto L47
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.ffci.b(r12)
            cdwg r1 = r7.c
            r6.d = r7
            r6.c = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r8 = r1.b(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L46
            return r0
        L46:
            r8 = r7
        L47:
            azei r8 = r8.b
            cdwb r9 = new cdwb
            r9.<init>()
            r8.d(r9)
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdwd.b(cdvy, java.lang.Object, ceuw, java.lang.Exception, ffgu):java.lang.Object");
    }
}
