package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class encq implements enos {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof enos) {
            return a().equals(((enos) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
