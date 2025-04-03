package com.google.android.apps.messaging.diagnostics.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsScenarioView;
import defpackage.a;
import defpackage.acfm;
import defpackage.engw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsScenarioView extends LinearLayout {
    public TextView a;
    public CheckBox b;
    public final Context c;
    public acfm d;
    private TextView e;

    public DiagnosticsScenarioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = context;
    }

    public final void a() {
        final String string;
        int i = this.d.e;
        int i2 = i - 1;
        Context context = getContext();
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            string = context.getString(R.string.diagnostics_scenario_status_pending);
        } else if (i2 == 1) {
            string = context.getString(R.string.diagnostics_scenario_status_running);
        } else if (i2 == 2) {
            string = context.getString(R.string.diagnostics_scenario_status_succeeded);
        } else if (i2 == 3) {
            string = context.getString(R.string.diagnostics_scenario_status_warning);
        } else if (i2 != 4) {
            string = a.a(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "FAILED" : "WARNING" : "SUCCEEDED" : "RUNNING" : "PENDING", "Unknown status (", ")");
        } else {
            string = context.getString(R.string.diagnostics_scenario_status_failed);
        }
        StringBuilder sb = new StringBuilder(string);
        final engw engwVar = this.d.c;
        if (!engwVar.isEmpty()) {
            final Context context2 = getContext();
            sb.append(context2.getString(R.string.scenario_status_details_separator));
            sb.append(context2.getString(R.string.diagnostics_scenario_tap_to_learn_more_text));
            setOnClickListener(new View.OnClickListener() { // from class: achm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    new AlertDialog.Builder(context2).setTitle(DiagnosticsScenarioView.this.d.b + ": " + string).setItems((CharSequence[]) engwVar.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() { // from class: achj
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            dialogInterface.dismiss();
                        }
                    }).create().show();
                }
            });
        }
        this.e.setText(sb);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        this.a = (TextView) findViewById(R.id.diagnostics_scenario_name);
        this.e = (TextView) findViewById(R.id.diagnostics_scenario_status);
        CheckBox checkBox = (CheckBox) findViewById(R.id.enable_scenario_checkbox);
        this.b = checkBox;
        checkBox.setOnClickListener(new View.OnClickListener() { // from class: achl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiagnosticsScenarioView diagnosticsScenarioView = DiagnosticsScenarioView.this;
                diagnosticsScenarioView.d.d = diagnosticsScenarioView.b.isChecked();
            }
        });
        super.onFinishInflate();
    }
}
