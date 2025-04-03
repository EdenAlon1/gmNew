package defpackage;

import com.google.research.xeno.effect.Callbacks$StatusCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpdq implements Callbacks$StatusCallback {
    final /* synthetic */ ffrf a;

    public dpdq(ffrf ffrfVar) {
        this.a = ffrfVar;
    }

    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
    public final void onCompletion(boolean z, String str) {
        if (z) {
            this.a.w(ffcu.a);
        } else {
            this.a.w(ffci.a(new IllegalStateException(str)));
        }
    }
}
