package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xbd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xbe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbd(xbe xbeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xbeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xbd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r6 = (defpackage.aqmo) defpackage.fflm.b(r6);
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com/google/android/apps/messaging/conversation2/actions/verifiedbadge/RbmVerificationDialog$showDialog$1"
            java.lang.String r2 = "RbmVerificationDialog.kt"
            ffhh r3 = defpackage.ffhh.a
            int r4 = r5.a
            defpackage.ffci.b(r6)
            if (r4 == 0) goto L10
            goto L1e
        L10:
            xbe r6 = r5.b
            r4 = 1
            r5.a = r4
            ffxx r6 = r6.d
            java.lang.Object r6 = defpackage.fgbj.c(r6, r5)
            if (r6 != r3) goto L1e
            return r3
        L1e:
            j$.util.Optional r6 = (j$.util.Optional) r6
            if (r6 == 0) goto L85
            java.lang.Object r6 = defpackage.fflm.b(r6)
            aqmo r6 = (defpackage.aqmo) r6
            if (r6 != 0) goto L2b
            goto L85
        L2b:
            java.lang.String r3 = r6.e()
            if (r3 == 0) goto L85
            java.lang.String r4 = r6.d()     // Catch: java.lang.Exception -> L64
            android.net.Uri r6 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L64
            boolean r4 = defpackage.csuu.w(r6)
            if (r4 != 0) goto L55
            enru r6 = defpackage.xbe.a
            ensk r6 = r6.j()
            r3 = 62
            ensk r6 = r6.h(r1, r0, r3, r2)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r0 = "Verifier logo is not a local resource. Not showing verification dialog."
            r6.q(r0)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L55:
            xbe r0 = r5.b
            xbc r1 = new xbc
            r1.<init>()
            ajjc r6 = r0.e
            defpackage.ajjb.b(r6, r1)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L64:
            r3 = move-exception
            enru r4 = defpackage.xbe.a
            ensk r4 = r4.j()
            enrr r4 = (defpackage.enrr) r4
            ensk r3 = r4.g(r3)
            r4 = 52
            ensk r0 = r3.h(r1, r0, r4, r2)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r6 = r6.d()
            java.lang.String r1 = "Unable to parse verifier logo URI: %s. Not showing verification dialog."
            r0.t(r1, r6)
            ffcu r6 = defpackage.ffcu.a
            return r6
        L85:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xbd(this.b, ffguVar);
    }
}
