package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.ConstraintLayout;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxzp extends cxyq {
    public static final entd a = entd.c("BugleBanners");
    public final elbx b;
    public final ConstraintLayout c;
    public final ffbr d;
    public final TextView e;
    public final ImageView f;
    public final ImageView g;
    public cxzo h;
    public cxzo i;
    public int j = 0;
    private final eler k;
    private final FrameLayout l;
    private ViewGroup m;

    public cxzp(eler elerVar, elbx elbxVar, ffbr ffbrVar, Context context) {
        this.k = elerVar;
        this.b = elbxVar;
        this.d = ffbrVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.l = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(R.layout.connected_half_banner_view, (ViewGroup) frameLayout, true);
        ConstraintLayout constraintLayout = (ConstraintLayout) frameLayout.findViewById(R.id.banner_root);
        this.c = constraintLayout;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ehdr.b(constraintLayout, android.R.attr.colorBackground));
        gradientDrawable.setStroke(1, ehdr.b(constraintLayout, R.attr.colorSurfaceVariant));
        constraintLayout.setBackground(gradientDrawable);
        this.e = (TextView) constraintLayout.findViewById(R.id.banner_general_text);
        this.f = (ImageView) constraintLayout.findViewById(R.id.banner_start_icon);
        this.g = (ImageView) constraintLayout.findViewById(R.id.banner_end_icon);
    }

    private final void e(cxyp cxypVar, boolean z) {
        if (z) {
            Slide f = f();
            f.addListener(new eleq(this.k, new cxzn(this, cxypVar), "ConnectedHalfBannerUiController: Slide in top transition"));
            ViewGroup viewGroup = this.m;
            viewGroup.getClass();
            TransitionManager.beginDelayedTransition(viewGroup, f);
            this.c.setVisibility(8);
            return;
        }
        this.j++;
        this.c.setVisibility(8);
        int i = this.j - 1;
        this.j = i;
        if (i != 0 || cxypVar == null) {
            return;
        }
        cxypVar.a(this);
    }

    private final Slide f() {
        Slide slide = new Slide();
        slide.setDuration(333L);
        slide.setSlideEdge(48);
        slide.addTarget(this.c);
        return slide;
    }

    @Override // defpackage.cxyq
    public final void a(ViewGroup viewGroup) {
        this.m = viewGroup;
        viewGroup.addView(this.l);
    }

    @Override // defpackage.cxyq
    public final void b() {
        ViewGroup viewGroup = (ViewGroup) this.l.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.l);
        }
        this.m = null;
    }

    @Override // defpackage.cxyq
    public final void c(cxyp cxypVar, boolean z) {
        e(cxypVar, z);
    }

    @Override // defpackage.cxyq
    public final void d(cxyp cxypVar, boolean z) {
        e(null, false);
        if (z) {
            Slide f = f();
            f.addListener(new eleq(this.k, new cxzm(this, cxypVar), "ConnectedHalfBannerUiController: Slide in top transition"));
            ViewGroup viewGroup = this.m;
            viewGroup.getClass();
            TransitionManager.beginDelayedTransition(viewGroup, f);
            this.c.setVisibility(0);
            return;
        }
        this.j++;
        this.c.setVisibility(0);
        int i = this.j - 1;
        this.j = i;
        if (i == 0) {
            cxypVar.a(this);
        }
    }
}
