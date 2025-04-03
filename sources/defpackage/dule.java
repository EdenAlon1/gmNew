package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.RatingView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dule extends dukr {
    public dukf ag;
    private final dukt ah = new dukt();
    private TextView ai;
    public String d;
    public int e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.hats_survey_question_rating, viewGroup, false);
        inflate.setContentDescription(this.a.c);
        duko.b((ImageView) inflate.findViewById(R.id.hats_lib_rating_banner_logo), this.m.getInt("DispalyLogoResId", 0));
        TextView textView = (TextView) inflate.findViewById(R.id.hats_lib_survey_question_text);
        this.ai = textView;
        textView.setText(dukq.a(this.a.c));
        this.ai.setContentDescription(this.a.c);
        RatingView ratingView = (RatingView) inflate.findViewById(R.id.hats_lib_rating_view);
        euke eukeVar = this.a.f;
        if (eukeVar == null) {
            eukeVar = euke.a;
        }
        ratingView.b(eukeVar, this.a.g);
        ratingView.a = new duld(this);
        if (!this.J) {
            this.ah.b((duks) G(), inflate);
        }
        return inflate;
    }

    @Override // defpackage.dukr
    public final eukg b() {
        eukf eukfVar = (eukf) eukg.a.createBuilder();
        if (this.ag.e()) {
            int a = (int) this.ag.a();
            eukfVar.copyOnWrite();
            ((eukg) eukfVar.instance).d = a;
            if (this.d != null) {
                eukfVar.copyOnWrite();
                ((eukg) eukfVar.instance).e = eukh.a(3);
                eukb eukbVar = (eukb) eukc.a.createBuilder();
                int i = this.e;
                eukbVar.copyOnWrite();
                ((eukc) eukbVar.instance).b = i;
                float f = this.e;
                eukbVar.copyOnWrite();
                ((eukc) eukbVar.instance).c = f;
                String str = this.d;
                eukbVar.copyOnWrite();
                eukc eukcVar = (eukc) eukbVar.instance;
                str.getClass();
                eukcVar.e = str;
                eukfVar.a((eukc) eukbVar.build());
                Log.d("HatsLibRatingFragment", "Selected response: ".concat(String.valueOf(this.d)));
            }
        }
        return (eukg) eukfVar.build();
    }

    @Override // defpackage.dukr
    public final String e() {
        return this.ai.getText().toString();
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
        this.ah.a();
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
        ((dulb) G()).F(r(), this);
    }

    @Override // defpackage.dukr
    public final void q(String str) {
        this.ai.setText(dukq.a(str));
        this.ai.setContentDescription(str);
    }

    public final boolean r() {
        return this.d != null;
    }
}
