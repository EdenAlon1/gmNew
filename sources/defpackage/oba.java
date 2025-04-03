package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oba extends lml {
    public WeakReference a;

    @Override // defpackage.lml
    protected final void fD() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            ffkj.c("completeTransition");
            weakReference = null;
        }
        ffix ffixVar = (ffix) weakReference.get();
        if (ffixVar != null) {
            ffixVar.invoke();
        }
    }
}
