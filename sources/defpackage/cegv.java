package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cegv implements cegx {
    public final String a;

    public cegv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cegv) && ffkj.e(this.a, ((cegv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RestoreNextPage(nextPaginationToken=" + this.a + ")";
    }
}
