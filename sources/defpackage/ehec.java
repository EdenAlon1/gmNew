package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehec {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final ehow f;

    private ehec(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, ehow ehowVar, Rect rect) {
        ksw.f(rect.left);
        ksw.f(rect.top);
        ksw.f(rect.right);
        ksw.f(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = ehowVar;
    }

    static ehec c(Context context, int i) {
        ksw.b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ehfk.b);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList c = ehmq.c(context, obtainStyledAttributes, 4);
        ColorStateList c2 = ehmq.c(context, obtainStyledAttributes, 9);
        ColorStateList c3 = ehmq.c(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        ehow ehowVar = new ehow(ehow.b(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)));
        obtainStyledAttributes.recycle();
        return new ehec(c, c2, c3, dimensionPixelSize, ehowVar, rect);
    }

    public final int a() {
        return this.a.bottom;
    }

    public final int b() {
        return this.a.top;
    }

    final void d(TextView textView) {
        ehop ehopVar = new ehop();
        ehop ehopVar2 = new ehop();
        ehopVar.fy(this.f);
        ehopVar2.fy(this.f);
        ehopVar.O(this.c);
        ehopVar.U(this.e, this.d);
        textView.setTextColor(this.b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), ehopVar, ehopVar2);
        Rect rect = this.a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
