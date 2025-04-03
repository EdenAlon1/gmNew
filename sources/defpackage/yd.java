package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yd extends vy {
    public yj a;
    public boolean b;

    public yd(int i, int i2) {
        super(i, i2);
    }

    public final int d() {
        yj yjVar = this.a;
        if (yjVar == null) {
            return -1;
        }
        return yjVar.e;
    }

    public yd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public yd(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public yd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
