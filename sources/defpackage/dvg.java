package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvg implements dvw {
    final /* synthetic */ eey a;
    final /* synthetic */ dvz b;

    public dvg(eey eeyVar, dvz dvzVar) {
        this.a = eeyVar;
        this.b = dvzVar;
    }

    private final eea c() {
        return this.a.d();
    }

    @Override // defpackage.dvw
    public final float a(float f, float f2) {
        float abs = Math.abs(f2);
        eea c = c();
        int i = 0;
        if (!c.i().isEmpty()) {
            int size = c.i().size();
            Iterator it = c.i().iterator();
            while (it.hasNext()) {
                i += ((eei) it.next()).h;
            }
            i /= size;
        }
        return ffmk.c(abs - i, 0.0f) * Math.signum(f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (java.lang.Math.abs(r7) <= java.lang.Math.abs(r8)) goto L37;
     */
    @Override // defpackage.dvw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b(float r23) {
        /*
            r22 = this;
            r0 = r22
            eea r1 = r0.c()
            java.util.List r1 = r1.i()
            int r2 = r1.size()
            r3 = 0
            r5 = -8388608(0xffffffffff800000, float:-Infinity)
            r6 = r3
            r8 = r5
            r7 = 2139095040(0x7f800000, float:Infinity)
        L15:
            r9 = 0
            r10 = 1
            if (r6 >= r2) goto L7b
            java.lang.Object r11 = r1.get(r6)
            eei r11 = (defpackage.eei) r11
            boolean r12 = r11 instanceof defpackage.ejs
            if (r10 == r12) goto L25
            r12 = 0
            goto L26
        L25:
            r12 = r11
        L26:
            if (r12 == 0) goto L30
            boolean r12 = r12.k
            if (r12 == r10) goto L2d
            goto L30
        L2d:
            r21 = 2139095040(0x7f800000, float:Infinity)
            goto L78
        L30:
            dvz r10 = r0.b
            eea r12 = r0.c()
            int r13 = defpackage.dvh.b(r12)
            eea r12 = r0.c()
            int r14 = r12.b()
            eea r12 = r0.c()
            int r15 = r12.a()
            int r12 = r11.h
            r21 = 2139095040(0x7f800000, float:Infinity)
            int r4 = r11.g
            int r11 = r11.a
            eea r16 = r0.c()
            int r20 = r16.d()
            r17 = r4
            r19 = r10
            r18 = r11
            r16 = r12
            float r4 = defpackage.dwa.a(r13, r14, r15, r16, r17, r18, r19, r20)
            int r10 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r10 > 0) goto L6f
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L6f
            r8 = r4
        L6f:
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 < 0) goto L78
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L78
            r7 = r4
        L78:
            int r6 = r6 + 1
            goto L15
        L7b:
            r21 = 2139095040(0x7f800000, float:Infinity)
            eey r1 = r0.a
            jzn r1 = r1.f()
            r2 = r23
            int r1 = defpackage.dvh.a(r1, r2)
            boolean r2 = defpackage.dve.a(r1, r3)
            if (r2 == 0) goto L9c
            float r1 = java.lang.Math.abs(r7)
            float r2 = java.lang.Math.abs(r8)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto Lac
            goto Lad
        L9c:
            boolean r2 = defpackage.dve.a(r1, r10)
            if (r2 == 0) goto La3
            goto Lad
        La3:
            r2 = 2
            boolean r1 = defpackage.dve.a(r1, r2)
            if (r1 != 0) goto Lac
            r7 = r9
            goto Lad
        Lac:
            r7 = r8
        Lad:
            int r1 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r1 != 0) goto Lb2
            goto Lb7
        Lb2:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto Lb7
            return r7
        Lb7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvg.b(float):float");
    }
}
