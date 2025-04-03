package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okf extends okj {
    public final Throwable a;

    public okf(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okf) && ffkj.e(this.a, ((okf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String c;
        c = ffpc.c("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ", "|");
        return c;
    }
}
