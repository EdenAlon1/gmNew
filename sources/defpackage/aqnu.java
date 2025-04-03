package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqnu {
    private final ffbr a;

    public aqnu(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.engw r6, defpackage.ffji r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.aqnt
            if (r0 == 0) goto L13
            r0 = r8
            aqnt r0 = (defpackage.aqnt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqnt r0 = new aqnt
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yjb r7 = r0.d
            defpackage.ffci.b(r8)
            goto L9b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ffci.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r6, r2)
            r8.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L44:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r6.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            aoku r2 = r2.g()
            j$.util.Optional r2 = r2.e()
            r2.getClass()
            java.lang.Object r2 = defpackage.fflm.b(r2)
            awui r2 = (defpackage.awui) r2
            r8.add(r2)
            goto L44
        L65:
            boolean r6 = r8.isEmpty()
            if (r6 == 0) goto L6c
            goto L7f
        L6c:
            java.util.Iterator r6 = r8.iterator()
        L70:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r6.next()
            awui r2 = (defpackage.awui) r2
            if (r2 != 0) goto L70
            goto Ld5
        L7f:
            ffbr r6 = r5.a
            java.lang.Object r6 = r6.b()
            avrk r6 = (defpackage.avrk) r6
            elfl r6 = r6.a(r8)
            r6.getClass()
            r8 = r7
            yjb r8 = (defpackage.yjb) r8
            r0.d = r8
            r0.c = r4
            java.lang.Object r8 = defpackage.fgfz.c(r6, r0)
            if (r8 == r1) goto Lda
        L9b:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r6 = r8.values()
            boolean r8 = r6 instanceof java.util.Collection
            if (r8 == 0) goto Lad
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto Lad
        Lab:
            r3 = r4
            goto Ld5
        Lad:
            java.util.Iterator r6 = r6.iterator()
        Lb1:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lab
            java.lang.Object r8 = r6.next()
            avmz r8 = (defpackage.avmz) r8
            avoi r8 = r8.a()
            azau r8 = defpackage.azav.a(r8)
            aqpm r8 = defpackage.aqpk.a(r8)
            java.lang.Object r8 = r7.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lb1
        Ld5:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqnu.a(engw, ffji, ffgu):java.lang.Object");
    }
}
