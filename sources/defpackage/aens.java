package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aens {
    public static void a(Activity activity, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        View findViewById = activity.findViewById(R.id.start_chat_fab);
        Snackbar s = Snackbar.s(activity, activity.getWindow().getDecorView().getRootView(), charSequence, 0);
        if (findViewById != null) {
            s.n(findViewById);
            s.l = true;
        }
        if (!TextUtils.isEmpty(charSequence2) && onClickListener != null) {
            s.t(charSequence2, onClickListener);
        }
        s.i();
    }

    public static void b(Activity activity, CharSequence charSequence) {
        a(activity, charSequence, null, null);
    }
}
