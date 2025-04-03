package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.SurveyViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efss extends efmt implements efsm {
    public final faje c;
    public final LayoutInflater d;
    public SurveyViewPager e;
    public final efnh f;
    public final Bundle g;
    public final MaterialCardView h;
    public final LinearLayout i;
    public boolean j;
    public final efso k;
    public final efsj l;
    public final fr m;
    private final efnn n;
    private enhk o;

    public efss(LayoutInflater layoutInflater, fr frVar, efsj efsjVar, efso efsoVar) {
        this.a = layoutInflater.inflate(R.layout.survey_container, (ViewGroup) null, false);
        this.d = layoutInflater;
        this.m = frVar;
        efpd efpdVar = (efpd) efsoVar;
        faje fajeVar = efpdVar.a;
        this.c = fajeVar;
        this.f = efpdVar.b;
        this.j = efpdVar.c;
        this.k = efsoVar;
        this.l = efsjVar;
        this.g = efpdVar.m;
        HashMap hashMap = new HashMap();
        for (fajr fajrVar : fajeVar.g) {
            if ((fajrVar.b & 1) != 0) {
                fajp fajpVar = fajrVar.k;
                if (!hashMap.containsKey((fajpVar == null ? fajp.a : fajpVar).c)) {
                    fajp fajpVar2 = fajrVar.k;
                    hashMap.put((fajpVar2 == null ? fajp.a : fajpVar2).c, Integer.valueOf(fajrVar.e - 1));
                }
            }
        }
        this.o = enhk.j(hashMap);
        this.n = new efnn(o(), efpdVar.e, efpdVar.f);
        this.i = (LinearLayout) p(R.id.survey_container);
        this.h = (MaterialCardView) p(R.id.survey_overall_container);
    }

    private final void l() {
        if (this.e.B() || !efro.a(e(), this.c, this.f)) {
            n();
        } else {
            m(this.e.c + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(int i) {
        efpb efpbVar = efor.c;
        if (efor.b(fdvs.c(efor.b))) {
            c(d());
        }
        int a = faia.a(g().b);
        if (a == 0) {
            throw null;
        }
        if (a == 1) {
            Bundle bundle = this.g;
            String valueOf = String.valueOf(g().d);
            fain g = g();
            faik faikVar = (g.b == 2 ? (faim) g.c : faim.a).c;
            if (faikVar == null) {
                faikVar = faik.a;
            }
            bundle.putString(valueOf, faikVar.d);
        }
        j(5);
        this.e.y(i);
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager == null || !surveyViewPager.C()) {
            fajr fajrVar = (fajr) this.c.g.get(e());
            String str = fajrVar.g.isEmpty() ? fajrVar.f : fajrVar.g;
            int size = fajrVar.h.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                faks faksVar = (faks) fajrVar.h.get(i2);
                int i3 = faksVar.b;
                if (fakr.a(i3) == 3) {
                    fakp fakpVar = i3 == 2 ? (fakp) faksVar.c : fakp.a;
                    Bundle bundle2 = this.g;
                    int i4 = fakpVar.b;
                    String string = bundle2.getString(String.valueOf(i4));
                    if (string != null) {
                        strArr[i2] = faksVar.d;
                        strArr2[i2] = string;
                    } else {
                        Log.e("SurveyContainer", a.f(i4, "No single-select question with ordinal ", " was found."));
                    }
                }
            }
            this.e.z(TextUtils.replace(str, strArr, strArr2).toString());
        }
        i();
        this.e.v().Q.sendAccessibilityEvent(32);
        long j = efow.a;
    }

    private final void n() {
        long j = efow.a;
        j(5);
        this.j = true;
        b(false);
        Iterator it = q().iterator();
        while (it.hasNext()) {
            ((efsl) it.next()).s();
        }
        efpb efpbVar = efor.c;
        if (!efor.c(fdvv.b(efor.b))) {
            this.e.x();
            return;
        }
        efso efsoVar = this.k;
        if (((efpd) efsoVar).i == efmg.CARD) {
            this.e.x();
            return;
        }
        p(R.id.survey_main_scroll_view).setVisibility(8);
        for (efsl efslVar : q()) {
            fahq fahqVar = this.c.d;
            if (fahqVar == null) {
                fahqVar = fahq.b;
            }
            efslVar.aT(fahqVar.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.efsm
    public final void a() {
        int a;
        int a2;
        int a3;
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager != null && surveyViewPager.A()) {
            faiw faiwVar = this.c.c;
            if (faiwVar == null) {
                faiwVar = faiw.a;
            }
            if (!faiwVar.b) {
                j(3);
            }
        }
        efow.h(this.i);
        k();
        efnc f = f();
        int a4 = fajq.a(((fajr) this.c.g.get(e())).i);
        if (a4 == 0) {
            a4 = 1;
        }
        int i = a4 - 2;
        if (i == 1) {
            fain w = this.e.w();
            faik faikVar = (w.b == 2 ? (faim) w.c : faim.a).c;
            if (faikVar == null) {
                faikVar = faik.a;
            }
            int i2 = faikVar.c;
            efnd.a.h(f);
        } else if (i == 2) {
            ArrayList arrayList = new ArrayList();
            fain w2 = this.e.w();
            Iterator<E> it = (w2.b == 3 ? (faid) w2.c : faid.a).b.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((faik) it.next()).c - 1));
            }
            efmv efmvVar = efnd.a;
            engw.n(arrayList);
            efmvVar.f(f);
        } else if (i == 3) {
            fain w3 = this.e.w();
            faik faikVar2 = (w3.b == 4 ? (faih) w3.c : faih.a).c;
            if (faikVar2 == null) {
                faikVar2 = faik.a;
            }
            int i3 = faikVar2.c;
            efnd.a.g(f);
        } else if (i == 4) {
            efnd.a.a(f);
        }
        efpb efpbVar = efor.c;
        if (!efor.b(fdvs.c(efor.b))) {
            fajr fajrVar = (fajr) this.c.g.get(e());
            if (d() && (a3 = fajq.a(fajrVar.i)) != 0 && a3 == 5) {
                c(true);
            }
        }
        fain w4 = this.e.w();
        if (w4 != null) {
            this.f.a = w4;
        }
        if (!efor.a()) {
            l();
            return;
        }
        SurveyViewPager surveyViewPager2 = this.e;
        if (surveyViewPager2 == null) {
            l();
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
            int a5 = fahb.a(fahcVar.b);
            if (a5 != 0 && a5 == 5) {
                n();
                return;
            }
        }
        efpb efpbVar2 = efor.c;
        if (efor.c(fduu.c(efor.b)) && (a2 = fajq.a(fajrVar2.i)) != 0 && a2 == 5) {
            fain w5 = this.e.w();
            faik faikVar3 = (w5.b == 4 ? (faih) w5.c : faih.a).c;
            if (faikVar3 == null) {
                faikVar3 = faik.a;
            }
            int a6 = new efms().a(this.o, this.c.g.size(), faikVar3.c, fajrVar2);
            if (a6 == -1) {
                l();
                return;
            } else if (a6 - 1 == this.c.g.size()) {
                n();
                return;
            } else {
                efsw efswVar = (efsw) this.e.b;
                m(efswVar != null ? efswVar.n(a6) : 0);
                return;
            }
        }
        efpb efpbVar3 = efor.c;
        if (!efor.c(fduu.b(efor.b)) || (a = fajq.a(fajrVar2.i)) == 0 || a != 3) {
            l();
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
            fain w6 = this.e.w();
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
            l();
            return;
        }
        fahc fahcVar2 = fagxVar.g;
        if (fahcVar2 == null) {
            fahcVar2 = fahc.a;
        }
        int a7 = fahb.a(fahcVar2.b);
        int i5 = (a7 != 0 ? a7 : 1) - 2;
        if (i5 != 2) {
            if (i5 != 3) {
                l();
                return;
            } else {
                n();
                return;
            }
        }
        fahc fahcVar3 = fagxVar.g;
        if (fahcVar3 == null) {
            fahcVar3 = fahc.a;
        }
        String str = fahcVar3.c;
        efsw efswVar2 = (efsw) this.e.b;
        if (efswVar2 != null && this.o.containsKey(str)) {
            r8 = efswVar2.n(((Integer) this.o.get(str)).intValue());
        }
        m(r8);
    }

    @Override // defpackage.efsm
    public final void b(boolean z) {
        MaterialButton materialButton = (MaterialButton) p(R.id.survey_next);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    @Override // defpackage.efsm
    public final void c(boolean z) {
        MaterialButton materialButton = (MaterialButton) p(R.id.survey_next);
        if (materialButton != null) {
            materialButton.setVisibility(true != z ? 8 : 0);
        }
    }

    @Override // defpackage.efsm
    public final boolean d() {
        return efow.m(this.c);
    }

    public final int e() {
        SurveyViewPager surveyViewPager = this.e;
        if (surveyViewPager == null) {
            return 0;
        }
        int i = surveyViewPager.c;
        return efor.a() ? i + ((efpd) this.k).g : i;
    }

    public final efnc f() {
        efmz efmzVar = new efmz();
        efmzVar.b(((efpd) this.k).f.b);
        efmzVar.d(((efpd) this.k).e);
        efmzVar.c(((efpd) this.k).l);
        return efmzVar.a();
    }

    public final fain g() {
        return this.f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(final java.lang.String r8) {
        /*
            r7 = this;
            efsr r6 = new efsr
            r6.<init>()
            faje r0 = r7.c
            faiy r0 = r0.i
            if (r0 != 0) goto Ld
            faiy r0 = defpackage.faiy.a
        Ld:
            int r0 = r0.b
            r0 = r0 & 1
            r1 = 0
            if (r0 == 0) goto L30
            faje r0 = r7.c
            faiy r0 = r0.i
            if (r0 != 0) goto L1c
            faiy r0 = defpackage.faiy.a
        L1c:
            java.lang.String r0 = r0.c
            int r0 = r0.length()
            if (r0 <= 0) goto L30
            faje r0 = r7.c
            faiy r0 = r0.i
            if (r0 != 0) goto L2c
            faiy r0 = defpackage.faiy.a
        L2c:
            java.lang.String r0 = r0.c
            r3 = r0
            goto L31
        L30:
            r3 = r1
        L31:
            faje r0 = r7.c
            faiy r0 = r0.i
            if (r0 != 0) goto L3a
            faiy r2 = defpackage.faiy.a
            goto L3b
        L3a:
            r2 = r0
        L3b:
            int r2 = r2.b
            r2 = r2 & 2
            if (r2 == 0) goto L59
            if (r0 != 0) goto L45
            faiy r0 = defpackage.faiy.a
        L45:
            java.lang.String r0 = r0.d
            int r0 = r0.length()
            if (r0 <= 0) goto L59
            faje r0 = r7.c
            faiy r0 = r0.i
            if (r0 != 0) goto L55
            faiy r0 = defpackage.faiy.a
        L55:
            java.lang.String r0 = r0.d
            r4 = r0
            goto L5a
        L59:
            r4 = r1
        L5a:
            faje r0 = r7.c
            faiy r0 = r0.i
            if (r0 != 0) goto L63
            faiy r2 = defpackage.faiy.a
            goto L64
        L63:
            r2 = r0
        L64:
            int r2 = r2.b
            r2 = r2 & 4
            if (r2 == 0) goto L80
            if (r0 != 0) goto L6e
            faiy r0 = defpackage.faiy.a
        L6e:
            java.lang.String r0 = r0.e
            int r0 = r0.length()
            if (r0 <= 0) goto L80
            faje r0 = r7.c
            faiy r0 = r0.i
            if (r0 != 0) goto L7e
            faiy r0 = defpackage.faiy.a
        L7e:
            java.lang.String r1 = r0.e
        L80:
            r5 = r1
            android.content.Context r0 = r7.o()
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 2131430661(0x7f0b0d05, float:1.848303E38)
            android.view.View r1 = r7.p(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r8
            defpackage.efoo.c(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efss.h(java.lang.String):void");
    }

    public final void i() {
        MaterialButton materialButton = (MaterialButton) p(R.id.survey_next);
        if (materialButton == null || !this.e.B()) {
            return;
        }
        materialButton.setText(R.string.survey_submit);
    }

    public final void j(int i) {
        efnh efnhVar = this.f;
        efnhVar.g = i;
        this.n.a(efnhVar, efow.k(this.c));
    }

    public final void k() {
        p(R.id.survey_controls_divider).setVisibility(8);
        p(R.id.survey_controls_legal_text).setVisibility(8);
    }
}
