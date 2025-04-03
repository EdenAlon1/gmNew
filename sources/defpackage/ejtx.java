package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejtx extends ejvx {
    private final enip a;

    public ejtx(enip enipVar) {
        if (enipVar == null) {
            throw new NullPointerException("Null notificationKeys");
        }
        this.a = enipVar;
    }

    @Override // defpackage.ejvx, defpackage.ejuj
    public final enip b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejvx) {
            return this.a.equals(((ejvx) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SetKey{notificationKeys=" + this.a.toString() + "}";
    }
}
