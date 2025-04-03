package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edtr extends RuntimeException {
    public edtr(String str) {
        super(str);
    }

    public edtr(Throwable th) {
        super("Cobalt registry could not be parsed from base64 string", th);
    }
}
