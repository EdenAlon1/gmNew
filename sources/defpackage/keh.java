package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class keh {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public keh() {
        this(31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keh)) {
            return false;
        }
        keh kehVar = (keh) obj;
        return this.a == kehVar.a && this.b == kehVar.b && this.e == kehVar.e && this.c == kehVar.c && this.d == kehVar.d;
    }

    public final int hashCode() {
        key.a(this.e);
        return (((((((keg.a(this.a) * 31) + keg.a(this.b)) * 31) + 1) * 31) + keg.a(this.c)) * 31) + keg.a(this.d);
    }

    public keh(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.e = i;
        this.c = z3;
        this.d = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ keh(int r10) {
        /*
            r9 = this;
            r0 = r10 & 16
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r8 = r2
            goto L9
        L8:
            r8 = r1
        L9:
            r0 = r10 & 8
            if (r0 == 0) goto Lf
            r7 = r2
            goto L10
        Lf:
            r7 = r1
        L10:
            r0 = r10 & 1
            r3 = r10 & 2
            if (r3 == 0) goto L18
            r5 = r2
            goto L19
        L18:
            r5 = r1
        L19:
            r10 = r10 & 4
            if (r10 == 0) goto L1f
            r6 = r2
            goto L20
        L1f:
            r6 = r1
        L20:
            if (r2 == r0) goto L24
            r4 = r1
            goto L25
        L24:
            r4 = r2
        L25:
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.keh.<init>(int):void");
    }

    public /* synthetic */ keh(boolean z, int i) {
        this(1 == (i & 1), (i & 2) != 0, 1, (!((i & 4) == 0)) | z, true);
    }
}
