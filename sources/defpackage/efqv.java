package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efqv {
    public static enhk a;
    public final efqu b;
    public efnh c;
    public Context d;
    public Activity e;
    public efpp f;
    public faje g;
    public efnj h;
    public fakk i;
    public efsa j;
    public efpf k;
    public boolean l;
    public String m;
    public String n;
    private View p;
    private ViewGroup q;
    private int s;
    private Integer t;
    private efmg u;
    private String v;
    private boolean r = false;
    private boolean w = false;
    private boolean x = true;
    private boolean y = true;
    public int o = 0;

    public efqv(efqu efquVar) {
        this.b = efquVar;
    }

    private final void m(final View.OnClickListener onClickListener, final String str) {
        ((MaterialButton) this.q.findViewById(R.id.survey_next)).setOnClickListener(new View.OnClickListener() { // from class: efqm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                efou efouVar = new efou();
                onClickListener.onClick(view);
                efot.e(efouVar, efqv.this.d, str);
            }
        });
    }

    private final void n() {
        ((LayoutInflater) this.d.getSystemService("layout_inflater")).inflate(R.layout.survey_controls, this.q);
        if (efow.m(this.g)) {
            f(false);
            MaterialButton materialButton = (MaterialButton) this.q.findViewById(R.id.survey_next);
            if (materialButton != null && this.g.g.size() == 1 && !this.w) {
                materialButton.setText(R.string.survey_submit);
            }
            efoi.e(this.q.findViewById(R.id.survey_controls_container), this.q.findViewById(R.id.survey_next), R.dimen.survey_button_accessibility_padding, 0);
        } else {
            this.q.findViewById(R.id.survey_next).setVisibility(8);
        }
        this.q.findViewById(R.id.survey_controls_divider).setVisibility(8);
        this.q.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
    }

    private final void o(Context context, String str, fakk fakkVar, boolean z) {
        efnh efnhVar = this.c;
        efnhVar.g = 3;
        new efnn(context, str, fakkVar).a(efnhVar, z);
    }

    private final boolean p() {
        Activity activity;
        if (this.r) {
            return false;
        }
        efpb efpbVar = efor.c;
        return (efor.b(fdwh.a.get().b(efor.b)) && (activity = this.b.getActivity()) != null && activity.isChangingConfigurations()) ? false : true;
    }

    private static final void q(View view, String str) {
        Spanned fromHtml;
        TextView textView = (TextView) view.findViewById(R.id.survey_prompt_title_text);
        fromHtml = Html.fromHtml(str, 0);
        textView.setText(fromHtml);
        textView.announceForAccessibility(fromHtml.toString());
    }

    public final efnc a() {
        fakk fakkVar = this.i;
        if (fakkVar == null || this.m == null) {
            long j = efow.a;
            return null;
        }
        efmz efmzVar = new efmz();
        efmzVar.b(fakkVar.b);
        efmzVar.d(this.m);
        efmzVar.c(efnm.POPUP);
        return efmzVar.a();
    }

    public final void b(fajr fajrVar) {
        if (!efor.a()) {
            this.o = 1;
            return;
        }
        fajp fajpVar = fajrVar.k;
        if (fajpVar == null) {
            fajpVar = fajp.a;
        }
        if ((fajpVar.b & 1) == 0) {
            this.o = 1;
            return;
        }
        fajp fajpVar2 = fajrVar.k;
        if (fajpVar2 == null) {
            fajpVar2 = fajp.a;
        }
        fahc fahcVar = fajpVar2.d;
        if (fahcVar == null) {
            fahcVar = fahc.a;
        }
        int a2 = fahb.a(fahcVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a2 - 2 != 3) {
            this.o = 1;
        } else {
            this.o = this.g.g.size();
        }
    }

    public final void c() {
        efmg efmgVar;
        this.h.a();
        efpb efpbVar = efor.c;
        if (!efor.c(fdvv.b(efor.b)) || (((efmgVar = this.u) != efmg.TOAST && efmgVar != efmg.SILENT) || (this.g.g.size() != 1 && !efro.b(this.l, this.g, this.c) && this.o != this.g.g.size()))) {
            h();
            return;
        }
        efmg efmgVar2 = this.u;
        if (efmgVar2 == efmg.TOAST) {
            View view = this.p;
            fahq fahqVar = this.g.d;
            if (fahqVar == null) {
                fahqVar = fahq.b;
            }
            Snackbar.r(view, fahqVar.c, -1).i();
        } else if (efmgVar2 == efmg.SILENT) {
            Log.v("SurveyPromptDialogDel", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
        }
        Context context = this.d;
        String str = this.m;
        fakk fakkVar = this.i;
        boolean k = efow.k(this.g);
        efnh efnhVar = this.c;
        efnhVar.g = 5;
        new efnn(context, str, fakkVar).a(efnhVar, k);
        o(this.d, this.m, this.i, efow.k(this.g));
        this.b.dismissAllowingStateLoss();
    }

    public final void d() {
        if (efor.b == null) {
            return;
        }
        if (!efor.d()) {
            if (p()) {
                efnd.a.b();
            }
        } else {
            efnc a2 = a();
            if (!p() || a2 == null) {
                return;
            }
            efnd.a.c(a2);
        }
    }

    public final void e(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.d.getSystemService("accessibility");
        View findViewById = view.findViewById(R.id.survey_prompt_title_text);
        efpb efpbVar = efor.c;
        if (!efor.b(fdux.a.get().a(efor.b)) || !accessibilityManager.isTouchExplorationEnabled() || findViewById == null || findViewById.isAccessibilityFocused()) {
            return;
        }
        findViewById.performAccessibilityAction(64, null);
    }

    public final void f(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.q.findViewById(R.id.survey_next);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    public final void g(fajr fajrVar) {
        efsa efsaVar = this.j;
        faib faibVar = (faib) fain.a.createBuilder();
        if (this.h.c() && efsaVar.a != null) {
            faij faijVar = (faij) faik.a.createBuilder();
            int i = efsaVar.b;
            faijVar.copyOnWrite();
            ((faik) faijVar.instance).c = i;
            int i2 = efsaVar.c;
            faijVar.copyOnWrite();
            ((faik) faijVar.instance).b = faii.a(i2);
            String str = efsaVar.a;
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
            int i3 = fajrVar.e;
            faibVar.copyOnWrite();
            ((fain) faibVar.instance).d = i3;
        }
        fain fainVar2 = (fain) faibVar.build();
        if (fainVar2 != null) {
            this.c.a = fainVar2;
        }
        b(fajrVar);
        efsa efsaVar2 = this.j;
        efpb efpbVar = efor.c;
        if (efor.c(fduu.b(efor.b))) {
            fagx fagxVar = fagx.a;
            fagz fagzVar = (fajrVar.c == 4 ? (fakn) fajrVar.d : fakn.a).c;
            if (fagzVar == null) {
                fagzVar = fagz.a;
            }
            Iterator<E> it = fagzVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fagx fagxVar2 = (fagx) it.next();
                if (fagxVar2.d == efsaVar2.b) {
                    fagxVar = fagxVar2;
                    break;
                }
            }
            if ((fagxVar.b & 1) != 0) {
                fahc fahcVar = fagxVar.g;
                if (fahcVar == null) {
                    fahcVar = fahc.a;
                }
                int a2 = fahb.a(fahcVar.b);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i4 = a2 - 2;
                if (i4 == 2) {
                    fahc fahcVar2 = fagxVar.g;
                    if (fahcVar2 == null) {
                        fahcVar2 = fahc.a;
                    }
                    String str2 = fahcVar2.c;
                    this.o = a.containsKey(str2) ? ((Integer) a.get(str2)).intValue() : 0;
                } else if (i4 != 3) {
                    this.o = 1;
                } else {
                    this.o = this.g.g.size();
                }
            }
        } else {
            this.o = 1;
        }
        c();
    }

    public final void h() {
        faje fajeVar;
        Activity activity = this.b.getActivity();
        String str = this.m;
        faje fajeVar2 = this.g;
        fakk fakkVar = this.i;
        efnh efnhVar = this.c;
        int i = this.s;
        Integer valueOf = Integer.valueOf(i);
        boolean z = this.l;
        Integer num = this.t;
        efmg efmgVar = this.u;
        String str2 = this.v;
        int i2 = this.o;
        boolean z2 = this.w;
        boolean z3 = this.x;
        boolean z4 = this.y;
        HashMap hashMap = new HashMap();
        Iterator it = fajeVar2.g.iterator();
        while (true) {
            fajeVar = fajeVar2;
            if (!it.hasNext()) {
                break;
            }
            fajr fajrVar = (fajr) it.next();
            Iterator it2 = it;
            if ((fajrVar.b & 1) != 0) {
                fajp fajpVar = fajrVar.k;
                if (fajpVar == null) {
                    fajpVar = fajp.a;
                }
                if (!hashMap.containsKey(fajpVar.c)) {
                    fajp fajpVar2 = fajrVar.k;
                    if (fajpVar2 == null) {
                        fajpVar2 = fajp.a;
                    }
                    hashMap.put(fajpVar2.c, Integer.valueOf(fajrVar.e - 1));
                }
            }
            it = it2;
            fajeVar2 = fajeVar;
        }
        efsi.a = enhk.j(hashMap);
        Intent intent = new Intent(activity, (Class<?>) efsi.class);
        intent.setClassName(activity, str2);
        intent.putExtra("TriggerId", str);
        intent.putExtra("SurveyPayload", fajeVar.toByteArray());
        intent.putExtra("SurveySession", fakkVar.toByteArray());
        intent.putExtra("Answer", efnhVar);
        intent.putExtra("IsFullWidth", false);
        intent.putExtra("IgnoreFirstQuestion", z);
        if (num != null) {
            intent.putExtra("LogoResId", num);
        }
        intent.putExtra("IsSubmitting", false);
        intent.putExtra("SurveyCompletionStyle", efmgVar);
        intent.putExtra("StartingQuestionIndex", i2);
        intent.putExtra("keepNextButtonForLastQuestion", z2);
        intent.putExtra("isCarDisplayFullyReachable", z3);
        intent.putExtra("isCarDisplayRightOfUser", z4);
        long j = efow.a;
        valueOf.getClass();
        activity.startActivityForResult(intent, i);
        this.r = true;
        o(this.d, this.m, this.i, efow.k(this.g));
        this.b.dismissAllowingStateLoss();
    }

    public final void i(Context context, String str, fakk fakkVar, boolean z) {
        efnh efnhVar = this.c;
        efnhVar.g = 4;
        new efnn(context, str, fakkVar).a(efnhVar, z);
    }

    public final void j(Context context, String str, fakk fakkVar, boolean z) {
        efnh efnhVar = this.c;
        efnhVar.g = 6;
        new efnn(context, str, fakkVar).a(efnhVar, z);
    }

    public final void k() {
        if (efor.b == null) {
            this.b.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0467  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View l(android.view.ViewGroup r24) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efqv.l(android.view.ViewGroup):android.view.View");
    }
}
