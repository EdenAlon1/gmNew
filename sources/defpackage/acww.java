package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acww extends RuntimeException {
    public acww() {
        super("Received a failed response from Ditto");
    }

    public acww(Throwable th) {
        super("Could not parse conversation reply payload", th);
    }
}
