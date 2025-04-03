package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adhk {
    private final Optional a;

    public adhk(Optional optional) {
        this.a = optional;
    }

    public final boolean a(eg egVar) {
        if (!adhu.a()) {
            return false;
        }
        Bundle a = egVar.U().d() ? egVar.U().a("tiktok_account_controller_saved_instance_state") : null;
        if (a != null) {
            return !((Boolean) this.a.orElse(false)).booleanValue() && a.getBoolean("tiktok_accounts_disabled");
        }
        return true;
    }
}
