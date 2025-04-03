package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvv implements dlvw {
    private final String a;

    public dlvv(String str) {
        this.a = str;
    }

    @Override // defpackage.dlwk
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlvv) && ffkj.e(this.a, ((dlvv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(contentDescription=" + this.a + ")";
    }
}
