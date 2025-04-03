package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsu {
    public final ffsk a;
    private final ffhd b;
    private final ffsk c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final Optional h;

    public cpsu(ffhd ffhdVar, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, Optional optional) {
        ffhdVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = ffhdVar;
        this.c = ffskVar;
        this.a = ffskVar2;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = optional;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object g(cpsu cpsuVar, awui awuiVar, febo feboVar, ffgu ffguVar, int i) {
        if ((i & 4) != 0) {
            feboVar = null;
        }
        return cpsuVar.f(awuiVar, feboVar, ffguVar);
    }

    @ffbs
    public final cpsz a(awui awuiVar) {
        esun a;
        awuiVar.getClass();
        efbd.b();
        ffbr ffbrVar = this.e;
        a = ((akke) this.d.b()).a(c(awuiVar, null), ((akkf) ffbrVar.b()).a(awuiVar));
        return new cpsz(a, this.a);
    }

    @ffbs
    public final elfl b(awui awuiVar) {
        elfl c;
        awuiVar.getClass();
        c = axol.c(this.a, ffhe.a, ffsm.a, new cpsq(this, awuiVar, null));
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [cprz, java.lang.Object] */
    public final essz c(awui awuiVar, febo feboVar) {
        chin chinVar = (chin) this.g.b();
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        if (b != awuh.PHONE) {
            throw new cpsp();
        }
        djrk djrkVar = (djrk) this.f.b();
        String str = awuiVar.d;
        str.getClass();
        chgx a = chinVar.a(djrkVar.a(str));
        this.h.isPresent();
        return new essz(this.h.get().a(a, feboVar));
    }

    @ffbs
    public final elfl e(awui awuiVar, cphu cphuVar) {
        elfl c;
        awuiVar.getClass();
        c = axol.c(this.c, ffhe.a, ffsm.a, new cpsr(cphuVar, this, awuiVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.awui r6, defpackage.febo r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cpst
            if (r0 == 0) goto L13
            r0 = r8
            cpst r0 = (defpackage.cpst) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cpst r0 = new cpst
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            awui r6 = r0.e
            cpsu r7 = r0.d
            defpackage.ffci.b(r8)
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r8)
            ffhd r8 = r5.b
            ffhd r8 = defpackage.ekxi.a(r8)
            cpss r2 = new cpss
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.d = r5
            r0.e = r6
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r7 = r5
        L50:
            essz r8 = (defpackage.essz) r8
            ffbr r0 = r7.e
            java.lang.Object r0 = r0.b()
            akkf r0 = (defpackage.akkf) r0
            esph r6 = r0.a(r6)
            ffbr r7 = r7.d
            java.lang.Object r7 = r7.b()
            akke r7 = (defpackage.akke) r7
            esun r6 = defpackage.estk.a(r7, r8, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpsu.f(awui, febo, ffgu):java.lang.Object");
    }
}
