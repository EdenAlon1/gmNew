package defpackage;

import android.os.Bundle;
import com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ehwc extends IInAppReviewServiceCallback.Stub {
    final ehvt a;
    final dhri b;
    final /* synthetic */ ehwe c;

    public ehwc(ehwe ehweVar, ehvt ehvtVar, dhri dhriVar) {
        this.c = ehweVar;
        this.a = ehvtVar;
        this.b = dhriVar;
    }

    @Override // com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback
    public void onGetLaunchReviewFlowInfo(Bundle bundle) {
        ehwr ehwrVar = this.c.b;
        if (ehwrVar != null) {
            ehwrVar.e(this.b);
        }
        this.a.d("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
