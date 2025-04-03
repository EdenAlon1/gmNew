package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.hats20.view.RatingView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dujm extends dn implements dujk {
    private final dujl ag = new dujl(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dujl dujlVar = this.ag;
        dujlVar.c = super.G();
        dujlVar.d = new dukm(dujlVar.c);
        Bundle bundle2 = ((ea) dujlVar.a).m;
        String string = bundle2.getString("SiteId");
        int i = bundle2.getInt("RequestCode", -1);
        dujlVar.f = (evpr) dukd.a(evpr.a, bundle2.getByteArray("Survey"));
        dujlVar.g = (eukk) dukd.a(eukk.a, bundle2.getByteArray("SurveyPayload"));
        dujlVar.e = (dujv) bundle2.getParcelable("AnswerBeacon");
        dujlVar.i = bundle2.getBoolean("BottomSheet");
        dujlVar.j = bundle2.getBoolean("IsRatingBanner");
        int i2 = bundle2.getInt("hatsDisplayLogo", 0);
        dn dnVar = (dn) dujlVar.a;
        if (dnVar.c) {
            dnVar.d.requestWindowFeature(1);
        }
        dujlVar.e.c("sv");
        new dujx(dujlVar.f.h, dujy.a(dujlVar.c)).a(dujlVar.e);
        dukb.c().a().b();
        dujlVar.b = layoutInflater.inflate(R.layout.hats_prompt_banner, viewGroup, false);
        duko.b((ImageView) dujlVar.b.findViewById(R.id.hats_lib_prompt_banner_logo), i2);
        View view = dujlVar.b;
        dujlVar.h = new duja((CardView) view, ((dn) dujlVar.a).d, dujlVar.d, dujlVar.i);
        if (dujlVar.j) {
            dujl.e(view, ((euka) dujlVar.g.b.get(0)).c);
            View view2 = dujlVar.b;
            View findViewById = view2.findViewById(R.id.prompt_banner_header);
            Resources resources = dujlVar.c.getResources();
            findViewById.setPadding(0, 0, resources.getDimensionPixelSize(R.dimen.hats_lib_close_button_size) - resources.getDimensionPixelSize(R.dimen.hats_lib_prompt_banner_right_padding), 0);
            ((ImageButton) view2.findViewById(R.id.hats_lib_close_button)).setOnClickListener(new duji(dujlVar));
            duko.c(view2.findViewById(R.id.hats_lib_close_button_layout), view2.findViewById(R.id.hats_lib_close_button), R.dimen.hats_lib_close_button_top_right_padding, R.dimen.hats_lib_close_button_top_right_padding);
            dujlVar.k = new dukf();
            dujlVar.k.c();
            dujlVar.e.e(0);
            RatingView ratingView = (RatingView) view2.findViewById(R.id.hats_lib_prompt_rating_view);
            ratingView.setVisibility(0);
            euka eukaVar = (euka) dujlVar.g.b.get(0);
            euke eukeVar = eukaVar.f;
            if (eukeVar == null) {
                eukeVar = euke.a;
            }
            ratingView.b(eukeVar, eukaVar.g);
            ratingView.a = new dujj(dujlVar, string, i, i2);
        } else {
            dujl.e(view, dujlVar.f.e);
            View view3 = dujlVar.b;
            view3.findViewById(R.id.hats_lib_prompt_buttons).setVisibility(0);
            view3.findViewById(R.id.hats_lib_close_button_layout).setVisibility(8);
            Button button = (Button) view3.findViewById(R.id.hats_lib_prompt_no_thanks_button);
            Button button2 = (Button) view3.findViewById(R.id.hats_lib_prompt_take_survey_button);
            dujlVar.c(button);
            dujlVar.c(button2);
            view3.findViewById(R.id.hats_lib_prompt_no_thanks_wrapper).setOnTouchListener(new duje(button));
            view3.findViewById(R.id.hats_lib_prompt_take_survey_wrapper).setOnTouchListener(new dujf(button2));
            button2.setOnClickListener(new dujg(dujlVar, string, i, i2));
            button.setOnClickListener(new dujh(dujlVar));
        }
        return dujlVar.b;
    }

    @Override // defpackage.dujk
    public final /* bridge */ /* synthetic */ Activity a() {
        return super.G();
    }

    @Override // defpackage.ea
    public final void ai() {
        if (!this.ag.m) {
            dukb.c().a().a();
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void am() {
        super.am();
        this.ag.n = false;
    }

    @Override // defpackage.ea
    public final void ao() {
        this.ag.a();
        super.ao();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void l() {
        super.l();
        this.ag.a();
    }
}
