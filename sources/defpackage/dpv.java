package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpv extends CancellationException {
    public dpv() {
        super(null);
    }

    public dpv(byte[] bArr) {
        super("The press gesture was canceled.");
    }
}
