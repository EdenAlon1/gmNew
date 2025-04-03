package defpackage;

import com.google.android.ims.events.EventHubProxy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipv implements erqj {
    final /* synthetic */ EventHubProxy a;

    public dipv(EventHubProxy eventHubProxy) {
        this.a = eventHubProxy;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        String str;
        str = this.a.b;
        dkty.i(th, "Failed to send events from proxy %s", str);
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
    }
}
