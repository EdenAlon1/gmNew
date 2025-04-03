package defpackage;

import com.google.android.apps.aicore.aidl.ISmartReplyResultCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sdj extends ISmartReplyResultCallback.Stub {
    final /* synthetic */ sbm a;

    public sdj(sbm sbmVar) {
        this.a = sbmVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
    public final void onSmartReplyInferenceFailure(int i) {
        this.a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
    public final void onSmartReplyInferenceSuccess(ryl rylVar) {
        int i = engw.d;
        engr engrVar = new engr();
        engw engwVar = rylVar.a;
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ryh ryhVar = (ryh) engwVar.get(i2);
            engrVar.h(new sdf(ryhVar.a, ryhVar.c, ryhVar.b));
        }
        this.a.b(sdi.c(engrVar.g(), rylVar.b));
    }
}
