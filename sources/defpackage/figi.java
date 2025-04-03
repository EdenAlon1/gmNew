package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class figi {
    public static UploadDataProvider a(byte[] bArr, int i, int i2) {
        return new figf(ByteBuffer.wrap(bArr, i, i2).slice());
    }
}
