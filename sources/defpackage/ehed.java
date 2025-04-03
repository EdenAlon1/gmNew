package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehed {
    public final ehec a;
    final ehec b;
    final ehec c;
    final ehec d;
    final ehec e;
    final ehec f;
    final ehec g;
    public final Paint h;

    public ehed(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ehmp.e(context, ehes.class.getCanonicalName()), ehfk.a);
        this.a = ehec.c(context, obtainStyledAttributes.getResourceId(4, 0));
        this.g = ehec.c(context, obtainStyledAttributes.getResourceId(2, 0));
        this.b = ehec.c(context, obtainStyledAttributes.getResourceId(3, 0));
        this.c = ehec.c(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList c = ehmq.c(context, obtainStyledAttributes, 7);
        this.d = ehec.c(context, obtainStyledAttributes.getResourceId(9, 0));
        this.e = ehec.c(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f = ehec.c(context, obtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(c.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
