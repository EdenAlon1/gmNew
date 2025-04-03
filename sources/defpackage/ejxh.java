package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxh extends ejyw {
    private final Object a;

    public ejxh(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.a = obj;
    }

    @Override // defpackage.ejyw, defpackage.ejyx
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejyw) {
            return this.a.equals(((ejyw) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Success{data=" + this.a.toString() + "}";
    }
}
