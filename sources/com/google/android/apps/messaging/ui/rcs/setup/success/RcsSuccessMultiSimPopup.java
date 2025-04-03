package com.google.android.apps.messaging.ui.rcs.setup.success;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.ctwb;
import defpackage.ddbi;
import defpackage.ddbs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsSuccessMultiSimPopup extends ddbi {
    public RcsSuccessMultiSimPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.rcs_success_multi_sim_popup, (ViewGroup) this, true);
    }

    @Override // defpackage.ddbi
    protected final View a() {
        return findViewById(R.id.rcs_success_msim_dismiss_button);
    }

    @Override // defpackage.ddbi
    protected final void b() {
        TextView textView = (TextView) findViewById(R.id.rcs_success_msim_index);
        TextView textView2 = (TextView) findViewById(R.id.rcs_success_msim_display_name);
        TextView textView3 = (TextView) findViewById(R.id.rcs_success_msim_title);
        TextView textView4 = (TextView) findViewById(R.id.rcs_success_msim_body);
        textView.setText(((ddbs) this.a).k);
        ddbs ddbsVar = (ddbs) this.a;
        if (ddbsVar.l == null) {
            ddbsVar.l = ((ctwb) ddbsVar.d.b()).k().r();
        }
        textView2.setText(ddbsVar.l);
        textView3.setText(((ddbs) this.a).m);
        textView4.setText(((ddbs) this.a).n);
        this.a.h(textView4);
    }
}
