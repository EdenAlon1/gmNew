package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyz extends dza {
    public static final /* synthetic */ int a = 0;
    private final hus c;

    public dyz(hus husVar) {
        this.c = husVar;
    }

    @Override // defpackage.dza
    public final int a(int i, kah kahVar) {
        return this.c.a(0, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyz) && ffkj.e(this.c, ((dyz) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.c + ')';
    }
}
