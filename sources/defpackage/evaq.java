package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evaq implements Runnable {
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ evat b;

    public evaq(evat evatVar, UrlResponseInfo urlResponseInfo) {
        this.a = urlResponseInfo;
        this.b = evatVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ByteBuffer byteBuffer;
        evao evaoVar = this.b.b;
        int i = 0;
        if (evaoVar.a.isEmpty()) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        } else if (evaoVar.a.size() == 1) {
            byteBuffer = (ByteBuffer) evaoVar.a.get(0);
            if (byteBuffer.hasRemaining()) {
                byteBuffer.flip();
            }
            byteBuffer.position(0);
        } else {
            for (ByteBuffer byteBuffer2 : evaoVar.a) {
                byteBuffer2.flip();
                i += byteBuffer2.remaining();
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            Iterator it = evaoVar.a.iterator();
            while (it.hasNext()) {
                allocateDirect.put((ByteBuffer) it.next());
            }
            allocateDirect.flip();
            byteBuffer = allocateDirect;
        }
        ((ensz) evau.a.n().h("com/google/frameworks/client/data/android/HttpClientImpl$HttpClientUrlRequestListener$1", "run", 264, "HttpClientImpl.java")).u("Initial buffer guess was %d, actual size was %d", this.b.a(this.a), byteBuffer.remaining());
        evat evatVar = this.b;
        evbf evbfVar = new evbf();
        evbfVar.a(evat.b(this.a.getAllHeaders()));
        evbfVar.b(byteBuffer);
        evbfVar.d = this.a.getHttpStatusCode();
        evbfVar.b.addAll(this.b.d);
        evatVar.a.set(new evbg(evbfVar));
    }
}
