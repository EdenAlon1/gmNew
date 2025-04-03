package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dntn {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dntn() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dntn.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dntn)) {
            return false;
        }
        dntn dntnVar = (dntn) obj;
        return this.a == dntnVar.a && this.b == dntnVar.b && this.c == dntnVar.c;
    }

    public final int hashCode() {
        return (((dntm.a(this.a) * 31) + dntm.a(this.b)) * 31) + dntm.a(this.c);
    }

    public final String toString() {
        return "Flags(useWrappingMetatext=" + this.a + ", useClickableWithPosition=" + this.b + ", trackLastMetatextItemInList=" + this.c + ")";
    }

    public /* synthetic */ dntn(boolean z, boolean z2, boolean z3, int i) {
        this.a = 1 == ((z ? 1 : 0) & ((i & 1) ^ 1));
        this.b = ((i & 2) == 0) & z2;
        this.c = ((i & 4) == 0) & z3;
    }
}
