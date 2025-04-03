package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mun implements mvc {
    public final int a;
    final /* synthetic */ muq b;

    public mun(muq muqVar, int i) {
        this.b = muqVar;
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 != 0) goto L21;
     */
    @Override // defpackage.mvc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.mgz r12, defpackage.lxz r13, int r14) {
        /*
            r11 = this;
            muq r0 = r11.b
            boolean r1 = r0.y()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            int r1 = r11.a
            r0.t(r1)
            mvb[] r3 = r0.m
            r4 = r3[r1]
            boolean r8 = r0.w
            r3 = r14 & 2
            muy r9 = r4.b
            r10 = 1
            if (r3 == 0) goto L1e
            r7 = r10
            goto L20
        L1e:
            r3 = 0
            r7 = r3
        L20:
            r5 = r12
            r6 = r13
            int r12 = r4.d(r5, r6, r7, r8, r9)
            r13 = -4
            if (r12 != r13) goto L5b
            boolean r12 = r6.eR()
            if (r12 != 0) goto L5a
            r12 = r14 & 1
            r14 = r14 & 4
            if (r14 != 0) goto L52
            if (r12 == 0) goto L43
            muw r12 = r4.a
            muy r14 = r4.b
            muv r3 = r12.c
            luv r12 = r12.a
            defpackage.muw.b(r3, r6, r14, r12)
            goto L5a
        L43:
            muw r12 = r4.a
            muy r14 = r4.b
            muv r3 = r12.c
            luv r5 = r12.a
            muv r14 = defpackage.muw.b(r3, r6, r14, r5)
            r12.c = r14
            goto L55
        L52:
            if (r12 == 0) goto L55
            goto L5a
        L55:
            int r12 = r4.f
            int r12 = r12 + r10
            r4.f = r12
        L5a:
            r12 = r13
        L5b:
            if (r12 != r2) goto L60
            r0.u(r1)
        L60:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mun.a(mgz, lxz, int):int");
    }

    @Override // defpackage.mvc
    public final int b(long j) {
        muq muqVar = this.b;
        if (muqVar.y()) {
            return 0;
        }
        int i = this.a;
        muqVar.t(i);
        mvb mvbVar = muqVar.m[i];
        int b = mvbVar.b(j, muqVar.w);
        mvbVar.p(b);
        if (b != 0) {
            return b;
        }
        muqVar.u(i);
        return 0;
    }

    @Override // defpackage.mvc
    public final void c() {
        muq muqVar = this.b;
        mvb mvbVar = muqVar.m[this.a];
        mpa mpaVar = mvbVar.d;
        if (mpaVar == null || mpaVar.a() != 1) {
            muqVar.v();
        } else {
            moz c = mvbVar.d.c();
            lti.f(c);
            throw c;
        }
    }

    @Override // defpackage.mvc
    public final boolean d() {
        muq muqVar = this.b;
        if (muqVar.y()) {
            return false;
        }
        return muqVar.m[this.a].r(muqVar.w);
    }
}
