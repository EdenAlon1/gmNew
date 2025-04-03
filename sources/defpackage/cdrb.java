package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdrb implements cdwr {
    @Override // defpackage.cdws
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((cdvx) obj).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cdrd r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cdra
            if (r0 == 0) goto L13
            r0 = r6
            cdra r0 = (defpackage.cdra) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdra r0 = new cdra
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            crty r5 = r5.eR()
            r6 = 4
            elfl r5 = r5.ah(r6)
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            ceyt r5 = defpackage.ceyt.i()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdrb.b(cdrd, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdwr
    public final /* bridge */ /* synthetic */ Object d(Object obj, ceuw ceuwVar, Object obj2, ffgu ffguVar) {
        return b((cdrd) obj, ffguVar);
    }
}
