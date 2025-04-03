package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xza implements xyg {
    private final atwr a;
    private final yla b;

    public xza(yla ylaVar, atwr atwrVar) {
        this.b = ylaVar;
        this.a = atwrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.xyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xho r6, defpackage.xyj r7, java.lang.String r8, defpackage.ffgu r9) {
        /*
            r5 = this;
            boolean r8 = r9 instanceof defpackage.xyy
            if (r8 == 0) goto L13
            r8 = r9
            xyy r8 = (defpackage.xyy) r8
            int r0 = r8.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.d = r0
            goto L18
        L13:
            xyy r8 = new xyy
            r8.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r8.b
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.String r6 = r8.g
            java.lang.Object r7 = r8.a
            drem r0 = r8.f
            xho r8 = r8.e
            defpackage.ffci.b(r9)
            r3 = r6
            r6 = r8
            goto L8f
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            defpackage.ffci.b(r9)
            doxs r9 = r6.a
            boolean r1 = r9 instanceof defpackage.dsci
            if (r1 == 0) goto Lac
            drli r9 = (defpackage.drli) r9
            drlk r1 = r7.c
            drkd r1 = r1.a
            drme r3 = r7.b
            java.lang.Long r4 = r7.d
            drlh r9 = defpackage.drma.e(r9, r1, r3, r4)
            drem r9 = (defpackage.drem) r9
            java.lang.String r1 = r9.b
            atwr r3 = r5.a
            android.net.Uri r1 = android.net.Uri.parse(r1)
            boolean r3 = r3.a()
            if (r3 != 0) goto L6f
            xhn r3 = r6.b
            android.net.Uri r3 = r3.c
            if (r3 != 0) goto L67
            goto L6f
        L67:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "A DraftAttachment.Processed Sticker should not have a local copy"
            r6.<init>(r7)
            throw r6
        L6f:
            drld r3 = r9.a
            drlx r3 = defpackage.drjy.a(r3)
            java.lang.String r3 = r3.a()
            r1.getClass()
            r8.e = r6
            r8.f = r9
            r8.a = r1
            r8.g = r3
            r8.d = r2
            java.lang.Object r7 = r5.b(r1, r6, r7, r8)
            if (r7 == r0) goto Lab
            r0 = r9
            r9 = r7
            r7 = r1
        L8f:
            android.net.Uri r9 = (android.net.Uri) r9
            android.util.Size r8 = new android.util.Size
            int r1 = r0.c
            int r0 = r0.d
            r8.<init>(r1, r0)
            xhn r6 = r6.b
            awap r6 = r6.b
            xzm r0 = new xzm
            r0.<init>(r3, r9, r8, r6)
            xzc r6 = new xzc
            android.net.Uri r7 = (android.net.Uri) r7
            r6.<init>(r0, r7)
            return r6
        Lab:
            return r0
        Lac:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xza.a(xho, xyj, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r5, defpackage.xho r6, defpackage.xyj r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.xyz
            if (r0 == 0) goto L13
            r0 = r8
            xyz r0 = (defpackage.xyz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xyz r0 = new xyz
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ffci.b(r8)     // Catch: defpackage.yky -> L27
            goto L49
        L27:
            r5 = move-exception
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r8)
            xhn r6 = r6.b
            android.net.Uri r6 = r6.c
            if (r6 == 0) goto L3b
            return r6
        L3b:
            boolean r6 = r7.e
            if (r6 == 0) goto L55
            yla r6 = r4.b     // Catch: defpackage.yky -> L27
            r0.c = r3     // Catch: defpackage.yky -> L27
            java.lang.Object r8 = defpackage.ykx.a(r6, r5, r0)     // Catch: defpackage.yky -> L27
            if (r8 == r1) goto L4c
        L49:
            android.net.Uri r8 = (android.net.Uri) r8     // Catch: defpackage.yky -> L27
            return r8
        L4c:
            return r1
        L4d:
            xyh r6 = new xyh
            java.lang.String r7 = "Failed to download sticker attachment"
            r6.<init>(r7, r5)
            throw r6
        L55:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xza.b(android.net.Uri, xho, xyj, ffgu):java.lang.Object");
    }
}
