package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehlo extends ehlc {
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;

    public ehlo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray a = ehiz.a(context, attributeSet, ehml.b, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        this.m = a.getInt(0, 0);
        int a2 = ehmq.a(context, a, 4, dimensionPixelSize);
        int i = this.a;
        this.n = Math.max(a2, i + i);
        this.o = ehmq.a(context, a, 3, dimensionPixelSize2);
        this.p = a.getInt(2, 0);
        this.q = a.getBoolean(1, true);
        a.recycle();
        a();
    }
}
