package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;
import defpackage.aupl;
import defpackage.cxct;
import defpackage.djrm;
import defpackage.egyl;
import defpackage.ooi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsSimStatusPreference extends Preference {
    public LinearLayout a;
    public final List b;
    private MaterialCardView c;
    private TextView d;
    private int e;
    private SpannableStringBuilder f;
    private LinearLayout g;

    public RcsSimStatusPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 8;
        this.b = new ArrayList();
    }

    @Override // androidx.preference.Preference
    public final void a(ooi ooiVar) {
        super.a(ooiVar);
        LinearLayout linearLayout = (LinearLayout) ooiVar.C(R.id.rcs_sim_status_list);
        if (linearLayout != null) {
            this.a = linearLayout;
            if (!this.b.isEmpty() && this.a.getChildCount() == 0) {
                for (RcsSimStatusView rcsSimStatusView : this.b) {
                    o(rcsSimStatusView, rcsSimStatusView.H().c);
                }
                this.b.clear();
            }
        }
        TextView textView = (TextView) ooiVar.C(R.id.legal_banner_text);
        if (textView != null) {
            this.d = textView;
            ac(this.f);
        }
        MaterialCardView materialCardView = (MaterialCardView) ooiVar.C(R.id.legal_banner);
        if (materialCardView != null) {
            this.c = materialCardView;
            ad(this.e);
        }
    }

    public final void ab() {
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public final void ac(SpannableStringBuilder spannableStringBuilder) {
        this.f = spannableStringBuilder;
        TextView textView = this.d;
        if (textView == null || spannableStringBuilder == null) {
            return;
        }
        textView.setText(spannableStringBuilder);
        egyl.b(this.d);
    }

    public final void ad(int i) {
        this.e = i;
        MaterialCardView materialCardView = this.c;
        if (materialCardView != null) {
            materialCardView.setVisibility(i);
        }
    }

    public final void ae(djrm djrmVar, int i) {
        RcsSimStatusView l = l(djrmVar);
        if (l != null) {
            cxct H = l.H();
            H.v = i;
            if (((aupl) H.t.b()).a()) {
                return;
            }
            H.j();
        }
    }

    public final LinearLayout k() {
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            return linearLayout;
        }
        LinearLayout linearLayout2 = this.a;
        if (linearLayout2 != null && linearLayout2.getParent() != null && (this.a.getParent() instanceof LinearLayout)) {
            this.g = (LinearLayout) this.a.getParent();
        }
        return this.g;
    }

    public final RcsSimStatusView l(djrm djrmVar) {
        LinearLayout linearLayout = this.a;
        if (linearLayout == null) {
            return null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((RcsSimStatusView) this.a.getChildAt(i)).H().c.equals(djrmVar)) {
                return (RcsSimStatusView) this.a.getChildAt(i);
            }
        }
        return null;
    }

    public final void o(RcsSimStatusView rcsSimStatusView, djrm djrmVar) {
        rcsSimStatusView.H().c = djrmVar;
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            linearLayout.addView(rcsSimStatusView);
        } else {
            this.b.add(rcsSimStatusView);
        }
    }
}
