package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxpr extends cxqg {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public cxpr(boolean z, int i, boolean z2, boolean z3, int i2) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = z3;
        this.e = i2;
    }

    @Override // defpackage.cxqg
    public final int a() {
        return this.e;
    }

    @Override // defpackage.cxqg
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cxqg
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.cxqg
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.cxqg
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxqg) {
            cxqg cxqgVar = (cxqg) obj;
            if (this.a == cxqgVar.c() && this.b == cxqgVar.b() && this.c == cxqgVar.e() && this.d == cxqgVar.d() && this.e == cxqgVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int i2 = this.b;
        return ((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "TextColorAndResIdConfig{isIncoming=" + this.a + ", status=" + this.b + ", overrideAsFailure=" + this.c + ", isSelected=" + this.d + ", protocol=" + this.e + "}";
    }
}
