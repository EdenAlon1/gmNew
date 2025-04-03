package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxxw extends cxyn {
    private final boolean a;
    private final boolean b;

    public cxxw(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.cxyn
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cxyn
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxyn) {
            cxyn cxynVar = (cxyn) obj;
            if (this.a == cxynVar.a() && this.b == cxynVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "BannerFrameworkConfig{showDismissAnimationEnabled=" + this.a + ", windowInsetsEnabled=" + this.b + "}";
    }
}
