package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyl extends enym {
    public enyl(enxo enxoVar, enxu enxuVar) {
        super(enxoVar, enxuVar);
    }

    public static enyl c(enxk enxkVar) {
        byte a = enxkVar.a();
        if (a != 1) {
            throw new IOException(a.h(a, "Unsupported S2LatLngRect encoding version "));
        }
        enxo enxoVar = new enxo(enxkVar.b(), enxkVar.b());
        enxu enxuVar = new enxu(enxkVar.b(), enxkVar.b());
        if (k(enxoVar, enxuVar)) {
            return new enyl(enxoVar, enxuVar);
        }
        throw new IOException("Decoded lat and lng intervals do not form a valid S2LatLngRect.");
    }

    public static enyl d() {
        return new enyl(new enxo(1.0d, eobe.a), enxu.c());
    }

    public static enyl f() {
        return new enyl(new enxo(-1.5707963267948966d, 1.5707963267948966d), enxu.d());
    }

    @Override // defpackage.enym
    public final enxo a() {
        return this.a;
    }

    @Override // defpackage.enym
    public final enxu b() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.enyl e(defpackage.enyj r12) {
        /*
            r11 = this;
            enyl r0 = new enyl
            enxs r1 = r12.a()
            double r1 = r1.c
            enxo r3 = r11.a
            enxo r1 = r3.b(r1)
            enxo r2 = new enxo
            r3 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            r5 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            r2.<init>(r3, r5)
            enxo r3 = new enxo
            double r4 = r1.a
            double r6 = r2.a
            double r4 = java.lang.Math.max(r4, r6)
            double r6 = r1.b
            double r1 = r2.b
            double r1 = java.lang.Math.min(r6, r1)
            r3.<init>(r4, r1)
            enxs r12 = r12.b()
            double r1 = r12.c
            enxu r4 = new enxu
            enxu r12 = r11.b
            r4.<init>(r12)
            r5 = 0
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 < 0) goto L63
            boolean r12 = r4.l()
            if (r12 == 0) goto L4c
            goto L9f
        L4c:
            double r5 = r1 + r1
            double r7 = r4.a()
            double r7 = r7 + r5
            r5 = 4377498837804122112(0x3cc0000000000000, double:4.440892098500626E-16)
            double r7 = r7 + r5
            r5 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            int r12 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r12 < 0) goto L7b
            r4.h()
            goto L9f
        L63:
            boolean r12 = r4.m()
            if (r12 != 0) goto L9f
            double r7 = r1 + r1
            double r9 = r4.a()
            double r9 = r9 + r7
            r7 = -4845873199050653696(0xbcc0000000000000, double:-4.440892098500626E-16)
            double r9 = r9 + r7
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 > 0) goto L7b
            r4.g()
            goto L9f
        L7b:
            double r5 = r4.a
            double r5 = r5 - r1
            double r5 = defpackage.enxm.b(r5)
            double r7 = r4.b
            double r7 = r7 + r1
            double r7 = defpackage.enxm.b(r7)
            r9 = 0
            r4.f(r5, r7, r9)
            double r1 = r4.a
            r5 = -4609115380302729960(0xc00921fb54442d18, double:-3.141592653589793)
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 > 0) goto L9f
            r1 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            r4.a = r1
        L9f:
            r0.<init>(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enyl.e(enyj):enyl");
    }

    public final enyl g() {
        enxo enxoVar = this.a;
        return (enxoVar.a == -1.5707963267948966d || enxoVar.b == 1.5707963267948966d) ? new enyl(enxoVar, enxu.d()) : this;
    }
}
