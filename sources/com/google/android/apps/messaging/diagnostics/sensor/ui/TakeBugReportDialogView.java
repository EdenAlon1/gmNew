package com.google.android.apps.messaging.diagnostics.sensor.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.sensor.ui.TakeBugReportDialogView;
import defpackage.acew;
import defpackage.acex;
import defpackage.acgm;
import defpackage.acgn;
import defpackage.acgp;
import defpackage.ellj;
import defpackage.ellq;
import defpackage.re;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TakeBugReportDialogView extends acgp {
    public EditText a;
    public RadioGroup b;
    public acew c;
    public Button d;
    public ellq e;
    public acex f;
    private List g;
    private Button h;

    public TakeBugReportDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void c(View view, int i) {
        ellj.g(new acgn(new acgm(i, this.c, this.a.getText().toString())), view);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (EditText) findViewById(R.id.take_bug_report_comment);
        this.b = (RadioGroup) findViewById(R.id.take_bug_report_categories_view);
        this.d = (Button) findViewById(R.id.take_bug_report_view_report_button);
        this.h = (Button) findViewById(R.id.take_bug_report_view_cancel_button);
        this.e.a(this.d, new View.OnClickListener() { // from class: achb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeBugReportDialogView.this.c(view, 1);
            }
        });
        this.e.a(this.h, new View.OnClickListener() { // from class: achc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeBugReportDialogView.this.c(view, 2);
            }
        });
        List<acew> list = this.f.a;
        this.g = list;
        for (final acew acewVar : list) {
            re reVar = new re(getContext());
            reVar.setText(acewVar.a);
            reVar.setId(acewVar.c);
            reVar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: acha
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        acew acewVar2 = acewVar;
                        TakeBugReportDialogView takeBugReportDialogView = TakeBugReportDialogView.this;
                        takeBugReportDialogView.c = acewVar2;
                        for (int i = 0; i < takeBugReportDialogView.b.getChildCount(); i++) {
                            re reVar2 = (re) takeBugReportDialogView.b.getChildAt(i);
                            if (acewVar2.c != reVar2.getId()) {
                                reVar2.setVisibility(8);
                            }
                        }
                        takeBugReportDialogView.d.setEnabled(true);
                        takeBugReportDialogView.a.requestFocus();
                    }
                }
            });
            this.b.addView(reVar);
        }
    }
}
