package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drr implements ijf {
    public boolean a;
    private final dsp b;

    public drr(dsp dspVar, boolean z) {
        this.b = dspVar;
        this.a = z;
    }

    @Override // defpackage.ijf
    public final long a(long j, long j2, int i) {
        if (!this.a) {
            return 0L;
        }
        dsp dspVar = this.b;
        if (dspVar.a.i()) {
            return 0L;
        }
        return dspVar.f(dspVar.a(dspVar.a.a(dspVar.a(dspVar.b(j2)))));
    }

    @Override // defpackage.ijf
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ijf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r5, long r7, defpackage.ffgu r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof defpackage.drq
            if (r5 == 0) goto L13
            r5 = r9
            drq r5 = (defpackage.drq) r5
            int r6 = r5.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.d = r6
            goto L18
        L13:
            drq r5 = new drq
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r6 = r5.b
            ffhh r9 = defpackage.ffhh.a
            int r0 = r5.d
            r1 = 1
            if (r0 == 0) goto L3e
            if (r0 == r1) goto L38
            r7 = 2
            if (r0 != r7) goto L30
            long r7 = r5.a
            defpackage.ffci.b(r6)
            kan r6 = (defpackage.kan) r6
            long r5 = r6.a
            goto L5d
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            long r7 = r5.a
            defpackage.ffci.b(r6)
            goto L59
        L3e:
            defpackage.ffci.b(r6)
            boolean r6 = r4.a
            r2 = 0
            if (r6 == 0) goto L63
            dsp r6 = r4.b
            boolean r0 = r6.h
            if (r0 == 0) goto L4f
            r5 = r2
            goto L5d
        L4f:
            r5.a = r7
            r5.d = r1
            java.lang.Object r6 = r6.g(r7, r5)
            if (r6 == r9) goto L62
        L59:
            kan r6 = (defpackage.kan) r6
            long r5 = r6.a
        L5d:
            long r2 = defpackage.kan.c(r7, r5)
            goto L63
        L62:
            return r9
        L63:
            kan r5 = new kan
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drr.c(long, long, ffgu):java.lang.Object");
    }

    @Override // defpackage.ijf
    public final /* synthetic */ Object d(long j, ffgu ffguVar) {
        return new kan(0L);
    }
}
