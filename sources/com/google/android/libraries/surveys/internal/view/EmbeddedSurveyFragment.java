package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import defpackage.ea;
import defpackage.efmg;
import defpackage.efmt;
import defpackage.efnc;
import defpackage.efnd;
import defpackage.efnh;
import defpackage.efnm;
import defpackage.efoi;
import defpackage.efoo;
import defpackage.efor;
import defpackage.efow;
import defpackage.efpb;
import defpackage.efpc;
import defpackage.efpd;
import defpackage.efro;
import defpackage.efsj;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.efss;
import defpackage.efsw;
import defpackage.faiw;
import defpackage.faje;
import defpackage.fakk;
import defpackage.fdvs;
import defpackage.fr;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class EmbeddedSurveyFragment extends ea implements efsj, efsl {
    private efsm a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        View view;
        efpd efpdVar;
        efmg efmgVar;
        faje fajeVar;
        efnh efnhVar;
        String str;
        fakk fakkVar;
        efmg efmgVar2;
        efnm efnmVar;
        Bundle bundle2;
        Bundle bundle3 = this.m;
        efnh efnhVar2 = bundle != null ? (efnh) bundle.getParcelable("Answer") : (efnh) bundle3.getParcelable("Answer");
        String string = bundle3.getString("TriggerId");
        byte[] byteArray = bundle3.getByteArray("SurveyPayload");
        faje fajeVar2 = byteArray != null ? (faje) efow.c(faje.a, byteArray) : null;
        byte[] byteArray2 = bundle3.getByteArray("SurveySession");
        fakk fakkVar2 = byteArray2 != null ? (fakk) efow.c(fakk.a, byteArray2) : null;
        if (string == null || fajeVar2 == null || fajeVar2.g.size() == 0 || efnhVar2 == null) {
            z = true;
            i = 2;
            view = null;
            efpdVar = null;
        } else if (fakkVar2 == null) {
            z = true;
            i = 2;
            view = null;
            efpdVar = null;
        } else {
            efpc efpcVar = new efpc();
            efpcVar.n = (byte) (efpcVar.n | 2);
            efpcVar.a(false);
            efpcVar.b(false);
            efpcVar.d(0);
            efpcVar.c(false);
            efpcVar.m = new Bundle();
            efpcVar.a = fajeVar2;
            efpcVar.b = efnhVar2;
            efpcVar.f = fakkVar2;
            efpcVar.e = string;
            efpcVar.b(bundle != null ? bundle.getBoolean("IsSubmitting") : bundle3.getBoolean("IsSubmitting", false));
            if (bundle3.containsKey("LogoResId")) {
                efpcVar.d = Integer.valueOf(bundle3.getInt("LogoResId", 0));
            }
            if (bundle3.containsKey("keepNextButtonForLastQuestion")) {
                efpcVar.c(bundle3.getBoolean("keepNextButtonForLastQuestion", false));
            }
            efpcVar.h = bundle != null ? Integer.valueOf(bundle.getInt("CurrentQuestionIndexForViewPager")) : null;
            if (bundle != null) {
                Bundle bundle4 = bundle.getBundle("SingleSelectOrdinalAnswerMappings");
                if (bundle4 == null) {
                    bundle4 = new Bundle();
                }
                efpcVar.m = bundle4;
            }
            efmg efmgVar3 = (efmg) bundle3.getSerializable("SurveyCompletionCode");
            if (efmgVar3 == null) {
                throw new NullPointerException("Null surveyCompletionStyle");
            }
            efpcVar.i = efmgVar3;
            efpcVar.a(true);
            efnm efnmVar2 = efnm.EMBEDDED;
            if (efnmVar2 == null) {
                throw new NullPointerException("Null surveyStyle");
            }
            efpcVar.l = efnmVar2;
            efpcVar.d(bundle3.getInt("StartingQuestionIndex"));
            if (efpcVar.n != 31 || (fajeVar = efpcVar.a) == null || (efnhVar = efpcVar.b) == null || (str = efpcVar.e) == null || (fakkVar = efpcVar.f) == null || (efmgVar2 = efpcVar.i) == null || (efnmVar = efpcVar.l) == null || (bundle2 = efpcVar.m) == null) {
                StringBuilder sb = new StringBuilder();
                if (efpcVar.a == null) {
                    sb.append(" surveyPayload");
                }
                if (efpcVar.b == null) {
                    sb.append(" answer");
                }
                if ((efpcVar.n & 1) == 0) {
                    sb.append(" isSubmitting");
                }
                if ((efpcVar.n & 2) == 0) {
                    sb.append(" ignoreFirstQuestion");
                }
                if (efpcVar.e == null) {
                    sb.append(" triggerId");
                }
                if (efpcVar.f == null) {
                    sb.append(" surveySession");
                }
                if ((efpcVar.n & 4) == 0) {
                    sb.append(" startingQuestionIndex");
                }
                if (efpcVar.i == null) {
                    sb.append(" surveyCompletionStyle");
                }
                if ((efpcVar.n & 8) == 0) {
                    sb.append(" hideCloseButton");
                }
                if ((efpcVar.n & 16) == 0) {
                    sb.append(" keepNextButtonForLastQuestion");
                }
                if (efpcVar.l == null) {
                    sb.append(" surveyStyle");
                }
                if (efpcVar.m == null) {
                    sb.append(" singleSelectOrdinalAnswerMappings");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            view = null;
            z = true;
            i = 2;
            efpdVar = new efpd(fajeVar, efnhVar, efpcVar.c, efpcVar.d, str, fakkVar, efpcVar.g, efpcVar.h, efmgVar2, efpcVar.j, efpcVar.k, efnmVar, bundle2);
        }
        if (efpdVar == null) {
            Log.e("EmbeddedSurveyFragment", "Required EXTRAS not found in the intent, bailing out.");
            return view;
        }
        efss efssVar = new efss(layoutInflater, I(), this, efpdVar);
        this.a = efssVar;
        efssVar.b.add(this);
        Object obj = this.a;
        final efss efssVar2 = (efss) obj;
        if (efssVar2.j) {
            efpd efpdVar2 = (efpd) efssVar2.k;
            if (efpdVar2.l == efnm.EMBEDDED && ((efmgVar = efpdVar2.i) == efmg.TOAST || efmgVar == efmg.SILENT)) {
                ((efmt) obj).p(R.id.survey_main_scroll_view).setVisibility(8);
                return ((efmt) this.a).a;
            }
        }
        efpd efpdVar3 = (efpd) efssVar2.k;
        boolean z2 = (efpdVar3.l == efnm.EMBEDDED && efpdVar3.h == null) ? z : false;
        faiw faiwVar = efssVar2.c.c;
        if (faiwVar == null) {
            faiwVar = faiw.a;
        }
        boolean z3 = faiwVar.b;
        efnc f = efssVar2.f();
        if (!z3 || z2) {
            efnd.a.e(f);
        }
        if (((efpd) efssVar2.k).l == efnm.EMBEDDED) {
            efmt efmtVar = (efmt) obj;
            FrameLayout frameLayout = (FrameLayout) efmtVar.p(R.id.fl_card_container);
            frameLayout.setClipToPadding(false);
            frameLayout.setClipChildren(false);
            frameLayout.setPadding(0, efmtVar.a.getResources().getDimensionPixelOffset(R.dimen.card_container_top_padding), 0, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) efssVar2.h.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.gravity = 8388659;
            efssVar2.h.setLayoutParams(layoutParams);
        }
        if (((efpd) efssVar2.k).l != efnm.EMBEDDED) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) efssVar2.h.getLayoutParams();
            if (efoi.d(efssVar2.h.getContext())) {
                layoutParams2.width = -2;
            } else {
                layoutParams2.width = efoi.a(efssVar2.h.getContext());
            }
            efssVar2.h.setLayoutParams(layoutParams2);
        }
        final String str2 = TextUtils.isEmpty(efssVar2.f.b) ? view : efssVar2.f.b;
        efmt efmtVar2 = (efmt) obj;
        ImageButton imageButton = (ImageButton) efmtVar2.p(R.id.survey_close_button);
        imageButton.setImageDrawable(efoo.f(efmtVar2.o()));
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: efsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                efou efouVar = new efou();
                efss efssVar3 = efss.this;
                efssVar3.j(6);
                efow.h(efssVar3.i);
                Iterator it = efssVar3.q().iterator();
                while (it.hasNext()) {
                    ((efsl) it.next()).r();
                }
                efot.d(efouVar, efssVar3.o(), str2);
            }
        });
        efmtVar2.p(R.id.survey_main_scroll_view).setFocusable(false);
        boolean d = efssVar2.d();
        efssVar2.d.inflate(R.layout.survey_controls, efssVar2.i);
        efpb efpbVar = efor.c;
        if (efor.b(fdvs.c(efor.b))) {
            efssVar2.c(d);
        } else if (!d) {
            efssVar2.c(false);
        }
        efpd efpdVar4 = (efpd) efssVar2.k;
        if (efpdVar4.l == efnm.EMBEDDED) {
            Integer num = efpdVar4.h;
            if (num == null || num.intValue() == 0) {
                efssVar2.h(str2);
            } else {
                efssVar2.k();
            }
        } else {
            faiw faiwVar2 = efssVar2.c.c;
            if (faiwVar2 == null) {
                faiwVar2 = faiw.a;
            }
            if (faiwVar2.b) {
                efssVar2.k();
            } else {
                efssVar2.h(str2);
            }
        }
        efpd efpdVar5 = (efpd) efssVar2.k;
        Integer num2 = efpdVar5.h;
        efmg efmgVar4 = efpdVar5.i;
        fr frVar = efssVar2.m;
        faje fajeVar3 = efssVar2.c;
        efsw efswVar = new efsw(frVar, fajeVar3, efpdVar5.d, false, efro.b(false, fajeVar3, efssVar2.f), efmgVar4, ((efpd) efssVar2.k).g);
        efssVar2.e = (SurveyViewPager) efmtVar2.p(R.id.survey_viewpager);
        SurveyViewPager surveyViewPager = efssVar2.e;
        surveyViewPager.l = efssVar2.l;
        surveyViewPager.j(efswVar);
        efssVar2.e.setImportantForAccessibility(i);
        if (num2 != null) {
            efssVar2.e.k(num2.intValue());
        }
        if (d) {
            efssVar2.i();
        }
        efssVar2.i.setVisibility(0);
        efssVar2.i.forceLayout();
        if (d) {
            ((MaterialButton) efmtVar2.p(R.id.survey_next)).setOnClickListener(new View.OnClickListener() { // from class: efsq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    efou efouVar = new efou();
                    efss efssVar3 = efss.this;
                    efssVar3.a();
                    efot.e(efouVar, efssVar3.o(), str2);
                }
            });
        }
        Iterator it = efmtVar2.q().iterator();
        while (it.hasNext()) {
            ((efsl) it.next()).aU();
        }
        efmtVar2.p(R.id.survey_close_button).setVisibility(z != ((efpd) efssVar2.k).j ? 0 : 8);
        SurveyViewPager surveyViewPager2 = efssVar2.e;
        if (surveyViewPager2 != null && surveyViewPager2.A()) {
            faiw faiwVar3 = efssVar2.c.c;
            if (faiwVar3 == null) {
                faiwVar3 = faiw.a;
            }
            if (!faiwVar3.b) {
                efssVar2.j(2);
            }
        }
        return ((efmt) this.a).a;
    }

    @Override // defpackage.efsd
    public final fr a() {
        return I();
    }

    @Override // defpackage.efsl
    public final void aT(String str) {
        Snackbar.r(fe().getWindow().findViewById(android.R.id.content), str, -1).i();
    }

    @Override // defpackage.efsd
    public final boolean aV() {
        return true;
    }

    @Override // defpackage.efsd
    public final boolean aW() {
        return this.a.d();
    }

    @Override // defpackage.efps
    public final void aX() {
        this.a.c(false);
    }

    @Override // defpackage.efsj
    public final /* bridge */ /* synthetic */ Activity b() {
        return super.G();
    }

    @Override // defpackage.efsd
    public final void f() {
        ImageButton imageButton = (ImageButton) ((efmt) this.a).p(R.id.survey_close_button);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        SurveyViewPager surveyViewPager = ((efss) this.a).e;
        bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? surveyViewPager.c : 0);
        bundle.putBoolean("IsSubmitting", ((efss) this.a).j);
        bundle.putParcelable("Answer", ((efss) this.a).f);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", ((efss) this.a).g);
    }

    @Override // defpackage.efps
    public final void p() {
        this.a.a();
    }

    @Override // defpackage.efpt
    public final void q(boolean z, ea eaVar) {
        efss efssVar = (efss) this.a;
        if (efssVar.j || efsw.m(eaVar) != efssVar.e.c || ((efpd) efssVar.k).k) {
            return;
        }
        efssVar.b(z);
    }

    @Override // defpackage.efps
    public final void t(boolean z) {
        this.a.b(z);
    }

    @Override // defpackage.efsl
    public final void aU() {
    }

    @Override // defpackage.efsd
    public final void e() {
    }

    @Override // defpackage.efsl
    public final void r() {
    }

    @Override // defpackage.efsl
    public final void s() {
    }
}
