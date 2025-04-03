package defpackage;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efte extends efpe {
    private LinearLayout d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Spanned fromHtml;
        this.d = (LinearLayout) layoutInflater.inflate(R.layout.survey_thank_you_fragment, viewGroup, false);
        int i = this.m.getInt("DisplayLogoResId", 0);
        efoi.c((ImageView) this.d.findViewById(R.id.survey_prompt_banner_logo), Integer.valueOf(i));
        TextView textView = (TextView) this.d.findViewById(R.id.survey_question_text);
        fromHtml = Html.fromHtml(this.b.c, 0);
        textView.setText(fromHtml);
        textView.setContentDescription(fromHtml.toString());
        textView.announceForAccessibility(textView.getContentDescription());
        String f = efow.f(this.b.e);
        if (!TextUtils.isEmpty(f)) {
            TextView textView2 = (TextView) this.d.findViewById(R.id.survey_follow_up_url);
            efpb efpbVar = efor.c;
            if (fdvj.a.get().a(A()) && i == 0 && (textView2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMarginStart(B().getDimensionPixelOffset(R.dimen.survey_thank_you_url_start_margin_state_no_icon));
            }
            String str = this.b.d;
            if (TextUtils.isEmpty(str)) {
                str = B().getString(R.string.survey_thank_you_followup_message);
            }
            textView2.setContentDescription(str);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new eftd(this, f), 0, str.length(), 0);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(spannableString);
            if (efow.j(z())) {
                textView2.setClickable(false);
                textView2.setLongClickable(false);
            }
            textView2.setOnTouchListener(new View.OnTouchListener() { // from class: eftc
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        view.setPressed(true);
                    } else if (motionEvent.getAction() == 1) {
                        view.performClick();
                        view.setPressed(false);
                    }
                    return false;
                }
            });
            textView2.setVisibility(0);
        }
        return this.d;
    }

    @Override // defpackage.efpe
    public final fain e() {
        return null;
    }

    @Override // defpackage.efpe
    public final void f() {
        if (this.d != null) {
            int i = 0;
            while (i < this.d.getChildCount()) {
                View childAt = this.d.getChildAt(i);
                childAt.setAlpha(0.0f);
                i++;
                childAt.animate().alpha(1.0f).setDuration(150L).setStartDelay(i * 80);
            }
        }
    }

    @Override // defpackage.efpe
    public final void p() {
        b().aX();
        b().q(true, this);
        if (!TextUtils.isEmpty(efow.f(this.b.e)) || b() == null) {
            return;
        }
        efpb efpbVar = efor.c;
        if (efor.b(fdva.a.get().a(efor.b))) {
            b().f();
        }
        b().e();
    }

    @Override // defpackage.efpe
    public final void q(String str) {
    }
}
