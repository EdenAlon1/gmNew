package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import defpackage.cwvg;
import defpackage.ooi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ExperimentBadgePreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentBadgePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        ooiVar.getClass();
        super.a(ooiVar);
        View C = ooiVar.C(R.id.experiment_badge);
        C.getClass();
        ((ComposeView) C).a(cwvg.b);
    }
}
