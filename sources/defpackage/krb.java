package defpackage;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krb {
    public static boolean a(Context context) {
        boolean isUserUnlocked;
        isUserUnlocked = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        return isUserUnlocked;
    }
}
