package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyp {
    public String a;
    public final int b;

    public byyp(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof byyp)) {
            return false;
        }
        String str = this.a;
        return str != null ? ffkj.e(str, ((byyp) obj).a) : this.b == ((byyp) obj).b;
    }

    public final int hashCode() {
        String str = this.a;
        return str != null ? str.hashCode() : this.b;
    }

    public final String toString() {
        String str = this.a;
        return str == null ? String.valueOf(this.b) : str;
    }

    public byyp(String str) {
        this.b = -1;
        this.a = str;
    }
}
