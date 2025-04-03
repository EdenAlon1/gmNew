package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;
import com.google.android.material.button.MaterialButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxct {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/appsettings/RcsSimStatusViewPeer");
    private boolean C;
    private String D;
    private final ffbr F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    private final ffbr J;
    public final Context b;
    public djrm c;
    public final RcsMultiSimStatusCheckboxView d;
    public final TextView e;
    public int f;
    public ddym h;
    public final ImageView i;
    public TextView j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    private final TextView w;
    private final TextView x;
    private djtc y;
    private final MaterialButton z;
    private int A = 8;
    private boolean B = true;
    private Optional E = Optional.empty();
    public int v = 1;
    public boolean g = false;

    public cxct(RcsSimStatusView rcsSimStatusView, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13) {
        this.b = rcsSimStatusView.getContext();
        this.p = ffbrVar;
        this.n = ffbrVar2;
        this.F = ffbrVar4;
        this.G = ffbrVar5;
        this.o = ffbrVar3;
        this.H = ffbrVar6;
        this.q = ffbrVar7;
        this.r = ffbrVar8;
        this.I = ffbrVar9;
        this.J = ffbrVar10;
        this.s = ffbrVar11;
        this.u = ffbrVar12;
        this.t = ffbrVar13;
        this.e = (TextView) rcsSimStatusView.findViewById(R.id.rcs_sim_status_title);
        this.w = (TextView) rcsSimStatusView.findViewById(R.id.rcs_sim_status_status_text);
        this.x = (TextView) rcsSimStatusView.findViewById(R.id.rcs_sim_status_summary);
        this.d = (RcsMultiSimStatusCheckboxView) rcsSimStatusView.findViewById(R.id.rcs_multi_sim_checkbox);
        this.i = (ImageView) rcsSimStatusView.findViewById(R.id.tos_tooltip_info_view);
        this.z = (MaterialButton) rcsSimStatusView.findViewById(R.id.verify_number_button);
        m(this.A);
        l(this.B);
    }

    private final SpannableStringBuilder k() {
        String string = this.b.getString(R.string.rcs_status_setting_up_desc_fi_multi_sync_link_text);
        return ddyi.e(this.b, this.b.getString(R.string.rcs_status_setting_up_desc_fi_multi_sync, string), string, new View.OnClickListener() { // from class: cxcn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxct cxctVar = cxct.this;
                ((akvg) cxctVar.o.b()).y(cxctVar.b, "https://support.google.com/messages?p=".concat(String.valueOf((String) djai.t().a.ax.a())));
                ((cmqb) cxctVar.s.b()).c(djrn.a(cxctVar.c).a, 3);
            }
        });
    }

    private final void l(boolean z) {
        boolean z2 = false;
        if (!dizg.G() && z) {
            z2 = true;
        }
        this.z.setEnabled(z2);
    }

    private final void m(int i) {
        if (true == dizg.G()) {
            i = 8;
        }
        this.z.setVisibility(i);
    }

    private final void n(int i, int i2) {
        Context context = this.b;
        String string = context.getString(i2);
        String string2 = context.getString(R.string.rcs_status_label);
        SpannableString spannableString = new SpannableString(String.valueOf(string2).concat(String.valueOf(string)));
        spannableString.setSpan(new ForegroundColorSpan(this.b.getColor(R.color.settings_rcs_status_label)), 0, string2.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(this.b.getColor(i)), string2.length(), string2.length() + string.length(), 33);
        this.w.setText(spannableString);
        if (((asqs) this.H.b()).a()) {
            this.w.setContentDescription(this.b.getString(R.string.rcs_status_multi_sim_text_context_description, Integer.valueOf(this.f), string));
        }
    }

    private final boolean o() {
        if (!this.E.isEmpty() && ((cmay) this.E.get()).d.size() != 0) {
            cmav cmavVar = ((cmax) enjk.j(((cmay) this.E.get()).d)).d;
            if (cmavVar == null) {
                cmavVar = cmav.a;
            }
            cmau b = cmau.b(cmavVar.e);
            if (b == null) {
                b = cmau.UNRECOGNIZED;
            }
            if (b == cmau.OTP_FORCE_VERIFICATION_THROTTLED && (cmavVar.b & 2) != 0) {
                eyja d = eykm.d(((cqoh) this.n.b()).f().toEpochMilli());
                eyja eyjaVar = cmavVar.d;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                if (eykl.a(d, eyjaVar) < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean p() {
        if (!((diwq) this.J.b()).a() || !this.m) {
            return false;
        }
        f(k());
        if (!djai.S()) {
            return true;
        }
        ((cmqb) this.s.b()).c(djrn.a(this.c).a, 2);
        return true;
    }

    public final SpannableStringBuilder a(int i, int i2) {
        Context context = this.b;
        String string = context.getString(i);
        String string2 = context.getString(R.string.carrier_tos_pref_link_text);
        final String string3 = context.getString(i2);
        return ddyi.e(this.b, this.b.getString(R.string.carrier_tos_pref_template_v2, string, string2), string2, new View.OnClickListener() { // from class: cxck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxct cxctVar = cxct.this;
                ((akvg) cxctVar.o.b()).y(cxctVar.b, string3);
            }
        });
    }

    final RcsMultiSimStatusCheckboxView b() {
        RcsMultiSimStatusCheckboxView rcsMultiSimStatusCheckboxView = this.d;
        if (rcsMultiSimStatusCheckboxView != null) {
            return rcsMultiSimStatusCheckboxView;
        }
        return null;
    }

    final void c(djrm djrmVar) {
        this.D = ((ctyx) this.F.b()).f("manual_msisdn_entered_phone_number_for_sim_".concat(djrn.a(djrmVar).a), "");
    }

    final void d(Optional optional) {
        this.E = optional;
        if (((aupl) this.t.b()).a()) {
            return;
        }
        j();
    }

    final void e(final djrm djrmVar) {
        this.z.setOnClickListener(new View.OnClickListener() { // from class: cxcm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cxct cxctVar = cxct.this;
                ((akvg) cxctVar.o.b()).Z((Activity) cxctVar.p.b(), djrn.a(djrmVar).a, 4);
            }
        });
    }

    final void f(SpannableStringBuilder spannableStringBuilder) {
        if (this.x != null) {
            h(0);
            this.x.setText(spannableStringBuilder);
            egyl.b(this.x);
        }
    }

    final void g(String str) {
        if (this.x != null) {
            h(0);
            this.x.setText(str);
        }
    }

    final void h(int i) {
        this.x.setVisibility(i);
    }

    final void i(int i, djtc djtcVar) {
        this.C = ((ckds) this.G.b()).J(i);
        this.y = djtcVar;
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r2 == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxct.j():void");
    }
}
