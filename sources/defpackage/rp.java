package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rp extends uo implements rs {
    public CharSequence a;
    ListAdapter b;
    public final Rect c;
    final /* synthetic */ rt d;
    private int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(rt rtVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = rtVar;
        this.c = new Rect();
        this.l = rtVar;
        y();
        this.m = new rm(this);
    }

    @Override // defpackage.rs
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.uo, defpackage.rs
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.rs
    public final void h(int i) {
        this.s = i;
    }

    @Override // defpackage.rs
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.rs
    public final void k(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean x = x();
        n();
        w();
        super.v();
        ti tiVar = this.e;
        tiVar.setChoiceMode(1);
        tiVar.setTextDirection(i);
        tiVar.setTextAlignment(i2);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        ti tiVar2 = this.e;
        if (x() && tiVar2 != null) {
            tiVar2.a = false;
            tiVar2.setSelection(selectedItemPosition);
            if (tiVar2.getChoiceMode() != 0) {
                tiVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (x || (viewTreeObserver = this.d.getViewTreeObserver()) == null) {
            return;
        }
        rn rnVar = new rn(this);
        viewTreeObserver.addOnGlobalLayoutListener(rnVar);
        t(new ro(this, rnVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    final void n() {
        int i;
        Drawable c = c();
        if (c != null) {
            c.getPadding(this.d.d);
            i = zu.a(this.d) ? this.d.d.right : -this.d.d.left;
        } else {
            Rect rect = this.d.d;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        rt rtVar = this.d;
        int paddingLeft = rtVar.getPaddingLeft();
        int paddingRight = rtVar.getPaddingRight();
        int width = rtVar.getWidth();
        int i2 = rtVar.c;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int a = rtVar.a(this.b, c());
            int i4 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left) - this.d.d.right;
            if (a > i4) {
                a = i4;
            }
            r(Math.max(a, i3));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = zu.a(this.d) ? i + (((width - paddingRight) - this.f) - this.s) : i + paddingLeft + this.s;
    }
}
