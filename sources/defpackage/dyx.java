package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyx extends dza {
    public static final /* synthetic */ int a = 0;
    private final hun c;

    public dyx(hun hunVar) {
        this.c = hunVar;
    }

    @Override // defpackage.dza
    public final int a(int i, kah kahVar) {
        return this.c.a(0, i, kahVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyx) && ffkj.e(this.c, ((dyx) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.c + ')';
    }
}
