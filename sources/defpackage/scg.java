package defpackage;

import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scg extends IAiCoreServiceProviderCallback.Stub {
    final /* synthetic */ sch a;

    public scg(sch schVar) {
        this.a = schVar;
    }

    @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback
    public final void onServiceProviderFailure(int i, String str) {
        this.a.b(new sao(4, i != 1 ? i != 2 ? i != 3 ? 0 : 607 : 604 : 601, "AiCore service is not connected. Service error: ".concat(String.valueOf(str)), null));
    }

    @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback
    public final void onServiceProviderSuccess(IAICoreService iAICoreService) {
        this.a.a(iAICoreService);
    }
}
