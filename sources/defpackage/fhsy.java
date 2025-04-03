package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhsy extends fhta {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected fhsy(defpackage.fhsu r7, defpackage.fhsx r8, defpackage.fhsx r9) {
        /*
            r6 = this;
            int r0 = r7.h
            if (r0 == 0) goto L3d
            r1 = 5
            if (r0 == r1) goto L3d
            java.math.BigInteger r1 = defpackage.fhsr.b
            fhsx r1 = r7.c(r1)
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L38
            r4 = 2
            if (r0 == r4) goto L38
            r5 = 3
            if (r0 == r5) goto L2f
            r5 = 4
            if (r0 == r5) goto L26
            r4 = 6
            if (r0 != r4) goto L1e
            goto L38
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "unknown coordinate system"
            r7.<init>(r8)
            throw r7
        L26:
            fhsx[] r0 = new defpackage.fhsx[r4]
            r0[r2] = r1
            fhsx r1 = r7.d
            r0[r3] = r1
            goto L3f
        L2f:
            fhsx[] r0 = new defpackage.fhsx[r5]
            r0[r2] = r1
            r0[r3] = r1
            r0[r4] = r1
            goto L3f
        L38:
            fhsx[] r0 = new defpackage.fhsx[r3]
            r0[r2] = r1
            goto L3f
        L3d:
            fhsx[] r0 = defpackage.fhta.a
        L3f:
            r6.<init>(r7, r8, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhsy.<init>(fhsu, fhsx, fhsx):void");
    }

    @Override // defpackage.fhta
    public final boolean a() {
        fhsx i;
        fhsx l;
        fhsu fhsuVar = this.b;
        fhsx fhsxVar = fhsuVar.d;
        fhsx fhsxVar2 = fhsuVar.e;
        int i2 = fhsuVar.h;
        fhsx fhsxVar3 = this.c;
        if (i2 != 6) {
            fhsx fhsxVar4 = this.d;
            fhsx h = fhsxVar4.d(fhsxVar3).h(fhsxVar4);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("unsupported coordinate system");
                }
                fhsx fhsxVar5 = this.e[0];
                if (!fhsxVar5.n()) {
                    fhsx h2 = fhsxVar5.h(fhsxVar5.k());
                    h = h.h(fhsxVar5);
                    fhsxVar = fhsxVar.h(fhsxVar5);
                    fhsxVar2 = fhsxVar2.h(h2);
                }
            }
            return h.equals(fhsxVar3.d(fhsxVar).h(fhsxVar3.k()).d(fhsxVar2));
        }
        fhsx fhsxVar6 = this.e[0];
        boolean n = fhsxVar6.n();
        if (fhsxVar3.o()) {
            fhsx k = this.d.k();
            if (!n) {
                fhsxVar2 = fhsxVar2.h(fhsxVar6.k());
            }
            return k.equals(fhsxVar2);
        }
        fhsx fhsxVar7 = this.d;
        fhsx k2 = fhsxVar3.k();
        if (n) {
            i = fhsxVar7.k().d(fhsxVar7).d(fhsxVar);
            l = k2.k().d(fhsxVar2);
        } else {
            fhsx k3 = fhsxVar6.k();
            fhsx k4 = k3.k();
            i = fhsxVar7.d(fhsxVar6).i(fhsxVar7, fhsxVar, k3);
            l = k2.l(fhsxVar2, k4);
        }
        return i.h(k2).equals(l);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    @Override // defpackage.fhta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhsy.b():boolean");
    }

    protected fhsy(fhsu fhsuVar, fhsx fhsxVar, fhsx fhsxVar2, fhsx[] fhsxVarArr) {
        super(fhsuVar, fhsxVar, fhsxVar2, fhsxVarArr);
    }
}
