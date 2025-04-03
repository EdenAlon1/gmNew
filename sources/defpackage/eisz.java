package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eisz extends eisx {
    public final int a;

    public eisz(int i) {
        this.a = i;
    }

    @Override // defpackage.eisx
    @Deprecated
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof eisx) && this.a == ((eisx) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "AccountId{id=" + this.a + "}";
    }
}
