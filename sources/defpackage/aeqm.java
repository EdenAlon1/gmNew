package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeqm extends aeqn {
    public final View a;
    public final TextView b;

    public aeqm(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.gallery_hqms_close_button);
        findViewById.getClass();
        this.a = findViewById;
        View findViewById2 = view.findViewById(R.id.gallery_hqms_onboarding_next);
        findViewById2.getClass();
        this.b = (TextView) findViewById2;
    }
}
