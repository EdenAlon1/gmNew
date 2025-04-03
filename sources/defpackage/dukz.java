package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dukz extends dulj {
    public ViewGroup ag;
    private final dukt al = new dukt();
    private dukf am;
    public boolean[] d;
    public boolean e;

    private final void aT(String str, boolean z, int i, String str2) {
        LayoutInflater.from(z()).inflate(R.layout.hats_survey_question_multiple_select_item, this.ag, true);
        FrameLayout frameLayout = (FrameLayout) this.ag.getChildAt(i);
        CheckBox checkBox = (CheckBox) frameLayout.findViewById(R.id.hats_lib_multiple_select_checkbox);
        checkBox.setText(str);
        checkBox.setContentDescription(str);
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(new duky(this, i));
        frameLayout.setOnClickListener(new dukx(checkBox));
        if (str2 != null) {
            checkBox.setTag(str2);
        }
    }

    @Override // defpackage.dulj, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View M = super.M(layoutInflater, viewGroup, bundle);
        M.setContentDescription(this.a.c);
        if (!this.J) {
            this.al.b((duks) G(), M);
        }
        return M;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        ((dulb) G()).F(t(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dukr
    public final eukg b() {
        eukf eukfVar = (eukf) eukg.a.createBuilder();
        if (this.am.e()) {
            if (this.e) {
                eukb eukbVar = (eukb) eukc.a.createBuilder();
                eukbVar.copyOnWrite();
                ((eukc) eukbVar.instance).d = eujy.a(4);
                eukfVar.a((eukc) eukbVar.build());
                this.am.b();
            } else {
                eygr eygrVar = this.a.e;
                int i = 0;
                while (true) {
                    boolean[] zArr = this.d;
                    if (i >= zArr.length) {
                        break;
                    }
                    if (zArr[i]) {
                        eukb eukbVar2 = (eukb) eukc.a.createBuilder();
                        eukbVar2.copyOnWrite();
                        ((eukc) eukbVar2.instance).b = i;
                        eukbVar2.copyOnWrite();
                        ((eukc) eukbVar2.instance).d = eujy.a(3);
                        String str = ((eujx) eygrVar.get(i)).b;
                        eukbVar2.copyOnWrite();
                        eukc eukcVar = (eukc) eukbVar2.instance;
                        str.getClass();
                        eukcVar.e = str;
                        eukfVar.a((eukc) eukbVar2.build());
                        this.am.b();
                    }
                    i++;
                }
                if (((eukg) eukfVar.instance).g.size() > 0) {
                    int nextInt = ((dujz) dukb.c()).b.nextInt(((eukg) eukfVar.instance).g.size());
                    eukb eukbVar3 = (eukb) ((eukc) ((eukg) eukfVar.instance).g.get(nextInt)).toBuilder();
                    eukbVar3.copyOnWrite();
                    ((eukc) eukbVar3.instance).g = true;
                    eukc eukcVar2 = (eukc) eukbVar3.build();
                    eukfVar.copyOnWrite();
                    eukg eukgVar = (eukg) eukfVar.instance;
                    eukgVar.a();
                    eukgVar.g.remove(nextInt);
                    eukfVar.copyOnWrite();
                    eukg eukgVar2 = (eukg) eukfVar.instance;
                    eukcVar2.getClass();
                    eukgVar2.a();
                    eukgVar2.g.add(nextInt, eukcVar2);
                }
            }
            if (this.am.d()) {
                eukfVar.copyOnWrite();
                ((eukg) eukfVar.instance).e = eukh.a(3);
            }
            int i2 = this.c;
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).b = i2;
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).c = euki.a(4);
            int a = (int) this.am.a();
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).d = a;
        }
        return (eukg) eukfVar.build();
    }

    @Override // defpackage.dukr
    public final void f() {
        boolean z = ((dujz) dukb.c()).c;
        if (this.ag != null) {
            int i = 0;
            while (i < this.ag.getChildCount()) {
                View childAt = this.ag.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.dukr, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle != null) {
            this.e = bundle.getBoolean("NoneOfTheAboveAsBoolean", false);
            this.am = (dukf) bundle.getParcelable("QuestionMetrics");
            this.d = bundle.getBooleanArray("ResponsesAsArray");
        }
        if (this.am == null) {
            this.am = new dukf();
        }
        boolean[] zArr = this.d;
        if (zArr == null) {
            this.d = new boolean[this.a.e.size()];
            return;
        }
        if (zArr.length != this.a.e.size()) {
            Log.e("HatsLibMultiSelectFrag", "Saved instance state responses had incorrect length: " + this.d.length);
            this.d = new boolean[this.a.e.size()];
        }
    }

    @Override // defpackage.ea
    public final void j() {
        this.al.a();
        super.j();
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putBoolean("NoneOfTheAboveAsBoolean", this.e);
        bundle.putParcelable("QuestionMetrics", this.am);
        bundle.putBooleanArray("ResponsesAsArray", this.d);
    }

    @Override // defpackage.dukr
    public final void p() {
        this.am.c();
        ((dulb) G()).F(t(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dulj
    public final View r() {
        this.ag = (LinearLayout) LayoutInflater.from(z()).inflate(R.layout.hats_survey_scrollable_answer_content_container, (ViewGroup) null).findViewById(R.id.hats_lib_survey_answers_container);
        eygr eygrVar = this.a.e;
        for (int i = 0; i < eygrVar.size(); i++) {
            aT(((eujx) eygrVar.get(i)).b, this.d[i], i, null);
        }
        aT(B().getString(R.string.hats_lib_none_of_the_above), this.e, eygrVar.size(), "NoneOfTheAbove");
        return this.ag;
    }

    @Override // defpackage.dulj
    public final String s() {
        return this.a.c;
    }

    public final boolean t() {
        if (this.e) {
            return true;
        }
        for (boolean z : this.d) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
