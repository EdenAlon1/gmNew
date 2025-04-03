package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efrt extends efrq {
    public int ak;
    private LinearLayout al;
    private efnj am;
    public String d;
    public int e = -1;

    @Override // defpackage.efpe
    public final fain e() {
        faib faibVar = (faib) fain.a.createBuilder();
        if (this.am.c() && this.d != null) {
            this.am.a();
            faij faijVar = (faij) faik.a.createBuilder();
            int i = this.e;
            faijVar.copyOnWrite();
            ((faik) faijVar.instance).c = i;
            int i2 = this.ak;
            faijVar.copyOnWrite();
            ((faik) faijVar.instance).b = faii.a(i2);
            String str = this.d;
            faijVar.copyOnWrite();
            faik faikVar = (faik) faijVar.instance;
            str.getClass();
            faikVar.d = str;
            faik faikVar2 = (faik) faijVar.build();
            fail failVar = (fail) faim.a.createBuilder();
            failVar.copyOnWrite();
            faim faimVar = (faim) failVar.instance;
            faikVar2.getClass();
            faimVar.c = faikVar2;
            faimVar.b |= 1;
            faim faimVar2 = (faim) failVar.build();
            faibVar.copyOnWrite();
            fain fainVar = (fain) faibVar.instance;
            faimVar2.getClass();
            fainVar.c = faimVar2;
            fainVar.b = 2;
            int i3 = this.a.e;
            faibVar.copyOnWrite();
            ((fain) faibVar.instance).d = i3;
        }
        return (fain) faibVar.build();
    }

    @Override // defpackage.efpe
    public final void f() {
        if (this.al != null) {
            int i = 0;
            while (i < this.al.getChildCount()) {
                View childAt = this.al.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.efpe, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.am = (efnj) bundle.getParcelable("QuestionMetrics");
        }
        if (this.am == null) {
            this.am = new efnj();
        }
    }

    @Override // defpackage.efrq, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.am);
    }

    @Override // defpackage.efrq, defpackage.efpe
    public final void p() {
        EditText editText;
        super.p();
        this.am.b();
        efsj b = b();
        if (b != null) {
            LinearLayout linearLayout = this.al;
            boolean z = false;
            if (linearLayout != null && (editText = (EditText) linearLayout.findViewById(R.id.survey_other_option)) != null && editText.hasFocus()) {
                z = true;
            }
            b.q(z, this);
        }
    }

    @Override // defpackage.efrq
    public final View r() {
        View inflate = LayoutInflater.from(z()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null);
        this.al = (LinearLayout) inflate.findViewById(R.id.survey_answers_container);
        efsb efsbVar = new efsb(z());
        efsbVar.a = new efrz() { // from class: efrs
            @Override // defpackage.efrz
            public final void a(efsa efsaVar) {
                efrt efrtVar = efrt.this;
                efsj b = efrtVar.b();
                if (b == null) {
                    Log.w("SurveyMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                    return;
                }
                efrtVar.ak = efsaVar.c;
                efrtVar.d = efsaVar.a;
                efrtVar.e = efsaVar.b;
                if (efsaVar.c == 4) {
                    b.t(true);
                } else {
                    b.p();
                }
            }
        };
        fajr fajrVar = this.a;
        efsbVar.a(fajrVar.c == 4 ? (fakn) fajrVar.d : fakn.a);
        this.al.addView(efsbVar);
        if (!b().aW()) {
            inflate.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), B().getDimensionPixelSize(R.dimen.survey_bottom_padding));
        }
        return inflate;
    }

    @Override // defpackage.efrq
    public final String s() {
        return this.a.g.isEmpty() ? this.a.f : this.a.g;
    }
}
