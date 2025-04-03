package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvb extends RuntimeException {
    public acvb() {
        super("sendMessage was called on JsBridgeTransport before it is ready to accept messages.");
    }
}
