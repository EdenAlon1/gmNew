package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejty extends ejvy {
    private final ejvt a;

    public ejty(ejvt ejvtVar) {
        this.a = ejvtVar;
    }

    @Override // defpackage.ejvy
    public final ejvt a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejvy) {
            return this.a.equals(((ejvy) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SingleExternalKey{externalKey=" + this.a.toString() + "}";
    }
}
