package defpackage;

import com.google.android.apps.aicore.aidl.ITokenizationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbk extends ITokenizationCallback.Stub {
    final /* synthetic */ kfb a;

    public sbk(kfb kfbVar) {
        this.a = kfbVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
    public final void onTokenizationFailure(int i) {
        this.a.c(new sao(5, i, "Tokenization failed.", null));
    }

    @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
    public final void onTokenizationInfoSuccess(sah sahVar) {
        this.a.b(new sav(sahVar.a));
    }

    @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
    public final void onTokenizationSuccess(int i) {
        this.a.c(new sao(5, 14, "GetTokenInfo should not invoke onTokenizationSuccess method.", null));
    }
}
