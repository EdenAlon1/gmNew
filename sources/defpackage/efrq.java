package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efrq extends efpe {
    public View ag;
    public View ah;
    public View ai;
    public ScrollViewWithSizeCallback aj;
    private TextView d;
    private final efrp e = new efrp(this);
    private boolean ak = false;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.survey_question_with_scrollable_content, viewGroup, false);
        this.ag = inflate.findViewById(R.id.survey_question_header_logo_text);
        this.d = (TextView) inflate.findViewById(R.id.survey_question_text);
        CharSequence charSequence = bundle != null ? bundle.getCharSequence("QuestionTextFromHtml") : null;
        if (charSequence == null) {
            charSequence = Html.fromHtml(s(), 0);
        }
        this.d.setText(charSequence);
        this.d.setContentDescription(charSequence.toString());
        this.ai = r();
        ScrollViewWithSizeCallback scrollViewWithSizeCallback = (ScrollViewWithSizeCallback) inflate.findViewById(R.id.survey_question_scroll_view);
        this.aj = scrollViewWithSizeCallback;
        scrollViewWithSizeCallback.addView(this.ai);
        ScrollViewWithSizeCallback scrollViewWithSizeCallback2 = this.aj;
        efrp efrpVar = this.e;
        scrollViewWithSizeCallback2.a = efrpVar;
        if (!this.ak && scrollViewWithSizeCallback2 != null) {
            scrollViewWithSizeCallback2.getViewTreeObserver().addOnScrollChangedListener(efrpVar);
            this.ak = true;
        }
        efoi.c((ImageView) inflate.findViewById(R.id.survey_prompt_banner_logo), this.c);
        efsj b = b();
        if (b != null) {
            this.ah = b.b().findViewById(R.id.survey_controls_container);
        }
        kvo.r(inflate, null);
        return inflate;
    }

    public final boolean aT() {
        return (z() == null || this.d == null || this.ag == null || this.ah == null || this.ai == null || this.aj == null) ? false : true;
    }

    @Override // defpackage.ea
    public final void i() {
        ScrollViewWithSizeCallback scrollViewWithSizeCallback;
        if (this.ak && (scrollViewWithSizeCallback = this.aj) != null) {
            scrollViewWithSizeCallback.getViewTreeObserver().removeOnScrollChangedListener(this.e);
            this.ak = false;
        }
        super.i();
    }

    @Override // defpackage.ea
    public void k(Bundle bundle) {
        TextView textView = this.d;
        if (textView != null) {
            bundle.putCharSequence("QuestionTextFromHtml", textView.getText());
        }
    }

    @Override // defpackage.efpe
    public void p() {
        View view;
        efpb efpbVar = efor.c;
        if ((!efor.b(fdvs.c(efor.b)) || aT()) && efow.j(z()) && (view = this.ag) != null) {
            view.requestFocus();
            this.ag.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.efpe
    public final void q(String str) {
        Spanned fromHtml;
        efpb efpbVar = efor.c;
        if (!efor.b(fdvs.c(efor.b)) || aT()) {
            fromHtml = Html.fromHtml(str, 0);
            this.d.setText(fromHtml);
            this.d.setContentDescription(fromHtml.toString());
        }
    }

    public abstract View r();

    public abstract String s();
}
