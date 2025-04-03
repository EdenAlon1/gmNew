package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjux implements cjum {
    public final ejiq a;
    public final ffsk b;
    private final cqoh c;
    private final elho d;
    private boolean e;

    public cjux(ejiq ejiqVar, ffsk ffskVar, cqoh cqohVar, elho elhoVar) {
        ejiqVar.getClass();
        ffskVar.getClass();
        cqohVar.getClass();
        elhoVar.getClass();
        this.a = ejiqVar;
        this.b = ffskVar;
        this.c = cqohVar;
        this.d = elhoVar;
    }

    private static final Object h(elho elhoVar, String str, String[] strArr, final ffix ffixVar) {
        emyl emylVar = new emyl() { // from class: cjup
            @Override // defpackage.emyl
            public final Object get() {
                return ffix.this.invoke();
            }
        };
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, 0);
        ekzm c = elho.c();
        if (c == null) {
            return elhoVar.a(emylVar, str, strArr2);
        }
        try {
            return elhoVar.a(emylVar, str, strArr2);
        } finally {
            ekyf.a(c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cjum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(final defpackage.cjwg r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cjuq
            if (r0 == 0) goto L13
            r0 = r7
            cjuq r0 = (defpackage.cjuq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjuq r0 = new cjuq
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            elho r7 = r5.d
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            cjuo r4 = new cjuo
            r4.<init>()
            java.lang.String r6 = "KeyValueProfileCacheImpl#getIfPresent"
            java.lang.Object r6 = h(r7, r6, r2, r4)
            r6.getClass()
            com.google.common.util.concurrent.ListenableFuture r6 = (com.google.common.util.concurrent.ListenableFuture) r6
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r6, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            emxc r7 = (defpackage.emxc) r7
            java.lang.Object r6 = r7.f()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjux.a(cjwg, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cjum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cjwg r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cjut
            if (r0 == 0) goto L13
            r0 = r6
            cjut r0 = (defpackage.cjut) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjut r0 = new cjut
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            r0.c = r3
            java.lang.Object r6 = r4.g(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjux.b(cjwg, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r8 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.cjum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cjwg r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cjuu
            if (r0 == 0) goto L13
            r0 = r8
            cjuu r0 = (defpackage.cjuu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjuu r0 = new cjuu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r8)
            goto L60
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            cjwg r7 = r0.e
            cjux r2 = r0.d
            defpackage.ffci.b(r8)
            goto L4b
        L3b:
            defpackage.ffci.b(r8)
            r0.d = r6
            r0.e = r7
            r0.c = r5
            java.lang.Object r8 = r6.b(r7, r0)
            if (r8 == r1) goto L6e
            r2 = r6
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L69
            r8 = 0
            r0.d = r8
            r0.e = r8
            r0.c = r4
            java.lang.Object r8 = r2.f(r7, r0)
            if (r8 == r1) goto L6e
        L60:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L69
            r3 = r5
        L69:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjux.c(cjwg, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.cjum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cjwg r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cjuv
            if (r0 == 0) goto L13
            r0 = r7
            cjuv r0 = (defpackage.cjuv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjuv r0 = new cjuv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
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
            cjwg r6 = r0.e
            cjux r2 = r0.d
            defpackage.ffci.b(r7)
            goto L4a
        L3a:
            defpackage.ffci.b(r7)
            r0.d = r5
            r0.e = r6
            r0.c = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 == r1) goto L67
            r2 = r5
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L61
            r7 = 0
            r0.d = r7
            r0.e = r7
            r0.c = r3
            java.lang.Object r6 = r2.f(r6, r0)
            if (r6 != r1) goto L60
            goto L67
        L60:
            return r6
        L61:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjux.d(cjwg, ffgu):java.lang.Object");
    }

    @Override // defpackage.cjum
    public final Object e(final cjwg cjwgVar, final cjwc cjwcVar, ffgu ffguVar) {
        Object h = h(this.d, "KeyValueProfileCacheImpl#put", new String[0], new ffix() { // from class: cjun
            @Override // defpackage.ffix
            public final Object invoke() {
                cjwf cjwfVar = (cjwf) cjwg.a.createBuilder();
                cjwfVar.getClass();
                cjwh.c(cjwgVar.c, cjwfVar);
                cjwg a = cjwh.a(cjwfVar);
                ffhe ffheVar = ffhe.a;
                ffsm ffsmVar = ffsm.a;
                ffhd a2 = ekxi.a(ffheVar);
                cjuw cjuwVar = new cjuw(null, cjwcVar);
                cjux cjuxVar = cjux.this;
                return cjuxVar.a.b(a, fgfz.b(cjuxVar.b, a2, ffsmVar, cjuwVar));
            }
        });
        h.getClass();
        Object c = fgfz.c((ListenableFuture) h, ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
    
        if (j$.time.Duration.between(r6.b, r0.c.f()).compareTo(j$.time.Duration.ofHours(r1)) > 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.cjwg r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cjur
            if (r0 == 0) goto L13
            r0 = r6
            cjur r0 = (defpackage.cjur) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjur r0 = new cjur
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cjwg r5 = r0.e
            cjux r0 = r0.d
            defpackage.ffci.b(r6)
            goto L57
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            cjwg r6 = defpackage.cjwg.a
            eyfq r6 = r6.createBuilder()
            cjwf r6 = (defpackage.cjwf) r6
            r6.getClass()
            java.lang.String r2 = r5.c
            defpackage.cjwh.c(r2, r6)
            cjwg r6 = defpackage.cjwh.a(r6)
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r4.a(r6, r0)
            if (r6 == r1) goto L7d
            r0 = r4
        L57:
            ejjb r6 = (defpackage.ejjb) r6
            long r1 = r5.d
            boolean r5 = r0.e
            r5 = 0
            if (r6 == 0) goto L77
            cqoh r0 = r0.c
            j$.time.Instant r0 = r0.f()
            j$.time.Instant r6 = r6.b
            j$.time.Duration r6 = j$.time.Duration.between(r6, r0)
            j$.time.Duration r0 = j$.time.Duration.ofHours(r1)
            int r6 = r6.compareTo(r0)
            if (r6 <= 0) goto L77
            goto L78
        L77:
            r3 = r5
        L78:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjux.f(cjwg, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.cjwg r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cjus
            if (r0 == 0) goto L13
            r0 = r6
            cjus r0 = (defpackage.cjus) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjus r0 = new cjus
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            cjwg r6 = defpackage.cjwg.a
            eyfq r6 = r6.createBuilder()
            cjwf r6 = (defpackage.cjwf) r6
            r6.getClass()
            java.lang.String r5 = r5.c
            defpackage.cjwh.c(r5, r6)
            cjwg r5 = defpackage.cjwh.a(r6)
            r0.c = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 == r1) goto L59
        L4e:
            ejjb r6 = (defpackage.ejjb) r6
            if (r6 != 0) goto L53
            goto L54
        L53:
            r3 = 0
        L54:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjux.g(cjwg, ffgu):java.lang.Object");
    }
}
