package defpackage;

import android.content.Intent;
import com.google.android.libraries.surveys.internal.view.SurveyActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsc extends abo {
    final /* synthetic */ SurveyActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efsc(SurveyActivity surveyActivity) {
        super(true);
        this.a = surveyActivity;
    }

    @Override // defpackage.abo
    public final void b() {
        efsi efsiVar = this.a.n;
        efsiVar.o(6);
        if (efsiVar.k) {
            efsiVar.v.setResult(-1, new Intent().putExtra("EXTRA_BACK_BUTTON_PRESSED", true));
        }
        efsiVar.v.finish();
    }
}
