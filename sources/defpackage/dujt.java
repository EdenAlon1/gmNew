package defpackage;

import com.google.android.libraries.hats20.SurveyPromptActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dujt implements Runnable {
    final /* synthetic */ SurveyPromptActivity a;

    public dujt(SurveyPromptActivity surveyPromptActivity) {
        this.a = surveyPromptActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.q = true;
        dukb.c().b().a = false;
        this.a.finish();
    }
}
