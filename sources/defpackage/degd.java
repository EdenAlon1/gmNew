package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degd implements defs {
    public static final entd a = entd.c("BugleWearable");
    public final ffbr b;
    public final ffbr c;
    public final ffhd d;
    public final ffsk e;
    public final ffbr f;
    public final ffbr g;

    public degd(ffbr ffbrVar, ffbr ffbrVar2, ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffhdVar;
        this.e = ffskVar;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
    }

    @Override // defpackage.defs
    public final elfl a(cvia cviaVar, String str) {
        elfl c;
        cviaVar.getClass();
        str.getClass();
        c = axol.c(this.e, ffhe.a, ffsm.a, new dega(this, cviaVar, str, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.defs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cvia r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.deft
            if (r0 == 0) goto L13
            r0 = r6
            deft r0 = (defpackage.deft) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            deft r0 = new deft
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            eyjx r5 = r0.f
            cvhv r1 = r0.e
            cvhv r0 = r0.d
            defpackage.ffci.b(r6)
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ffci.b(r6)
            cvhx r6 = defpackage.cvhx.a
            eyfq r6 = r6.createBuilder()
            cvhw r6 = (defpackage.cvhw) r6
            cvhv r6 = defpackage.cvhu.a(r6)
            eyjx r2 = r6.b()
            r0.d = r6
            r0.e = r6
            r0.f = r2
            r0.c = r3
            java.lang.Object r5 = r4.d(r5, r0)
            if (r5 == r1) goto L64
            r0 = r6
            r1 = r0
            r6 = r5
            r5 = r2
        L5a:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r1.c(r5, r6)
            cvhx r5 = r0.a()
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.degd.b(cvia, ffgu):java.lang.Object");
    }

    @Override // defpackage.defs
    public final elfl c(List list) {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new degb(this, list, null));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cvia r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.degd.d(cvia, ffgu):java.lang.Object");
    }
}
