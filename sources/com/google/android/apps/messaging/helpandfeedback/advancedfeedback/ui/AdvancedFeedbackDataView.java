package com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import defpackage.adtw;
import defpackage.adxx;
import defpackage.ellq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AdvancedFeedbackDataView extends adxx {
    public CheckBox g;
    public TextView h;
    public TextView i;
    public adtw j;
    public ellq k;

    public AdvancedFeedbackDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Optional g() {
        adtw adtwVar = this.j;
        return adtwVar == null ? Optional.empty() : Optional.of(adtwVar);
    }

    public final boolean h() {
        return this.g.isChecked();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (CheckBox) findViewById(R.id.advanced_feedback_data_checkbox);
        this.i = (TextView) findViewById(R.id.advanced_feedback_learn_more_button);
        this.h = (TextView) findViewById(R.id.advanced_feedback_data_title);
        this.k.a(this.i, new View.OnClickListener() { // from class: adwp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvancedFeedbackDataView advancedFeedbackDataView = AdvancedFeedbackDataView.this;
                adtw adtwVar = advancedFeedbackDataView.j;
                if (adtwVar != null) {
                    ellj.g(new adxq(adtwVar), advancedFeedbackDataView.i);
                }
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: adwq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvancedFeedbackDataView advancedFeedbackDataView = AdvancedFeedbackDataView.this;
                TextView textView = advancedFeedbackDataView.i;
                if (view == textView) {
                    textView.callOnClick();
                } else {
                    advancedFeedbackDataView.g.toggle();
                }
            }
        });
    }
}
