package defpackage;

import android.app.Activity;
import android.support.v7.widget.AppCompatTextView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbis {
    public static TextView a(Activity activity, String str) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(activity);
        appCompatTextView.setText(str);
        appCompatTextView.setPadding(32, 8, 0, 0);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setTextColor(ehdr.d(activity, R.attr.colorOnBackground, "DebugCommandViews"));
        return appCompatTextView;
    }
}
