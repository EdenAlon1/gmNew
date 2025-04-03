package defpackage;

import android.os.Trace;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fimb extends UploadDataProvider {
    final /* synthetic */ fimc a;

    public fimb(fimc fimcVar) {
        this.a = fimcVar;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        fimc fimcVar = this.a;
        int i = fimcVar.a;
        if (i != -1) {
            return i;
        }
        boolean z = fimcVar.c;
        ByteBuffer byteBuffer = fimcVar.b;
        return z ? byteBuffer.limit() : byteBuffer.position();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        new fiev("CronetBufferedOutputStream.UploadDataProviderImpl#read");
        try {
            int remaining = byteBuffer.remaining();
            if (remaining < this.a.b.remaining()) {
                byteBuffer.put(this.a.b.array(), this.a.b.position(), remaining);
                ByteBuffer byteBuffer2 = this.a.b;
            } else {
                byteBuffer.put(this.a.b);
            }
            uploadDataSink.onReadSucceeded(false);
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
        new fiev("CronetBufferedOutputStream.UploadDataProviderImpl#rewind");
        try {
            uploadDataSink.onRewindSucceeded();
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
}
