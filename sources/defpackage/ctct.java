package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctct extends ctcj {
    private final int a;
    private final int b;

    public ctct(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ctcj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ctcj
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctcj) {
            ctcj ctcjVar = (ctcj) obj;
            if (this.a == ctcjVar.b() && this.b == ctcjVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "PlaybackError{type=" + this.a + ", code=" + this.b + "}";
    }
}
