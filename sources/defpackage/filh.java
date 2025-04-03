package defpackage;

import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class filh extends QuicException {
    public final int a;
    public final int b;
    private final file c;

    public filh(String str, int i, int i2, int i3, int i4) {
        super(str, null);
        this.c = new file(str, i, i2);
        this.a = i3;
        this.b = i4;
    }

    @Override // org.chromium.net.QuicException
    public final int getConnectionCloseSource() {
        return this.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.c.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.c.a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.c.getMessage() + ", QuicDetailedErrorCode=" + this.a + ", Source=" + this.b;
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return this.a;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.c.immediatelyRetryable();
    }
}
