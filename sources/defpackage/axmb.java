package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axmb {
    public final cscu a;
    public final cskc b;
    private final crty c;
    private final ffsk d;

    public axmb(crty crtyVar, cscu cscuVar, ffsk ffskVar, axld axldVar, axkm axkmVar, crtz crtzVar, chje chjeVar, ctvb ctvbVar, aolr aolrVar) {
        crtyVar.getClass();
        ffskVar.getClass();
        axldVar.getClass();
        axkmVar.getClass();
        crtzVar.getClass();
        chjeVar.getClass();
        ctvbVar.getClass();
        aolrVar.getClass();
        this.c = crtyVar;
        this.a = cscuVar;
        this.d = ffskVar;
        this.b = cskc.g("BugleCmsFolsom", "CmsInitialRestoreEncryptionStatusChecker");
    }

    public final elfl a(eisx eisxVar, boolean z, Context context) {
        elfl c;
        eisxVar.getClass();
        context.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new axma(this, context, eisxVar, z, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r2.a(r8, r9, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffjn r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.axly
            if (r0 == 0) goto L13
            r0 = r9
            axly r0 = (defpackage.axly) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            axly r0 = new axly
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r9)
            goto La1
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.b
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.Object r2 = r0.a
            ffjn r2 = (defpackage.ffjn) r2
            defpackage.ffci.b(r9)
            goto L7c
        L42:
            java.lang.Object r8 = r0.b
            ffjn r8 = (defpackage.ffjn) r8
            java.lang.Object r2 = r0.a
            axmb r2 = (defpackage.axmb) r2
            defpackage.ffci.b(r9)
            goto L64
        L4e:
            defpackage.ffci.b(r9)
            crty r9 = r7.c
            elfl r9 = r9.x()
            r0.a = r7
            r0.b = r8
            r0.e = r5
            java.lang.Object r9 = defpackage.fgfz.c(r9, r0)
            if (r9 == r1) goto La4
            r2 = r7
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            crty r2 = r2.c
            elfl r2 = r2.w()
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r2 = defpackage.fgfz.c(r2, r0)
            if (r2 == r1) goto La4
            r6 = r2
            r2 = r8
            r8 = r9
            r9 = r6
        L7c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8c
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L8b
            goto L8c
        L8b:
            r5 = 0
        L8c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r9.getClass()
            r4 = 0
            r0.a = r4
            r0.b = r4
            r0.e = r3
            java.lang.Object r8 = r2.a(r8, r9, r0)
            if (r8 != r1) goto La1
            goto La4
        La1:
            ffcu r8 = defpackage.ffcu.a
            return r8
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axmb.b(ffjn, ffgu):java.lang.Object");
    }
}
