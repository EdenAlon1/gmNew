package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apui {
    public final String a;

    public apui(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apui) && ffkj.e(this.a, ((apui) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MutationId(id=" + this.a + ")";
    }
}
