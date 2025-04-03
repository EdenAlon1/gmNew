package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzmk extends dzor {
    private final boolean a;

    public dzmk(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dzor
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dzor) && this.a == ((dzor) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "Block{blocked=" + this.a + "}";
    }
}
