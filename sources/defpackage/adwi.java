package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adwi extends adwm {
    public final AdvancedFeedbackActivity a;
    public File b;
    public abo c;
    public int d = 1;

    public adwi(AdvancedFeedbackActivity advancedFeedbackActivity) {
        this.a = advancedFeedbackActivity;
    }

    public final void a() {
        adws a = adws.a();
        cg cgVar = new cg(this.a.a());
        cgVar.F(R.anim.enter, R.anim.exit);
        cgVar.E(R.id.advanced_feedback_fragment_container, a);
        cgVar.c();
        this.d = 1;
        a.H().d();
    }
}
