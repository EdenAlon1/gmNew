package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dghh extends dghk {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Context h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dghh(dfre dfreVar, FeedbackOptions feedbackOptions, Context context, long j) {
        super(dfreVar);
        this.a = feedbackOptions;
        this.h = context;
        this.i = j;
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        dghy dghyVar = (dghy) dfqkVar;
        dghd dghdVar = this.a.t;
        if (dghdVar != null) {
            dgib.e(this.h, dghdVar, this.i);
        }
        dghyVar.N(this.a, this.i);
        l(Status.a);
    }
}
