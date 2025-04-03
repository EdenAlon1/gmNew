package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiaw implements aiaz {
    public final String a;

    public aiaw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aiaw) && ffkj.e(this.a, ((aiaw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Header(value=" + this.a + ")";
    }
}
