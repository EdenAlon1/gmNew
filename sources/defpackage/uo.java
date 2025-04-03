package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uo implements ou {
    private static Method a;
    private static Method b;
    private final Rect A;
    private Rect B;
    private Context c;
    private ListAdapter d;
    public ti e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    public AdapterView.OnItemSelectedListener n;
    final un o;
    final Handler p;
    public boolean q;
    public PopupWindow r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private DataSetObserver w;
    private final um x;
    private final ul y;
    private final uj z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                b = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public uo(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        if (this.v) {
            return this.t;
        }
        return 0;
    }

    public final Drawable c() {
        return this.r.getBackground();
    }

    @Override // defpackage.ou
    public final ListView dG() {
        return this.e;
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.w;
        if (dataSetObserver == null) {
            this.w = new uk(this);
        } else {
            ListAdapter listAdapter2 = this.d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.w);
        }
        ti tiVar = this.e;
        if (tiVar != null) {
            tiVar.setAdapter(this.d);
        }
    }

    public final void f(Drawable drawable) {
        this.r.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.t = i;
        this.v = true;
    }

    @Override // defpackage.ou
    public final void m() {
        this.r.dismiss();
        this.r.setContentView(null);
        this.e = null;
        this.p.removeCallbacks(this.o);
    }

    public final int o() {
        if (x()) {
            return this.e.getSelectedItemPosition();
        }
        return -1;
    }

    public ti p(Context context, boolean z) {
        return new ti(context, z);
    }

    public final void q() {
        ti tiVar = this.e;
        if (tiVar != null) {
            tiVar.a = true;
            tiVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.r.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        background.getPadding(this.A);
        Rect rect = this.A;
        this.f = rect.left + rect.right + i;
    }

    public final void s(Rect rect) {
        this.B = rect != null ? new Rect(rect) : null;
    }

    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.r.setOnDismissListener(onDismissListener);
    }

    public final boolean u() {
        return this.r.getInputMethodMode() == 2;
    }

    @Override // defpackage.ou
    public final void v() {
        int i;
        int maxAvailableHeight;
        int makeMeasureSpec;
        if (this.e == null) {
            ti p = p(this.c, !this.q);
            this.e = p;
            p.setAdapter(this.d);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new ui(this));
            this.e.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.n;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.r.setContentView(this.e);
        }
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.getPadding(this.A);
            Rect rect = this.A;
            i = rect.top + rect.bottom;
            if (!this.v) {
                this.t = -this.A.top;
            }
        } else {
            this.A.setEmpty();
            i = 0;
        }
        maxAvailableHeight = this.r.getMaxAvailableHeight(this.l, this.t, this.r.getInputMethodMode() == 2);
        if (this.s != -1) {
            int i2 = this.f;
            if (i2 == -2) {
                int i3 = this.c.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.A;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i2 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else {
                int i4 = this.c.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.A;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - (rect3.left + rect3.right), 1073741824);
            }
            maxAvailableHeight = this.e.b(makeMeasureSpec, maxAvailableHeight);
            i = maxAvailableHeight > 0 ? i + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0;
        }
        boolean u = u();
        this.r.setWindowLayoutType(this.u);
        int i5 = maxAvailableHeight + i;
        if (this.r.isShowing()) {
            if (this.l.isAttachedToWindow()) {
                int i6 = this.f;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.l.getWidth();
                }
                int i7 = this.s;
                if (i7 == -1) {
                    if (true != u) {
                        i5 = -1;
                    }
                    if (u) {
                        this.r.setWidth(this.f == -1 ? -1 : 0);
                        this.r.setHeight(0);
                    } else {
                        this.r.setWidth(this.f == -1 ? -1 : 0);
                        this.r.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    i5 = i7;
                }
                this.r.setOutsideTouchable(true);
                this.r.update(this.l, this.g, this.t, i6 < 0 ? -1 : i6, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int i8 = this.f;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.l.getWidth();
        }
        int i9 = this.s;
        if (i9 == -1) {
            i5 = -1;
        } else if (i9 != -2) {
            i5 = i9;
        }
        this.r.setWidth(i8);
        this.r.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = a;
            if (method != null) {
                try {
                    method.invoke(this.r, true);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.r.setIsClippedToScreen(true);
        }
        this.r.setOutsideTouchable(true);
        this.r.setTouchInterceptor(this.x);
        if (this.i) {
            this.r.setOverlapAnchor(this.h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = b;
            if (method2 != null) {
                try {
                    method2.invoke(this.r, this.B);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            this.r.setEpicenterBounds(this.B);
        }
        this.r.showAsDropDown(this.l, this.g, this.t, this.j);
        this.e.setSelection(-1);
        if (!this.q || this.e.isInTouchMode()) {
            q();
        }
        if (this.q) {
            return;
        }
        this.p.post(this.z);
    }

    public final void w() {
        this.r.setInputMethodMode(2);
    }

    @Override // defpackage.ou
    public final boolean x() {
        return this.r.isShowing();
    }

    public final void y() {
        this.q = true;
        this.r.setFocusable(true);
    }

    public uo(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public uo(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.s = -2;
        this.f = -2;
        this.u = 1002;
        this.j = 0;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.o = new un(this);
        this.x = new um(this);
        this.y = new ul(this);
        this.z = new uj(this);
        this.A = new Rect();
        this.c = context;
        this.p = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kt.q, i, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.v = true;
        }
        obtainStyledAttributes.recycle();
        rc rcVar = new rc(context, attributeSet, i);
        this.r = rcVar;
        rcVar.setInputMethodMode(1);
    }
}
