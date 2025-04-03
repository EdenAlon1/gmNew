package defpackage;

import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ISmartReplyService;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import com.google.android.apps.aicore.client.api.internal.IgnoreCancellationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdk extends sbo implements sap {
    public static final /* synthetic */ int h = 0;
    private static final String i = "sdk";

    public sdk(sak sakVar, saq saqVar, emdl emdlVar) {
        super(sakVar, saqVar, emdlVar);
    }

    @Override // defpackage.sbo
    protected final /* bridge */ /* synthetic */ Object c(IAICoreService iAICoreService) {
        return iAICoreService.getSmartReplyService(this.c.e());
    }

    @Override // defpackage.sbo
    protected final /* bridge */ /* synthetic */ ICancellationCallback d(Object obj, Object obj2, sbm sbmVar) {
        return ((ISmartReplyService) obj).runCancellableInference(((sdh) obj2).b(), new sdj(sbmVar));
    }

    @Override // defpackage.sbo
    protected final /* bridge */ /* synthetic */ ICancellationCallback e(Object obj, Object obj2, ITokenizationCallback iTokenizationCallback) {
        ISmartReplyService iSmartReplyService = (ISmartReplyService) obj2;
        if (iSmartReplyService.getApiVersion() >= 4) {
            return iSmartReplyService.getTokenInfo(((sdh) obj).b(), true, iTokenizationCallback);
        }
        Log.w(i, "Ignoring getTokenInfo because service is older than V5");
        iTokenizationCallback.onTokenizationFailure(16);
        return new IgnoreCancellationCallback();
    }
}
