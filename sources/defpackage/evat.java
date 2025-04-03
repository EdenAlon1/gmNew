package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evat extends UrlRequest.Callback {
    final SettableFuture a;
    final evba c;
    private final Executor e;
    final evao b = new evao();
    public final List d = new ArrayList();

    public evat(SettableFuture settableFuture, Executor executor, evba evbaVar) {
        this.a = settableFuture;
        this.e = executor;
        this.c = evbaVar;
    }

    public static final enkg b(Map map) {
        engx engxVar = new engx();
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                engxVar.b(evax.b((String) entry.getKey()), (String) it.next());
            }
        }
        return engxVar.a();
    }

    public final int a(UrlResponseInfo urlResponseInfo) {
        if ("head".equalsIgnoreCase(this.c.g)) {
            return 1;
        }
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        if (!allHeaders.containsKey("content-length")) {
            return 32768;
        }
        int parseInt = Integer.parseInt(allHeaders.get("content-length").get(0));
        return allHeaders.containsKey("content-encoding") ? Math.max(Math.min(parseInt + parseInt, 32768), 1) : parseInt + 1;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.e.execute(new evar(this));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.e.execute(new evas(this, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.b.a(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
        } else {
            urlRequest.read(ByteBuffer.allocateDirect(32768));
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.c.e) {
            this.d.add(str);
            urlRequest.followRedirect();
            return;
        }
        SettableFuture settableFuture = this.a;
        evbf evbfVar = new evbf();
        evbfVar.a(b(urlResponseInfo.getAllHeaders()));
        evbfVar.b(ByteBuffer.allocateDirect(0));
        evbfVar.d = urlResponseInfo.getHttpStatusCode();
        settableFuture.set(new evbg(evbfVar));
        urlRequest.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a(urlResponseInfo));
        this.b.a(allocateDirect);
        urlRequest.read(allocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.e.execute(new evaq(this, urlResponseInfo));
    }
}
