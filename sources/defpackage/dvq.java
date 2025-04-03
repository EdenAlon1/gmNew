package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvq implements dtt {
    public final dvw a;
    public final cxt b;
    public final cyj c;
    private final hvl d = drp.c;

    public dvq(dvw dvwVar, cyj cyjVar, cxt cxtVar) {
        this.a = dvwVar;
        this.c = cyjVar;
        this.b = cxtVar;
    }

    @Override // defpackage.dpq
    public final /* synthetic */ Object a(drd drdVar, float f, ffgu ffguVar) {
        return b(drdVar, f, dtv.a, ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dtt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.drd r5, float r6, defpackage.ffji r7, defpackage.ffgu r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.dvo
            if (r0 == 0) goto L13
            r0 = r8
            dvo r0 = (defpackage.dvo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dvo r0 = new dvo
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r8)
            r0.c = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 == r1) goto L5c
        L3a:
            dvb r8 = (defpackage.dvb) r8
            java.lang.Object r5 = r8.a
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            cxv r6 = r8.b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4c
            goto L56
        L4c:
            java.lang.Object r5 = r6.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L56:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvq.b(drd, float, ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.drd r11, float r12, defpackage.ffji r13, defpackage.ffgu r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.dvk
            if (r0 == 0) goto L13
            r0 = r14
            dvk r0 = (defpackage.dvk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dvk r0 = new dvk
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r13 = r0.a
            defpackage.ffci.b(r14)
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.ffci.b(r14)
            hvl r14 = r10.d
            dvn r4 = new dvn
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r7
            r0.d = r3
            java.lang.Object r14 = defpackage.ffra.a(r14, r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r13 = r7
        L4c:
            dvb r14 = (defpackage.dvb) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvq.c(drd, float, ffji, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.drd r8, float r9, float r10, defpackage.ffji r11, defpackage.ffgu r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.dvp
            if (r0 == 0) goto L13
            r0 = r12
            dvp r0 = (defpackage.dvp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dvp r0 = new dvp
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.ffci.b(r12)
            goto L7a
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            defpackage.ffci.b(r12)
            float r12 = java.lang.Math.abs(r9)
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L3d
            goto L80
        L3d:
            float r12 = java.lang.Math.abs(r10)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 == 0) goto L80
            r6.c = r2
            cyj r12 = r7.c
            float r12 = defpackage.cyk.b(r12, r10)
            float r12 = java.lang.Math.abs(r12)
            float r1 = java.lang.Math.abs(r9)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 < 0) goto L61
            cyj r12 = r7.c
            dvd r1 = new dvd
            r1.<init>(r12)
            goto L68
        L61:
            cxt r12 = r7.b
            dwb r1 = new dwb
            r1.<init>(r12)
        L68:
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r9)
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r10)
            r2 = r8
            r5 = r11
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            if (r12 == r0) goto L7f
        L7a:
            dvb r12 = (defpackage.dvb) r12
            cxv r8 = r12.b
            return r8
        L7f:
            return r0
        L80:
            r8 = 28
            cxv r8 = defpackage.cxw.b(r9, r10, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvq.d(drd, float, float, ffji, ffgu):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dvq)) {
            return false;
        }
        dvq dvqVar = (dvq) obj;
        return ffkj.e(dvqVar.b, this.b) && ffkj.e(dvqVar.c, this.c) && ffkj.e(dvqVar.a, this.a);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
    }
}
