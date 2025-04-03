package defpackage;

import androidx.car.app.model.Alert;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lif extends lia {
    public lif(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.a.mark(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final void c(long j) {
        long j2 = this.b;
        if (j2 > j) {
            this.b = 0;
            this.a.reset();
        } else {
            j -= j2;
        }
        b((int) j);
    }

    public lif(byte[] bArr) {
        super(bArr);
        this.a.mark(Alert.DURATION_SHOW_INDEFINITELY);
    }
}
