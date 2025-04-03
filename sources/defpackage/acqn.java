package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acqn extends RuntimeException {
    public acqn() {
        super("Could not connect to Ditto WebView. Retries exhausted.");
    }

    public acqn(String str, Throwable th) {
        super(str, th);
    }
}
