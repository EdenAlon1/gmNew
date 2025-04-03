package defpackage;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctii implements ctih {
    final UserManager a;

    public ctii(Context context) {
        emxf.b(context != null, "Context cannot be null.");
        this.a = (UserManager) context.getSystemService("user");
    }

    @Override // defpackage.ctih
    public final boolean a() {
        UserManager userManager = this.a;
        userManager.getClass();
        return userManager.isMainUser();
    }
}
