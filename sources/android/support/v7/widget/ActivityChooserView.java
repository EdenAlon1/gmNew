package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import defpackage.kt;
import defpackage.kte;
import defpackage.kvo;
import defpackage.qd;
import defpackage.qe;
import defpackage.qf;
import defpackage.qg;
import defpackage.qh;
import defpackage.qi;
import defpackage.qj;
import defpackage.qk;
import defpackage.uo;
import defpackage.yt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ActivityChooserView extends ViewGroup {
    public final qj a;
    public final View b;
    public final Drawable c;
    public final FrameLayout d;
    public final ImageView e;
    public final FrameLayout f;
    public final ImageView g;
    public kte h;
    final DataSetObserver i;
    public boolean j;
    public int k;
    public int l;
    private final qk m;
    private final int n;
    private final ViewTreeObserver.OnGlobalLayoutListener o;
    private uo p;
    private boolean q;

    /* compiled from: PG */
    public static class InnerLayout extends LinearLayout {
        private static final int[] a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            yt k = yt.k(context, attributeSet, a);
            setBackgroundDrawable(k.h(0));
            k.o();
        }
    }

    public ActivityChooserView(Context context) {
        super(context, null, 0);
        this.i = new qe(this);
        this.o = new qf(this);
        this.k = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, kt.e, 0, 0);
        kvo.o(this, context, kt.e, null, obtainStyledAttributes, 0, 0);
        this.k = obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(com.google.android.apps.messaging.R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        qk qkVar = new qk(this);
        this.m = qkVar;
        View findViewById = findViewById(com.google.android.apps.messaging.R.id.activity_chooser_view_content);
        this.b = findViewById;
        this.c = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(com.google.android.apps.messaging.R.id.default_activity_button);
        this.f = frameLayout;
        frameLayout.setOnClickListener(qkVar);
        frameLayout.setOnLongClickListener(qkVar);
        this.g = (ImageView) frameLayout.findViewById(com.google.android.apps.messaging.R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(com.google.android.apps.messaging.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(qkVar);
        frameLayout2.setAccessibilityDelegate(new qg());
        frameLayout2.setOnTouchListener(new qh(this, frameLayout2));
        this.d = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(com.google.android.apps.messaging.R.id.image);
        this.e = imageView;
        imageView.setImageDrawable(drawable);
        qj qjVar = new qj(this);
        this.a = qjVar;
        qjVar.registerDataSetObserver(new qi(this));
        Resources resources = context.getResources();
        this.n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.abc_config_prefDialogWidth));
    }

    public final uo a() {
        if (this.p == null) {
            uo uoVar = new uo(getContext());
            this.p = uoVar;
            uoVar.e(this.a);
            uo uoVar2 = this.p;
            uoVar2.l = this;
            uoVar2.y();
            uo uoVar3 = this.p;
            qk qkVar = this.m;
            uoVar3.m = qkVar;
            uoVar3.t(qkVar);
        }
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    public final void b(int i) {
        if (this.a.a == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.o);
        ?? r0 = this.f.getVisibility() == 0 ? 1 : 0;
        int a = this.a.a();
        if (i == Integer.MAX_VALUE || a <= i + r0) {
            this.a.e(false);
            this.a.c(i);
        } else {
            this.a.e(true);
            this.a.c(i - 1);
        }
        uo a2 = a();
        if (a2.x()) {
            return;
        }
        if (this.j || r0 == 0) {
            this.a.d(true, r0);
        } else {
            this.a.d(false, false);
        }
        qj qjVar = this.a;
        int i2 = qjVar.b;
        qjVar.b = Alert.DURATION_SHOW_INDEFINITELY;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = qjVar.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            view = qjVar.getView(i4, view, null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        qjVar.b = i2;
        a2.r(Math.min(i3, this.n));
        a2.v();
        kte kteVar = this.h;
        if (kteVar != null) {
            kteVar.subUiVisibilityChanged(true);
        }
        a2.e.setContentDescription(getContext().getString(com.google.android.apps.messaging.R.string.abc_activitychooserview_choose_application));
        a2.e.setSelector(new ColorDrawable(0));
    }

    public final boolean c() {
        return a().x();
    }

    public final void d() {
        if (c()) {
            a().m();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.o);
            }
        }
    }

    public final void e() {
        if (c() || !this.q) {
            return;
        }
        this.j = false;
        b(this.k);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qd qdVar = this.a.a;
        if (qdVar != null) {
            qdVar.registerObserver(this.i);
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qd qdVar = this.a.a;
        if (qdVar != null) {
            qdVar.unregisterObserver(this.i);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.o);
        }
        if (c()) {
            d();
        }
        this.q = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
        if (c()) {
            return;
        }
        d();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.b;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
