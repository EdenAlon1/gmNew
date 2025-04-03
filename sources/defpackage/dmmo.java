package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmmo {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dmmo() {
        /*
            r2 = this;
            r0 = 0
            r1 = 7
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmmo.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmmo)) {
            return false;
        }
        dmmo dmmoVar = (dmmo) obj;
        return this.a == dmmoVar.a && this.b == dmmoVar.b && this.c == dmmoVar.c;
    }

    public final int hashCode() {
        return (((dmmn.a(this.a) * 31) + dmmn.a(this.b)) * 31) + dmmn.a(this.c);
    }

    public final String toString() {
        return "Flags(catchNullPointerExceptionsOnTextFieldDraw=" + this.a + ", skipContentSizeAnimation=" + this.b + ", useSendImeAction=" + this.c + ")";
    }

    public dmmo(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public /* synthetic */ dmmo(boolean z, boolean z2, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), false, z2 & ((i & 4) == 0));
    }
}
