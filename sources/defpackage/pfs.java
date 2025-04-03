package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import j$.util.Optional;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pfs implements WebMessageListenerBoundaryInterface {
    private final acwi a;

    public pfs(acwi acwiVar) {
        this.a = acwiVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        pes a = pfq.a((WebMessageBoundaryInterface) fimp.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (a != null) {
            final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) fimp.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            pfm pfmVar = (pfm) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: pfl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new pfm(JsReplyProxyBoundaryInterface.this);
                }
            });
            acwi acwiVar = this.a;
            if (!z) {
                csjb a2 = acwj.a.a();
                a2.I("Ignoring post message from iFrame inside Ditto");
                a2.r();
                return;
            }
            if (acwiVar.b.k) {
                csjb a3 = acwj.a.a();
                a3.I("Ignoring post message from closed transport");
                a3.r();
                return;
            }
            acwiVar.a.h = Optional.of(pfmVar);
            acwj acwjVar = acwiVar.b;
            synchronized (acwjVar.b) {
                if (acwjVar.i.isPresent()) {
                    ((kfb) acwjVar.i.get()).b(null);
                    acwjVar.i = Optional.empty();
                }
            }
            String a4 = a.a();
            if (emxe.c(a4)) {
                return;
            }
            acwj acwjVar2 = acwiVar.b;
            acwjVar2.g.b(a4, acwjVar2.e);
        }
    }
}
