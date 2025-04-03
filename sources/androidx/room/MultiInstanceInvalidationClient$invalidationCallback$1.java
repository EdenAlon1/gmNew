package androidx.room;

import androidx.room.IMultiInstanceInvalidationCallback;
import defpackage.ffqy;
import defpackage.ffsk;
import defpackage.osh;
import defpackage.osi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationClient$invalidationCallback$1 extends IMultiInstanceInvalidationCallback.Stub {
    final /* synthetic */ osi this$0;

    MultiInstanceInvalidationClient$invalidationCallback$1(osi osiVar) {
        this.this$0 = osiVar;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void onInvalidation(String[] strArr) {
        strArr.getClass();
        osi osiVar = this.this$0;
        ffsk ffskVar = osiVar.a;
        ffqy.d(null, null, null, new osh(strArr, osiVar, null), 3);
    }
}
