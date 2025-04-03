package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fghw {
    private final ffql a = new ffql(0, ffqo.a);
    public fghx[] b;

    private final void h(int i, int i2) {
        fghx[] fghxVarArr = this.b;
        fghxVarArr.getClass();
        fghx fghxVar = fghxVarArr[i2];
        fghxVar.getClass();
        fghx fghxVar2 = fghxVarArr[i];
        fghxVar2.getClass();
        fghxVarArr[i] = fghxVar;
        fghxVarArr[i2] = fghxVar2;
        fghxVar.e(i);
        fghxVar2.e(i2);
    }

    public final int a() {
        return this.a.c;
    }

    public final fghx b() {
        fghx[] fghxVarArr = this.b;
        if (fghxVarArr != null) {
            return fghxVarArr[0];
        }
        return null;
    }

    public final fghx c() {
        fghx b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (((java.lang.Comparable) r5).compareTo(r6) < 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fghx d(int r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.ffso.a
            fghx[] r0 = r7.b
            r0.getClass()
            int r1 = r7.a()
            r2 = -1
            int r1 = r1 + r2
            r7.e(r1)
            int r1 = r7.a()
            if (r8 >= r1) goto L7e
            int r1 = r7.a()
            r7.h(r8, r1)
            int r1 = r8 + (-1)
            if (r8 <= 0) goto L3c
            int r1 = r1 / 2
            r3 = r0[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.h(r8, r1)
            r7.f(r1)
            goto L7e
        L3c:
            int r1 = r8 + r8
            int r3 = r1 + 1
            int r4 = r7.a()
            if (r3 >= r4) goto L7e
            fghx[] r4 = r7.b
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.a()
            if (r1 >= r5) goto L66
            r5 = r4[r1]
            r5.getClass()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L66
            goto L67
        L66:
            r1 = r3
        L67:
            r3 = r4[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L7e
            r7.h(r8, r1)
            r8 = r1
            goto L3c
        L7e:
            int r8 = r7.a()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.d(r1)
            r8.e(r2)
            int r2 = r7.a()
            r0[r2] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fghw.d(int):fghx");
    }

    public final void e(int i) {
        this.a.c = i;
    }

    public final void f(int i) {
        while (i > 0) {
            fghx[] fghxVarArr = this.b;
            fghxVarArr.getClass();
            int i2 = (i - 1) >> 1;
            fghx fghxVar = fghxVarArr[i2];
            fghxVar.getClass();
            fghx fghxVar2 = fghxVarArr[i];
            fghxVar2.getClass();
            if (((Comparable) fghxVar).compareTo(fghxVar2) <= 0) {
                return;
            }
            h(i, i2);
            i = i2;
        }
    }

    public final boolean g() {
        return a() == 0;
    }
}
