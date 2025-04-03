package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnib extends dnid {
    public final String a;

    public dnib(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnib) && ffkj.e(this.a, ((dnib) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Emoji(emoji=" + this.a + ")";
    }
}
