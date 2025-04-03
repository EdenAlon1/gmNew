package defpackage;

import android.view.View;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsv extends pdb {
    final /* synthetic */ SurveyViewPager a;

    public efsv(SurveyViewPager surveyViewPager) {
        this.a = surveyViewPager;
    }

    @Override // defpackage.pdb, defpackage.pcx
    public final void b(int i) {
        this.a.invalidate();
        efpe v = this.a.v();
        if (v != null) {
            v.p();
            v.f();
            View view = v.Q;
            if (view != null) {
                view.sendAccessibilityEvent(32);
            }
        }
        this.a.requestLayout();
    }
}
