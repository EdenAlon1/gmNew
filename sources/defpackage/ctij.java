package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctij implements ctih {
    final UserManager a;

    public ctij(Context context) {
        emxf.b(context != null, "Context cannot be null.");
        this.a = (UserManager) context.getSystemService("user");
    }

    @Override // defpackage.ctih
    public final boolean a() {
        UserManager userManager = this.a;
        userManager.getClass();
        return userManager.getSerialNumberForUser(Process.myUserHandle()) == 0;
    }
}
