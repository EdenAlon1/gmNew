package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msh extends mta {
    private final long c;
    private final long d;
    private final long e;
    private final boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (r0 == r5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public msh(defpackage.lru r14, long r15, long r17) {
        /*
            r13 = this;
            r0 = r17
            r13.<init>(r14)
            int r2 = r14.b()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L7e
            lrt r2 = new lrt
            r2.<init>()
            lrt r14 = r14.p(r3, r2)
            r5 = 0
            r7 = r15
            long r9 = java.lang.Math.max(r5, r7)
            boolean r2 = r14.k
            if (r2 != 0) goto L30
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 == 0) goto L30
            boolean r2 = r14.h
            if (r2 == 0) goto L2a
            goto L30
        L2a:
            msi r14 = new msi
            r14.<init>(r4)
            throw r14
        L30:
            r7 = -9223372036854775808
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L39
            long r0 = r14.m
            goto L3d
        L39:
            long r0 = java.lang.Math.max(r5, r0)
        L3d:
            long r5 = r14.m
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L5c
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L4e
            r11 = r5
            goto L4f
        L4e:
            r11 = r0
        L4f:
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L55
            r0 = r11
            goto L5c
        L55:
            msi r7 = new msi
            r8 = 2
            r7.<init>(r8, r9, r11)
            throw r7
        L5c:
            r13.c = r9
            r13.d = r0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L66
            r5 = r7
            goto L68
        L66:
            long r5 = r0 - r9
        L68:
            r13.e = r5
            boolean r5 = r14.i
            if (r5 == 0) goto L7b
            if (r2 == 0) goto L7a
            long r5 = r14.m
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 == 0) goto L7b
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 != 0) goto L7b
        L7a:
            r3 = r4
        L7b:
            r13.f = r3
            return
        L7e:
            msi r14 = new msi
            r14.<init>(r3)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msh.<init>(lru, long, long):void");
    }

    @Override // defpackage.mta, defpackage.lru
    public final lrs d(int i, lrs lrsVar, boolean z) {
        this.b.d(0, lrsVar, z);
        long j = lrsVar.e - this.c;
        long j2 = this.e;
        lrsVar.n(lrsVar.a, lrsVar.b, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j);
        return lrsVar;
    }

    @Override // defpackage.mta, defpackage.lru
    public final lrt e(int i, lrt lrtVar, long j) {
        this.b.e(0, lrtVar, 0L);
        long j2 = lrtVar.p;
        long j3 = this.c;
        lrtVar.p = j2 + j3;
        lrtVar.m = this.e;
        lrtVar.i = this.f;
        long j4 = lrtVar.l;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            lrtVar.l = max;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            lrtVar.l = max;
            lrtVar.l = max - this.c;
        }
        long j6 = this.c;
        int i2 = lvf.a;
        long j7 = lrtVar.e;
        long z = lvf.z(j6);
        if (j7 != -9223372036854775807L) {
            lrtVar.e = j7 + z;
        }
        long j8 = lrtVar.f;
        if (j8 != -9223372036854775807L) {
            lrtVar.f = j8 + z;
        }
        return lrtVar;
    }
}
