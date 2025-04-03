package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.internal.IFeedbackService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dghy extends dfwc {
    private final Context a;

    public dghy(Context context, Looper looper, dfrc dfrcVar, dfrd dfrdVar, dfvs dfvsVar) {
        super(context, looper, 29, dfvsVar, dfrcVar, dfrdVar);
        this.a = context;
        dihh.b(context);
    }

    public final void M(FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        dgib.c(bundle);
        dgib.d(feedbackOptions);
        ((IFeedbackService) w()).saveAsyncFeedbackPsbd(feedbackOptions, bundle, j);
    }

    public final void N(FeedbackOptions feedbackOptions, long j) {
        dgib.d(feedbackOptions);
        ((IFeedbackService) w()).startFeedbackWithTimestamp(new ErrorReport(feedbackOptions, this.a.getCacheDir()), j);
    }

    @Override // defpackage.dfwc, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dfqr
    public final int a() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IFeedbackService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gK() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gL() {
        return dghf.b;
    }
}
