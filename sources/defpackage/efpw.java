package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpw extends efrq {
    public String d;
    private efnj e;

    private final efpz t(String str) {
        efpz efpzVar = new efpz(z());
        ((EditText) efpzVar.findViewById(R.id.survey_open_text)).setText(str);
        fajr fajrVar = this.a;
        efpzVar.a(fajrVar.c == 7 ? (fajc) fajrVar.d : fajc.a);
        efpzVar.a = new efpy() { // from class: efpv
            @Override // defpackage.efpy
            public final void a(String str2) {
                efpw.this.d = str2;
            }
        };
        return efpzVar;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        efsj b = b();
        if (b != null) {
            b.q(true, this);
        }
    }

    @Override // defpackage.efpe
    public final fain e() {
        faib faibVar = (faib) fain.a.createBuilder();
        if (this.e.c()) {
            this.e.a();
            String b = emxe.b(this.d);
            faie faieVar = (faie) faif.a.createBuilder();
            faieVar.copyOnWrite();
            ((faif) faieVar.instance).b = b;
            faif faifVar = (faif) faieVar.build();
            int i = this.a.e;
            faibVar.copyOnWrite();
            ((fain) faibVar.instance).d = i;
            faibVar.copyOnWrite();
            fain fainVar = (fain) faibVar.instance;
            faifVar.getClass();
            fainVar.c = faifVar;
            fainVar.b = 5;
        }
        return (fain) faibVar.build();
    }

    @Override // defpackage.efpe, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            this.e = new efnj();
        } else {
            this.e = (efnj) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.efrq, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putParcelable("QuestionMetrics", this.e);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        View view;
        super.onConfigurationChanged(configuration);
        efpb efpbVar = efor.c;
        if (fdvm.a.get().a(z()) && configuration.orientation == 2 && (view = this.Q) != null) {
            EditText editText = (EditText) view.findViewById(R.id.survey_open_text);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.survey_answers_container);
            if (linearLayout == null || editText == null) {
                return;
            }
            linearLayout.removeAllViews();
            linearLayout.addView(t(editText.getText().toString()));
        }
    }

    @Override // defpackage.efrq, defpackage.efpe
    public final void p() {
        super.p();
        this.e.b();
        efsj b = b();
        if (b != null) {
            b.q(true, this);
        }
    }

    @Override // defpackage.efrq
    public final View r() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(z()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        linearLayout.addView(t(""));
        return linearLayout;
    }

    @Override // defpackage.efrq
    public final String s() {
        return this.a.g.isEmpty() ? this.a.f : this.a.g;
    }
}
