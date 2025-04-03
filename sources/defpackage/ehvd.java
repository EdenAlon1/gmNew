package defpackage;

import android.os.Bundle;
import com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ehvd extends IAppUpdateServiceCallback.Stub {
    final ehvt a;
    final dhri b;
    final /* synthetic */ ehvg c;

    public ehvd(ehvg ehvgVar, ehvt ehvtVar, dhri dhriVar) {
        this.c = ehvgVar;
        this.a = ehvtVar;
        this.b = dhriVar;
    }

    @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
    public void onCompleteUpdate(Bundle bundle) {
        this.c.b.e(this.b);
        this.a.d("onCompleteUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
    public void onRequestInfo(Bundle bundle) {
        this.c.b.e(this.b);
        this.a.d("onRequestInfo", new Object[0]);
    }
}
