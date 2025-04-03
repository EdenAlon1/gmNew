package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyaf extends MaterialCardView {
    public static final /* synthetic */ int j = 0;
    public float g;
    public boolean h;
    final /* synthetic */ cyag i;
    private final ArrayList k;
    private final VelocityTracker l;
    private final ViewTreeObserver.OnGlobalLayoutListener m;
    private float n;
    private float o;
    private boolean p;
    private boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyaf(final cyag cyagVar, Context context) {
        super(context);
        this.i = cyagVar;
        this.k = new ArrayList();
        this.l = VelocityTracker.obtain();
        this.m = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: cyac
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ImageView imageView = cyaf.this.i.l;
                if (imageView == null || imageView.getParent() == null) {
                    return;
                }
                View view = (View) imageView.getParent();
                Rect rect = new Rect();
                imageView.getHitRect(rect);
                int dimensionPixelSize = imageView.getContext().getResources().getDimensionPixelSize(R.dimen.min_touch_target_size) / 2;
                rect.top -= dimensionPixelSize;
                rect.left -= dimensionPixelSize;
                rect.bottom += dimensionPixelSize;
                rect.right += dimensionPixelSize;
                view.setTouchDelegate(new TouchDelegate(rect, imageView));
            }
        };
        this.p = true;
        this.h = true;
        this.q = false;
        LayoutInflater.from(context).inflate(R.layout.full_banner_card_view_v2, (ViewGroup) this, true);
        cyagVar.j = (IllustrationViewStub) findViewById(R.id.banner_full_icon);
        cyagVar.k = (IllustrationViewStub) findViewById(R.id.banner_chip_icon);
        setClipChildren(false);
        if (ctib.d()) {
            setElevation(context.getResources().getDimension(R.dimen.banner2o_elevation));
        } else {
            setElevation(0.0f);
        }
        gw(context.getResources().getDimension(R.dimen.banner2o_full_corner_radius));
        gu(ehdr.d(context, R.attr.colorSurface, "FullBannerUiController"));
        setFocusable(true);
        cyagVar.i = (LinearLayout) findViewById(R.id.banner_chip_content);
        cyagVar.h = (ConstraintLayout) findViewById(R.id.banner_full_content);
        cyagVar.l = (ImageView) findViewById(R.id.banner_close_icon);
        new crly(this, R.id.banner_secondary_icon_stub, R.id.banner_secondary_icon);
        cyagVar.m = (Button) findViewById(R.id.banner_full_end_button);
        cyagVar.n = (Button) findViewById(R.id.banner_full_start_button);
        cyagVar.o = (TextView) findViewById(R.id.banner_full_title);
        cyagVar.p = (TextView) findViewById(R.id.banner_full_body);
        cyagVar.q = (TextView) findViewById(R.id.banner_full_count);
        egyl.b(cyagVar.p);
        cyagVar.i.setOnClickListener(new elay(cyagVar.b, "FullBannerUiController: Chip clicked", new View.OnClickListener() { // from class: cyad
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = cyaf.j;
                ((ensz) ((ensz) cyag.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController$BannerCardView", "<init>", 1281, "FullBannerUiController.java")).q("Banner chip clicked");
                cyag cyagVar2 = cyag.this;
                cyagVar2.h(null, true);
                cyah cyahVar = cyagVar2.C;
                if (cyahVar != null) {
                    cyahVar.f(cyagVar2);
                }
            }
        }));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (java.lang.Math.abs(r10.n - r11.getRawX()) >= r10.i.e.getResources().getDimension(com.google.android.apps.messaging.R.dimen.banner2o_click_distance)) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean h(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyaf.h(android.view.MotionEvent):boolean");
    }

    private final boolean i() {
        cyag cyagVar = this.i;
        return cyagVar.E == 1 && cyagVar.w;
    }

    public final void g() {
        this.h = true;
        this.i.t = false;
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this.m);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.m);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.q = true;
        return h(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.q) {
            this.q = false;
            return true;
        }
        h(motionEvent);
        return true;
    }
}
