package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbiq {
    public final Activity a;
    public final Optional b;

    public dbiq(Activity activity, Optional optional) {
        this.a = activity;
        this.b = optional;
    }

    public final EditText a(int i) {
        qw qwVar = new qw(this.a);
        qwVar.setInputType(i);
        qwVar.setSingleLine(false);
        return qwVar;
    }

    public final TextView b(String str) {
        return dbis.a(this.a, str);
    }

    public final View c() {
        Activity activity = this.a;
        int applyDimension = (int) TypedValue.applyDimension(1, 10.0f, activity.getResources().getDisplayMetrics());
        View view = new View(activity);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, applyDimension));
        return view;
    }
}
