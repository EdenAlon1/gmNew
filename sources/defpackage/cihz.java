package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cihz implements cihk {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/reflectedmessage/ReflectedReplyCpimHeadersHandlerDelegate");
    private final ffbr b;

    public cihz(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ba, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r11 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.cihk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fayv r9, defpackage.ciht r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cihy
            if (r0 == 0) goto L13
            r0 = r11
            cihy r0 = (defpackage.cihy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cihy r0 = new cihy
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.ffci.b(r11)     // Catch: java.lang.Exception -> L2b
            goto Lbc
        L2b:
            r9 = move-exception
            goto Lc4
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            fayv r9 = r0.d
            defpackage.ffci.b(r11)
            goto La0
        L3c:
            defpackage.ffci.b(r11)
            j$.util.Optional r11 = defpackage.clbe.b(r9)
            java.lang.Object r11 = r11.get()
            java.lang.String r2 = "Reply"
            boolean r11 = defpackage.ffkj.e(r11, r2)
            if (r11 == 0) goto Ld5
            bdhg r11 = defpackage.cnmg.a(r9)
            boolean r11 = r11.i()
            if (r11 != 0) goto Lcd
            enru r11 = defpackage.cihz.a
            ensk r11 = r11.h()
            ensn r2 = defpackage.ente.a
            java.lang.String r5 = "BugleDittoRcs"
            r11.Y(r2, r5)
            java.lang.String r2 = "handleCustomCpimHeaders"
            r5 = 34
            java.lang.String r6 = "com/google/android/apps/messaging/shared/net/handler/reflectedmessage/ReflectedReplyCpimHeadersHandlerDelegate"
            java.lang.String r7 = "ReflectedReplyCpimHeadersHandlerDelegate.kt"
            ensk r11 = r11.h(r6, r2, r5, r7)
            enrr r11 = (defpackage.enrr) r11
            j$.util.Optional r2 = defpackage.clbe.b(r9)
            java.lang.Object r2 = r2.get()
            bdhg r5 = defpackage.cnmg.a(r9)
            java.lang.String r5 = r5.f()
            java.lang.String r6 = "Handling CPIM headers: referenceType: %s, repliedToRcsMessageId= %s."
            r11.D(r6, r2, r5)
            ffbr r11 = r8.b
            java.lang.Object r11 = r11.b()
            ciif r11 = (defpackage.ciif) r11
            java.lang.String r10 = r10.e
            r10.getClass()
            r0.d = r9
            r0.c = r4
            java.lang.Object r11 = r11.a(r10, r0)
            if (r11 == r1) goto Lcc
        La0:
            aotl r11 = (defpackage.aotl) r11
            bdhg r9 = defpackage.cnmg.a(r9)     // Catch: java.lang.Exception -> L2b
            java.lang.String r9 = r9.f()     // Catch: java.lang.Exception -> L2b
            elfl r9 = r11.T(r9)     // Catch: java.lang.Exception -> L2b
            r9.getClass()     // Catch: java.lang.Exception -> L2b
            r10 = 0
            r0.d = r10     // Catch: java.lang.Exception -> L2b
            r0.c = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r11 = defpackage.fgfz.c(r9, r0)     // Catch: java.lang.Exception -> L2b
            if (r11 == r1) goto Lcc
        Lbc:
            com.google.android.apps.messaging.shared.api.messaging.MessageId r11 = (com.google.android.apps.messaging.shared.api.messaging.MessageId) r11     // Catch: java.lang.Exception -> L2b
            cihj r9 = new cihj
            r9.<init>(r11)
            return r9
        Lc4:
            cihm r10 = new cihm
            java.lang.String r11 = "Could not find the replied-to RCS message."
            r10.<init>(r11, r9)
            throw r10
        Lcc:
            return r1
        Lcd:
            cihm r9 = new cihm
            java.lang.String r10 = "The repliedToRcsMessageId cannot be empty."
            r9.<init>(r10)
            throw r9
        Ld5:
            cihm r10 = new cihm
            j$.util.Optional r9 = defpackage.clbe.b(r9)
            java.lang.Object r9 = r9.get()
            java.util.Objects.toString(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r11 = "Invalid ReferenceType for reply: referenceType: "
            java.lang.String r9 = r11.concat(r9)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cihz.a(fayv, ciht, ffgu):java.lang.Object");
    }

    @Override // defpackage.cihk
    public final boolean b() {
        return true;
    }
}
