package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgoc extends dgol {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle h;
    final /* synthetic */ long i;
    final /* synthetic */ GoogleHelp j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgoc(dfre dfreVar, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(dfreVar);
        this.a = feedbackOptions;
        this.h = bundle;
        this.i = j;
        this.j = googleHelp;
    }

    @Override // defpackage.dgok
    protected final void n(IGoogleHelpService iGoogleHelpService) {
        try {
            iGoogleHelpService.saveAsyncFeedbackPsbd(this.a, this.h, this.i, this.j, new dgob(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            j(dgom.a);
        }
    }
}
