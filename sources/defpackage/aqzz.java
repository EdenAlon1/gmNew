package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqzz implements arag {
    public final aolr a;
    private final ffsk b;
    private final azam c;
    private final ffbz d;

    public aqzz(ffsk ffskVar, azam azamVar, aolr aolrVar) {
        ffskVar.getClass();
        aolrVar.getClass();
        this.b = ffskVar;
        this.c = azamVar;
        this.a = aolrVar;
        this.d = ffca.a(new ffix() { // from class: aqzw
            @Override // defpackage.ffix
            public final Object invoke() {
                return aqzz.this.a.f();
            }
        });
    }

    private final aoku c() {
        return (aoku) this.d.a();
    }

    @Override // defpackage.arag
    public final elfl a(aqux aquxVar) {
        elfl c;
        c = axol.c(this.b, ffhe.a, ffsm.a, new aqzy(this, aquxVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.arag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aqux r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.aqzx
            if (r0 == 0) goto L13
            r0 = r9
            aqzx r0 = (defpackage.aqzx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqzx r0 = new aqzx
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.ffci.b(r9)
            goto L71
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.ffci.b(r9)
            azam r9 = r7.c
            azan r2 = defpackage.azan.SMS
            int r5 = r8.b()
            aoku r6 = r7.c()
            elfl r9 = r9.a(r2, r5, r6)
            r9.getClass()
            azam r2 = r7.c
            ffss r9 = defpackage.axol.e(r9)
            azan r5 = defpackage.azan.MMS
            int r8 = r8.b()
            aoku r6 = r7.c()
            elfl r8 = r2.a(r5, r8, r6)
            r8.getClass()
            ffss r8 = defpackage.axol.e(r8)
            r2 = 2
            ffss[] r2 = new defpackage.ffss[r2]
            r2[r3] = r9
            r2[r4] = r8
            r0.c = r4
            java.lang.Object r9 = defpackage.ffqv.b(r2, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r9.get(r3)
            azaj r8 = (defpackage.azaj) r8
            java.lang.Object r9 = r9.get(r4)
            azaj r9 = (defpackage.azaj) r9
            araa r0 = new araa
            r0.<init>(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqzz.b(aqux, ffgu):java.lang.Object");
    }
}
