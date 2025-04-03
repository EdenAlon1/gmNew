package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkr {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;

    public avkr(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    private final Object e(azch azchVar, ffgu ffguVar) {
        return ((azcj) this.c.b()).a(azchVar).a(ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.azcr r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.avkn
            if (r0 == 0) goto L13
            r0 = r7
            avkn r0 = (defpackage.avkn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avkn r0 = new avkn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            avkr r6 = r0.d
            defpackage.ffci.b(r7)
            goto L4e
        L38:
            defpackage.ffci.b(r7)
            ffbr r7 = r5.a
            java.lang.Object r7 = r7.b()
            azcn r7 = (defpackage.azcn) r7
            r0.d = r5
            r0.c = r4
            java.lang.Object r7 = r7.d(r6, r0)
            if (r7 == r1) goto L5d
            r6 = r5
        L4e:
            azch r7 = (defpackage.azch) r7
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.b(r7, r0)
            if (r6 != r1) goto L5c
            goto L5d
        L5c:
            return r6
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkr.a(azcr, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.azch r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.avko
            if (r0 == 0) goto L13
            r0 = r6
            avko r0 = (defpackage.avko) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avko r0 = new avko
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L69
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            azcg r6 = r5.b
            azcg r2 = defpackage.azcg.a
            if (r6 == r2) goto L60
            azcg r2 = defpackage.azcg.b
            if (r6 != r2) goto L3d
            goto L60
        L3d:
            azcr r5 = r5.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Creating a one to one RecipientsDescriptor for an unsupported destination type ("
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "). destinationToken="
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = "."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        L60:
            r0.c = r3
            java.lang.Object r6 = r4.e(r5, r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            awui r6 = (defpackage.awui) r6
            avkl r5 = new avkl
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkr.b(azch, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.azcr r6, defpackage.azhq r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.avkp
            if (r0 == 0) goto L13
            r0 = r8
            avkp r0 = (defpackage.avkp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avkp r0 = new avkp
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            azhq r7 = r0.e
            avkr r6 = r0.d
            defpackage.ffci.b(r8)
            goto L52
        L3a:
            defpackage.ffci.b(r8)
            ffbr r8 = r5.a
            java.lang.Object r8 = r8.b()
            azcn r8 = (defpackage.azcn) r8
            r0.d = r5
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = r8.d(r6, r0)
            if (r8 == r1) goto L63
            r6 = r5
        L52:
            azch r8 = (defpackage.azch) r8
            r2 = 0
            r0.d = r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r6 = r6.d(r8, r7, r0)
            if (r6 != r1) goto L62
            goto L63
        L62:
            return r6
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkr.c(azcr, azhq, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.azch r7, defpackage.azhq r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.avkq
            if (r0 == 0) goto L13
            r0 = r9
            avkq r0 = (defpackage.avkq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            avkq r0 = new avkq
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.a
            awwf r7 = (defpackage.awwf) r7
            defpackage.ffci.b(r9)
            goto L75
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            azch r7 = r0.e
            java.lang.Object r8 = r0.a
            avkr r8 = (defpackage.avkr) r8
            defpackage.ffci.b(r9)
            goto L5f
        L40:
            defpackage.ffci.b(r9)
            azcg r9 = r7.b
            azcg r2 = defpackage.azcg.a
            if (r9 != r2) goto L84
            ffbr r9 = r6.b
            java.lang.Object r9 = r9.b()
            azfv r9 = (defpackage.azfv) r9
            r0.a = r6
            r0.e = r7
            r0.d = r4
            java.lang.Object r9 = r9.f(r8, r0)
            if (r9 != r1) goto L5e
            goto L83
        L5e:
            r8 = r6
        L5f:
            azfh r9 = (defpackage.azfh) r9
            awwf r9 = r9.a()
            r0.a = r9
            r2 = 0
            r0.e = r2
            r0.d = r3
            java.lang.Object r7 = r8.e(r7, r0)
            if (r7 == r1) goto L83
            r5 = r9
            r9 = r7
            r7 = r5
        L75:
            java.util.List r8 = defpackage.ffdx.b(r9)
            engw r8 = defpackage.engq.a(r8)
            avkl r9 = new avkl
            r9.<init>(r7, r8, r4)
            return r9
        L83:
            return r1
        L84:
            java.lang.String r7 = "Recipient for private message in group must be of type PHONE_E164, not "
            java.lang.String r8 = "."
            java.lang.String r7 = defpackage.a.i(r9, r7, r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avkr.d(azch, azhq, ffgu):java.lang.Object");
    }
}
