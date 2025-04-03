package defpackage;

import j$.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxkk implements cxkb {
    public final comc a;
    public final BiFunction b;
    private final Function c;
    private final ffsk d;
    private final ffsk e;
    private final Optional f;

    public cxkk(comc comcVar, Function function, BiFunction biFunction, ffsk ffskVar, ffsk ffskVar2, Optional optional) {
        ffskVar.getClass();
        ffskVar2.getClass();
        this.a = comcVar;
        this.c = function;
        this.b = biFunction;
        this.d = ffskVar;
        this.e = ffskVar2;
        this.f = optional;
    }

    @Override // defpackage.cxkb
    public final cxkc a(eyhs eyhsVar) {
        Object apply;
        eyhsVar.getClass();
        apply = this.c.apply(eyhsVar);
        return new cxkc((akue) apply);
    }

    @Override // defpackage.cxkb
    public final elfl b() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cxkd(this, null));
        return c;
    }

    public final elfl c(akue akueVar) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cxkg(this, akueVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cxkf
            if (r0 == 0) goto L13
            r0 = r8
            cxkf r0 = (defpackage.cxkf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cxkf r0 = new cxkf
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cxkk r0 = r0.d
            defpackage.ffci.b(r8)
            goto L54
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.ffci.b(r8)
            ffsk r8 = r7.e
            ffhe r2 = defpackage.ffhe.a
            ffsm r4 = defpackage.ffsm.a
            ffhd r2 = defpackage.ekxi.a(r2)
            cxke r5 = new cxke
            r6 = 0
            r5.<init>(r6, r7)
            ffss r8 = defpackage.ffra.b(r8, r2, r4, r5)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            r0 = r7
        L54:
            eyhs r8 = (defpackage.eyhs) r8
            cxkc r1 = new cxkc
            java.util.function.Function r0 = r0.c
            java.lang.Object r8 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r0, r8)
            akue r8 = (defpackage.akue) r8
            r1.<init>(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxkk.d(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cxkc r9, defpackage.akue r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cxki
            if (r0 == 0) goto L13
            r0 = r11
            cxki r0 = (defpackage.cxki) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cxki r0 = new cxki
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r11)
            goto L6d
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.ffci.b(r11)
            boolean r9 = r9.b(r10)
            r11 = 0
            if (r9 == 0) goto L72
            j$.util.Optional r9 = r8.f
            r9.isPresent()
            r9 = 0
            elfl r2 = defpackage.elfo.e(r9)
            r2.getClass()
            ffss r2 = defpackage.axol.e(r2)
            ffsk r4 = r8.d
            ffhe r5 = defpackage.ffhe.a
            ffsm r6 = defpackage.ffsm.a
            ffhd r5 = defpackage.ekxi.a(r5)
            cxkh r7 = new cxkh
            r7.<init>(r9, r8, r10)
            ffss r9 = defpackage.ffra.b(r4, r5, r6, r7)
            r10 = 2
            ffss[] r10 = new defpackage.ffss[r10]
            r10[r11] = r2
            r10[r3] = r9
            r0.c = r3
            java.lang.Object r9 = defpackage.ffqv.b(r10, r0)
            if (r9 != r1) goto L6d
            return r1
        L6d:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L72:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxkk.e(cxkc, akue, ffgu):java.lang.Object");
    }
}
