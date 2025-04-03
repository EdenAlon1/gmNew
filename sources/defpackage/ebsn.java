package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebsn {
    public static ebse a(Context context, Runnable runnable) {
        engw r = engw.r(context.getResources().getString(R.string.sign_in_cancel));
        if (r == null) {
            throw new NullPointerException("Null possibleCancelStringList");
        }
        if (runnable != null) {
            return new ebsm(r, runnable);
        }
        throw new NullPointerException("Null onCancel");
    }
}
