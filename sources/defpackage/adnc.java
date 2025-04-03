package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.gaia.expresssignin.HqmsExpressSignInTopView;
import com.google.android.apps.messaging.ui.rcs.consent.InterceptTouchConstraintLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adnc {
    public static final cfup a = cfvl.h(cfvl.b, "express_sign_in_top_view_learn_more_url", "https://support.google.com/messages?p=google_account_messages");
    public static final cfup b = cfvl.i(cfvl.b, "express_sign_in_top_view_scroll_to_how_it_works_link_by_default", false);
    public final ffbr c;
    public final dcyc d;
    private final Activity e;
    private final elbx f;

    public adnc(HqmsExpressSignInTopView hqmsExpressSignInTopView, ffbr ffbrVar, ffbr ffbrVar2, elbx elbxVar) {
        ConstraintLayout constraintLayout;
        this.c = ffbrVar;
        this.e = (Activity) ffbrVar2.b();
        this.f = elbxVar;
        TextView textView = (TextView) hqmsExpressSignInTopView.findViewById(R.id.how_it_works_link_overlap_with_subtitle_fix);
        hqmsExpressSignInTopView.findViewById(R.id.how_it_works_link_overlap_with_subtitle_fix).setVisibility(0);
        hqmsExpressSignInTopView.findViewById(R.id.esi_subtitle_overlap_with_subtitle_fix).setVisibility(0);
        hqmsExpressSignInTopView.findViewById(R.id.how_it_works_link).setVisibility(4);
        hqmsExpressSignInTopView.findViewById(R.id.esi_subtitle).setVisibility(4);
        final Context context = hqmsExpressSignInTopView.getContext();
        Resources resources = context.getResources();
        SpannableStringBuilder e = ddyi.e(context, resources.getString(R.string.tooltip_content_with_line_break_fix), resources.getString(R.string.tooltip_link), new elay(elbxVar, "HqmsExpressSignInTopViewPeer#clickLearnMore", new View.OnClickListener() { // from class: adna
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((adtc) adnc.this.c.b()).e(context, (String) adnc.a.e());
            }
        }));
        View view = textView;
        while (!(view instanceof ConstraintLayout)) {
            if (view != null) {
                Object parent = view.getParent();
                if (parent == null) {
                    constraintLayout = null;
                    break;
                }
                view = (View) parent;
            }
            if (view == null) {
                constraintLayout = null;
                break;
            }
        }
        constraintLayout = (ConstraintLayout) view;
        if (constraintLayout == null) {
            throw new IllegalArgumentException("WelcomeTooltip must have a ConstraintLayout in its parent hierarchy");
        }
        dcyc dcycVar = new dcyc(textView, LayoutInflater.from(constraintLayout.getContext()), constraintLayout);
        dcycVar.b.setText(e);
        this.d = dcycVar;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.e.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        dcycVar.i = (displayMetrics.widthPixels * 251) / 360;
        TextView textView2 = (TextView) dcycVar.e.findViewById(R.id.tooltip_text);
        textView2.setTextAppearance(R.style.TextAppearance_GoogleMaterial3_Body2);
        textView2.setTextColor(ehdr.b(textView2, R.attr.colorOnSurfaceVariant));
        egyl.d(textView2, LinkMovementMethod.getInstance());
        egyl.c(textView2);
        ((InterceptTouchConstraintLayout) hqmsExpressSignInTopView.findViewById(R.id.esi_content)).i = new dcxu(dcycVar);
        Activity activity = this.e;
        if (activity instanceof abe) {
            ((abe) activity).gE().b((abe) this.e, dcycVar.f);
        }
        textView.setOnClickListener(new elay(elbxVar, "HqmsExpressSignInTopViewPeer#clickHowItWorks", new View.OnClickListener() { // from class: admz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dcyc dcycVar2 = adnc.this.d;
                int i = dcycVar2.l;
                if (i == 0) {
                    dcycVar2.b.sendAccessibilityEvent(32768);
                    return;
                }
                if (i == 2) {
                    dcycVar2.g.removeAllListeners();
                    dcycVar2.g.cancel();
                }
                if (dcycVar2.l == 3) {
                    dcycVar2.a.setVisibility(0);
                    dcycVar2.d.addView(dcycVar2.a);
                    if (!dcycVar2.h) {
                        kkk kkkVar = new kkk();
                        kkkVar.i(dcycVar2.a.getId(), -2);
                        int id = dcycVar2.a.getId();
                        int id2 = dcycVar2.c.getId();
                        int id3 = dcycVar2.c.getId();
                        kkkVar.g(id, 6, id2, 6, 0);
                        kkkVar.g(id, 7, id3, 7, 0);
                        kkf kkfVar = (kkf) kkkVar.b.get(Integer.valueOf(id));
                        if (kkfVar != null) {
                            kkfVar.d.y = 0.5f;
                        }
                        int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, dcycVar2.a.getContext().getResources().getDisplayMetrics());
                        kkkVar.b(dcycVar2.a.getId()).d.e = (int) dcycVar2.a.getResources().getDimension(R.dimen.welcome_tooltip_max_height);
                        if (dcycVar2.i != 0) {
                            kkkVar.i(dcycVar2.a.getId(), dcycVar2.i);
                        }
                        dcycVar2.j.isPresent();
                        dcycVar2.k.isPresent();
                        kkkVar.g(dcycVar2.a.getId(), 4, dcycVar2.c.getId(), 3, applyDimension);
                        kkkVar.b(dcycVar2.a.getId()).b.d = dcycVar2.a.getAlpha();
                        kkkVar.c((ConstraintLayout) dcycVar2.d);
                        dcycVar2.h = true;
                    }
                }
                int i2 = dcycVar2.l;
                if (i2 == 3 || i2 == 2) {
                    float alpha = dcycVar2.a.getAlpha();
                    ValueAnimator a2 = dcycVar2.a(alpha, 1.0f);
                    a2.setDuration((long) ((1.0f - alpha) * 150.0f));
                    a2.addListener(new dcya(dcycVar2));
                    a2.start();
                    dcycVar2.g = a2;
                }
                dcycVar2.b.sendAccessibilityEvent(32768);
                dcycVar2.l = 1;
                dcycVar2.f.h(true);
            }
        }));
        if (((Boolean) b.e()).booleanValue()) {
            ScrollView scrollView = (ScrollView) hqmsExpressSignInTopView.findViewById(R.id.scroll_view);
            scrollView.addOnLayoutChangeListener(new adnb(scrollView, textView));
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) hqmsExpressSignInTopView.findViewById(R.id.express_sign_in_illustration);
        lottieAnimationView.f(R.raw.hqms_illustration);
        lottieAnimationView.d();
    }
}
