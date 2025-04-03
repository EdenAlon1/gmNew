package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqmh implements aqly {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/recipient/kids/RecipientsTrustedContactsApiImpl");
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final aqvh g;
    private final cghm h;

    public aqmh(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, aqvh aqvhVar, cghm cghmVar, ffbr ffbrVar6) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        aqvhVar.getClass();
        cghmVar.getClass();
        ffbrVar6.getClass();
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.b = ffbrVar4;
        this.c = ffbrVar5;
        this.g = aqvhVar;
        this.h = cghmVar;
    }

    public static final Uri f(aoku aokuVar) {
        Uri build = new Uri.Builder().scheme((aokuVar.u() || aokuVar.B()) ? "mailto" : "sms").opaquePart(aokuVar.o()).build();
        build.getClass();
        return build;
    }

    private final boolean g(aoku aokuVar) {
        return aokuVar.u() || aokuVar.B();
    }

    @Override // defpackage.aqly
    public final elfl a(aoku aokuVar) {
        elfl c;
        aokuVar.getClass();
        Object b = this.f.b();
        b.getClass();
        c = axol.c((ffsk) b, ffhe.a, ffsm.a, new aqmg(this, aokuVar, null));
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.aqly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aqmb
            if (r0 == 0) goto L13
            r0 = r7
            aqmb r0 = (defpackage.aqmb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aqmb r0 = new aqmb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            goto L65
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            aqmh r2 = r0.e
            defpackage.ffci.b(r7)
            goto L4c
        L3a:
            defpackage.ffci.b(r7)
            cghm r7 = r5.h
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 == r1) goto L92
            r2 = r5
        L4c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8d
            java.util.HashSet r6 = defpackage.ffdx.V(r6)
            r7 = 0
            r0.e = r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r7 = r2.c(r6, r0)
            if (r7 == r1) goto L92
        L65:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r6 = r7.values()
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L76
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L76
            goto L8d
        L76:
            java.util.Iterator r6 = r6.iterator()
        L7a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8d
            java.lang.Object r7 = r6.next()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7a
            r4 = 0
        L8d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqmh.b(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022c A[LOOP:2: B:61:0x0226->B:63:0x022c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // defpackage.aqly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Set r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqmh.c(java.util.Set, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[LOOP:1: B:22:0x007f->B:24:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aqmc
            if (r0 == 0) goto L13
            r0 = r5
            aqmc r0 = (defpackage.aqmc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aqmc r0 = new aqmc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            aqvh r5 = r4.g
            aqge r5 = r5.a()
            elfl r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 == r1) goto La1
        L47:
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L55:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r5.next()
            r2 = r1
            aqux r2 = (defpackage.aqux) r2
            j$.util.Optional r2 = r2.m()
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L55
            r0.add(r1)
            goto L55
        L70:
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ffdx.n(r0, r1)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La0
            java.lang.Object r1 = r0.next()
            aqux r1 = (defpackage.aqux) r1
            j$.util.Optional r1 = r1.m()
            java.lang.Object r1 = r1.get()
            aoku r1 = (defpackage.aoku) r1
            java.lang.String r1 = r1.l()
            r1.getClass()
            r5.add(r1)
            goto L7f
        La0:
            return r5
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqmh.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        if (r11 != r1) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.aoku r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqmh.e(aoku, ffgu):java.lang.Object");
    }
}
