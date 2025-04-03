package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwe implements dlwf {
    private final String a = "";

    @Override // defpackage.dlwk
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlwe) && ffkj.e(this.a, ((dlwe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(contentDescription=" + this.a + ")";
    }
}
