package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebu extends hvh implements itu {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    public ebu(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 == Integer.MAX_VALUE) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long a(defpackage.jzn r7) {
        /*
            r6 = this;
            float r0 = r6.c
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.c
            int r0 = r7.eo(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.d
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.d
            int r3 = r7.eo(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.a
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L40
            float r4 = r6.a
            int r4 = r7.eo(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 != r1) goto L41
        L40:
            r4 = r2
        L41:
            float r5 = r6.b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.b
            int r7 = r7.eo(r5)
            if (r7 >= 0) goto L52
            r7 = r2
        L52:
            if (r7 <= r3) goto L55
            r7 = r3
        L55:
            if (r7 != r1) goto L58
            goto L59
        L58:
            r2 = r7
        L59:
            long r0 = defpackage.jzl.d(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebu.a(jzn):long");
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        int d;
        int b;
        int c;
        int a;
        long d2;
        ipo ei;
        long a2 = a(ipqVar);
        if (this.e) {
            d2 = jzl.f(j, a2);
        } else {
            if (Float.isNaN(this.a)) {
                d = jzk.d(j);
                int b2 = jzk.b(a2);
                if (d > b2) {
                    d = b2;
                }
            } else {
                d = jzk.d(a2);
            }
            if (Float.isNaN(this.c)) {
                b = jzk.b(j);
                int d3 = jzk.d(a2);
                if (b < d3) {
                    b = d3;
                }
            } else {
                b = jzk.b(a2);
            }
            if (Float.isNaN(this.b)) {
                c = jzk.c(j);
                int a3 = jzk.a(a2);
                if (c > a3) {
                    c = a3;
                }
            } else {
                c = jzk.c(a2);
            }
            if (Float.isNaN(this.d)) {
                a = jzk.a(j);
                int c2 = jzk.c(a2);
                if (a < c2) {
                    a = c2;
                }
            } else {
                a = jzk.a(a2);
            }
            d2 = jzl.d(d, b, c, a);
        }
        iqk e = iplVar.e(d2);
        ei = ipqVar.ei(e.a, e.b, ffem.a, new ebt(e));
        return ei;
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        long a = a(inyVar);
        if (jzk.j(a)) {
            return jzk.a(a);
        }
        if (!this.e) {
            i = jzl.c(a, i);
        }
        return jzl.b(a, inxVar.a(i));
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        long a = a(inyVar);
        if (jzk.k(a)) {
            return jzk.b(a);
        }
        if (!this.e) {
            i = jzl.b(a, i);
        }
        return jzl.c(a, inxVar.b(i));
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        long a = a(inyVar);
        if (jzk.j(a)) {
            return jzk.a(a);
        }
        if (!this.e) {
            i = jzl.c(a, i);
        }
        return jzl.b(a, inxVar.c(i));
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        long a = a(inyVar);
        if (jzk.k(a)) {
            return jzk.b(a);
        }
        if (!this.e) {
            i = jzl.b(a, i);
        }
        return jzl.c(a, inxVar.d(i));
    }
}
