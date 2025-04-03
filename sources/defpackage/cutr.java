package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cutr {
    public final boolean a;
    public final boolean b;
    private final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cutr() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cutr.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cutr)) {
            return false;
        }
        cutr cutrVar = (cutr) obj;
        if (this.a != cutrVar.a) {
            return false;
        }
        boolean z = cutrVar.c;
        return this.b == cutrVar.b;
    }

    public final int hashCode() {
        return (((cutq.a(this.a) * 31) + cutq.a(false)) * 31) + cutq.a(this.b);
    }

    public final String toString() {
        return "SpatulaSettings(isEnabled=" + this.a + ", canEdit=false, isEnabledByDefault=" + this.b + ")";
    }

    public /* synthetic */ cutr(boolean z, boolean z2, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.c = false;
        this.b = ((i & 4) == 0) & z2;
    }
}
