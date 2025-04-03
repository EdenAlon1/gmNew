package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dghj extends dghk {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghj(dfre dfreVar, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        super(dfreVar);
        this.a = feedbackOptions;
        this.h = bundle;
        this.i = j;
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        try {
            ((dghy) dfqkVar).M(this.a, this.h, this.i);
            l(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psbd failed!", e);
            j(dghl.a);
        }
    }
}
