package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpi extends efrq {
    private boolean[] ak;
    private ViewGroup al;
    public efnj d;
    public efpp e;

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        b().q(t(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.efpe
    public final fain e() {
        faib faibVar = (faib) fain.a.createBuilder();
        if (this.d.c()) {
            faic faicVar = (faic) faid.a.createBuilder();
            fajr fajrVar = this.a;
            fagz fagzVar = (fajrVar.c == 5 ? (faja) fajrVar.d : faja.a).c;
            if (fagzVar == null) {
                fagzVar = fagz.a;
            }
            eygr eygrVar = fagzVar.b;
            int i = 0;
            while (true) {
                boolean[] zArr = this.e.b;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    String str = ((fagx) eygrVar.get(i)).e;
                    int a = fagv.a(((fagx) eygrVar.get(i)).c);
                    int i2 = 4;
                    if (a != 0 && a == 4 && !TextUtils.isEmpty(this.e.a)) {
                        str = this.e.a;
                    }
                    faij faijVar = (faij) faik.a.createBuilder();
                    int i3 = ((fagx) eygrVar.get(i)).d;
                    faijVar.copyOnWrite();
                    ((faik) faijVar.instance).c = i3;
                    faijVar.copyOnWrite();
                    faik faikVar = (faik) faijVar.instance;
                    str.getClass();
                    faikVar.d = str;
                    int a2 = fagv.a(((fagx) eygrVar.get(i)).c);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i4 = a2 - 2;
                    if (i4 == 1) {
                        i2 = 3;
                    } else if (i4 != 2) {
                        i2 = i4 != 3 ? 2 : 5;
                    }
                    faijVar.copyOnWrite();
                    ((faik) faijVar.instance).b = faii.a(i2);
                    faicVar.a((faik) faijVar.build());
                    this.d.a();
                }
                int i5 = this.a.e;
                faibVar.copyOnWrite();
                ((fain) faibVar.instance).d = i5;
                faid faidVar = (faid) faicVar.build();
                faibVar.copyOnWrite();
                fain fainVar = (fain) faibVar.instance;
                faidVar.getClass();
                fainVar.c = faidVar;
                fainVar.b = 3;
                i++;
            }
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
            this.d = (efnj) bundle.getParcelable("QuestionMetrics");
            this.ak = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.d == null) {
            this.d = new efnj();
        }
        boolean[] zArr = this.ak;
        if (zArr == null) {
            fajr fajrVar = this.a;
            fagz fagzVar = (fajrVar.c == 5 ? (faja) fajrVar.d : faja.a).c;
            if (fagzVar == null) {
                fagzVar = fagz.a;
            }
            this.ak = new boolean[fagzVar.b.size()];
            return;
        }
        fajr fajrVar2 = this.a;
        fagz fagzVar2 = (fajrVar2.c == 5 ? (faja) fajrVar2.d : faja.a).c;
        if (fagzVar2 == null) {
            fagzVar2 = fagz.a;
        }
        if (zArr.length != fagzVar2.b.size()) {
            Log.e("SurveyMultiSelectFrag", "Saved instance state responses had incorrect length: " + this.ak.length);
            fajr fajrVar3 = this.a;
            fagz fagzVar3 = (fajrVar3.c == 5 ? (faja) fajrVar3.d : faja.a).c;
            if (fagzVar3 == null) {
                fagzVar3 = fagz.a;
            }
            this.ak = new boolean[fagzVar3.b.size()];
        }
    }

    @Override // defpackage.efrq, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putParcelable("QuestionMetrics", this.d);
        bundle.putBooleanArray("ResponsesAsArray", this.ak);
    }

    @Override // defpackage.efrq, defpackage.efpe
    public final void p() {
        super.p();
        this.d.b();
        efsj b = b();
        if (b != null) {
            b.q(t(), this);
        }
    }

    @Override // defpackage.efrq
    public final View r() {
        this.al = (LinearLayout) LayoutInflater.from(z()).inflate(R.layout.survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.survey_answers_container);
        efpr efprVar = new efpr(z());
        efprVar.c = new efpq() { // from class: efph
            @Override // defpackage.efpq
            public final void a(efpp efppVar) {
                efpi efpiVar = efpi.this;
                efsj b = efpiVar.b();
                if (b == null) {
                    Log.w("SurveyMultiSelectFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next page. Likely the user rotated the device before the Runnable executed.");
                } else {
                    if (!efppVar.a()) {
                        b.t(false);
                        return;
                    }
                    efpiVar.e = efppVar;
                    efpiVar.d.a();
                    b.q(efpiVar.t(), efpiVar);
                }
            }
        };
        fajr fajrVar = this.a;
        efprVar.a(fajrVar.c == 5 ? (faja) fajrVar.d : faja.a, this.ak);
        this.al.addView(efprVar);
        return this.al;
    }

    @Override // defpackage.efrq
    public final String s() {
        return this.a.g.isEmpty() ? this.a.f : this.a.g;
    }

    public final boolean t() {
        efpp efppVar = this.e;
        if (efppVar == null) {
            return false;
        }
        return efppVar.a();
    }
}
