package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sav extends saw {
    private final int a;

    public sav(int i) {
        this.a = i;
    }

    @Override // defpackage.saw
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof saw) && this.a == ((saw) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "TokenInfo{tokenCount=" + this.a + "}";
    }
}
