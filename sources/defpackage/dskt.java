package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dskt {
    public static final void a(CharSequence charSequence, View view) {
        view.getClass();
        Snackbar.r(view, charSequence, 0).i();
    }

    public static /* synthetic */ void b(Activity activity, int i) {
        View findViewById = activity.findViewById(R.id.content);
        activity.getClass();
        findViewById.getClass();
        String string = activity.getString(i);
        string.getClass();
        a(string, findViewById);
    }
}
