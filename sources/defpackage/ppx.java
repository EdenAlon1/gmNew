package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppx extends pqa {
    private final Throwable a;

    public ppx(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ")";
    }
}
