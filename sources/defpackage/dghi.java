package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.internal.IFeedbackService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dghi extends dghk {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghi(dfre dfreVar, Bundle bundle, long j) {
        super(dfreVar);
        this.a = bundle;
        this.h = j;
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        dghy dghyVar = (dghy) dfqkVar;
        try {
            Bundle bundle = this.a;
            long j = this.h;
            dgib.c(bundle);
            ((IFeedbackService) dghyVar.w()).saveAsyncFeedbackPsd(bundle, j);
            l(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psd failed!", e);
            j(dghl.a);
        }
    }
}
