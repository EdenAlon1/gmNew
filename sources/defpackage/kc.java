package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kc extends dn {
    @Override // defpackage.dn
    public Dialog hf(Bundle bundle) {
        return new kb(z(), this.b);
    }

    @Override // defpackage.dn
    public final void r(Dialog dialog, int i) {
        if (!(dialog instanceof kb)) {
            super.r(dialog, i);
            return;
        }
        kb kbVar = (kb) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        kbVar.g();
    }
}
