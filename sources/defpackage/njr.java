package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njr implements njw {
    public static final /* synthetic */ int a = 0;
    private static final enom b = new encx(new emwl() { // from class: njq
        @Override // defpackage.emwl
        public final Object apply(Object obj) {
            int i = njr.a;
            return Long.valueOf(njr.d(((njp) obj).b));
        }
    }, enoe.a);
    private final engw c;
    private final long[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public njr(java.util.List r15) {
        /*
            r14 = this;
            r14.<init>()
            r0 = r15
            enou r0 = (defpackage.enou) r0
            int r0 = r0.c
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L49
            java.lang.Object r15 = defpackage.enjk.l(r15)
            njp r15 = (defpackage.njp) r15
            long r5 = r15.b
            long r5 = d(r5)
            long r7 = r15.c
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            engw r15 = r15.a
            engw r15 = defpackage.engw.r(r15)
            r14.c = r15
            long[] r15 = new long[r4]
            r15[r3] = r5
            r14.d = r15
            return
        L32:
            engw r0 = r15.a
            engw r1 = defpackage.enou.a
            engw r0 = defpackage.engw.s(r0, r1)
            r14.c = r0
            long r0 = r15.c
            long r0 = r0 + r5
            r15 = 2
            long[] r15 = new long[r15]
            r15[r3] = r5
            r15[r4] = r0
            r14.d = r15
            return
        L49:
            int r0 = r0 + r0
            long[] r0 = new long[r0]
            r14.d = r0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r0, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            enom r4 = defpackage.njr.b
            engw r15 = defpackage.engw.E(r4, r15)
            r4 = r3
        L62:
            r5 = r15
            enou r5 = (defpackage.enou) r5
            int r5 = r5.c
            if (r3 >= r5) goto Lcb
            java.lang.Object r5 = r15.get(r3)
            njp r5 = (defpackage.njp) r5
            long r6 = r5.b
            long r6 = d(r6)
            long r8 = r5.c
            long r8 = r8 + r6
            if (r4 == 0) goto Laa
            long[] r10 = r14.d
            int r11 = r4 + (-1)
            r12 = r10[r11]
            int r10 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r10 >= 0) goto L85
            goto Laa
        L85:
            if (r10 != 0) goto L99
            java.lang.Object r10 = r0.get(r11)
            engw r10 = (defpackage.engw) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L99
            engw r6 = r5.a
            r0.set(r11, r6)
            goto Lb6
        L99:
            java.lang.String r10 = "CuesWithTimingSubtitle"
            java.lang.String r12 = "Truncating unsupported overlapping cues."
            defpackage.luj.f(r10, r12)
            long[] r10 = r14.d
            r10[r11] = r6
            engw r6 = r5.a
            r0.set(r11, r6)
            goto Lb6
        Laa:
            long[] r10 = r14.d
            int r11 = r4 + 1
            r10[r4] = r6
            engw r4 = r5.a
            r0.add(r4)
            r4 = r11
        Lb6:
            long r5 = r5.c
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto Lc8
            long[] r5 = r14.d
            int r6 = r4 + 1
            r5[r4] = r8
            engw r4 = defpackage.enou.a
            r0.add(r4)
            r4 = r6
        Lc8:
            int r3 = r3 + 1
            goto L62
        Lcb:
            engw r15 = defpackage.engw.n(r0)
            r14.c = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njr.<init>(java.util.List):void");
    }

    public static long d(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    @Override // defpackage.njw
    public final int a() {
        return this.c.size();
    }

    @Override // defpackage.njw
    public final int b(long j) {
        engw engwVar = this.c;
        int aj = lvf.aj(this.d, j, false);
        if (aj < engwVar.size()) {
            return aj;
        }
        return -1;
    }

    @Override // defpackage.njw
    public final long c(int i) {
        lti.a(i < this.c.size());
        return this.d[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.njw
    public final /* bridge */ /* synthetic */ List e(long j) {
        int ak = lvf.ak(this.d, j, false);
        if (ak != -1) {
            return (engw) this.c.get(ak);
        }
        int i = engw.d;
        return enou.a;
    }
}
