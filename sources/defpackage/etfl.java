package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfl {
    public final InputStream a;

    private etfl(InputStream inputStream) {
        this.a = inputStream;
    }

    public static etfl a(byte[] bArr) {
        return new etfl(new ByteArrayInputStream(bArr));
    }
}
