package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqfr {
    public final ffbr a;
    private final cqoh b;
    private final ffsk c;
    private final ffbz d;
    private final fgcq e;

    public cqfr(ffbr ffbrVar, cqoh cqohVar, ffsk ffskVar) {
        ffbrVar.getClass();
        cqohVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = cqohVar;
        this.c = ffskVar;
        this.d = ffca.a(new ffix() { // from class: cqfk
            @Override // defpackage.ffix
            public final Object invoke() {
                comy comyVar = (comy) cqfr.this.a.b();
                comu c = comv.c();
                c.d(comb.FORWARD_SYNC_WORK_ORGANIZER);
                c.f(cqgk.a);
                return comyVar.a(c.a());
            }
        });
        ffxx e = a().e();
        int i = fgcz.a;
        this.e = fgbn.a(e, ffskVar, fgcy.b, 1);
    }

    public final comc a() {
        return (comc) this.d.a();
    }

    public final cqgk b(cqgk cqgkVar, boolean z, AtomicBoolean atomicBoolean) {
        cqgo a = cqgn.a((cqfv) cqgkVar.toBuilder());
        atomicBoolean.set(((cqgk) a.a.instance).f != z);
        cqfv cqfvVar = a.a;
        cqfvVar.copyOnWrite();
        ((cqgk) cqfvVar.instance).f = z;
        if (z) {
            eyja d = eykm.d(this.b.f().toEpochMilli());
            d.getClass();
            cqfv cqfvVar2 = a.a;
            cqfvVar2.copyOnWrite();
            cqgk cqgkVar2 = (cqgk) cqfvVar2.instance;
            cqgkVar2.g = d;
            cqgkVar2.b |= 4;
        }
        return a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cqfl
            if (r0 == 0) goto L13
            r0 = r5
            cqfl r0 = (defpackage.cqfl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqfl r0 = new cqfl
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            fgcq r5 = r4.e
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            cqgk r5 = (defpackage.cqgk) r5
            boolean r5 = r5.f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqfr.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cqfm
            if (r0 == 0) goto L13
            r0 = r6
            cqfm r0 = (defpackage.cqfm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cqfm r0 = new cqfm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            cqfr r0 = r0.d
            defpackage.ffci.b(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            cqfr r2 = r0.d
            defpackage.ffci.b(r6)
            goto L48
        L3a:
            defpackage.ffci.b(r6)
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L79
            r2 = r5
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L52
            r6 = 0
            return r6
        L52:
            fgcq r6 = r2.e
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.fgbj.a(r6, r0)
            if (r6 == r1) goto L79
            r0 = r2
        L5f:
            cqgk r6 = (defpackage.cqgk) r6
            eyja r6 = r6.g
            if (r6 != 0) goto L67
            eyja r6 = defpackage.eyja.a
        L67:
            r6.getClass()
            j$.time.Instant r6 = defpackage.eykn.d(r6)
            cqoh r0 = r0.b
            j$.time.Instant r0 = r0.f()
            j$.time.Duration r6 = j$.time.Duration.between(r6, r0)
            return r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqfr.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(final boolean r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cqfq
            if (r0 == 0) goto L13
            r0 = r9
            cqfq r0 = (defpackage.cqfq) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cqfq r0 = new cqfq
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.a
            fflb r8 = (defpackage.fflb) r8
            defpackage.ffci.b(r9)
            goto L85
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            boolean r8 = r0.b
            fflb r2 = r0.f
            java.lang.Object r4 = r0.a
            cqfr r4 = (defpackage.cqfr) r4
            defpackage.ffci.b(r9)
            r6 = r2
            r2 = r9
            r9 = r6
            goto L6d
        L45:
            defpackage.ffci.b(r9)
            fflb r9 = new fflb
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r5 = 0
            r2.<init>(r5)
            r9.a = r2
            comc r2 = r7.a()
            cqfi r5 = new cqfi
            r5.<init>()
            r0.a = r7
            r0.f = r9
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r2.d(r5, r0)
            if (r2 == r1) goto L92
            r4 = r7
        L6d:
            cqgk r2 = (defpackage.cqgk) r2
            fgcq r2 = r4.e
            cqfp r4 = new cqfp
            r4.<init>(r2, r8)
            r0.a = r9
            r8 = 0
            r0.f = r8
            r0.e = r3
            java.lang.Object r8 = defpackage.fgbj.a(r4, r0)
            if (r8 != r1) goto L84
            goto L92
        L84:
            r8 = r9
        L85:
            java.lang.Object r8 = r8.a
            java.util.concurrent.atomic.AtomicBoolean r8 = (java.util.concurrent.atomic.AtomicBoolean) r8
            boolean r8 = r8.get()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqfr.e(boolean, ffgu):java.lang.Object");
    }
}
