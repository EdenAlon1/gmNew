package defpackage;

import android.os.Trace;
import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fimd extends UploadDataProvider {
    final /* synthetic */ fime a;

    public fimd(fime fimeVar) {
        this.a = fimeVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return -1L;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        new fiev("CronetChunkedOutputStream.UploadDataProviderImpl#read");
        try {
            if (byteBuffer.remaining() >= this.a.b.remaining()) {
                byteBuffer.put(this.a.b);
                uploadDataSink.onReadSucceeded(this.a.c);
                fime fimeVar = this.a;
                if (!fimeVar.c) {
                    fimeVar.a.c();
                }
            } else {
                int limit = this.a.b.limit();
                ByteBuffer byteBuffer2 = this.a.b;
                byteBuffer.put(this.a.b);
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
