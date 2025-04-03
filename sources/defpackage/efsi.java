package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsi {
    public static enhk a;
    public faje b;
    public fakk c;
    public SurveyViewPager d;
    public efnh e;
    public efnn f;
    public ScrollView h;
    public MaterialCardView i;
    public LinearLayout j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Integer s;
    public boolean t;
    public efmg u;
    public final Activity v;
    public final efsj w;
    public final fr x;
    public Bundle g = new Bundle();
    public final Handler q = new Handler();
    public final Runnable r = new Runnable() { // from class: efse
        @Override // java.lang.Runnable
        public final void run() {
            efsi efsiVar = efsi.this;
            efsiVar.k = true;
            efsiVar.v.finish();
        }
    };

    public efsi(Activity activity, fr frVar, efsj efsjVar) {
        this.v = activity;
        this.x = frVar;
        this.w = efsjVar;
    }

    private final void q() {
        if (this.d.B() || !efro.a(a(), this.b, this.e)) {
            t();
        } else {
            s(this.d.c + 1);
        }
    }

    private final void r(ViewGroup viewGroup, boolean z) {
        viewGroup.setEnabled(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                r((ViewGroup) childAt, z);
            } else if (childAt.getId() == R.id.survey_next && z) {
                b(R.id.survey_next).setEnabled(this.l);
            } else {
                childAt.setEnabled(z);
            }
        }
    }

    private final void s(int i) {
        efpb efpbVar = efor.c;
        if (efor.b(fdvs.c(efor.b))) {
            j(m());
        }
        h();
        o(5);
        this.d.y(i);
        l();
        k();
        this.d.v().Q.sendAccessibilityEvent(32);
        long j = efow.a;
    }

    private final void t() {
        long j = efow.a;
        o(5);
        this.k = true;
        i(false);
        this.v.setResult(-1, new Intent());
        efpb efpbVar = efor.c;
        if (!efor.c(fdvv.b(efor.b))) {
            this.d.x();
            return;
        }
        if (this.u == efmg.CARD) {
            this.d.x();
            return;
        }
        this.i.setVisibility(8);
        efmg efmgVar = this.u;
        if (efmgVar != efmg.TOAST) {
            if (efmgVar == efmg.SILENT) {
                Log.v("SurveyActivityImpl", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
                this.v.finish();
                return;
            }
            return;
        }
        View findViewById = this.v.getWindow().findViewById(android.R.id.content);
        fahq fahqVar = this.b.d;
        if (fahqVar == null) {
            fahqVar = fahq.b;
        }
        Snackbar.r(findViewById, fahqVar.c, -1).i();
        e();
    }

    public final int a() {
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = surveyViewPager.c;
        return efor.a() ? i + this.m : this.t ? i + 1 : i;
    }

    public final View b(int i) {
        return this.v.findViewById(i);
    }

    public final efnc c() {
        String stringExtra = this.v.getIntent().getStringExtra("TriggerId");
        fakk fakkVar = this.c;
        if (fakkVar == null || stringExtra == null) {
            long j = efow.a;
            return null;
        }
        efmz efmzVar = new efmz();
        efmzVar.b(fakkVar.b);
        efmzVar.d(stringExtra);
        efmzVar.c(efnm.POPUP);
        return efmzVar.a();
    }

    public final fain d() {
        return this.e.a;
    }

    public final void e() {
        this.v.setResult(-1, new Intent());
        this.q.postDelayed(this.r, 2400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        int a2;
        int a3;
        int a4;
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager != null && surveyViewPager.A()) {
            faiw faiwVar = this.b.c;
            if (faiwVar == null) {
                faiwVar = faiw.a;
            }
            if (!faiwVar.b) {
                o(3);
            }
        }
        efow.h(this.j);
        p();
        efnc c = c();
        if (c != null) {
            int a5 = fajq.a(((fajr) this.b.g.get(a())).i);
            if (a5 == 0) {
                a5 = 1;
            }
            int i = a5 - 2;
            if (i == 1) {
                fain w = this.d.w();
                faik faikVar = (w.b == 2 ? (faim) w.c : faim.a).c;
                if (faikVar == null) {
                    faikVar = faik.a;
                }
                int i2 = faikVar.c;
                efnd.a.h(c);
            } else if (i == 2) {
                ArrayList arrayList = new ArrayList();
                fain w2 = this.d.w();
                Iterator<E> it = (w2.b == 3 ? (faid) w2.c : faid.a).b.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((faik) it.next()).c - 1));
                }
                efmv efmvVar = efnd.a;
                engw.n(arrayList);
                efmvVar.f(c);
            } else if (i == 3) {
                fain w3 = this.d.w();
                faik faikVar2 = (w3.b == 4 ? (faih) w3.c : faih.a).c;
                if (faikVar2 == null) {
                    faikVar2 = faik.a;
                }
                int i3 = faikVar2.c;
                efnd.a.g(c);
            } else if (i == 4) {
                efnd.a.a(c);
            }
        }
        efpb efpbVar = efor.c;
        if (!efor.b(fdvs.c(efor.b))) {
            fajr fajrVar = (fajr) this.b.g.get(a());
            if (m() && (a4 = fajq.a(fajrVar.i)) != 0 && a4 == 5) {
                j(true);
            }
        }
        fain w4 = this.d.w();
        if (w4 != null) {
            this.e.a = w4;
        }
        if (!efor.a()) {
            q();
            return;
        }
        SurveyViewPager surveyViewPager2 = this.d;
        if (surveyViewPager2 == null) {
            q();
            return;
        }
        fajr fajrVar2 = surveyViewPager2.v().a;
        fajp fajpVar = fajrVar2.k;
        if (fajpVar == null) {
            fajpVar = fajp.a;
        }
        if ((fajpVar.b & 1) != 0) {
            fajp fajpVar2 = fajrVar2.k;
            if (fajpVar2 == null) {
                fajpVar2 = fajp.a;
            }
            fahc fahcVar = fajpVar2.d;
            if (fahcVar == null) {
                fahcVar = fahc.a;
            }
            int a6 = fahb.a(fahcVar.b);
            if (a6 != 0 && a6 == 5) {
                t();
                return;
            }
        }
        efpb efpbVar2 = efor.c;
        if (efor.c(fduu.c(efor.b)) && (a3 = fajq.a(fajrVar2.i)) != 0 && a3 == 5) {
            fain w5 = this.d.w();
            faik faikVar3 = (w5.b == 4 ? (faih) w5.c : faih.a).c;
            if (faikVar3 == null) {
                faikVar3 = faik.a;
            }
            int a7 = new efms().a(a, this.b.g.size(), faikVar3.c, fajrVar2);
            if (a7 == -1) {
                q();
                return;
            } else if (a7 - 1 == this.b.g.size()) {
                t();
                return;
            } else {
                efsw efswVar = (efsw) this.d.b;
                s(efswVar != null ? efswVar.n(a7) : 0);
                return;
            }
        }
        efpb efpbVar3 = efor.c;
        if (!efor.c(fduu.b(efor.b)) || (a2 = fajq.a(fajrVar2.i)) == 0 || a2 != 3) {
            q();
            return;
        }
        fagx fagxVar = fagx.a;
        fagz fagzVar = (fajrVar2.c == 4 ? (fakn) fajrVar2.d : fakn.a).c;
        if (fagzVar == null) {
            fagzVar = fagz.a;
        }
        Iterator<E> it2 = fagzVar.b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            fagx fagxVar2 = (fagx) it2.next();
            int i4 = fagxVar2.d;
            fain w6 = this.d.w();
            faik faikVar4 = (w6.b == 2 ? (faim) w6.c : faim.a).c;
            if (faikVar4 == null) {
                faikVar4 = faik.a;
            }
            if (i4 == faikVar4.c) {
                fagxVar = fagxVar2;
                break;
            }
        }
        if (((fajrVar2.c == 4 ? (fakn) fajrVar2.d : fakn.a).b & 1) == 0 || (fagxVar.b & 1) == 0) {
            q();
            return;
        }
        fahc fahcVar2 = fagxVar.g;
        if (fahcVar2 == null) {
            fahcVar2 = fahc.a;
        }
        int a8 = fahb.a(fahcVar2.b);
        int i5 = (a8 != 0 ? a8 : 1) - 2;
        if (i5 != 2) {
            if (i5 != 3) {
                q();
                return;
            } else {
                t();
                return;
            }
        }
        fahc fahcVar3 = fagxVar.g;
        if (fahcVar3 == null) {
            fahcVar3 = fahc.a;
        }
        String str = fahcVar3.c;
        efsw efswVar2 = (efsw) this.d.b;
        if (efswVar2 != null && a.containsKey(str)) {
            r8 = efswVar2.n(((Integer) a.get(str)).intValue());
        }
        s(r8);
    }

    public final void g(boolean z) {
        this.j.setDescendantFocusability(true != z ? 262144 : 393216);
        this.j.setAlpha(true != z ? 1.0f : 0.4f);
        if (z) {
            this.l = b(R.id.survey_next).isEnabled();
        }
        r(this.j, !z);
    }

    public final void h() {
        int a2 = faia.a(d().b);
        if (a2 == 0) {
            throw null;
        }
        if (a2 == 1) {
            Bundle bundle = this.g;
            String valueOf = String.valueOf(d().d);
            fain d = d();
            faik faikVar = (d.b == 2 ? (faim) d.c : faim.a).c;
            if (faikVar == null) {
                faikVar = faik.a;
            }
            bundle.putString(valueOf, faikVar.d);
        }
    }

    public final void i(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null && materialButton.isEnabled() != z) {
            materialButton.setEnabled(z);
        }
        this.l = z;
    }

    public final void j(boolean z) {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton != null) {
            materialButton.setVisibility(true != z ? 8 : 0);
        }
    }

    public final void k() {
        MaterialButton materialButton = (MaterialButton) b(R.id.survey_next);
        if (materialButton == null || !this.d.B() || this.n) {
            return;
        }
        materialButton.setText(R.string.survey_submit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        SurveyViewPager surveyViewPager = this.d;
        if (surveyViewPager == null || !surveyViewPager.C()) {
            fajr fajrVar = (fajr) this.b.g.get(a());
            String str = fajrVar.g.isEmpty() ? fajrVar.f : fajrVar.g;
            int size = fajrVar.h.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                faks faksVar = (faks) fajrVar.h.get(i);
                int i2 = faksVar.b;
                if (fakr.a(i2) == 3) {
                    int i3 = (i2 == 2 ? (fakp) faksVar.c : fakp.a).b;
                    String string = this.g.getString(String.valueOf(i3));
                    if (string != null) {
                        strArr[i] = faksVar.d;
                        strArr2[i] = string;
                    } else {
                        Log.e("SurveyActivityImpl", a.f(i3, "No single-select question with ordinal ", " was found."));
                    }
                }
            }
            this.d.z(TextUtils.replace(str, strArr, strArr2).toString());
        }
    }

    public final boolean m() {
        return efow.m(this.b);
    }

    public final boolean n(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            this.i.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && this.k) {
                long j = efow.a;
                this.v.finish();
                return true;
            }
        }
        efpb efpbVar = efor.c;
        if (fdvg.b(this.v)) {
            return false;
        }
        return this.v.onTouchEvent(motionEvent);
    }

    public final void o(int i) {
        efnh efnhVar = this.e;
        efnhVar.g = i;
        this.f.a(efnhVar, efow.k(this.b));
    }

    public final void p() {
        b(R.id.survey_controls_divider).setVisibility(8);
        b(R.id.survey_controls_legal_text).setVisibility(8);
    }
}
