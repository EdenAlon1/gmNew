package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehbn extends kb {
    private FrameLayout a;
    public BottomSheetBehavior c;
    public FrameLayout d;
    boolean e;
    public boolean f;
    public boolean g;
    public ehbm h;
    private CoordinatorLayout i;
    private boolean j;
    private ehjq k;
    private ehbc l;

    public ehbn(Context context) {
        this(context, 0);
        d();
    }

    private final View b(int i, View view, ViewGroup.LayoutParams layoutParams) {
        k();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.j) {
            FrameLayout frameLayout = this.d;
            ehbh ehbhVar = new ehbh(this);
            int[] iArr = kvo.a;
            kvd.k(frameLayout, ehbhVar);
        }
        this.d.removeAllViews();
        if (layoutParams == null) {
            this.d.addView(view);
        } else {
            this.d.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ehbi(this));
        kvo.p(this.d, new ehbj(this));
        this.d.setOnTouchListener(new ehbk());
        return this.a;
    }

    private final void d() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.j = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private final void j() {
        ehjq ehjqVar = this.k;
        if (ehjqVar == null) {
            return;
        }
        if (this.e) {
            ehjqVar.a();
        } else {
            ehjqVar.b();
        }
    }

    private final void k() {
        if (this.a == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.a = frameLayout;
            this.i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.a.findViewById(R.id.design_bottom_sheet);
            this.d = frameLayout2;
            BottomSheetBehavior v = BottomSheetBehavior.v(frameLayout2);
            this.c = v;
            v.w(this.l);
            this.c.B(this.e);
            this.k = new ehjq(this.c, this.d);
        }
    }

    public final BottomSheetBehavior a() {
        if (this.c == null) {
            k();
        }
        return this.c;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        a();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.j && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            FrameLayout frameLayout = this.a;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            CoordinatorLayout coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            kwg.a(window, z2);
            ehbm ehbmVar = this.h;
            if (ehbmVar != null) {
                ehbmVar.d(window);
            }
        }
        j();
    }

    @Override // defpackage.kb, defpackage.abg, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        ehbm ehbmVar = this.h;
        if (ehbmVar != null) {
            ehbmVar.d(null);
        }
        ehjq ehjqVar = this.k;
        if (ehjqVar != null) {
            ehjqVar.b();
        }
    }

    @Override // defpackage.abg, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.c;
        if (bottomSheetBehavior == null || bottomSheetBehavior.x != 5) {
            return;
        }
        bottomSheetBehavior.D(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.e != z) {
            this.e = z;
            BottomSheetBehavior bottomSheetBehavior = this.c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.B(z);
            }
            if (getWindow() != null) {
                j();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.e) {
            this.e = true;
        }
        this.f = z;
        this.g = true;
    }

    @Override // defpackage.kb, defpackage.abg, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(b(i, null, null));
    }

    @Override // defpackage.kb, defpackage.abg, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(b(0, view, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ehbn(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130969017(0x7f0401b9, float:1.7546704E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132150190(0x7f1607ae, float:1.9942407E38)
        L1b:
            r3.<init>(r4, r5)
            r3.e = r0
            r3.f = r0
            ehbl r4 = new ehbl
            r4.<init>(r3)
            r3.l = r4
            r3.g()
            r3.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehbn.<init>(android.content.Context, int):void");
    }

    @Override // defpackage.kb, defpackage.abg, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(0, view, layoutParams));
    }
}
