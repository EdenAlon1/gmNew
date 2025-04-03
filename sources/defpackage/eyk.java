package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyk implements ipn {
    private final ffix a;
    private final ffix b;

    public eyk(ffix ffixVar, ffix ffixVar2) {
        this.a = ffixVar;
        this.b = ffixVar2;
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int a(iny inyVar, List list, int i) {
        return ipm.a(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int b(iny inyVar, List list, int i) {
        return ipm.b(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int c(iny inyVar, List list, int i) {
        return ipm.c(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int d(iny inyVar, List list, int i) {
        return ipm.d(this, inyVar, list, i);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    @Override // defpackage.ipn
    public final defpackage.ipo e(defpackage.ipq r19, java.util.List r20, long r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L13:
            if (r5 >= r3) goto L2a
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            ipl r7 = (defpackage.ipl) r7
            java.lang.Object r7 = r7.f()
            boolean r7 = r7 instanceof defpackage.eym
            if (r7 != 0) goto L27
            r2.add(r6)
        L27:
            int r5 = r5 + 1
            goto L13
        L2a:
            ffix r3 = r0.b
            java.lang.Object r3 = r3.invoke()
            java.util.List r3 = (java.util.List) r3
            r5 = 0
            if (r3 == 0) goto La3
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r3.size()
            r6.<init>(r7)
            int r7 = r3.size()
            r8 = r4
        L43:
            if (r8 >= r7) goto La2
            java.lang.Object r9 = r3.get(r8)
            iam r9 = (defpackage.iam) r9
            if (r9 == 0) goto L99
            ffcf r10 = new ffcf
            java.lang.Object r11 = r2.get(r8)
            ipl r11 = (defpackage.ipl) r11
            float r12 = r9.d
            float r13 = r9.b
            float r12 = r12 - r13
            double r12 = (double) r12
            double r12 = java.lang.Math.floor(r12)
            float r12 = (float) r12
            float r13 = r9.e
            float r14 = r9.c
            float r13 = r13 - r14
            double r13 = (double) r13
            double r13 = java.lang.Math.floor(r13)
            float r13 = (float) r13
            int r12 = (int) r12
            int r13 = (int) r13
            r14 = 5
            long r12 = defpackage.jzl.k(r4, r12, r13, r14)
            iqk r11 = r11.e(r12)
            float r12 = r9.b
            int r12 = java.lang.Math.round(r12)
            long r12 = (long) r12
            float r9 = r9.c
            int r9 = java.lang.Math.round(r9)
            long r14 = (long) r9
            kaa r9 = new kaa
            r16 = 32
            long r12 = r12 << r16
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r16
            long r12 = r12 | r14
            r9.<init>(r12)
            r10.<init>(r11, r9)
            goto L9a
        L99:
            r10 = r5
        L9a:
            if (r10 == 0) goto L9f
            r6.add(r10)
        L9f:
            int r8 = r8 + 1
            goto L43
        La2:
            r5 = r6
        La3:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            int r3 = r1.size()
        Lb0:
            if (r4 >= r3) goto Lc7
            java.lang.Object r6 = r1.get(r4)
            r7 = r6
            ipl r7 = (defpackage.ipl) r7
            java.lang.Object r7 = r7.f()
            boolean r7 = r7 instanceof defpackage.eym
            if (r7 == 0) goto Lc4
            r2.add(r6)
        Lc4:
            int r4 = r4 + 1
            goto Lb0
        Lc7:
            ffix r1 = r0.a
            java.util.List r1 = defpackage.esa.a(r2, r1)
            int r2 = defpackage.jzk.b(r21)
            int r3 = defpackage.jzk.a(r21)
            eyj r4 = new eyj
            r4.<init>(r5, r1)
            r1 = r19
            ipo r1 = defpackage.ipp.b(r1, r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyk.e(ipq, java.util.List, long):ipo");
    }
}
