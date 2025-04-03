package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ovw {
    public static final Object a(otb otbVar, boolean z, ffgu ffguVar) {
        if (!otbVar.r()) {
            return ((fggf) otbVar.k()).a;
        }
        if (((ott) ffguVar.u().get(ott.a)) == null) {
            return z ? otbVar.j() : otbVar.i();
        }
        throw null;
    }

    public static final Object b(otb otbVar, boolean z, boolean z2, ffji ffjiVar) {
        Object a;
        otbVar.l();
        otbVar.m();
        a = ffqz.a(ffhe.a, new ovr(otbVar, z, z2, ffjiVar, null));
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.otb r14, boolean r15, boolean r16, defpackage.ffji r17, defpackage.ffgu r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof defpackage.ovt
            if (r1 == 0) goto L15
            r1 = r0
            ovt r1 = (defpackage.ovt) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f = r2
            goto L1a
        L15:
            ovt r1 = new ovt
            r1.<init>(r0)
        L1a:
            r6 = r1
            java.lang.Object r0 = r6.e
            ffhh r7 = defpackage.ffhh.a
            int r1 = r6.f
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L4c
            if (r1 == r8) goto L48
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            defpackage.ffci.b(r0)
            return r0
        L30:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L38:
            boolean r14 = r6.d
            boolean r15 = r6.c
            java.lang.Object r1 = r6.b
            java.lang.Object r3 = r6.a
            defpackage.ffci.b(r0)
            r12 = r14
            r13 = r1
            r14 = r3
        L46:
            r11 = r15
            goto L91
        L48:
            defpackage.ffci.b(r0)
            return r0
        L4c:
            defpackage.ffci.b(r0)
            boolean r0 = r14.r()
            if (r0 == 0) goto L78
            boolean r0 = r14.t()
            if (r0 == 0) goto L78
            boolean r0 = r14.s()
            if (r0 == 0) goto L78
            ovv r0 = new ovv
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r15 = r0
            r6.f = r8
            java.lang.Object r14 = r14.w(r15, r6)
            if (r14 != r7) goto L77
            goto La9
        L77:
            return r14
        L78:
            r4 = r16
            r6.a = r14
            r5 = r17
            r6.b = r5
            r6.c = r15
            r6.d = r4
            r6.f = r3
            java.lang.Object r3 = a(r14, r4, r6)
            if (r3 != r7) goto L8d
            goto La9
        L8d:
            r0 = r3
            r12 = r4
            r13 = r5
            goto L46
        L91:
            ffhd r0 = (defpackage.ffhd) r0
            ovs r8 = new ovs
            r9 = 0
            r10 = r14
            otb r10 = (defpackage.otb) r10
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.a = r14
            r6.b = r14
            r6.f = r2
            java.lang.Object r14 = defpackage.ffra.a(r0, r8, r6)
            if (r14 != r7) goto Laa
        La9:
            return r7
        Laa:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovw.c(otb, boolean, boolean, ffji, ffgu):java.lang.Object");
    }
}
