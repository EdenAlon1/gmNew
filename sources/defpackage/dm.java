package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dm extends ek {
    final /* synthetic */ ek a;
    final /* synthetic */ dn b;

    public dm(dn dnVar, ek ekVar) {
        this.b = dnVar;
        this.a = ekVar;
    }

    @Override // defpackage.ek
    public final View a(int i) {
        ek ekVar = this.a;
        if (ekVar.b()) {
            return ekVar.a(i);
        }
        Dialog dialog = this.b.d;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.ek
    public final boolean b() {
        return this.a.b() || this.b.e;
    }
}
