package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dulc extends dulj {
    private dukf ag;
    public EditText d;
    private final dukt e = new dukt();

    @Override // defpackage.dulj, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View M = super.M(layoutInflater, viewGroup, bundle);
        M.setContentDescription(this.a.c);
        if (!this.J) {
            this.e.b((duks) G(), M);
        }
        return M;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        ((dulb) G()).F(true, this);
    }

    @Override // defpackage.dukr
    public final eukg b() {
        eukf eukfVar = (eukf) eukg.a.createBuilder();
        if (this.ag.e()) {
            this.ag.b();
            int a = (int) this.ag.a();
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).d = a;
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).c = euki.a(5);
            int i = this.c;
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).b = i;
            String obj = this.d.getText().toString();
            if (obj.trim().isEmpty()) {
                eukb eukbVar = (eukb) eukc.a.createBuilder();
                eukbVar.copyOnWrite();
                ((eukc) eukbVar.instance).f = "skipped";
                eukfVar.a((eukc) eukbVar.build());
                eukfVar.copyOnWrite();
                ((eukg) eukfVar.instance).e = eukh.a(4);
            } else {
                eukb eukbVar2 = (eukb) eukc.a.createBuilder();
                String trim = obj.trim();
                eukbVar2.copyOnWrite();
                eukc eukcVar = (eukc) eukbVar2.instance;
                trim.getClass();
                eukcVar.f = trim;
                eukfVar.a((eukc) eukbVar2.build());
                eukfVar.copyOnWrite();
                ((eukg) eukfVar.instance).e = eukh.a(3);
            }
        }
        return (eukg) eukfVar.build();
    }

    @Override // defpackage.dukr, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            this.ag = new dukf();
        } else {
            this.ag = (dukf) bundle.getParcelable("QuestionMetrics");
        }
    }

    @Override // defpackage.ea
    public final void j() {
        this.e.a();
        super.j();
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putParcelable("QuestionMetrics", this.ag);
    }

    @Override // defpackage.dukr
    public final void p() {
        this.ag.c();
        ((dulb) G()).F(true, this);
    }

    @Override // defpackage.dulj
    public final View r() {
        LayoutInflater from = LayoutInflater.from(z());
        View inflate = from.inflate(R.layout.hats_survey_scrollable_answer_content_container, (ViewGroup) null);
        inflate.setMinimumHeight(B().getDimensionPixelSize(R.dimen.hats_lib_open_text_question_min_height));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.hats_lib_survey_answers_container);
        from.inflate(R.layout.hats_survey_question_open_text_item, (ViewGroup) linearLayout, true);
        EditText editText = (EditText) linearLayout.findViewById(R.id.hats_lib_survey_open_text);
        this.d = editText;
        editText.setSingleLine(false);
        this.d.setHint(B().getString(R.string.hats_lib_open_text_hint));
        return linearLayout;
    }

    @Override // defpackage.dulj
    public final String s() {
        return this.a.c;
    }
}
