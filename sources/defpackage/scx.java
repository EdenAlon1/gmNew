package defpackage;

import com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scx extends IMagicRewriteResultCallback.Stub {
    final /* synthetic */ sbm a;

    public scx(sbm sbmVar) {
        this.a = sbmVar;
    }

    @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback
    public final void onMagicRewriteInferenceFailure(int i) {
        this.a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultCallback
    public final void onMagicRewriteInferenceSuccess(rxb rxbVar) {
        int i = engw.d;
        engr engrVar = new engr();
        engw engwVar = rxbVar.a;
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            rxz rxzVar = (rxz) engwVar.get(i2);
            String str = rxzVar.a;
            int i3 = rxzVar.b;
            int i4 = scy.h;
            engrVar.h(new sct(str, i3, rxzVar.d));
        }
        engw g = engrVar.g();
        this.a.b(new scr(engw.n(g), rxbVar.b));
    }
}
