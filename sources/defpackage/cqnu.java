package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqnu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqnv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqnu(cqnv cqnvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqnvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqnu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (r1.c(r10) == r0) goto L16;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater$updateZeroOrNullCharsetForTextParts$1"
            java.lang.String r4 = "TelephonyDatabaseUpdater.kt"
            java.lang.String r5 = "BugleTelephony"
            r6 = 1
            if (r1 == 0) goto L1b
            if (r1 == r6) goto L15
            defpackage.ffci.b(r11)     // Catch: java.lang.Exception -> L19
            goto L7d
        L15:
            defpackage.ffci.b(r11)     // Catch: java.lang.Exception -> L19
            goto L33
        L19:
            r11 = move-exception
            goto L5f
        L1b:
            defpackage.ffci.b(r11)
            bbhj r11 = defpackage.bbhj.a     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "PduPartUpdater#updateZeroOrNullCharsetForTextParts"
            cqnt r7 = new cqnt     // Catch: java.lang.Exception -> L19
            cqnv r8 = r10.b     // Catch: java.lang.Exception -> L19
            r9 = 0
            r7.<init>(r8, r9)     // Catch: java.lang.Exception -> L19
            r10.a = r6     // Catch: java.lang.Exception -> L19
            java.lang.Object r11 = r11.a(r1, r7, r10)     // Catch: java.lang.Exception -> L19
            if (r11 != r0) goto L33
            goto L5e
        L33:
            cqnv r1 = r10.b     // Catch: java.lang.Exception -> L19
            ffpw r11 = (defpackage.ffpw) r11     // Catch: java.lang.Exception -> L19
            long r6 = r11.c     // Catch: java.lang.Exception -> L19
            enru r11 = defpackage.cqnv.a     // Catch: java.lang.Exception -> L19
            ensk r11 = r11.e()     // Catch: java.lang.Exception -> L19
            ensn r8 = defpackage.ente.a     // Catch: java.lang.Exception -> L19
            r11.Y(r8, r5)     // Catch: java.lang.Exception -> L19
            r8 = 80
            ensk r11 = r11.h(r3, r2, r8, r4)     // Catch: java.lang.Exception -> L19
            enrr r11 = (defpackage.enrr) r11     // Catch: java.lang.Exception -> L19
            java.lang.String r8 = "TelephonyDatabaseUpdater#updateZeroOrNullCharsetForTextParts time: [%s]ms"
            long r6 = defpackage.ffpw.g(r6)     // Catch: java.lang.Exception -> L19
            r11.s(r8, r6)     // Catch: java.lang.Exception -> L19
            r11 = 2
            r10.a = r11     // Catch: java.lang.Exception -> L19
            java.lang.Object r11 = r1.c(r10)     // Catch: java.lang.Exception -> L19
            if (r11 != r0) goto L7d
        L5e:
            return r0
        L5f:
            enru r0 = defpackage.cqnv.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r5)
            enrr r0 = (defpackage.enrr) r0
            ensk r11 = r0.g(r11)
            r0 = 87
            ensk r11 = r11.h(r3, r2, r0, r4)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r0 = "Error thrown during MMS charset update!"
            r11.q(r0)
        L7d:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqnu(this.b, ffguVar);
    }
}
