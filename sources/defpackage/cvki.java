package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvki implements cvjo {
    public final comc a;
    public final ffbr b;
    public final ffbr c;
    private final ffhd d;
    private final ffsk e;

    public cvki(comc comcVar, ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar2.getClass();
        this.a = comcVar;
        this.d = ffhdVar;
        this.e = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.cvjo
    public final Object a(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new cvjq(null, this), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cvjo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cvjs
            if (r0 == 0) goto L13
            r0 = r6
            cvjs r0 = (defpackage.cvjs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvjs r0 = new cvjs
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.d
            ffhd r6 = defpackage.ekxi.a(r6)
            cvjr r2 = new cvjr
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvki.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.cvjo
    public final Object c(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new cvjt(null, this), ffguVar);
    }

    @Override // defpackage.cvjo
    public final Object d(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new cvju(null, this), ffguVar);
    }

    @Override // defpackage.cvjo
    public final Object e(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new cvjv(null, this), ffguVar);
    }

    @Override // defpackage.cvjo
    public final Object f(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new cvjw(null, this), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cvjo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cvjy
            if (r0 == 0) goto L13
            r0 = r6
            cvjy r0 = (defpackage.cvjy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvjy r0 = new cvjy
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.d
            ffhd r6 = defpackage.ekxi.a(r6)
            cvjx r2 = new cvjx
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvki.g(ffgu):java.lang.Object");
    }

    @Override // defpackage.cvjo
    public final Object h(Instant instant, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.d), new cvke(null, this, instant), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.cvjo
    public final Object i(enip enipVar, Instant instant, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.d), new cvkg(null, this, instant, enipVar), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.cvjo
    public final void j(eisx eisxVar, String str, cvjj cvjjVar, cvjl cvjlVar) {
        cvjjVar.getClass();
        axol.k(this.e, null, new cvkb(this, str, cvjjVar, cvjlVar, eisxVar, null), 3);
    }

    @Override // defpackage.cvjo
    public final void k() {
        axol.k(this.e, null, new cvkd(this, null), 3);
    }

    @Override // defpackage.eiyd
    public final ListenableFuture l(eiyc eiycVar) {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new cvjz(this, eiycVar, null));
        return c;
    }

    public final Object m(ffgu ffguVar) {
        Object d = this.a.d(new ffji() { // from class: cvjp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cvjn cvjnVar = (cvjn) obj;
                cvjnVar.getClass();
                cvjm cvjmVar = (cvjm) cvjnVar.toBuilder();
                cvjmVar.copyOnWrite();
                cvjn cvjnVar2 = (cvjn) cvjmVar.instance;
                cvjnVar2.b &= -2;
                cvjnVar2.c = 0;
                eyfy build = cvjmVar.build();
                build.getClass();
                return (cvjn) build;
            }
        }, ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }
}
