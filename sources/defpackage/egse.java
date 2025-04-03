package defpackage;

import android.app.Activity;
import com.google.android.gms.feedback.FeedbackOptions;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egse {
    public final Activity a;

    public egse(Activity activity) {
        this.a = activity;
    }

    public final FeedbackOptions a() {
        dghp dghpVar = new dghp(this.a.getApplicationContext());
        dghpVar.d = "com.google.android.libraries.user.profile.quickeditor.USER_INITIATED_FEEDBACK_REPORT";
        dghpVar.a = dgho.a(this.a);
        return dghpVar.a();
    }
}
