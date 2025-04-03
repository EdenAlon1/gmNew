package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ds implements lkp {
    final /* synthetic */ ea a;

    public ds(ea eaVar) {
        this.a = eaVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        View view;
        if (lkiVar != lki.ON_STOP || (view = this.a.Q) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
