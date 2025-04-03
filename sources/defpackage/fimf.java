package defpackage;

import android.os.Trace;
import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fimf extends UploadDataProvider {
    final /* synthetic */ fimg a;

    public fimf(fimg fimgVar) {
        this.a = fimgVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.b;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        new fiev("CronetFixedModeOutputStream.UploadDataProviderImpl#read");
        try {
            if (byteBuffer.remaining() >= this.a.c.remaining()) {
                byteBuffer.put(this.a.c);
                uploadDataSink.onReadSucceeded(false);
                this.a.a.c();
            } else {
                int limit = this.a.c.limit();
                ByteBuffer byteBuffer2 = this.a.c;
                byteBuffer.put(this.a.c);
                uploadDataSink.onReadSucceeded(false);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
    }
}
