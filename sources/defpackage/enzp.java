package defpackage;

import java.util.ArrayList;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enzp {
    public final enzo a;
    int b = 0;
    public final ArrayList c = new ArrayList();
    public final PriorityQueue d = new PriorityQueue(10, new enzs());
    public final /* synthetic */ enzu e;

    public enzp(enzu enzuVar, enzo enzoVar) {
        this.e = enzuVar;
        this.a = enzoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0.o(r3, r6.a()) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.enzr a(defpackage.enxy r6) {
        /*
            r5 = this;
            enzo r0 = r5.a
            enyp r0 = (defpackage.enyp) r0
            eobe r1 = r0.b
            enyi r1 = r1.a()
            enxz r2 = r6.d
            int r2 = defpackage.enyf.e(r1, r2)
            r3 = 3
            if (r2 != r3) goto L14
            goto L30
        L14:
            r3 = 2
            if (r2 != r3) goto L18
            goto L32
        L18:
            enxz r2 = r6.d
            int r2 = defpackage.enyf.a(r1, r2)
            if (r2 == 0) goto L32
            boolean r2 = r0.n(r1, r6)
            if (r2 != 0) goto L32
            enyr r2 = r6.a()
            boolean r0 = r0.o(r1, r2)
            if (r0 != 0) goto L32
        L30:
            r6 = 0
            return r6
        L32:
            byte r0 = r6.b
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L62
            int r0 = r0 + r2
            r3 = 30
            if (r0 > r3) goto L61
            enzo r0 = r5.a
            enyp r0 = (defpackage.enyp) r0
            eobe r3 = r0.b
            enyi r3 = r3.a()
            enxz r4 = r6.d
            int r4 = defpackage.enyf.e(r3, r4)
            if (r4 == r2) goto L50
            goto L62
        L50:
            boolean r4 = r0.n(r3, r6)
            if (r4 == 0) goto L57
            goto L62
        L57:
            enyr r4 = r6.a()
            boolean r0 = r0.o(r3, r4)
            if (r0 == 0) goto L62
        L61:
            r1 = r2
        L62:
            enzr r0 = new enzr
            r0.<init>()
            r0.a = r6
            r0.b = r1
            if (r1 != 0) goto L72
            r6 = 4
            enzr[] r6 = new defpackage.enzr[r6]
            r0.d = r6
        L72:
            int r6 = r5.b
            int r6 = r6 + r2
            r5.b = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enzp.a(enxy):enzr");
    }

    public final void b(enzr enzrVar) {
        enxz enxzVar;
        if (enzrVar == null) {
            return;
        }
        if (enzrVar.b) {
            this.c.add(enzrVar.a.d);
            return;
        }
        enxy enxyVar = enzrVar.a;
        byte b = enxyVar.b;
        enxy[] enxyVarArr = new enxy[4];
        for (int i = 0; i < 4; i++) {
            enxyVarArr[i] = new enxy();
        }
        if (!enxyVar.d.G()) {
            long j = enxyVar.d.d;
            long lowestOneBit = Long.lowestOneBit(j);
            enxz enxzVar2 = new enxz((j - lowestOneBit) + (lowestOneBit >>> 2));
            long j2 = enxyVar.d.j();
            enxq enxqVar = new enxq(enzn.c(enzn.b(enxz.f(j2))), enzn.c(enzn.b((int) j2)));
            double d = enxqVar.a;
            double d2 = enxqVar.b;
            for (int i2 = 0; i2 < 4; i2++) {
                enxy enxyVar2 = enxyVarArr[i2];
                enxyVar2.a = enxyVar.a;
                enxyVar2.b = (byte) (enxyVar.b + 1);
                enxyVar2.c = (byte) (enxyVar.c ^ enxw.b(i2));
                enxyVar2.d = enxzVar2;
                int a = enxw.a(enxyVar.c, i2);
                if ((a & 2) != 0) {
                    enxyVar2.e = d;
                    enxzVar = enxzVar2;
                    enxyVar2.f = enxyVar.f;
                } else {
                    enxzVar = enxzVar2;
                    enxyVar2.e = enxyVar.e;
                    enxyVar2.f = d;
                }
                if ((a & 1) != 0) {
                    enxyVar2.g = d2;
                    enxyVar2.h = enxyVar.h;
                } else {
                    enxyVar2.g = enxyVar.g;
                    enxyVar2.h = d2;
                }
                enxzVar2 = enxzVar.v();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            enzr a2 = a(enxyVarArr[i4]);
            if (a2 != null) {
                enzr[] enzrVarArr = enzrVar.d;
                int i5 = enzrVar.c;
                enzrVar.c = i5 + 1;
                enzrVarArr[i5] = a2;
                if (a2.b) {
                    i3++;
                }
            }
        }
        int i6 = enzrVar.c;
        if (i6 != 0) {
            if (i3 != 4 || enzrVar.a.b < 0) {
                this.d.add(new enzt(-((((enzrVar.a.b << 2) + i6) << 2) + i3), enzrVar));
            } else {
                enzrVar.b = true;
                b(enzrVar);
            }
        }
    }
}
