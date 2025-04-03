package defpackage;

import com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sdn extends ISuggestedTextResultCallback.Stub {
    final /* synthetic */ sbm a;

    public sdn(sbm sbmVar) {
        this.a = sbmVar;
    }

    @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
    public final void onSuggestedTextInferenceFailure(int i) {
        this.a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
    public final void onSuggestedTextInferenceSuccess(ryx ryxVar) {
        int i = engw.d;
        engr engrVar = new engr();
        engw engwVar = ryxVar.a;
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            engrVar.h(new sdf(((ryt) engwVar.get(i2)).a, 0.0f, 0));
        }
        this.a.b(sdi.c(engrVar.g(), ryxVar.b));
    }
}
