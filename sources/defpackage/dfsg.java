package defpackage;

import android.app.Dialog;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfsg extends dftf {
    final /* synthetic */ Dialog a;
    final /* synthetic */ dfsh b;

    public dfsg(dfsh dfshVar, Dialog dialog) {
        this.a = dialog;
        this.b = dfshVar;
    }

    @Override // defpackage.dftf
    public final void a() {
        this.b.a.b();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
