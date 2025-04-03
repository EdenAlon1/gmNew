package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijj {
    public ijo a;
    public ijo b;
    public ffix c = new ijg(this);
    public ffsk d;

    public final long a(long j, long j2, int i) {
        ijf c = c();
        if (c != null) {
            return c.a(j, j2, i);
        }
        return 0L;
    }

    public final long b(long j, int i) {
        ijf c = c();
        if (c != null) {
            return c.b(j, i);
        }
        return 0L;
    }

    public final ijf c() {
        ijo ijoVar = this.a;
        if (ijoVar != null) {
            return ijoVar.f();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r14 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r14 != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r10, long r12, defpackage.ffgu r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof defpackage.ijh
            if (r0 == 0) goto L13
            r0 = r14
            ijh r0 = (defpackage.ijh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ijh r0 = new ijh
            r0.<init>(r9, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.ffci.b(r14)
            goto L68
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.ffci.b(r14)
            goto L50
        L37:
            defpackage.ffci.b(r14)
            ijf r14 = r9.c()
            r4 = 0
            if (r14 != 0) goto L55
            ijo r1 = r9.b
            if (r1 == 0) goto L6f
            r6.c = r3
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.c(r2, r4, r6)
            if (r14 == r0) goto L6d
        L50:
            kan r14 = (defpackage.kan) r14
            long r4 = r14.a
            goto L6f
        L55:
            r7 = r12
            r12 = r2
            r2 = r10
            r10 = r4
            r4 = r7
            ijf r1 = r9.c()
            if (r1 == 0) goto L6e
            r6.c = r12
            java.lang.Object r14 = r1.c(r2, r4, r6)
            if (r14 == r0) goto L6d
        L68:
            kan r14 = (defpackage.kan) r14
            long r4 = r14.a
            goto L6f
        L6d:
            return r0
        L6e:
            r4 = r10
        L6f:
            kan r10 = new kan
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijj.d(long, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r5, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.iji
            if (r0 == 0) goto L13
            r0 = r7
            iji r0 = (defpackage.iji) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iji r0 = new iji
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            ijf r7 = r4.c()
            if (r7 == 0) goto L46
            r0.c = r3
            java.lang.Object r7 = r7.d(r5, r0)
            if (r7 == r1) goto L45
        L40:
            kan r7 = (defpackage.kan) r7
            long r5 = r7.a
            goto L48
        L45:
            return r1
        L46:
            r5 = 0
        L48:
            kan r7 = new kan
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijj.e(long, ffgu):java.lang.Object");
    }

    public final ffsk f() {
        ffsk ffskVar = (ffsk) this.c.invoke();
        if (ffskVar != null) {
            return ffskVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
