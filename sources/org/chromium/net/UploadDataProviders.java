package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.figd;
import defpackage.fige;
import defpackage.figf;
import defpackage.figh;
import defpackage.figi;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new figh(new fige(parcelFileDescriptor));
    }

    public static UploadDataProvider create(File file) {
        return new figh(new figd(file));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new figf(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return figi.a(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return figi.a(bArr, i, i2);
    }
}
