package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dukw extends dulj {
    private static final enhk al;
    public dukf ag;
    private LinearLayout am;
    public String d;
    private final dukt an = new dukt();
    public int e = -1;

    static {
        cmh cmhVar = new cmh();
        cmhVar.put(0, Integer.valueOf(R.drawable.ic_sentiment_very_satisfied_grey600_36dp));
        cmhVar.put(1, Integer.valueOf(R.drawable.ic_sentiment_satisfied_grey600_36dp));
        cmhVar.put(2, Integer.valueOf(R.drawable.ic_sentiment_neutral_grey600_36dp));
        cmhVar.put(3, Integer.valueOf(R.drawable.ic_sentiment_dissatisfied_grey600_36dp));
        cmhVar.put(4, Integer.valueOf(R.drawable.ic_sentiment_very_dissatisfied_grey600_36dp));
        al = enhk.j(cmhVar);
    }

    @Override // defpackage.dulj, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View M = super.M(layoutInflater, viewGroup, bundle);
        M.setContentDescription(this.a.c);
        if (!this.J) {
            this.an.b((duks) G(), M);
        }
        return M;
    }

    @Override // defpackage.dukr
    public final eukg b() {
        eukf eukfVar = (eukf) eukg.a.createBuilder();
        if (this.ag.d()) {
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).e = eukh.a(3);
        }
        if (this.ag.e()) {
            if (this.d != null) {
                eukb eukbVar = (eukb) eukc.a.createBuilder();
                int i = this.e;
                eukbVar.copyOnWrite();
                ((eukc) eukbVar.instance).b = i;
                eukbVar.copyOnWrite();
                ((eukc) eukbVar.instance).d = eujy.a(3);
                String str = this.d;
                eukbVar.copyOnWrite();
                eukc eukcVar = (eukc) eukbVar.instance;
                str.getClass();
                eukcVar.e = str;
                eukbVar.copyOnWrite();
                ((eukc) eukbVar.instance).g = true;
                eukfVar.a((eukc) eukbVar.build());
            }
            int i2 = this.c;
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).b = i2;
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).c = euki.a(3);
            int a = (int) this.ag.a();
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).d = a;
            eygi eygiVar = this.a.h;
            eukfVar.copyOnWrite();
            eukg eukgVar = (eukg) eukfVar.instance;
            eygi eygiVar2 = eukgVar.f;
            if (!eygiVar2.c()) {
                eukgVar.f = eyfy.mutableCopy(eygiVar2);
            }
            eydl.addAll(eygiVar, eukgVar.f);
        }
        return (eukg) eukfVar.build();
    }

    @Override // defpackage.dukr
    public final void f() {
        boolean z = ((dujz) dukb.c()).c;
        if (this.am != null) {
            int i = 0;
            while (i < this.am.getChildCount()) {
                View childAt = this.am.getChildAt(i);
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
            this.d = bundle.getString("SelectedResponse", null);
            this.ag = (dukf) bundle.getParcelable("QuestionMetrics");
        }
        if (this.ag == null) {
            this.ag = new dukf();
        }
    }

    @Override // defpackage.ea
    public final void j() {
        this.an.a();
        super.j();
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putString("SelectedResponse", this.d);
        bundle.putParcelable("QuestionMetrics", this.ag);
    }

    @Override // defpackage.dukr
    public final void p() {
        this.ag.c();
        ((dulb) G()).F(false, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dulj
    public final View r() {
        List list;
        LayoutInflater from = LayoutInflater.from(z());
        View inflate = from.inflate(R.layout.hats_survey_scrollable_answer_content_container, (ViewGroup) null);
        this.am = (LinearLayout) inflate.findViewById(R.id.hats_lib_survey_answers_container);
        View[] viewArr = new View[this.a.e.size()];
        eygi eygiVar = this.a.h;
        if (eygiVar.isEmpty() || eygiVar.size() != this.a.e.size()) {
            list = this.a.e;
        } else {
            list = new ArrayList();
            eygr eygrVar = this.a.e;
            for (int i = 0; i < eygrVar.size(); i++) {
                list.add(i, (eujx) eygrVar.get(eygiVar.indexOf(Integer.valueOf(i))));
            }
        }
        boolean z = this.a.g && list.size() == 5;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (z) {
                from.inflate(R.layout.hats_survey_question_multiple_choice_with_smileys_item, (ViewGroup) this.am, true);
                View childAt = this.am.getChildAt(r8.getChildCount() - 1);
                viewArr[i2] = childAt;
                TextView textView = (TextView) childAt.findViewById(R.id.hats_lib_survey_multiple_choice_text);
                textView.setText(((eujx) list.get(i2)).b);
                textView.setContentDescription(((eujx) list.get(i2)).b);
                ((ImageView) viewArr[i2].findViewById(R.id.hats_lib_survey_multiple_choice_icon)).setImageDrawable(pcj.b(B(), ((Integer) al.get(Integer.valueOf(i2))).intValue(), null));
            } else {
                from.inflate(R.layout.hats_survey_question_multiple_choice_item, (ViewGroup) this.am, true);
                View childAt2 = this.am.getChildAt(r8.getChildCount() - 1);
                viewArr[i2] = childAt2;
                ((Button) childAt2).setText(((eujx) list.get(i2)).b);
                ((Button) viewArr[i2]).setContentDescription(((eujx) list.get(i2)).b);
            }
            viewArr[i2].setOnClickListener(new dukv(this, viewArr, list, i2));
        }
        return inflate;
    }

    @Override // defpackage.dulj
    public final String s() {
        return this.a.c;
    }
}
