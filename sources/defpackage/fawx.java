package defpackage;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fawx extends UrlRequest.Callback {
    public final errj a;
    private final ExecutorService b;
    private final faww c;
    private final fawu d;

    public fawx(ExecutorService executorService) {
        fawu fawuVar = new fawu();
        this.b = executorService;
        faww fawwVar = new faww();
        this.c = fawwVar;
        this.a = new errj(fawwVar);
        this.d = fawuVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.c.a = new fawm(new fawl(fawk.CANCELED, ""));
        this.b.execute(this.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        boolean z = cronetException instanceof NetworkException;
        fawk fawkVar = fawk.UNKNOWN;
        if (z) {
            switch (((NetworkException) cronetException).getErrorCode()) {
                case 1:
                    fawkVar = fawk.BAD_URL;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    fawkVar = fawk.CONNECTION_ERROR;
                    break;
            }
        }
        fawl fawlVar = new fawl(fawkVar, cronetException);
        this.c.a = new fawm(fawlVar);
        this.b.execute(this.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        fawu fawuVar = this.d;
        emxf.l(!fawuVar.b);
        if (byteBuffer != fawuVar.a.peekLast()) {
            fawuVar.a.addLast(byteBuffer);
        }
        if (!byteBuffer.hasRemaining()) {
            byteBuffer = ByteBuffer.allocateDirect(8192);
        }
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        long j;
        long j2;
        emxf.l(!this.d.b);
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        if (allHeaders.containsKey("content-length")) {
            try {
                j2 = Long.parseLong(allHeaders.get("content-length").get(0));
            } catch (NumberFormatException unused) {
                j2 = 0;
            }
            if (j2 > 0) {
                j = (!allHeaders.containsKey("content-encoding") || (allHeaders.get("content-encoding").size() == 1 && Objects.equals(allHeaders.get("content-encoding").get(0), "identity"))) ? j2 + 1 : j2 + j2;
                urlRequest.read(ByteBuffer.allocateDirect((int) Math.min(j, 524288L)));
            }
        }
        j = 524288;
        urlRequest.read(ByteBuffer.allocateDirect((int) Math.min(j, 524288L)));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer byteBuffer;
        favs favsVar = new favs();
        for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
            favsVar.d(entry.getKey(), entry.getValue());
        }
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        fawu fawuVar = this.d;
        emxf.l(!fawuVar.b);
        fawuVar.b = true;
        Iterator it = fawuVar.a.iterator();
        while (it.hasNext()) {
            ((ByteBuffer) it.next()).flip();
        }
        if (fawuVar.a.isEmpty()) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        } else if (fawuVar.a.size() == 1) {
            byteBuffer = (ByteBuffer) fawuVar.a.remove();
        } else {
            Iterator it2 = fawuVar.a.iterator();
            int i = 0;
            while (it2.hasNext()) {
                i += ((ByteBuffer) it2.next()).remaining();
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            while (!fawuVar.a.isEmpty()) {
                allocateDirect.put((ByteBuffer) fawuVar.a.remove());
            }
            allocateDirect.flip();
            byteBuffer = allocateDirect;
        }
        byteBuffer.position(0);
        this.c.a = new fawm(new favt(httpStatusCode, favsVar, new efax(byteBuffer)));
        this.b.execute(this.a);
    }
}
