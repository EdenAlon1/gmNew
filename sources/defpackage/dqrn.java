package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqrn extends dqro {
    public final String a;

    public dqrn(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqrn) && ffkj.e(this.a, ((dqrn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Search(query=" + this.a + ")";
    }
}
