package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgq extends fcj {
    private final jvu e;
    private final exq f;

    public fgq(jvu jvuVar, jvj jvjVar, exq exqVar, fhy fhyVar) {
        super(jvuVar.b, jvuVar.c, exqVar != null ? exqVar.a : null, jvjVar, fhyVar);
        this.e = jvuVar;
        this.f = exqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int C(defpackage.exq r8, int r9) {
        /*
            r7 = this;
            ioc r0 = r8.b
            if (r0 == 0) goto L10
            ioc r1 = r8.c
            if (r1 == 0) goto Ld
            iam r0 = defpackage.iob.a(r1, r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L12
        L10:
            iam r0 = defpackage.iam.a
        L12:
            jvj r1 = r7.a
            jvu r2 = r7.e
            long r2 = r2.c
            int r2 = defpackage.jpm.a(r2)
            jpg r3 = r8.a
            int r1 = r1.a(r2)
            iam r1 = r3.n(r1)
            float r2 = r1.b
            float r1 = r1.c
            long r3 = r0.b()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            float r9 = (float) r9
            int r0 = (int) r3
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 * r9
            jvj r9 = r7.a
            jpg r8 = r8.a
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            float r1 = r1 + r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 & r5
            long r0 = r0 | r2
            int r8 = r8.k(r0)
            int r8 = r9.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgq.C(exq, int):int");
    }

    public final void A() {
        exq exqVar;
        if (g().length() <= 0 || (exqVar = this.f) == null) {
            return;
        }
        int C = C(exqVar, 1);
        h(C, C);
    }

    public final void B() {
        exq exqVar;
        if (g().length() <= 0 || (exqVar = this.f) == null) {
            return;
        }
        int C = C(exqVar, -1);
        h(C, C);
    }

    public final jvu y() {
        return jvu.b(this.e, this.d, this.c, 4);
    }

    public final List z(ffji ffjiVar) {
        if (!jpm.i(this.c)) {
            return ffdx.g(new juc("", 0), new jvr(jpm.d(this.c), jpm.d(this.c)));
        }
        juk jukVar = (juk) ffjiVar.invoke(this);
        if (jukVar == null) {
            return null;
        }
        return ffdx.b(jukVar);
    }
}
