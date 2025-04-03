package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efqy extends efpe {
    public efnj ag;
    private TextView ah;
    public String d;
    public int e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.survey_question_rating_fragment, viewGroup, false);
        Bundle bundle2 = this.m;
        efoi.c((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), bundle2.containsKey("DisplayLogoResId") ? Integer.valueOf(bundle2.getInt("DisplayLogoResId", 0)) : null);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = Html.fromHtml(this.a.g.isEmpty() ? this.a.f : this.a.g, 0);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.survey_question_text);
        this.ah = textView;
        textView.setText(charSequence);
        this.ah.setContentDescription(charSequence.toString());
        efrn efrnVar = new efrn(z());
        fajr fajrVar = this.a;
        efrnVar.d(fajrVar.c == 6 ? (fajw) fajrVar.d : fajw.a);
        efrnVar.a = new efrm() { // from class: efqx
            @Override // defpackage.efrm
            public final void a(int i) {
                efqy efqyVar = efqy.this;
                efqyVar.d = Integer.toString(i);
                efqyVar.e = i;
                efqyVar.ag.a();
                int a = fajq.a(efqyVar.a.i);
                if (a == 0) {
                    a = 1;
                }
                efsj b = efqyVar.b();
                if (b == null) {
                    Log.w("SurveyRatingFragment", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                } else if (a == 5) {
                    b.p();
                } else {
                    b.q(efqyVar.r(), efqyVar);
                }
            }
        };
        ((ViewGroup) inflate.findViewById(R.id.survey_rating_container)).addView(efrnVar);
        return inflate;
    }

    @Override // defpackage.efpe
    public final fain e() {
        faib faibVar = (faib) fain.a.createBuilder();
        if (this.ag.c() && this.d != null) {
            faij faijVar = (faij) faik.a.createBuilder();
            int i = this.e;
            faijVar.copyOnWrite();
            ((faik) faijVar.instance).c = i;
            faijVar.copyOnWrite();
            ((faik) faijVar.instance).b = faii.a(3);
            String str = this.d;
            faijVar.copyOnWrite();
            faik faikVar = (faik) faijVar.instance;
            str.getClass();
            faikVar.d = str;
            faik faikVar2 = (faik) faijVar.build();
            faig faigVar = (faig) faih.a.createBuilder();
            faigVar.copyOnWrite();
            faih faihVar = (faih) faigVar.instance;
            faikVar2.getClass();
            faihVar.c = faikVar2;
            faihVar.b |= 1;
            faih faihVar2 = (faih) faigVar.build();
            int i2 = this.a.e;
            faibVar.copyOnWrite();
            ((fain) faibVar.instance).d = i2;
            faibVar.copyOnWrite();
            fain fainVar = (fain) faibVar.instance;
            faihVar2.getClass();
            fainVar.c = faihVar2;
            fainVar.b = 4;
            long j = efow.a;
        }
        return (fain) faibVar.build();
    }

    @Override // defpackage.efpe, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.d = bundle.getString("SelectedResponse", null);
            this.ag = (efnj) bundle.getParcelable("QuestionMetrics");
        }
        if (this.ag == null) {
            this.ag = new efnj();
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.ag);
        TextView textView = this.ah;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // defpackage.efpe
    public final void p() {
        TextView textView;
        this.ag.b();
        if (b() != null) {
            b().aX();
        }
        b().q(r(), this);
        if (!efow.j(z()) || (textView = this.ah) == null) {
            return;
        }
        textView.requestFocus();
        this.ah.sendAccessibilityEvent(8);
    }

    @Override // defpackage.efpe
    public final void q(String str) {
        Spanned fromHtml;
        efpb efpbVar = efor.c;
        if (efor.b(fdvs.c(efor.b)) && (z() == null || this.ah == null)) {
            return;
        }
        fromHtml = Html.fromHtml(str, 0);
        this.ah.setText(fromHtml);
        this.ah.setContentDescription(fromHtml.toString());
    }

    public final boolean r() {
        return this.d != null;
    }
}
