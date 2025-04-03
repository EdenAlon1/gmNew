package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeql extends aeqn {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;

    public aeql(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.gallery_hqms_onboarding_ok);
        findViewById.getClass();
        this.a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.gallery_onboarding_profile_name);
        findViewById2.getClass();
        this.b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.gallery_onboarding_profile_email);
        findViewById3.getClass();
        this.c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.gallery_onboarding_profile_avatar);
        findViewById4.getClass();
        this.d = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.gallery_onboarding_profile_footnote_logo);
        findViewById5.getClass();
        this.e = (ImageView) findViewById5;
    }
}
