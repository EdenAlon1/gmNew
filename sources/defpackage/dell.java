package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dell implements djrl {
    public static final enru a = enru.c("com/google/android/apps/messaging/welcome/v1/consent/ConsentRcsProvisioningListenerImpl");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final ffsk f;
    private final ffbr g;
    private final ffbr h;

    public dell(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.f = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.e = ffbrVar6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.delg
            if (r0 == 0) goto L13
            r0 = r9
            delg r0 = (defpackage.delg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            delg r0 = new delg
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dell r0 = r0.d
            defpackage.ffci.b(r9)
            goto L47
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            defpackage.ffci.b(r9)
            ffbr r9 = r8.b
            java.lang.Object r9 = r9.b()
            cvjo r9 = (defpackage.cvjo) r9
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r9.c(r0)
            if (r9 == r1) goto L7e
            r0 = r8
        L47:
            j$.time.Instant r9 = (j$.time.Instant) r9
            if (r9 == 0) goto L5f
            ffbr r1 = r0.c
            java.lang.Object r1 = r1.b()
            cqoh r1 = (defpackage.cqoh) r1
            j$.time.Instant r1 = r1.f()
            r1.getClass()
            j$.time.Duration r9 = defpackage.ernl.a(r1, r9)
            goto L60
        L5f:
            r9 = 0
        L60:
            r1 = 0
            if (r9 == 0) goto L78
            long r4 = r9.toDays()
            ffbr r9 = r0.g
            java.lang.Object r9 = r9.b()
            java.lang.Number r9 = (java.lang.Number) r9
            long r6 = r9.longValue()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L78
            goto L79
        L78:
            r3 = r1
        L79:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dell.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.djrl
    public final void b(Set set) {
        axol.k(this.f, null, new deli(this, set, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Set r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.delh
            if (r0 == 0) goto L13
            r0 = r6
            delh r0 = (defpackage.delh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            delh r0 = new delh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.b
            java.lang.Object r6 = r6.b()
            cvjo r6 = (defpackage.cvjo) r6
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.e(r0)
            if (r6 == r1) goto L70
        L46:
            enip r6 = (defpackage.enip) r6
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L55
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L55
        L53:
            r3 = r1
            goto L6b
        L55:
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L59
        L6b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dell.c(java.util.Set, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Set r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.delj
            if (r0 == 0) goto L13
            r0 = r7
            delj r0 = (defpackage.delj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            delj r0 = new delj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.ffci.b(r7)
            goto L66
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.ffci.b(r7)
            return r7
        L38:
            defpackage.ffci.b(r7)
            ffbr r7 = r5.e
            java.lang.Object r7 = r7.b()
            avdi r7 = (defpackage.avdi) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L53
            r0.d = r4
            java.lang.Object r6 = r5.c(r6, r0)
            if (r6 != r1) goto L52
            goto L65
        L52:
            return r6
        L53:
            ffbr r7 = r5.b
            java.lang.Object r7 = r7.b()
            cvjo r7 = (defpackage.cvjo) r7
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            boolean r6 = defpackage.ffkj.e(r7, r6)
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dell.d(java.util.Set, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0063 -> B:10:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.Set r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.delk
            if (r0 == 0) goto L13
            r0 = r8
            delk r0 = (defpackage.delk) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            delk r0 = new delk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            dell r4 = r0.f
            defpackage.ffci.b(r8)
            goto L65
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ffci.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
            r4 = r6
            r2 = r8
        L43:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L74
            java.lang.Object r8 = r7.next()
            djrm r8 = (defpackage.djrm) r8
            ffbr r5 = r4.h
            java.lang.Object r5 = r5.b()
            djsi r5 = (defpackage.djsi) r5
            r0.f = r4
            r0.a = r2
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = r5.k(r8, r0)
            if (r8 == r1) goto L73
        L65:
            djrj r8 = (defpackage.djrj) r8
            if (r8 == 0) goto L6c
            java.lang.String r8 = r8.a
            goto L6d
        L6c:
            r8 = 0
        L6d:
            if (r8 == 0) goto L43
            r2.add(r8)
            goto L43
        L73:
            return r1
        L74:
            enip r7 = defpackage.engq.f(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dell.e(java.util.Set, ffgu):java.lang.Object");
    }
}
