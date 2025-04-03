package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mvw implements mvr {
    private final ArrayList a = new ArrayList();

    private final int g(long j) {
        for (int i = 0; i < this.a.size(); i++) {
            if (j < ((njp) this.a.get(i)).b) {
                return i;
            }
        }
        return this.a.size();
    }

    @Override // defpackage.mvr
    public final long a(long j) {
        if (this.a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((njp) this.a.get(0)).b) {
            return ((njp) this.a.get(0)).b;
        }
        for (int i = 1; i < this.a.size(); i++) {
            njp njpVar = (njp) this.a.get(i);
            if (j < njpVar.b) {
                long j2 = ((njp) this.a.get(i - 1)).d;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= njpVar.b) ? njpVar.b : j2;
            }
        }
        long j3 = ((njp) enjk.j(this.a)).d;
        if (j3 == -9223372036854775807L || j >= j3) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // defpackage.mvr
    public final long b(long j) {
        if (this.a.isEmpty() || j < ((njp) this.a.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < this.a.size(); i++) {
            long j2 = ((njp) this.a.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                njp njpVar = (njp) this.a.get(i - 1);
                long j3 = njpVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? njpVar.b : j3;
            }
        }
        njp njpVar2 = (njp) enjk.j(this.a);
        long j4 = njpVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? njpVar2.b : j4;
    }

    @Override // defpackage.mvr
    public final engw c(long j) {
        int g = g(j);
        if (g == 0) {
            int i = engw.d;
            return enou.a;
        }
        njp njpVar = (njp) this.a.get(g - 1);
        long j2 = njpVar.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return njpVar.a;
        }
        int i2 = engw.d;
        return enou.a;
    }

    @Override // defpackage.mvr
    public final void d() {
        this.a.clear();
    }

    @Override // defpackage.mvr
    public final void e(long j) {
        int g = g(j);
        if (g == 0) {
            return;
        }
        int i = g - 1;
        long j2 = ((njp) this.a.get(i)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            g = i;
        }
        this.a.subList(0, g).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC] */
    @Override // defpackage.mvr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.njp r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r4
        L10:
            defpackage.lti.a(r0)
            long r5 = r10.b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r1
            goto L26
        L25:
            r0 = r4
        L26:
            java.util.ArrayList r2 = r9.a
            int r2 = r2.size()
        L2c:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L5a
            long r5 = r10.b
            java.util.ArrayList r3 = r9.a
            java.lang.Object r3 = r3.get(r2)
            njp r3 = (defpackage.njp) r3
            long r7 = r3.b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L47
            java.util.ArrayList r11 = r9.a
            int r2 = r2 + r1
            r11.add(r2, r10)
            return r0
        L47:
            java.util.ArrayList r3 = r9.a
            java.lang.Object r3 = r3.get(r2)
            njp r3 = (defpackage.njp) r3
            long r5 = r3.b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L57
            r3 = r4
            goto L58
        L57:
            r3 = r1
        L58:
            r0 = r0 & r3
            goto L2c
        L5a:
            java.util.ArrayList r11 = r9.a
            r11.add(r4, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvw.f(njp, long):boolean");
    }
}
