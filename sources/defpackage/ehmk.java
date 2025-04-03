package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmk extends ehlc {
    public final int m;
    public final int n;
    public boolean o;
    public int p;
    public int q;
    public float r;
    public boolean s;
    public boolean t;

    public ehmk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        TypedArray a = ehiz.a(context, attributeSet, ehml.c, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.m = a.getInt(0, 1);
        int i = a.getInt(1, 0);
        this.n = i;
        this.p = Math.min(a.getDimensionPixelSize(3, 0), this.a);
        TypedValue peekValue = a.peekValue(2);
        if (peekValue != null) {
            if (peekValue.type == 5) {
                this.q = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, a.getResources().getDisplayMetrics()), this.a / 2);
                this.s = false;
                this.t = true;
            } else if (peekValue.type == 6) {
                this.r = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.s = true;
                this.t = true;
            }
        }
        a.recycle();
        a();
        this.o = i == 1;
    }

    @Override // defpackage.ehlc
    public final void a() {
        super.a();
        if (this.p < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.m == 0) {
            if ((this.b > 0 || (this.t && e() > 0)) && this.g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        if (!this.t) {
            return this.b;
        }
        if (!this.s) {
            return this.q;
        }
        return (int) (this.a * this.r);
    }
}
