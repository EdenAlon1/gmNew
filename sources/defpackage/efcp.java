package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcp extends RuntimeException {
    public efcp() {
    }

    public efcp(byte[] bArr) {
        super("The caller is trying to acquire a lease on too much data.");
    }

    public efcp(Throwable th) {
        super(th);
    }
}
