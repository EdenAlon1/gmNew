package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.efoi;
import defpackage.efor;
import defpackage.efpb;
import defpackage.fdwe;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SurveyPromptBannerWrapper extends FrameLayout {
    public SurveyPromptBannerWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        efpb efpbVar = efor.c;
        if (efor.c(fdwe.a.get().b(efor.b))) {
            i3 = i;
            i2 = efoi.b(this, findViewById(R.id.survey_prompt_banner), i3, i2, findViewById(R.id.survey_prompt_header), null, false);
        } else {
            i3 = i;
        }
        super.onMeasure(i3, i2);
    }
}
