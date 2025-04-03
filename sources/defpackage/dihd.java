package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dihd extends Exception {
    public dihd() {
    }

    public dihd(String str) {
        super(str);
    }

    public dihd(Throwable th) {
        super("ContentProvider query failed", th);
    }
}
