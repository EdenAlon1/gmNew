package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aimz implements aihu {
    public final ctuf a;

    public aimz(ctuf ctufVar) {
        ctufVar.getClass();
        this.a = ctufVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aimz) && this.a == ((aimz) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestPermission(permission=" + this.a + ")";
    }
}
