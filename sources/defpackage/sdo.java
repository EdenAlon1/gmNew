package defpackage;

import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ISuggestedTextService;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import com.google.android.apps.aicore.client.api.internal.IgnoreCancellationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdo extends sbo {
    private static final String h = "sdo";

    public sdo(sak sakVar, saq saqVar, emdl emdlVar) {
        super(sakVar, saqVar, emdlVar);
    }

    @Override // defpackage.sbo
    protected final /* bridge */ /* synthetic */ Object c(IAICoreService iAICoreService) {
        return iAICoreService.getSuggestedTextService(this.c.e());
    }

    @Override // defpackage.sbo
    protected final /* bridge */ /* synthetic */ ICancellationCallback d(Object obj, Object obj2, sbm sbmVar) {
        return ((ISuggestedTextService) obj).runCancellableInference(((sdh) obj2).c(), new sdn(sbmVar));
    }

    @Override // defpackage.sbo
    protected final /* bridge */ /* synthetic */ ICancellationCallback e(Object obj, Object obj2, ITokenizationCallback iTokenizationCallback) {
        ISuggestedTextService iSuggestedTextService = (ISuggestedTextService) obj2;
        if (iSuggestedTextService.getApiVersion() >= 2) {
            return iSuggestedTextService.getTokenInfo(((sdh) obj).c(), true, iTokenizationCallback);
        }
        Log.w(h, "Ignoring getTokenInfo because service is older than V3");
        iTokenizationCallback.onTokenizationFailure(16);
        return new IgnoreCancellationCallback();
    }
}
