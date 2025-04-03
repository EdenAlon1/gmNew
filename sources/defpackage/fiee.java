package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiee extends RuntimeException {
    public fiee(String str, Throwable th) {
        super("Native stack trace:" + System.lineSeparator() + str, th);
    }
}
