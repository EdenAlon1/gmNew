package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofw extends ofx {
    public static final ofw a = new ofw(true);
    public static final ofw b = new ofw(false);

    public ofw(boolean z) {
        super(z);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ofw) && this.c == ((ofw) obj).c;
    }

    public final int hashCode() {
        return this.c ? 1231 : 1237;
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.c + ')';
    }
}
