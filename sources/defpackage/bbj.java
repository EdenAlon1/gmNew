package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbj extends bem {
    private final Object a;

    public bbj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bem
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bem) {
            return this.a.equals(((bem) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.a + "}";
    }
}
