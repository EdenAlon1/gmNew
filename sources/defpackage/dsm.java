package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsm extends ffhv implements ffjm {
    long a;
    int b;
    /* synthetic */ long c;
    final /* synthetic */ dsp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsm(dsp dspVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = dspVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsm) c(new kan(((kan) obj).a), (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            long r0 = r11.a
            long r2 = r11.c
            defpackage.ffci.b(r12)
            goto L67
        L14:
            long r1 = r11.a
            long r3 = r11.c
            defpackage.ffci.b(r12)
            goto L4b
        L1c:
            long r3 = r11.c
            defpackage.ffci.b(r12)
            goto L34
        L22:
            defpackage.ffci.b(r12)
            long r4 = r11.c
            dsp r12 = r11.d
            ijj r12 = r12.f
            r11.b = r3
            java.lang.Object r12 = r12.e(r4, r11)
            if (r12 == r0) goto L79
            r3 = r4
        L34:
            kan r12 = (defpackage.kan) r12
            long r5 = r12.a
            long r5 = defpackage.kan.c(r3, r5)
            dsp r12 = r11.d
            r11.c = r3
            r11.a = r5
            r11.b = r2
            java.lang.Object r12 = r12.g(r5, r11)
            if (r12 == r0) goto L79
            r1 = r5
        L4b:
            kan r12 = (defpackage.kan) r12
            long r8 = r12.a
            dsp r12 = r11.d
            ijj r5 = r12.f
            long r6 = defpackage.kan.c(r1, r8)
            r11.c = r3
            r11.a = r8
            r12 = 3
            r11.b = r12
            r10 = r11
            java.lang.Object r12 = r5.d(r6, r8, r10)
            if (r12 == r0) goto L79
            r2 = r3
            r0 = r8
        L67:
            kan r12 = (defpackage.kan) r12
            long r4 = r12.a
            long r0 = defpackage.kan.c(r0, r4)
            long r0 = defpackage.kan.c(r2, r0)
            kan r12 = new kan
            r12.<init>(r0)
            return r12
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dsm dsmVar = new dsm(this.d, ffguVar);
        dsmVar.c = ((kan) obj).a;
        return dsmVar;
    }
}
