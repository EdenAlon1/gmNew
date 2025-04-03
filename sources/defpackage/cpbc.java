package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbc extends Exception {
    private static final long serialVersionUID = 1;

    public cpbc() {
    }

    public cpbc(String str) {
        super(str);
    }

    public cpbc(Throwable th) {
        super("caught exception in sending ", th);
    }
}
