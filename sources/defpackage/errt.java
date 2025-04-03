package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class errt {
    static void a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
