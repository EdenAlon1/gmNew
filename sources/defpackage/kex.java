package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kex {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;
    private final boolean f;

    public kex(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = true;
        this.c = z;
        this.d = z2;
        this.e = true;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kex)) {
            return false;
        }
        kex kexVar = (kex) obj;
        if (this.a != kexVar.a) {
            return false;
        }
        boolean z = kexVar.b;
        if (this.c != kexVar.c || this.d != kexVar.d) {
            return false;
        }
        boolean z2 = kexVar.e;
        boolean z3 = kexVar.f;
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        boolean z = this.d;
        return (((((((((i * 31) + kew.a(true)) * 31) + kew.a(this.c)) * 31) + kew.a(z)) * 31) + kew.a(true)) * 31) + kew.a(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kex(boolean r2, boolean r3, boolean r4, boolean r5) {
        /*
            r1 = this;
            int r0 = defpackage.kdy.a
            r0 = 1
            if (r0 == r2) goto L9
            r2 = 262152(0x40008, float:3.67353E-40)
            goto Lb
        L9:
            r2 = 262144(0x40000, float:3.67342E-40)
        Lb:
            if (r5 != 0) goto Lf
            r2 = r2 | 512(0x200, float:7.175E-43)
        Lf:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kex.<init>(boolean, boolean, boolean, boolean):void");
    }

    public /* synthetic */ kex(boolean z, boolean z2, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), z2 | (!((i & 2) == 0)), (i & 4) != 0, true);
    }
}
