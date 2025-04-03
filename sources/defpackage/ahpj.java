package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpj {
    public static Boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(Activity activity, boolean z) {
        activity.getClass();
        if (b(activity)) {
            if (a == null) {
                a = Boolean.valueOf(activity.getSharedPreferences("bugle", 0).getBoolean(activity.getResources().getString(R.string.split_view_pref_key), true));
            }
            Boolean bool = a;
            bool.getClass();
            if (bool.booleanValue() && !z) {
                return !((activity instanceof ekhu ? ((ekhu) activity).H() : null) instanceof ahra) || activity.isTaskRoot();
            }
        }
        return false;
    }

    public static final boolean b(Context context) {
        return context.getResources().getBoolean(R.bool.is_sw600_w600);
    }
}
