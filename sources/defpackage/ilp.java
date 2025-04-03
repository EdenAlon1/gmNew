package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class ilp {
    private final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof ilp) && this.a == ((ilp) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
