package defpackage;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pfh extends WebMessagePort.WebMessageCallback {
    final /* synthetic */ pet a;

    public pfh(pet petVar) {
        this.a = petVar;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        this.a.a(new pes(webMessage.getData(), pfu.f(webMessage.getPorts())));
    }
}
