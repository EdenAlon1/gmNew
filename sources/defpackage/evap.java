package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evap extends UploadDataProvider {
    private final ByteBuffer a;

    public evap(evaz evazVar) {
        this.a = evazVar.b.duplicate();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.a.remaining();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (this.a.remaining() > byteBuffer.remaining()) {
            ByteBuffer byteBuffer2 = this.a;
            int limit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
            byteBuffer.put(this.a);
            this.a.limit(limit);
        } else {
            byteBuffer.put(this.a);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.rewind();
        uploadDataSink.onRewindSucceeded();
    }
}
