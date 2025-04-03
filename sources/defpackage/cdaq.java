package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdaq {
    public static final entd a = entd.c("BugleCms");
    public final akzt b;
    public final cfyt c;
    public final asjt d;
    public final asjc e;
    public final String f;
    public final ccum g;
    private final ffsk h;
    private final axdf i;

    public cdaq(akzt akztVar, cfyt cfytVar, asjt asjtVar, ffsk ffskVar, axdf axdfVar, asjc asjcVar, String str, ccum ccumVar) {
        this.b = akztVar;
        this.c = cfytVar;
        this.d = asjtVar;
        this.h = ffskVar;
        this.i = axdfVar;
        this.e = asjcVar;
        this.f = str;
        this.g = ccumVar;
    }

    private final void h(ccvl ccvlVar, Throwable th) {
        ccvt ccvtVar = ccvlVar.b;
        this.i.g(axcq.a(ccvtVar.e, ccvtVar.b), csfx.b(ccvlVar.c), ccvtVar.c, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Throwable r6, defpackage.cdat r7, defpackage.ccvl r8, defpackage.ffgu r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.cdao
            if (r0 == 0) goto L13
            r0 = r9
            cdao r0 = (defpackage.cdao) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cdao r0 = new cdao
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            cdat r7 = r0.f
            java.lang.Object r6 = r0.a
            cdaq r8 = r0.e
            defpackage.ffci.b(r9)
            goto Ld3
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.ffci.b(r9)
            if (r8 == 0) goto La1
            ccvt r9 = r8.b
            int r9 = r9.b
            r2 = 9
            int r2 = defpackage.ccue.a(r2)
            boolean r2 = defpackage.cdal.a(r9, r2)
            if (r2 == 0) goto L4e
            axue r9 = defpackage.axue.CMS_EVENT_TYPE_DELETE_TRIGGERED
            goto L91
        L4e:
            r2 = 17
            int r2 = defpackage.ccue.a(r2)
            boolean r2 = defpackage.cdal.a(r9, r2)
            if (r2 == 0) goto L5d
            axue r9 = defpackage.axue.CMS_EVENT_TYPE_CREATE_TRIGGERED
            goto L91
        L5d:
            r2 = 5
            int r2 = defpackage.ccue.a(r2)
            boolean r2 = defpackage.cdal.a(r9, r2)
            if (r2 != 0) goto L8f
            r2 = 3
            int r2 = defpackage.ccue.a(r2)
            boolean r2 = defpackage.cdal.a(r9, r2)
            if (r2 != 0) goto L8f
            r2 = 65
            int r2 = defpackage.ccue.a(r2)
            boolean r2 = defpackage.cdal.a(r9, r2)
            if (r2 != 0) goto L8f
            r2 = 33
            int r2 = defpackage.ccue.a(r2)
            boolean r9 = defpackage.cdal.a(r9, r2)
            if (r9 == 0) goto L8c
            goto L8f
        L8c:
            axue r9 = defpackage.axue.CMS_EVENT_TYPE_UNKNOWN
            goto L91
        L8f:
            axue r9 = defpackage.axue.CMS_EVENT_TYPE_UPDATE_TRIGGERED
        L91:
            ccum r2 = r5.g
            java.lang.String r4 = r8.a
            j$.util.Optional.empty()
            j$.util.Optional.of(r6)
            r2.e(r9, r4, r8)
            r5.h(r8, r6)
        La1:
            entd r9 = defpackage.cdaq.a
            ensk r9 = r9.i()
            ensz r9 = (defpackage.ensz) r9
            ensk r9 = r9.g(r6)
            ensz r9 = (defpackage.ensz) r9
            if (r8 == 0) goto Lb6
            ccvt r8 = r8.b
            java.lang.String r8 = r8.a
            goto Lb8
        Lb6:
            java.lang.String r8 = "unknown"
        Lb8:
            java.lang.String r2 = "Uncaught exception while processing WorkHandler item %s"
            r9.t(r2, r8)
            cfyt r8 = r5.c
            elfl r8 = r8.b(r6)
            r0.e = r5
            r0.a = r6
            r0.f = r7
            r0.d = r3
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 != r1) goto Ld2
            return r1
        Ld2:
            r8 = r5
        Ld3:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r8.c(r7, r6)
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdaq.a(java.lang.Throwable, cdat, ccvl, ffgu):java.lang.Object");
    }

    public final Object b(Object obj, final axue axueVar, final ccvl ccvlVar, final Optional optional) {
        final String str = ccvlVar.a;
        ffji ffjiVar = new ffji() { // from class: cdaj
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ccvm ccvmVar = (ccvm) obj2;
                ccvmVar.getClass();
                cdaq.this.g.b(axueVar, str, optional, ccvmVar.a(), ccvlVar);
                return ffcu.a;
            }
        };
        if (ffch.d(obj)) {
            try {
                ffjiVar.invoke(obj);
            } catch (Throwable th) {
                obj = ffci.a(th);
            }
        }
        ffji ffjiVar2 = new ffji() { // from class: cdak
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                Throwable th2 = (Throwable) obj2;
                th2.getClass();
                Optional.of(th2);
                cdaq.this.g.e(axueVar, str, ccvlVar);
                return ffcu.a;
            }
        };
        Throwable c = ffch.c(obj);
        if (c == null) {
            return obj;
        }
        try {
            ffjiVar2.invoke(c);
            throw c;
        } catch (Throwable th2) {
            return ffci.a(th2);
        }
    }

    public final void c(cdat cdatVar, Throwable th) {
        String c = cdatVar.c(this.f);
        epeg a2 = axdy.a(th);
        a2.getClass();
        int i = a2.bs;
        Integer valueOf = i == 0 ? null : Integer.valueOf(i);
        if (valueOf != null) {
            this.b.e(c, valueOf.intValue());
        }
    }

    public final void d(Object obj, ccvl ccvlVar) {
        Throwable c = ffch.c(obj);
        if (c != null) {
            h(ccvlVar, c);
        }
    }

    public final void e(Object obj, ccvl ccvlVar) {
        Throwable c = ffch.c(obj);
        if (c != null) {
            axol.k(this.h, null, new cdap(c, this, ccvlVar, null), 3);
        }
    }

    public final void g(Object obj, cdat cdatVar) {
        if (ffch.d(obj)) {
            this.b.e(cdatVar.c(this.f), 22);
        }
        Throwable c = ffch.c(obj);
        if (c != null) {
            c(cdatVar, c);
        }
    }
}
