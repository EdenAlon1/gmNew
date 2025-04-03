package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofv extends ofx {
    public static final ofv a = new ofv();

    private ofv() {
        super(false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ofv) && this.c == ((ofv) obj).c;
    }

    public final int hashCode() {
        return this.c ? 1231 : 1237;
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.c + ')';
    }
}
