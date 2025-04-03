package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aetb implements drwd {
    public final aetu a;
    public final ffhd b;
    private final aepg c;

    public aetb(aepg aepgVar, aetu aetuVar, ffhd ffhdVar) {
        aepgVar.getClass();
        aetuVar.getClass();
        ffhdVar.getClass();
        this.c = aepgVar;
        this.a = aetuVar;
        this.b = ffhdVar;
    }

    public final Object a(drva drvaVar, aeuk aeukVar, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.b), new aesw(null, drvaVar, this, aeukVar), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (r8 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        return defpackage.drwg.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.drwd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.drva r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aeta
            if (r0 == 0) goto L13
            r0 = r9
            aeta r0 = (defpackage.aeta) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aeta r0 = new aeta
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r9)
            goto L7e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            drva r8 = r0.e
            aetb r2 = r0.d
            defpackage.ffci.b(r9)
            goto L5d
        L3b:
            defpackage.ffci.b(r9)
            cfva r9 = defpackage.cjja.a
            cfva r9 = defpackage.cjja.h
            java.lang.Object r9 = r9.e()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L66
            aepg r9 = r7.c
            r0.d = r7
            r0.e = r8
            r0.c = r4
            java.lang.Object r9 = r9.c(r0)
            if (r9 == r1) goto L92
            r2 = r7
        L5d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8c
            goto L67
        L66:
            r2 = r7
        L67:
            ffhd r9 = r2.b
            ffhd r9 = defpackage.ekxi.a(r9)
            aesz r6 = new aesz
            r6.<init>(r5, r8, r2)
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r9 = defpackage.ffra.a(r9, r6, r0)
            if (r9 == r1) goto L92
        L7e:
            aeuk r9 = (defpackage.aeuk) r9
            if (r9 != 0) goto L83
            goto L8b
        L83:
            int r8 = r9.ordinal()
            if (r8 == r4) goto L8f
            if (r8 == r3) goto L8c
        L8b:
            return r5
        L8c:
            drwg r8 = defpackage.drwg.b
            return r8
        L8f:
            drwg r8 = defpackage.drwg.a
            return r8
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aetb.b(drva, ffgu):java.lang.Object");
    }

    @Override // defpackage.drwd
    public final Object c(drva drvaVar, ffgu ffguVar) {
        Object a = a(drvaVar, aeuk.UNASSIGNED, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
