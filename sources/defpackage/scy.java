package defpackage;

import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IMagicRewriteService;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import com.google.android.apps.aicore.client.api.internal.IgnoreCancellationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scy extends sbo implements sap {
    public static final /* synthetic */ int h = 0;
    private static final String i = "scy";

    public scy(sak sakVar, saq saqVar, emdl emdlVar) {
        super(sakVar, saqVar, emdlVar);
    }

    @Override // defpackage.sbo
    protected final /* bridge */ /* synthetic */ Object c(IAICoreService iAICoreService) {
        return iAICoreService.getMagicRewriteService(this.c.e());
    }

    @Override // defpackage.sbo
    protected final /* bridge */ /* synthetic */ ICancellationCallback d(Object obj, Object obj2, sbm sbmVar) {
        return ((IMagicRewriteService) obj).runCancellableInference(((scv) obj2).d(), new scx(sbmVar));
    }

    @Override // defpackage.sbo
    protected final /* bridge */ /* synthetic */ ICancellationCallback e(Object obj, Object obj2, ITokenizationCallback iTokenizationCallback) {
        scv scvVar = (scv) obj;
        IMagicRewriteService iMagicRewriteService = (IMagicRewriteService) obj2;
        if (iMagicRewriteService.getApiVersion() >= 2) {
            return iMagicRewriteService.getTokenInfo(scvVar.d(), true, iTokenizationCallback);
        }
        Log.w(i, "Ignoring getTokenInfo because service is older than 2");
        iTokenizationCallback.onTokenizationFailure(16);
        return new IgnoreCancellationCallback();
    }
}
