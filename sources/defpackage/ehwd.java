package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwd extends ehwc {
    public ehwd(ehwe ehweVar, dhri dhriVar) {
        super(ehweVar, new ehvt("OnRequestInstallCallback"), dhriVar);
    }

    @Override // defpackage.ehwc, com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback
    public final void onGetLaunchReviewFlowInfo(Bundle bundle) {
        super.onGetLaunchReviewFlowInfo(bundle);
        this.b.d(new ehvu((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
