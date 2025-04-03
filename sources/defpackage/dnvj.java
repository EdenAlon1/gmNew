package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvj {
    public final String a;

    public dnvj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnvj) && ffkj.e(this.a, ((dnvj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(text=" + this.a + ")";
    }
}
