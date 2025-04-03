package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehbo extends kc {
    @Override // defpackage.kc, defpackage.dn
    public Dialog hf(Bundle bundle) {
        return new ehbn(z(), this.b);
    }

    @Override // defpackage.dn
    public void hw() {
        Dialog dialog = this.d;
        if (dialog instanceof ehbn) {
            boolean z = ((ehbn) dialog).a().u;
        }
        super.hw();
    }
}
