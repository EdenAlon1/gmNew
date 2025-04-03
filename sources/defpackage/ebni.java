package defpackage;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebni {
    public static boolean a(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        return userManager == null || !userManager.hasUserRestriction("no_modify_accounts");
    }
}
