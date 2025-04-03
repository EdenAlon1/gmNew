package defpackage;

import android.view.View;
import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dujp implements View.OnClickListener {
    final /* synthetic */ SurveyPromptActivity a;

    public dujp(SurveyPromptActivity surveyPromptActivity) {
        this.a = surveyPromptActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.G("o");
        this.a.C();
        this.a.finish();
    }
}
