package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cotr extends RuntimeException {
    public cotr() {
        super("BCM is used, but legacy access to telephony was performed. Calling getOrCreateThreadId when BCM is used is not allowed");
    }
}
