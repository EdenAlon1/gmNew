package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pb extends ViewGroup {
    protected final pa a;
    public final Context b;
    public ActionMenuView c;
    public pt d;
    public int e;
    protected kwd f;
    private boolean g;
    private boolean h;

    pb(Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static final int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static final int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        int i5 = measuredHeight + i4;
        if (z) {
            view.layout(i - measuredWidth, i4, i, i5);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, i5);
        return measuredWidth;
    }

    public final kwd b(int i, long j) {
        kwd kwdVar = this.f;
        if (kwdVar != null) {
            kwdVar.a();
        }
        if (i != 0) {
            kwd e = kvo.e(this);
            e.b(0.0f);
            e.c(j);
            pa paVar = this.a;
            paVar.d(e, i);
            e.d(paVar);
            return e;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        kwd e2 = kvo.e(this);
        e2.b(1.0f);
        e2.c(j);
        pa paVar2 = this.a;
        paVar2.d(e2, 0);
        e2.d(paVar2);
        return e2;
    }

    public void d(int i) {
        throw null;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, kt.a, R.attr.actionBarStyle, 0);
        d(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        pt ptVar = this.d;
        if (ptVar != null) {
            ptVar.i = na.a(ptVar.b);
            od odVar = ptVar.c;
            if (odVar != null) {
                odVar.l(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.h = false;
            actionMasked = 9;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.h = true;
                }
                if (i != 10 || i == 3) {
                    this.h = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.h = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            kwd kwdVar = this.f;
            if (kwdVar != null) {
                kwdVar.a();
            }
            super.setVisibility(i);
        }
    }

    public pb(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public pb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new pa(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
