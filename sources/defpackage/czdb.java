package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czdb {
    public final Boolean a;
    private final boolean b;

    public czdb() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czdb)) {
            return false;
        }
        czdb czdbVar = (czdb) obj;
        if (!ffkj.e(this.a, czdbVar.a)) {
            return false;
        }
        boolean z = czdbVar.b;
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "ToggleState(isActive=" + this.a + ", isApplyingChange=false)";
    }

    public /* synthetic */ czdb(Boolean bool, int i) {
        this.a = 1 == (i & 1) ? null : bool;
        this.b = false;
    }
}
