package defpackage;

import android.view.View;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dujo implements View.OnClickListener {
    final /* synthetic */ SurveyPromptActivity a;

    public dujo(SurveyPromptActivity surveyPromptActivity) {
        this.a = surveyPromptActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.D();
    }
}
