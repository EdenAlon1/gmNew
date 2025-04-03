package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehft extends iu {
    public final Rect b;
    private Drawable c;

    public ehft(Context context) {
        this(context, 0);
    }

    private static int A(Context context) {
        TypedValue b = ehmp.b(context, R.attr.materialAlertDialogTheme);
        if (b == null) {
            return 0;
        }
        return b.data;
    }

    @Override // defpackage.iu
    public final iv create() {
        iv create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.c;
        if (drawable instanceof ehop) {
            ((ehop) drawable).N(decorView.getElevation());
        }
        Drawable drawable2 = this.c;
        Rect rect = this.b;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ehfs(create, this.b));
        return create;
    }

    public final void j(boolean z) {
        this.a.m = z;
    }

    public final void k(Drawable drawable) {
        super.b(drawable);
    }

    public final void l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        ir irVar = this.a;
        irVar.q = charSequenceArr;
        irVar.s = onClickListener;
    }

    public final void m(int i) {
        ir irVar = this.a;
        irVar.f = irVar.a.getText(i);
    }

    public final void n(CharSequence charSequence) {
        super.c(charSequence);
    }

    public final void o(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
    }

    public final void p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.h(charSequence, onClickListener);
    }

    public final void q(DialogInterface.OnClickListener onClickListener) {
        super.d(R.string.clear_custom_smsc_dialog_button, onClickListener);
    }

    public final void r(DialogInterface.OnCancelListener onCancelListener) {
        this.a.n = onCancelListener;
    }

    public final void s(DialogInterface.OnDismissListener onDismissListener) {
        this.a.o = onDismissListener;
    }

    @Override // defpackage.iu
    public final /* synthetic */ iu setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
        return this;
    }

    @Override // defpackage.iu
    public final /* synthetic */ iu setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
        return this;
    }

    @Override // defpackage.iu
    public final /* synthetic */ iu setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        return this;
    }

    @Override // defpackage.iu
    public final /* synthetic */ iu setView(View view) {
        super.setView(view);
        return this;
    }

    public final void t(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
    }

    public final void u(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.i(charSequence, onClickListener);
    }

    public final void v(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        super.e(listAdapter, i, onClickListener);
    }

    public final void w(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        super.f(charSequenceArr, i, onClickListener);
    }

    public final void x(int i) {
        super.g(i);
    }

    public final void y(CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    public final void z(View view) {
        super.setView(view);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ehft(android.content.Context r12, int r13) {
        /*
            r11 = this;
            int r0 = A(r12)
            r1 = 0
            r2 = 2130968885(0x7f040135, float:1.7546436E38)
            r3 = 2132148970(0x7f1602ea, float:1.9939933E38)
            android.content.Context r4 = defpackage.ehua.a(r12, r1, r2, r3)
            if (r0 != 0) goto L12
            goto L18
        L12:
            aeo r5 = new aeo
            r5.<init>(r4, r0)
            r4 = r5
        L18:
            if (r13 != 0) goto L1e
            int r13 = A(r12)
        L1e:
            r11.<init>(r4, r13)
            android.content.Context r5 = r11.getContext()
            android.content.res.Resources$Theme r12 = r5.getTheme()
            int[] r7 = defpackage.ehfu.a
            r9 = 2132148970(0x7f1602ea, float:1.9939933E38)
            r13 = 0
            int[] r10 = new int[r13]
            r6 = 0
            r8 = 2130968885(0x7f040135, float:1.7546436E38)
            android.content.res.TypedArray r0 = defpackage.ehiz.a(r5, r6, r7, r8, r9, r10)
            android.content.res.Resources r4 = r5.getResources()
            r6 = 2131167636(0x7f070994, float:1.7949551E38)
            int r4 = r4.getDimensionPixelSize(r6)
            r6 = 2
            int r4 = r0.getDimensionPixelSize(r6, r4)
            android.content.res.Resources r6 = r5.getResources()
            r7 = 2131167637(0x7f070995, float:1.7949553E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r7 = 3
            int r6 = r0.getDimensionPixelSize(r7, r6)
            android.content.res.Resources r7 = r5.getResources()
            r8 = 2131167635(0x7f070993, float:1.794955E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 1
            int r7 = r0.getDimensionPixelSize(r8, r7)
            android.content.res.Resources r9 = r5.getResources()
            r10 = 2131167634(0x7f070992, float:1.7949547E38)
            int r9 = r9.getDimensionPixelSize(r10)
            int r13 = r0.getDimensionPixelSize(r13, r9)
            r0.recycle()
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.getLayoutDirection()
            if (r0 != r8) goto L8b
            r9 = r7
            goto L8c
        L8b:
            r9 = r4
        L8c:
            if (r0 == r8) goto L8f
            r4 = r7
        L8f:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r9, r6, r4, r13)
            r11.b = r0
            java.lang.Class r13 = r11.getClass()
            java.lang.String r13 = r13.getCanonicalName()
            r0 = 2130969299(0x7f0402d3, float:1.7547276E38)
            int r13 = defpackage.ehdr.d(r5, r0, r13)
            int[] r0 = defpackage.ehfu.a
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r1, r0, r2, r3)
            r4 = 4
            int r13 = r0.getColor(r4, r13)
            r0.recycle()
            ehop r0 = new ehop
            r0.<init>(r5, r1, r2, r3)
            r0.K(r5)
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r0.O(r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r13 < r1) goto Lf0
            android.util.TypedValue r13 = new android.util.TypedValue
            r13.<init>()
            r1 = 16844145(0x1010571, float:2.3697462E-38)
            r12.resolveAttribute(r1, r13, r8)
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r13.getDimension(r12)
            int r13 = r13.type
            r1 = 5
            if (r13 != r1) goto Lf0
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 < 0) goto Lf0
            r0.L(r12)
        Lf0:
            r11.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehft.<init>(android.content.Context, int):void");
    }
}
